package org.chengcai.day11abstract01;

/**
 * 
 * ���󷽷���������abstract���Σ�û�з����壬ֻ������������ʵ�ַ���
 * �����ࣺ������abstract���Σ����԰������󷽷�����ͨ�������ࡣ
 *         һ������Լ̳г����࣬һ���̳б���ʵ��(����)�������еĳ��󷽷�
 * 
 * �ӿڣ�ʹ�� interface���Σ����԰������󷽷��;�̬����
 * 
 * ��ͬ�㣺������ֻ�ܱ��̳У�һ����ֻ�ܼ̳�һ����
 *         �ӿ�ֻ�ܱ�ʵ�֣�һ�������ʵ�ֶ���ӿ�
 *         
 *  ��ͬ�㣺�̳�һ�����������ʵ��һ���ӿڣ�����ʵ���������г��󷽷�
 *          ������ͽӿڶ�û��ʵ�����󣬲��� ��newȥ����ʵ������       
 * 
 * 
 * 
 * 
 * 
 * 
 */

public abstract class Abs01 {

	public abstract boolean login(String username,String password);//���󷽷�
	
	public  int add(int a,int b){//��ͨ����
		return a+b;
	}
	
	
}
