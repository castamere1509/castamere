package org.chengcai.day04;

/**
 * 循环01
 * 
 * while(条件表达式){
 *    语句块
 * }
 * 
 * 条件表达式成立，运行大括号里面的语句块，运行玩一次后重新取对条件表达式进行判断
 *
 */

public class Loop01 {
	
	
	public static void main(String[] args) {
		
		//打印1-100的整数
		int i =1;
		while(i<=100){
			System.out.println(i);
			i++;
		}
		//千万不要写死循环
		/*
		int a =1;
		while(a>0){
			System.out.println(a);
			a++;
		}
		*/
		
		//打印1-100的偶数
		i=1;
		while(i<=100){
			if(i%2==0){
				System.out.println(i);
			}
			i++;
		}
		
		
		//打印1到2020年所有的闰年
		i =1;
		while(i<=2020){
			if(i%4==0 && i%100!=0 || i%400==0){
				System.out.println(i);				
			}
			i++;
		}
		
		//统计1到2020年有多少个闰年
		i=1;
		int count =0;
		while(i<=2020){
			if(i%4==0 && i%100!=0 || i%400==0){
				count = count+1;
			}
			i++;
			
		}
		System.out.println(count);
		
		//打印1-100的和；
		i =1;
		int sum=0;
		while(i<=100){
			sum = sum+i;
			i++;
			
		}
		System.out.println(sum);
		
		//倒序输出1-100的整数
		i = 100;
		while(i>=1){
			System.out.println(i);
			i--;
		}
				
		
		
	}
	
	
	

}
