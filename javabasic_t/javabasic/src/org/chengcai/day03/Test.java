package org.chengcai.day03;

import java.util.Scanner;

public class Test {
	

	 public static void main(String[] args) {
		
		 /**
			 *   1������Ƕ����ϰ��
			 *    �԰��ţ�
			 *      �����һ�䰵����ȷ ����Ҫ�ҵڶ��䰵�š�
			 *      �����һ�䰵�Ų���ȷ��ֱ�Ӳ���Ҫ�ҵڶ��䰵�š�
			 *     Ҫ��
			 *     1���û�������ȷ�ĵ�һ�䰵�� ����������� ���û�����ڶ��䰵�� ��
			 *     �����жϵڶ��䰵���Ƿ���ȷ
			 *     2������ڶ��䰵����ȷ ������ʾ����֮ Ҳ������Ӧ����ʾ��
			 *     
			 */
		 
		 System.out.println("�����ǵػ�����̨����԰���");
		 Scanner s =new Scanner(System.in);
		 String str1 =s.nextLine();
		 if(str1.equals("С����Ģ��")){
			 System.out.println("��������һƬ��");
			 String str2 =s.nextLine();
			 if(str2.equals("��ѻ������Ⱥ")){
				 System.out.println("���");
			 }else{
				 System.out.println("����˭��");				 
			 }			 
		 }else{			 
			System.out.println("�߿�"); 
		 }
		 
		 
		 
	}

	
	
	
	
}
