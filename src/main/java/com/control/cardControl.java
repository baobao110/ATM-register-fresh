package com.control;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.ibatis.annotations.ResultMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.AccountFlow.Account;
import com.BankCard.Card;
import com.ajax.ajaxDAO;
import com.fenye.Fenye;
import com.service.CardService;
import com.service.Service;
import com.test.logTest;
import com.user.User;


@Controller	//�����ע��д���̶�,SpringMVC���Զ�����ע���ҵ�Control��
@RequestMapping("/card")//����ͱȽ�����˼,SpringMVC�����ע���ǻ�ȡǰ�˵�url��ַƬ,����url��ַ�ҵ���Ӧ����ͷ���������Ӧ�Ĳ���
public class cardControl extends control{
	
	@Autowired	//���ע�������Զ��ҵ���ص���,�����Զ��ĳ�ʼ��,�����Ͳ���Ҫ��set�������г�ʼ��,������Խ��Service���@Component
	private Service service;
	
	@Autowired
	private CardService cardservice;
	

	private  Logger log=LoggerFactory.getLogger(cardControl.class);
	
	@RequestMapping("/down")
	public void  down(HttpServletResponse resp,HttpServletRequest req,HttpSession  session) throws IOException {
		User user=(User) session.getAttribute("user");
		String a=req.getParameter("number");
		int number=Integer.parseInt(a);
		String password=req.getParameter("password");
		Card cad=service.Get(number,password);
		String filename = number + ".csv";
		resp.setContentType("application/octet-stream");  
		resp.setHeader("Content-Disposition", "attachment;filename="+ filename);  
		
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(resp.getOutputStream()))) {
			int currentPage = 1;
			String header = "����,���,��ע,ʱ��";
			bw.write(header);
			bw.newLine();
			bw.flush();
			while (true) {
				Fenye list = service.List(number, password, currentPage);
				 ArrayList<Account>account=(ArrayList<Account>) list.getObject();
				if(null==account) {
					break;
				}
				if(account.isEmpty()) {//�����ر�ע�ⲻȻ�����������
					break;
				}
				for(Account i:account) {
					StringBuilder text = new StringBuilder();
					text.append(i.getNumber()).append(",")
					.append(i.getMoney()).append(",")
					.append(i.getDescription()).append(",")
					.append(i.getCreatetime()).append(",");
					bw.write(text.toString());
					bw.newLine();
					bw.flush();
					}
				currentPage++;
			}
		}
	}

	
	@RequestMapping("/todelete")
	public String toDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		return "delete";
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public ajaxDAO delete(String password,String number) throws ServletException, IOException {
		int num=Integer.parseInt(number);
		try {
			Card cad=service.Get(num,password);
			service.delete(num);
			return ajaxDAO.success();
		}
		catch(Exception e) {
			return ajaxDAO.failure(e.getMessage());
		}
	}
	//ע��������쳣�Ĳ�����Ժ͵ײ���ϵ
	
	@RequestMapping("/openAccount")
	@ResponseBody
	public ajaxDAO openAccount(String password, String confirmPwd,HttpSession session,HttpServletRequest req) throws ServletException, IOException {
		log.info("����");
		User user=(User) session.getAttribute("user");
		String username=user.getUsername();
		if(!password.equals(confirmPwd)) {
			return ajaxDAO.failure("�û������벻��ȷ");
		}
		else {
			try {
				Card card=service.open(username,password);
				req.setAttribute("user", user);
				return ajaxDAO.success(card);
			}catch(Exception e) {
				return ajaxDAO.failure(e.getMessage());
			}
		}
	}
	/*
	 * ע������Ĳ���session,��ǰ�����ڷ�������request��ȡ����������Spring-MVC�ͼ���,�����ڲ�����ֱ�Ӵ���,ͬʱ������ߵ�open������Ҫע���õ�redis��������������Ҫ�����Service
	 */
	
	@RequestMapping("/toOpenAccount")
	public String toOpenAccount(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		javax.servlet.http.HttpSession session = req.getSession();
		return "OpenAccount";
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public ajaxDAO save(HttpServletRequest req, HttpServletResponse resp,HttpSession session) throws ServletException, IOException {
		log.info("��Ǯ");
		String a=req.getParameter("number");
		int number=Integer.parseInt(a);
		String password=req.getParameter("password");
		String b=req.getParameter("money");
		double money=Double.parseDouble(b);
		try {
			Card cad=service.Get(number,password);
			User user=(User)session.getAttribute("user");
			service.save(number, password, money,user.getUsername());
			Card card=service.Get(number,password);
			return ajaxDAO.success(card);
		}catch(Exception e) {
			return ajaxDAO.failure(e.getMessage());
		}
	}
	
	@RequestMapping("/toSave")
	public String  toSave(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		return "save";
	}
	
	@RequestMapping("/transfer")
	@ResponseBody
	public  ajaxDAO transfer(HttpServletRequest req, HttpServletResponse resp,HttpSession session) throws ServletException, IOException {
		log.info("���");
		String a=req.getParameter("number");
		log.info("number"+a);
		int number=Integer.parseInt(a);
		String password=req.getParameter("password");
		log.info("password"+password);
		String b=req.getParameter("money");
		log.info("money"+b);
		double money=Double.parseDouble(b);
		try {
			Card cad=service.Get(number,password);
			String c=req.getParameter("InNumber");
			log.info("InNumber"+c);
			int InNumber=Integer.parseInt(c);
			User user=(User)session.getAttribute("user");
			service.transfer(number, password, money, InNumber,user.getUsername());
			Card card1=service.GetCard(number);
			Card card=service.Get(number,password);
			return ajaxDAO.success(card);
		}
		catch(Exception e) {
			return ajaxDAO.failure(e.getMessage());
		}
	}
	
	@RequestMapping("/toTransfer")
	public String toTransfer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		return "transfer";
	}
	
	@RequestMapping("/check")
	@ResponseBody
	public ajaxDAO  check(HttpServletRequest req, HttpServletResponse resp,HttpSession session) throws ServletException, IOException {
		String a=req.getParameter("number");
		int number=Integer.parseInt(a);
		String password=req.getParameter("password");
		String b=req.getParameter("money");
		double money=Double.parseDouble(b);
		try {
			Card cad=service.Get(number,password);
			User user=(User)session.getAttribute("user");
			service.draw(number, password, money,user.getUsername());
			Card card=service.GetCard(number);
			return ajaxDAO.success(card);
		}
		catch(Exception e) {
			return ajaxDAO.failure(e.getMessage());
		}
	}
	
	@RequestMapping("/toCheck")
	public String toCheck(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		return "check";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public ajaxDAO list(@RequestParam("number")String number,@RequestParam("password")String password,@RequestParam("currentPage")String currentPage) throws ServletException, IOException {
				int num=Integer.parseInt(number);
				log.info("number"+number);
				log.info("password"+password);
				log.info("currentPage"+currentPage);
				currentPage=currentPage ==null ? "1" : currentPage;
				try {
					Fenye list = service.List(num, password, Integer.parseInt(currentPage));//��ȡ��¼
					log.info("totalPage"+list.getTotalPage());
					return ajaxDAO.success(list);
				}
				catch(Exception e) {
					return ajaxDAO.failure(e.getMessage());
				}
		}
	
	@RequestMapping("/toList")
	public String toList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		return "list";
	
	}
	
	@RequestMapping("/toChangePassword")
	public String toChangePassword(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		return "password";
	}
	
	@RequestMapping("/password")
	@ResponseBody
	public ajaxDAO  password(String oldPassword, String newPassword,HttpServletRequest req) throws ServletException, IOException {
		String a=req.getParameter("number");
		int number=Integer.parseInt(a);
		try {
			Card cad=service.Get(number,oldPassword);
			Card card=service.ChangePassword(number, oldPassword, newPassword);
			return ajaxDAO.success(card);
		}
		catch(Exception e) {
			return ajaxDAO.failure(e.getMessage());
		}
	}
	
	@RequestMapping("/toUsercenter")
	public String toUsercenter(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("--------");
		javax.servlet.http.HttpSession session = req.getSession();
		String username= (String) session.getAttribute("username");
		log.info("username"+username);
		String currentPage = req.getParameter("currentPage");
		currentPage=currentPage ==null ? "1" : currentPage;//ע������ķ�ҳ��̨ʵ��
		Fenye list=cardservice.list(username, Integer.parseInt(currentPage));
		req.setAttribute("fenye", list);
		req.setAttribute("currentPage", Integer.parseInt(currentPage));
		req.setAttribute("username", username);
		return "usercenter";
	}
	
	@RequestMapping("/toInformation")
	public String toInformation	(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String a=req.getParameter("number");
		int number=Integer.parseInt(a);
		req.setAttribute("number", number);
		return "information";
	}
	
	@RequestMapping("/information")
	@ResponseBody
	public ajaxDAO information(HttpServletRequest req,String number,String password)throws ServletException, IOException {
		Card card=service.Get(Integer.parseInt(number),password);
		if(card==null) {
			return ajaxDAO.failure("ʧ��");
		}
		else {
			return ajaxDAO.success(card);
		}
		/*return "success3";*/
	}

	/*
	 * ע������ķ�������,���е�number��password�����ǰ�˵�nameһ��,
	 * �����ǰ�˵�Ҫȡ����������ͬ,������Ϊ���Ǵ�ǰ�˻�ȡ�����Ա��붼����ΪString����
	 * ������Խ��information��jspҳ�濴�Ͷ���,��Ҳ��Spring-MVC���÷���ɫ,��ȡǰ�˵�����
	 * ����Ҫ��request��ȡ,����ֱ�ӻ�ȡ���ǲ��������ǰ�˵�name��ͬ
	 */
	
	@RequestMapping("/flow")
	@ResponseBody
	public ajaxDAO flow(HttpSession session) throws ServletException, IOException {
		User user=(User)session.getAttribute("user");
		String username=user.getUsername();
		if(null!=username) {
			ArrayList<Card>list=cardservice.flow(username);//ע������redis�����ʹ�ý��뷽���в鿴
			return ajaxDAO.success(list);
		}
		else {
			return ajaxDAO.failure("��������");
		}
		
	}
}
