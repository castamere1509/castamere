package org.chengcai.day11interface02;

//Inc02�� ʵ��  Inc01�ӿ�   ����Ҫʵ�� Inc01�ӿ� ���г���ķ���

public class Inc02 implements Inc01 {

	@Override
	public boolean login(String username, String password) {
		 if(username.equals("С��")&&password.equals("123456")){
			 return true;//һ��������ֻ������һ��return
		 }
		return false;
	}

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	
	
	
}
