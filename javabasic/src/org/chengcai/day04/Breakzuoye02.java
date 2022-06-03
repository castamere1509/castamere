package org.chengcai.day04;

import java.util.Scanner;

/**
		*计算5的阶乘，5!的结果是?
		*
		打印九九乘法表
		
		*打印所有“水仙花数”，水仙花数指的时三位数，其各位数字的立方和等于该数本身，
		*比如153是-个水仙花数，因为153=1的三次方+5的三次方+3的三次方
		*
		*控制台输出三角形和菱形
		*
		*计算所有1000以内所有不能被7整除的整数之和
		*
		*从控制台接收两个数字，利用变量将这两个数字进行互换，
		*比如a接收3，b接收4，最后输出a为4，b为3
		*
		*利用循环，实现下面数据的输出结果
		* 1-3+5- 7+9- 11+13......-99+101
		* 
		*本金10000存入银行，年利率为千分之三，每过一年，将本金和利息相加作为新的本金,
		*计算5年后取回的钱是多少?
		*
 *
 */
public class Breakzuoye02 {
	public static void main(String[] args){
	//	计算5的阶乘，5!的结果是?
		/*
		int s=1;
		for(int i=1;i<=5;i++){
			s=i*s;
		}System.out.println(s);
		*/
	//打印九九乘法表
		/*
		for(int i=1;i<=9;i++){
		 for(int q=1;q<=i;q++){
			 System.out.print(i+"*"+q+"="+(i*q)+" ");
		 }System.out.println();
		}
		*/
	//*打印所有“水仙花数”，水仙花数指的时三位数，其各位数字的立方和等于该数本身，
	//*比如153是-个水仙花数，因为153=1的三次方+5的三次方+3的三次方	
    /*
     for(int i=100;i<=999;i++){
    	 int q=i/100;
    	 int w=(i-q*100)/10;
    	 int e=i-q*100-w*10;
    	 if(i==q*q*q+w*w*w+e*e*e){
    		 System.out.println(i);
    	 } 
     } 
     */
	/*	
     for(int i=100;i<=999;i++){
if(i==(i/100)*(i/100)*(i/100)+((i%100)/10)*((i%100)/10)*((i%100)/10)+(i%10)*(i%10)*(i%10)){
	System.out.println(i);
}
     }
		*/
    // *控制台输出三角形和菱形		
	/*	
	for(int a=4;a>=1;a--){
		for(int b=1;b<=7;b++){
		if(b==a || b==8-a ){
			System.out.print("*");
		}else{
			System.out.print(" ");
		}
		}System.out.println("");
	}for(int i=2;i<=4;i++){
		for(int b=1;b<=7;b++){
		if(b==i||b==8-i){
			System.out.print("*");
		}else{
			System.out.print(" ");
		}
		} System.out.println("");	
	} */
		/*
	for(int i=6;i>=1;i--){
		for(int j=1;j<=11;j++){
		if(j>=i && j<=12-i ){
			System.out.print("*");
		}else{
			System.out.print(" ");
		}
		}System.out.println("");
	}
	*/
  //控制台
	/*	
  Scanner sc = new Scanner(System.in);
  System.out.println("请输入第一个数据");
   int a = sc.nextInt();
	for(int i=a;i>=1;i--){
	for(int j=1;j<=a*2-1;j++){
	if(j>=i && j<=a*2-i){
		System.out.print("*");
	}else{
		System.out.print(" ");
	}
	}System.out.println("");
	}
	*/

	Scanner sc = new Scanner(System.in);
	System.out.println("请输入第一个数据");
    int x = sc.nextInt();
  
	for(int a=x;a>=1;a--){
		for(int b=1;b<=x*2-1;b++){
		if(b==a || b==x*2-a ){
			System.out.print("*");
		}else{
			System.out.print(" ");
		}
		}System.out.println("");
	}for(int i=x/2;i<=x;i++){
		for(int b=1;b<=x*2-1;b++){
		if(b==i||b==x*2-i){
			System.out.print("*");
		}else{
			System.out.print(" ");
		}
		} System.out.println("");	
	} 
	//*计算所有1000以内所有不能被7整除的整数之和
	for(int i=1;i<=1000;i++){
		if(i%7!=0){
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
		
	}
}
