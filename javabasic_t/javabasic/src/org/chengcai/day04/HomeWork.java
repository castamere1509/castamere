package org.chengcai.day04;

import java.util.Scanner;

public class HomeWork {
	
	/**
	 *  ��while ��ӡ1-100��555������
	 *  
	 *  ��while ��ӡ1-100�ڰ���5����5�ı���������
	 *  
	 *  ��do...while��ӡ5�Ľ׳�
	 * 
	 *  ��do...whileͳ��1-100�ڰ���5����5�ı����������ж��ٸ�
	 *  
	 *  ���Scannerͳ��int a�ж��ٸ�����
	 *   
	 * 
	 */
	public static void main(String[] args) {
		//��while ��ӡ1-100��555������
		int i=1;
		while(i<=100){
			if(555%i==0){
				System.out.println(i);
			}
			
			i++;
		}
		
		
		
		//��while ��ӡ1-100�ڰ���5����5�ı���������
		
		i=1;
		while(i<=100){
			if(i%5==0 || (i+"").contains("5")){
				System.out.println(i);				
			}
			
			i++;
		}
		
		
		
		

		//��do...while��ӡ5�Ľ׳�
		i=1;               // 1  2   3   4     5
		int sum=1;         // 1  1   2   6     24
		do{
			sum=i*sum;     //1   2   6   24    120
			i++;
		}while(i<=5);
		System.out.println(sum);		
				
		
		//��do...whileͳ��1-100�ڰ���5����5�ı����������ж��ٸ�
		i=1;
		int count =0;
		do{
			if(i%5==0 || (i+"").contains("5")){
					count++;		
			}
			
			i++;
		}while(i<=100);
	     System.out.println(count);
		
		
		
		//���Scannerͳ��int a�ж��ٸ�����
		
	     Scanner s =new Scanner(System.in);
	     System.out.println("�����������ֵ");
	     int a =s.nextInt();
	     i=1;
	     count =0;
	     while(i<=a){
	    	 if(a%i==0){	    		 
	    		 count++;
	    	 }
	    	 i++;
	     }
	     System.out.println(count);
		
	}
	
	

}
