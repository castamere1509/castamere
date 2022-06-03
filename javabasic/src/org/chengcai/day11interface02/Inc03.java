package org.chengcai.day11interface02;

public class Inc03 implements Inc01 {

	@Override
	public boolean login(String username, String password) {
		if(username.equals("大花")&&password.equals("1234")){
			return true;//一个方法体只会运行一次return
		}
		return false;
	}

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

}
