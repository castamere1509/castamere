package org.chengcai.day04;

import java.util.Scanner;

public class HomeWork2 {
	
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
		*写一段代码，从控制台输入两个数字，生成数字对应行列的矩形
		*/
	
	
	public static void main(String[] args) {
		//控制台输出三角形和菱形		
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
	
		/*打印所有“水仙花数”，水仙花数指的时三位数，其各位数字的立方和等于该数本身，
		*比如153是-个水仙花数，因为153=1的三次方+5的三次方+3的三次方*/
		
		for(int i =100;i<=999;i++){
			if(i==(i/100)*(i/100)*(i/100)+((i%100)/10)*((i%100)/10)*((i%100)/10)+(i%10)*(i%10)*(i%10)){
				System.out.println(i);
			}

			
		}	
		
		
		
		/*利用循环，实现下面数据的输出结果
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
		
	  
		/*从控制台接收两个数字，利用变量将这两个数字进行互换，
		*比如a接收3，b接收4，最后输出a为4，b为3*/
		
		//
		/*Scanner sc=new Scanner(System.in);
		System.out.println("输入a的值");
		int a=sc.nextInt();//3
		System.out.println("输入b的值");
		int b=sc.nextInt();//4
		int c;//作为一个暂时的容器
		c=a;//c的值赋予为3   a的值还是3
		a=b;//a的值赋予是4   b的值还是4
		b=c;//b的值赋予为3   c的值还是3
		System.out.println("a的值为："+a);
		System.out.println("b的值为："+b);*/
		
		
		
		
		/*本金10000存入银行，年利率为千分之三，每过一年，将本金和利息相加作为新的本金,
		*计算5年后取回的钱是多少?*/
		double summ=10000;
		for(int i=1;i<=5;i++){
			summ=summ*1.003;			
		}
		System.out.println(summ);
		
		
		//*写一段代码，从控制台输入两个数字，生成数字对应行列的矩形
		//打印空心矩形
		Scanner s=new Scanner(System.in);
		System.out.println("输入行的值");
		int d=s.nextInt();
		System.out.println("输入列的值");
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
