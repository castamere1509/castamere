package org.chengcai.day07;

import org.chengcai.day06.TestKuaBao1;//�Զ�������testkuabao������TestKuaBao1�࣬Ҳ���ֶ�����

//�������------------------------------------




/**
 * 1.���еķ�����֧��ͬ�����
 * 2.ͬһ�������໥���ã�����ʹ��private,˽�е�ֻ�ڱ������
 * 3.������ã������õķ���������public��
 */


public class Function04 {
		
	public static void main(String[] args) {
		
		//�������
		int i =Function03.add(1, 2);//��̬����������ֱ��ʹ������.���������ã�ǰ����Ȩ���㹻
		System.out.println(i);
		
		//�������
		int j=TestKuaBao1.add(5, 2);//������ñ��������
		System.out.println(j);
		
		//�������privateȨ��
		//Function03.adds(1,2); //����ֱ�ӱ���˽�е�ֻ�ڱ�����ã������ط�������
		
	}
	

}
