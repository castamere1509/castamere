package org.chengcai.day11interface02;

public class Inc03 implements Inc01 {

	@Override
	public boolean login(String username, String password) {
		if(username.equals("��")&&password.equals("1234")){
			return true;//һ��������ֻ������һ��return
		}
		return false;
	}

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

}
