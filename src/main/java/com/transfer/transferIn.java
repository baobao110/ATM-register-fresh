package com.transfer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.inter.HistoryDAO;
import com.record.history;
import com.service.Service;
import com.user.User;

@Component("In")	
public class transferIn {
	
	@Autowired
	private HistoryDAO historyDao;
	
	@Autowired
	private Service service;
	
	private Logger log=LoggerFactory.getLogger(transferIn.class);
	
	public void work() {
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, -1);//ʱ�����������Calendar�ķ���������Ҫע��add()����������
		
		Date date= cal.getTime();

		ArrayList<history> record=historyDao.recordback(date);
		
		if(null==record||record.isEmpty()) {
			log.info("������ת��");
		}
		
		else {
			ArrayList<history> back=new ArrayList<>();
			for(history i:record) {
				if(i.getStatus()==1||i.getStatus()==2) {
					log.info("=====================================����===============================================");
					back.add(i);
				}
			}
			log.info("���¼");
			for(history i:back) {
				service.In(date,i.getId());
			}
		}
	}
}

/*
 * ������Ҫע��ľ���Component��ע�ⲻȻspring�޷��ҵ�,
 * ע���spring-task�е�����һ��,���о��������ܿ������ﲻȻ�����ֻҪһ�ʲ��ɹ�������ˮ���ع�
 */
	