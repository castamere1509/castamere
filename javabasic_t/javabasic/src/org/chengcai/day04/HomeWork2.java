package org.chengcai.day04;

import java.util.Scanner;

public class HomeWork2 {
	
		/**
		*����5�Ľ׳ˣ�5!�Ľ����?
		*
		��ӡ�žų˷���
		
		*��ӡ���С�ˮ�ɻ�������ˮ�ɻ���ָ��ʱ��λ�������λ���ֵ������͵��ڸ�������
		*����153��-��ˮ�ɻ�������Ϊ153=1�����η�+5�����η�+3�����η�
		*
		*����̨��������κ�����
		*
		*��������1000�������в��ܱ�7����������֮��
		*
		*�ӿ���̨�����������֣����ñ��������������ֽ��л�����
		*����a����3��b����4��������aΪ4��bΪ3
		*
		*����ѭ����ʵ���������ݵ�������
		* 1-3+5- 7+9- 11+13......-99+101
		* 
		*����10000�������У�������Ϊǧ��֮����ÿ��һ�꣬���������Ϣ�����Ϊ�µı���,
		*����5���ȡ�ص�Ǯ�Ƕ���?
		*
		*дһ�δ��룬�ӿ���̨�����������֣��������ֶ�Ӧ���еľ���
		*/
	
	
	public static void main(String[] args) {
		//����̨��������κ�����		
		for(int i =4;i>=1;i--){
			for(int j=1;j<=7;j++){
				if(j==i || j==8-i ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
			
		}
		for(int i=2;i<=4;i++){
			for(int j=1;j<=1000;j++){
				if(j==i || j==8-i){
					System.out.print("*");					
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
			
		}
	
		/*��ӡ���С�ˮ�ɻ�������ˮ�ɻ���ָ��ʱ��λ�������λ���ֵ������͵��ڸ�������
		*����153��-��ˮ�ɻ�������Ϊ153=1�����η�+5�����η�+3�����η�*/
		
		for(int i =100;i<=999;i++){
			if(i==(i/100)*(i/100)*(i/100)+((i%100)/10)*((i%100)/10)*((i%100)/10)+(i%10)*(i%10)*(i%10)){
				System.out.println(i);
			}

			
		}	
		
		
		
		/*����ѭ����ʵ���������ݵ�������
		* 1-3+5- 7+9- 11+13......-99+101*/
		  int sum=0;
		for(int i=1;i<=101;i++){
			if(i%2==1){
				sum =sum+i;
				if(i==101){
					break;
				}
				i=i+2;
				sum =sum-i;				
			}
	
		}
		
		System.out.println(sum);
		
	  
		/*�ӿ���̨�����������֣����ñ��������������ֽ��л�����
		*����a����3��b����4��������aΪ4��bΪ3*/
		
		//
		/*Scanner sc=new Scanner(System.in);
		System.out.println("����a��ֵ");
		int a=sc.nextInt();//3
		System.out.println("����b��ֵ");
		int b=sc.nextInt();//4
		int c;//��Ϊһ����ʱ������
		c=a;//c��ֵ����Ϊ3   a��ֵ����3
		a=b;//a��ֵ������4   b��ֵ����4
		b=c;//b��ֵ����Ϊ3   c��ֵ����3
		System.out.println("a��ֵΪ��"+a);
		System.out.println("b��ֵΪ��"+b);*/
		
		
		
		
		/*����10000�������У�������Ϊǧ��֮����ÿ��һ�꣬���������Ϣ�����Ϊ�µı���,
		*����5���ȡ�ص�Ǯ�Ƕ���?*/
		double summ=10000;
		for(int i=1;i<=5;i++){
			summ=summ*1.003;			
		}
		System.out.println(summ);
		
		
		//*дһ�δ��룬�ӿ���̨�����������֣��������ֶ�Ӧ���еľ���
		//��ӡ���ľ���
		Scanner s=new Scanner(System.in);
		System.out.println("�����е�ֵ");
		int d=s.nextInt();
		System.out.println("�����е�ֵ");
		int f=s.nextInt();
		
		for(int i=1;i<=d;i++){
       	 for(int j=1;j<=f;j++){
       		 if(i==1 || i==d || j==1 || j==f){
       			System.out.print("*"); 
       		 }else{
       			 System.out.print(" ");
       		 }
       		 
       		 
       	 }       	 
       	 System.out.println("");
        }
		
		
		
	}
	

	
	
	

}
