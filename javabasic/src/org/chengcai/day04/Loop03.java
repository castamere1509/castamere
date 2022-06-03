package org.chengcai.day04;
/**
 * 循环03  for循环
 * 
 *for(表达式1;表达式2;表达式3){
 *
 *语句块
 *}
 */
public class Loop03 {
	public static void main(String[] args){
		//打印1-100的整数
		int a=1;
		while(a<=100){
			System.out.println(a);
			a++;
		}
		
		//打印1-100的整数
		//for后面括号里面的int i=1;在本循环全部结束前，只运行一次
		//i<=100,每次循环运行一次，用来判断循环是否继续
		//i++是在每次循环结束后运行一次
		//判断》》语句块》》变量++》》判断》》语句块》》变量++》》判断》》语句块...直到判断不成立
		for(int i=1;i<=100;i++){
			System.out.println(i);
		}
		
		//打印1-100的偶数
		for(int i=1;i<=100;i++){
			if(i%2==0){
				System.out.println(i+"是偶数");
			}else{
				System.out.println(i+"是奇数");
			}
		}
		
		//打印1-2020年的闰年
		for(int i=1;i<=2020;i++){
			if(i%4==0 && i%100 !=0 || i%400==0){
				System.out.println(i);
			}
		}
		
		//打印1-2020有多少个闰年
		int c=0;
		for(int i=1;i<=2020;i++){
			if(i%4==0 && i%100 !=0 || i%400==0){
				c++;
			}
		}System.out.println(c);
		
		//倒序输出1-100
		for(int i=100;i>=1;i--){
				System.out.println(i);	
		}
		
		//打印1-100的和
		int sum=0;
		for(int i=1;i<=100;i++){
			sum=sum+i;
		}System.out.println(sum);
			
	}

}
