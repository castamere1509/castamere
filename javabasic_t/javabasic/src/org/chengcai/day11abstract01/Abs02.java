package org.chengcai.day11abstract01;

//һ������Լ̳г����࣬һ���̳б���ʵ��(����)�������еĳ��󷽷�

public class Abs02 extends Abs01 {

	@Override//���Ǻ���д
	public boolean login(String username, String password) {
		 if(username.equals("С��")&&password.equals("123456")){
			 return true;//һ��������ֻ������һ��return
		 }
		return false;
	}
	
	

}
