package org.chengcai.day11abstract01;

public class Abs03 extends Abs01 {

	@Override
	public boolean login(String username, String password) {
		if(username.equals("大花")&&password.equals("1234")){
			 return true;//一个方法体只会运行一次return
		 }
		return false;
	}
	
	

}
