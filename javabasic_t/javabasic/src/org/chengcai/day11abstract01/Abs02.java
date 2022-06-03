package org.chengcai.day11abstract01;

//一个类可以继承抽象类，一旦继承必须实现(覆盖)抽象类中的抽象方法

public class Abs02 extends Abs01 {

	@Override//覆盖和重写
	public boolean login(String username, String password) {
		 if(username.equals("小花")&&password.equals("123456")){
			 return true;//一个方法体只会运行一次return
		 }
		return false;
	}
	
	

}
