package com.message;

import org.springframework.stereotype.Component;

public class messageDTO {
	
	private int UnReadNumber;
	
	private Object obj;
	
	private Boolean success;

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public int getUnReadNumber() {
		return UnReadNumber;
	}

	public void setUnReadNumber(int unReadNumber) {
		UnReadNumber = unReadNumber;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public messageDTO(int unReadNumber, Object obj, Boolean success) {
		super();
		UnReadNumber = unReadNumber;
		this.obj = obj;
		this.success = success;
	}

	public static messageDTO success(int unReadNumber, Object obj) {
		return new messageDTO(unReadNumber, obj, true);
	}	

}

//���������ĸ��������ʵajax����ʽ�������ⶨ���,���Ը�������Ĳ�ͬ������ʵ�ajax��ʽ 

