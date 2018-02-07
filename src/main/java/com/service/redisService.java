package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.BankCard.Card;

@Service
public class redisService {
	
	@Autowired
	private RedisTemplate<String, String> template;
	
	 @Resource(name="redisTemplate")
	private ValueOperations<String, List<Card>> card;//ע�������CardҪ�̳����л�,�����redisTemplate���������ļ��ж�Ӧ��id
	 
	 public List<Card>List(String username){
		 String key="card="+username;
		 return  card.get(key);
	 }
	 
	 public void Set(String username,List<Card> cad) {
		 String key="card="+username;
		 card.set(key, cad);
	 }
	 
	 
	 public void del(String username) {
		 String key="card="+username;
		template.delete(key);
	 }
}
//ע�������redis�ķ����ֱ�Ϊ���滺�� ��ӻ���  ɾ������  ��������Ҫע��ɾ������
