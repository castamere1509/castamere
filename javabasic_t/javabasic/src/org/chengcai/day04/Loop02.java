package org.chengcai.day04;

/**
 * 循环02
 * 
 * do{
 * 语句块
 * }while(条件)
 *do ....while 循环的特性，先执行一次语句块，再进行判断，所以该循环最少执行一次
 *
 */

public class Loop02 {
	
	
	public static void main(String[] args) {
		
			//打印1-100的整数
		  int i =1;
		  do{
			  System.out.println(i);
			  i++;
		  }while(i<=100);
		
		//打印1-100的偶数
		  i=1;
		  do{
			  if(i%2==0){
				  System.out.println(i);
			  }
			  i++;
		  }while(i<=100);
		
		  //打印1-2020年的闰年
		  i=1;
		  do{
			  if(i%4==0 && i%100!=0 || i%400==0){
				  System.out.println(i);
			  }
			  i++;
		  }while(i<=2020);
		  
		  
		  
		  
		  //打印1-100的偶数和
		  i=1;
		  int sum=0;
		  do{
			  if(i%2==0){
				  sum =sum+i;
			  }
			  i++;
		  }while(i<=100);
		  System.out.println(sum);
		  
		  
		  
		  //统计1-2020年有多少个闰年
		i=1;
		int count=0;
		do{
			if(i%4==0 && i%100!=0 || i%400==0){
				count++;
			}
			i++;
		}while(i<=2020);
		System.out.println(count);
		 
		  
		  
		  
	}
	

}
