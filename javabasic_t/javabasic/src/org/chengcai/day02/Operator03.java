package org.chengcai.day02;
/**
 * java�е��������+  -  *  /   %
 *
 *
 */

public class Operator03 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);//30
		int d = a-b;
		System.out.println(d);//-10
		int e = a*b;
		System.out.println(e);//200
		int f =a / b;
		System.out.println(f);//0
		//a��int���ͣ�bΪint���ͣ�a/b�Ľ��Ϊint���ͣ�int��0.5 ����0
		
		double d1 =10;
		double d2 =d1 / b;
		System.out.println(d2);//0.5
		
		//ȡ��  %
		//�κ�ֵ�Ա������ֵȡ�඼����������
		//�κ�ֵ��1ȡ�඼����0
		//��2ȡ�࣬ż����0��������1
		System.out.println(1%2);//1
		System.out.println(2%2);//0
		System.out.println(3%2);//1
		System.out.println(4%2);//0
		System.out.println(5%2);//1
		
		
		
		
	}
	
	

}
