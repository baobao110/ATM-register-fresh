package com.inter;

import java.sql.Connection;
import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.AccountFlow.Account;

public interface AccountDAO {
	public int add(Account account);//��Ӽ�¼
	public ArrayList<Account> List(@Param("number")int number,@Param("currentNumber")int currentNumber,@Param("move")int move);
	/*
	 * ��������Ƿ��ط�ҳ�и�ҳ�����м�¼��number�ǲ�ѯ�Ŀ���,currentNumber��ָ��ǰҳ����ʼҳ������¼,moveָ��ҳ��ʾҳ�������
	 */
	public int totalNumber(int number);//��ȡ���еļ�¼����
	
	public ArrayList<Account> ten(String username);
}
