package org.chengcai.day07;
/**
 * ֵ����:java��������ʱ���ݱ�����ֵ,�����Ǳ�������
 * 
 */
public class Function05 {
	public static int add(int a,int b){
		a =a+10;//a=20;
		b =b+10;//b=30;
		
		return a+b;
	}

	
public static void main(String[] args){
	
	int a=10;
	int b=20;
	int i=add(a,b);//���͸���������10��20����ֵ,����a��b��������������
	System.out.println(i);//50
}
	
	
}
