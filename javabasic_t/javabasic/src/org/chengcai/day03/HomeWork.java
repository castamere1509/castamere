package org.chengcai.day03;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		
		/**
		��ϰ��
		  ��Ŀ1�� ����һ��int ���͵ı����� ����ʹ��if...else ��ӡ������ż����������
		                ��ʾ��ż����2ȡ��Ϊ0

		  ��Ŀ2��  �ж��Ƿ�Ϊ����
		         year ��4�����Ҳ��ܱ�100������year ������400�ı�����������

		  ��Ŀ3�� ���Ϻ���������4�ɳ���
		          0-7�� ��  BS001���г�
		          9-12�� ��  BS002���г�
		          14-16�� BS003
		          18-20�� �� BS004
		                ����ʱ���޳�������дһ�γ����ж���ͬ��ʱ���ӡ����Ӧ�ĳ���
		 * 
		 */	
		
		
		
		
		
	//����һ��int ���͵ı����� ����ʹ��if...else ��ӡ������ż����������
		Scanner s =new Scanner(System.in);
		System.out.println("��������Ҫ�ж���ż������");
		int a =s.nextInt();
		if(a%2 == 0){
			System.out.println(a+"��ż��");
		}else{
			System.out.println(a+"������");
		}
		
	//�ж��Ƿ�Ϊ����
		System.out.println("���������");
		int year =s.nextInt();
		if(year%4==0 && year%100 !=0 || year%400==0){
			System.out.println(year+"������");
		}else{
			System.out.println(year+"��������");
		}
		/*
		  ��Ŀ3�� ���Ϻ���������4�ɳ���
          0-7�� ��  BS001���г�
          9-12�� ��  BS002���г�
          14-16�� BS003
          18-20�� �� BS004
                ����ʱ���޳�������дһ�γ����ж���ͬ��ʱ���ӡ����Ӧ�ĳ���
 * 
 */	    
		System.out.println("������ʱ��");
		int time =s.nextInt();
		if(time >=0 && time<=7){
			System.out.println("�� BS001���г�");
		}else if(time >=9 && time<=12){
			System.out.println("�� BS002���г�");
		}else if(time >=14 && time <=16){
			System.out.println("�� BS003���г�");
		}else if(time >=18 && time <=20){
			System.out.println("�� BS004���г�");
		}else{
			System.out.println("�޳�����");
		}
		
		
		
		
		/**
		 *   1������Ƕ����ϰ��
		 *    �Ұ��ţ�
		 *      �����һ�䰵����ȷ ����Ҫ�ҵڶ��䰵�š�
		 *      �����һ�䰵�Ų���ȷ��ֱ�Ӳ���Ҫ�ҵڶ��䰵�š�
		 *     Ҫ��
		 *     1���û�������ȷ�ĵ�һ�䰵�� ����������� ���û�����ڶ��䰵�� �������жϵڶ��䰵���Ƿ���ȷ
		 *     2������ڶ��䰵����ȷ ������ʾ����֮ Ҳ������Ӧ����ʾ��
		 *     
		 */
		
		
		
		
		
	}
	

}
