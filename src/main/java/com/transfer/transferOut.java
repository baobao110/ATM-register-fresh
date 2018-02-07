package com.transfer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.inter.HistoryDAO;
import com.record.history;
import com.service.Service;

@Component("Out")
public class transferOut {
	
	@Autowired
	private HistoryDAO historyDao;
	
	@Autowired
	private Service service;
	
	private Logger log=LoggerFactory.getLogger(transferOut.class);
	
	public void work() {
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, -1);//ʱ�����������Calendar�ķ���������Ҫע��add()����������
		
		Date date= cal.getTime();

		ArrayList<history> record=historyDao.record(0,date);
		
		if(null==record||record.isEmpty()) {
			log.info("������ת��");
		}
		
		else {
			for(history i:record) {
				service.Out(date,i.getId());
			}
		}
	}
	
	/*
	 * ע������ļ��ϵĲ�ѯ,������Ҫע�����ڽ��м��ϵ��б�ʱ,
	 * �ر�Ҫע�⼯�ϵĿ�ֵ����,����ļ����жϲ�����null������isEmpty()����,
	 * ��һ���֮ǰ���ļ����س���ͬ������������ļ�����ʱ����isEmpty()�ͻ�һֱ������
	 * ��һ����֮ǰ���������Ժ��ж�ʱ���������ж�Ϊ��ʱ��Ҫ��isEmpty()�ķ���
	 */
}
