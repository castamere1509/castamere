package org.chengcai.day04;

import java.util.Scanner;

public class HomeWork {
	
	/**
	 *  用while 打印1-100内555的因数
	 *  
	 *  用while 打印1-100内包含5或者5的倍数的整数
	 *  
	 *  用do...while打印5的阶乘
	 * 
	 *  用do...while统计1-100内包含5或者5的倍数的整数有多少个
	 *  
	 *  结合Scanner统计int a有多少个因数
	 *   
	 * 
	 */
	public static void main(String[] args) {
		//用while 打印1-100内555的因数
		int i=1;
		while(i<=100){
			if(555%i==0){
				System.out.println(i);
			}
			
			i++;
		}
		
		
		
		//用while 打印1-100内包含5或者5的倍数的整数
		
		i=1;
		while(i<=100){
			if(i%5==0 || (i+"").contains("5")){
				System.out.println(i);				
			}
			
			i++;
		}
		
		
		
		

		//用do...while打印5的阶乘
		i=1;               // 1  2   3   4     5
		int sum=1;         // 1  1   2   6     24
		do{
			sum=i*sum;     //1   2   6   24    120
			i++;
		}while(i<=5);
		System.out.println(sum);		
				
		
		//用do...while统计1-100内包含5或者5的倍数的整数有多少个
		i=1;
		int count =0;
		do{
			if(i%5==0 || (i+"").contains("5")){
					count++;		
			}
			
			i++;
		}while(i<=100);
	     System.out.println(count);
		
		
		
		//结合Scanner统计int a有多少个因数
		
	     Scanner s =new Scanner(System.in);
	     System.out.println("请输入变量的值");
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
