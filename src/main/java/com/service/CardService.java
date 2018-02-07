package com.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.BankCard.Card;
import com.control.cardControl;
import com.fenye.Fenye;
import com.inter.CardDAO;



@Component	//�����ע����Ϊ�˷���Control�еı�������
@Transactional
public class CardService {
	
	@Autowired
	private CardDAO cardDao;
	
	@Autowired
	private  redisService redis;
	
	private  Logger log=LoggerFactory.getLogger(CardService.class);
	
	public Fenye List(int number,int currentPage) {
		int totalNumber=cardDao.totalNumber(number);
		Fenye fenye=new Fenye(totalNumber, currentPage);
		 ArrayList<Card>list=cardDao.List(number, fenye.getcurrentNumber(), fenye.move);
		 fenye.setObject(list);//����ȡ�ļ�¼����
		 log.info(">>>>>>>>"+fenye);
		 return fenye;
	}
	
	public Fenye list(String username,int currentPage) {
		int totalNumber=cardDao.total(username);
		System.out.println(totalNumber);
		Fenye fenye=new Fenye(totalNumber, currentPage);
		 ArrayList<Card>list=cardDao.list(username, fenye.getcurrentNumber(), fenye.move);
		 fenye.setObject(list);//����ȡ�ļ�¼����
		 return fenye;
	}
	
	public  ArrayList<Card> flow(String username) {
		 ArrayList<Card>list=(ArrayList<Card>) redis.List(username);
		 if(null==list||list.isEmpty()) {
			list=cardDao.flow(username);
			 redis.Set(username, list);
		 }
		 return list;
	}
	//ע���������redis�������������û���ķ�ʽ����������������ھ���ӻ���,�������п�,����������Ҳ��һ���ı׶�,�����������Control����
	
	
}
