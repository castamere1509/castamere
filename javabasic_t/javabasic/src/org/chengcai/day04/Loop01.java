package org.chengcai.day04;

/**
 * ѭ��01
 * 
 * while(�������ʽ){
 *    ����
 * }
 * 
 * �������ʽ���������д�������������飬������һ�κ�����ȡ���������ʽ�����ж�
 *
 */

public class Loop01 {
	
	
	public static void main(String[] args) {
		
		//��ӡ1-100������
		int i =1;
		while(i<=100){
			System.out.println(i);
			i++;
		}
		//ǧ��Ҫд��ѭ��
		/*
		int a =1;
		while(a>0){
			System.out.println(a);
			a++;
		}
		*/
		
		//��ӡ1-100��ż��
		i=1;
		while(i<=100){
			if(i%2==0){
				System.out.println(i);
			}
			i++;
		}
		
		
		//��ӡ1��2020�����е�����
		i =1;
		while(i<=2020){
			if(i%4==0 && i%100!=0 || i%400==0){
				System.out.println(i);				
			}
			i++;
		}
		
		//ͳ��1��2020���ж��ٸ�����
		i=1;
		int count =0;
		while(i<=2020){
			if(i%4==0 && i%100!=0 || i%400==0){
				count = count+1;
			}
			i++;
			
		}
		System.out.println(count);
		
		//��ӡ1-100�ĺͣ�
		i =1;
		int sum=0;
		while(i<=100){
			sum = sum+i;
			i++;
			
		}
		System.out.println(sum);
		
		//�������1-100������
		i = 100;
		while(i>=1){
			System.out.println(i);
			i--;
		}
				
		
		
	}
	
	
	

}
