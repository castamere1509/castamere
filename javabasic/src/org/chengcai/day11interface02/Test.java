package org.chengcai.day11interface02;

public class Test {
	public static void main(String[] args){
		
			Inc01 i1 = new Inc02();//��̬����������ָ���������
			Inc01 i2 = new Inc03();//��̬����������ָ���������
			
			i1.login("","");//����Inc02���login����
			i2.login("", "");//����Inc03���login����
			
			//�����߼��л�
			Inc01 in =null;//����һ��Inc01���͵ı��� in
			in = new Inc02();
			in.login("", "");//����Inc02���login����
			
			in = new Inc03();
			in.login("", "");//����Inc03���login����
		
	}

}
