package org.chengcai.day11interface02;

//Inc02类 实现  Inc01接口   必须要实现 Inc01接口 所有抽象的方法

public class Inc02 implements Inc01 {

	@Override
	public boolean login(String username, String password) {
		 if(username.equals("小花")&&password.equals("123456")){
			 return true;//一个方法体只会运行一次return
		 }
		return false;
	}

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	
	
	
}
