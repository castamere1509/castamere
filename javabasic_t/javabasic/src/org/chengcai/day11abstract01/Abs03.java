package org.chengcai.day11abstract01;

public class Abs03 extends Abs01 {

	@Override
	public boolean login(String username, String password) {
		if(username.equals("��")&&password.equals("1234")){
			 return true;//һ��������ֻ������һ��return
		 }
		return false;
	}
	
	

}
