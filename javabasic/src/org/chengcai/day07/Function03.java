package org.chengcai.day07;
/**
 * 
 * ����Ȩ��            ��      ��       ����       ������
 * public     V  V	  V		V   (���κ��˶��ǿ��õ�)
 * protecte   V  V    V     X   (�̳е�����Է����Լ���privateһ����Ȩ��)
 * default    V  V    X     X   (������Ȩ��,�����������ھ��ɱ�����)
 * private    V  X    X     X   (���͵��ڲ�����֮����κ��˶����ܷ��ʵ�Ԫ��)
 */
public class Function03 {
	//����Ȩ�޷���
	public static int add(int a,int b){
		return a+b;
	}
    //˽��Ȩ�޷���
	private static int adds(int a,int b){
		return a+b;
	}
	
public static void main(String[] args){
	//�������
	int i =add(1,2);//��̬����,����ֱ��ʹ������,����������,ǰ����Ȩ���㹻
	System.out.println(i);
	
	i =adds(1,2);//ͬ����,�ɵ���privateȨ�޷���
	System.out.println(i);
	
}
	
	
}
