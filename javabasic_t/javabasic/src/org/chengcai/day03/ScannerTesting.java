package org.chengcai.day03;

import java.util.Scanner;

public class ScannerTesting {
         public static void main(String[] args) {
        	 Scanner sc = new Scanner(System.in);
        	 System.out.println("请输入本次考试成绩：");
        	 int score = sc.nextInt();
       	         	    		
     		if(score>=0 && score<60){
     			System.out.println("不及格");
     		}else if(score >=60 && score <80){
     			System.out.println("成绩良好");
     		}else if(score >=80 && score<100){
     			System.out.println("成绩优秀");
     		}else if(score ==100){
     			System.out.println("非常完美");
     		}else{
     			System.out.println("成绩异常");
     		}
        	
     		
     		
        	 
        	 
		}

		
	
	
}
