package org.chengcai.day03;

import java.util.Scanner;

public class ScannerTesting {
         public static void main(String[] args) {
        	 Scanner sc = new Scanner(System.in);
        	 System.out.println("�����뱾�ο��Գɼ���");
        	 int score = sc.nextInt();
       	         	    		
     		if(score>=0 && score<60){
     			System.out.println("������");
     		}else if(score >=60 && score <80){
     			System.out.println("�ɼ�����");
     		}else if(score >=80 && score<100){
     			System.out.println("�ɼ�����");
     		}else if(score ==100){
     			System.out.println("�ǳ�����");
     		}else{
     			System.out.println("�ɼ��쳣");
     		}
        	
     		
     		
        	 
        	 
		}

		
	
	
}
