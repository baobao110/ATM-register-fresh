package com.control;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import com.AccountFlow.Account;
import com.BankCard.Card;
import com.ajax.ajaxDAO;
import com.fenye.Fenye;
import com.flow.flow;
import com.service.CardService;
import com.service.Service;
import com.service.UserService;
import com.user.User;


@Controller
@RequestMapping("/user")
public class userControl extends control {
	
	@Autowired
	private Service service;
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private CardService cardservice;
	
	private  Logger log=LoggerFactory.getLogger(userControl.class);
	@RequestMapping("/back")
	public String back(HttpSession session) {
		session.invalidate();
		return "login";
	}//����֮����Ҫ��һ���˳�������Ϊ��ʹ�ỰʧЧ,��Ȼ�Ƴ�����url��ַ���ɿ���������¼�������
	
	@RequestMapping("/load")
	public void load( MultipartFile upfile,HttpSession session,HttpServletRequest req, HttpServletResponse resp) throws Exception, IOException { 
		User user = (User)session.getAttribute("user");
		String username=user.getUsername();
		req.setAttribute("username", username);
		try {
			if (!upfile.isEmpty()) {
	            String filePath = WebUtils.getRealPath(session.getServletContext(), "/load/" +username);
	            File uploadedFile = new File(filePath);
	            upfile.transferTo(uploadedFile);//ע�������transferTo��������ø÷������뱣֤�ļ������ر�
	            
	            OutputStream os = resp.getOutputStream();
	            os.write("<script type=\"text/javascript\">parent.loadAvatar();</script>".getBytes());//����������������ʽ��js����,����ע��parent.loadAvatar();
	            os.flush();
	            os.close();
	        }
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/toUpload")
	public String toUpload(HttpSession session) {
		return "load";
	}

	
	
	@RequestMapping("/showPicture")
	public void showPicture(HttpSession session,HttpServletResponse resp) throws FileNotFoundException, IOException {
		User user=(User)session.getAttribute("user");
		String path=WebUtils.getRealPath(session.getServletContext(), "/load/"+user.getUsername());
		log.info("path======"+path);
	/*	OutputStream out=resp.getOutputStream();
		FileInputStream in=new FileInputStream(path);*/
		try(OutputStream out=resp.getOutputStream();
				FileInputStream in=new FileInputStream(path)){
			byte[] data=new byte[1024];
			int len=-1;
			while((len=in.read(data))!=-1) {
				out.write(data, 0, len);
				out.flush();
			}
		}
		/*out.close();
		in.close();*/
		
	}
	//�ر�ע�������try���,ͨ��������ļ������Ҫ�ر�,���������try���Ͳ���,�����Զ��ر��ļ���,�����������������ر��ļ�����Ӱ��ͼƬ����
	
	@RequestMapping("/toRegister")
	public String  toRegister(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		javax.servlet.http.HttpSession session = req.getSession();//����н��и�ֵ����ԭ����Session�����û�д����µ�Session
		String uuID=UUID.randomUUID().toString();
		session.setAttribute("uuID", uuID);
		log.info("session"+session);
		return "register";
	}//����һ  :ע��������α�������ظ��ύ,�����õ��ľ���UUID,����ÿ�ν���ע����涼������Ψһ��UUID,�������ͨ��UUID�����ж�,������α����ظ����ύ��,���￴register����
	@RequestMapping("/Register")
	@ResponseBody
	public ajaxDAO Register(String username, String password,HttpSession session,String confirm,String uuID) throws ServletException, IOException {
		if(null==uuID||"".equals(uuID)) {
			return ajaxDAO.failure("��ˢ��");
		}
		
		String id=(String)session.getAttribute("uuID");
		if(!id.equals(uuID)) {
			return ajaxDAO.failure("��ˢ��");
		}
		
		if(!confirm.equals(password)) {
			return ajaxDAO.failure("�������");
		}
		User u=userservice.get(username);
		if(null==u) {
			try {
				
				User user= userservice.register(username,password);
				session.setAttribute("user",user);
				session.removeAttribute("uuID");//����һ:�������ע��ɹ��ͽ�ԭ����uuID�Ƴ�,�����ٴ��ύ��ʱ��ΪuuIDΪnull�����޷�ͨ��
				return ajaxDAO.success();
			}
				catch (Exception e) {
					// TODO: handle exception
					return ajaxDAO.failure(e.getMessage());
				}
		}
		else {
			return ajaxDAO.failure("�û��Ѵ���");
		}
	}
	
	/*@RequestMapping("/Register")
	@ResponseBody
	public ajaxDAO Register(@Validated DVO registVO, BindingResult result) throws ServletException, IOException {
		if(result.hasErrors()) {
			FieldError error = result.getFieldError();
			List<FieldError> list = result.getFieldErrors();
			String errorMessage = "";
			for (FieldError err : list) {
				errorMessage += err.getDefaultMessage() + " " ;
			}
			
			return ajaxDAO.failure(errorMessage);
		}
		if(!registVO.getConfirm().equals(registVO.getPassword())){
			return ajaxDAO.failure("���벻��ȷ");
		}
		User user= userservice.register(registVO.getUsername(),registVO.getPassword());
		return ajaxDAO.success();
	
	}*/
	
	
	
	@RequestMapping("/toLogin")
	public String toLogin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		javax.servlet.http.HttpSession session = req.getSession();
		log.info("session1"+session);
		return "login";																																								
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public ajaxDAO  login(String username, String password,HttpSession session,String code) throws ServletException, IOException {
		if(null==code||"".equals(code)) {
			return ajaxDAO.failure("��֤�벻��Ϊ��");
		}
		code=code.trim();
		String cod=(String)session.getAttribute("code");
		if(!cod.equalsIgnoreCase(code)) {
			return ajaxDAO.failure("��֤�����");
		}
		
		try {
				User user=userservice.login(username, password);
				session.setAttribute("user", user);
				return ajaxDAO.success();
			}
		catch(Exception e) {
				return ajaxDAO.failure(e.getMessage());
			}
	}
	
	@RequestMapping("/ten")
	@ResponseBody
	public ajaxDAO ten(HttpSession session,HttpServletRequest req) throws ServletException, IOException {
		User user=(User)session.getAttribute("user");
		log.info("user------"+user);
		String username=user.getUsername();
		req.setAttribute("username", username);
		log.info("username"+username);
		try {
			ArrayList<flow> account=service.ten(username);
			return ajaxDAO.success(account);
			}
			catch(Exception e) {
				return ajaxDAO.failure(e.getMessage());
		}
		
	}
	
	@RequestMapping("/toUsercenter")
	public String toUsercenter(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		User user=(User)session.getAttribute("user");
		log.info("user------"+user);
		String username=user.getUsername();
		req.setAttribute("username", username);
		log.info("username"+username);
		return "usercenter";
	}//������Ҫ��session��ȡuser,��Ȼ�޷�ͨ��������
	
	@RequestMapping("/toFlow")
	@ResponseBody
	public ajaxDAO toFlow(HttpServletRequest req,HttpServletResponse resp, String currentPage)throws ServletException, IOException{
		javax.servlet.http.HttpSession session = req.getSession();
		User user= (User) session.getAttribute("user");//�������Ҫ��session��ȡuser��Ȼ�û�����ҳ���޷����ر�
		String username=user.getUsername();
		currentPage=currentPage ==null ? "1" : currentPage;//ע������ķ�ҳ��̨ʵ��
		try {
			Fenye list=cardservice.list(username, Integer.parseInt(currentPage));
			return ajaxDAO.success(list);
		}
		catch(Exception e) {
			return ajaxDAO.failure(e.getMessage());
		}
		
	}
	
	@RequestMapping("/Flow")
	@ResponseBody
	public ajaxDAO Flow(HttpSession session)throws ServletException, IOException{
		User user= (User) session.getAttribute("user");//�������Ҫ��session��ȡuser��Ȼ�û�����ҳ���޷����ر�
		String username=user.getUsername();
		try {
			ArrayList<Card>list=cardservice.flow(username);
			return ajaxDAO.success(list);
		}
		catch(Exception e) {
			return ajaxDAO.failure(e.getMessage());
		}
		
	}
	//ע�������flow����������,ͬ����Control��ϵ

}
