package org.chengcai.day04;

import java.util.Scanner;

public class Break {
	public static void main(String[] args){
		//打印1-10的整数
		for(int i=1;i<=10;i++){
			if(i == 5){
				//break;//终止这个for的所有循环
				continue;//跳过当前循环,进行下次循环
			}	System.out.println(i);
		}
		
		//打印1-100的整数,要求逢7过	
		for(int i=1;i<=100;i++){
			if(i%7 ==0 || (i+"").contains("7")){
				continue;//跳过当前循环,进行下次循环
			}	System.out.println(i);
		}
		
		//用*打印一个空心的矩形
		int l= 9;
		int h= 7;
		for (int i=0;i<h;i++) {
			for (int j=0;j<l;j++) {
				if ( i == 0 ) {
					System.out.print("*");
				}
				else if (i == h-1) {
				System.out.print("*");
			}
				else if (j == 0 || j == l-1) {
					System.out.print("*");
				}
				else {
				System.out.print(" ");
			}
			}
			System.out.println();
		}
	//使用for循环打印200-300所有的奇数和偶数
		for(int i=200;i<=300;i++){
				System.out.println(i);
		}	
	//使用for循环打印10的阶乘结果是多少？
		int s = 1;
		for(int i = 1;i <= 10;i++){
			s = s * i; 
			}
		System.out.println(s);
		//使用for循环打印如下三角形
		/******
		 *****
		 ****
		 ***
		 **
		 */

		 for(int i=7;i>0;i--){
			 for(int j=1;j<i;j++){	 
				 System.out.print("*"); 	
			 }System.out.println("");
		 }

		//使用for循环打印任意空心图形
		 int a = 11;
		 int b = 6;
		 for (int i=0;i<b;i++) {
				for (int j=0;j<a;j++) {
					if ( i == 0 ) {
						System.out.print("@");
					}else if(i == b-1 ){
						System.out.print("@");
					
					}else if(j ==0 || j== a-1){
						System.out.print("@");
					}else {
						System.out.print(" ");
					}
				}System.out.println();
		 }
	
		//使用for循环打印任意空心三角形
		
		for(int i=4;i>=1;i--){
			for(int j=1;j<=7;j++){
				if(j==i || j==(8-i) && i!=4 || i==1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		//使用for循环打印等腰三角形
		
		for(int i=4;i>=1;i--){
			for(int j=1;j<=7;j++){
				if(j==i || j==(8-i) && i!=4 || i==1){
					System.out.print("*");
				}else{
				System.out.print(" ");
				}
		}System.out.println();
		}
		
	//打印所有的“水仙花数”，水仙花数指的是三位数，其各位数字的立方和等于该数本身
		
		    for(int i=100;i<=999;i++){
			int q = i/100;
			int w = (i-q*100)/10;
			int g = i-q*100 -w*10;
			if(i==q*q*q + w*w*w + g*g*g){
				System.out.println(i);
			}
		}
		
	//控制台输出三角形和菱形	
		
		
		
	
		
		
		
	//计算所有1000以内所有不能被7整除的整数之和
		
		int x=1;
		int f = 0;
		do{
			if(x%7!=0){
			f = f+x;
			}x++;
			}while(x<=1000);
		System.out.println(f);
	
		
	//从控制台接受两个数字，利用变量将这两个数字进行互换，	
	//比如a接收到3，b接收到4，最后输出a为4，b为3
		/*
      Scanner sc = new Scanner(System.in);
      System.out.println("请输入第一个数字");     
      int a = sc.nextInt();
      System.out.println("请输入第二个数字");
	  int b = sc.nextInt();
	  int c = a+b;
	  System.out.println(a=c-a);
	  System.out.println(b=c-b);
	 */
		/*
		Scanner sc = new Scanner(System.in);
	      System.out.println("请输入第一个数字");     
	      int a = sc.nextInt();
	      System.out.println("请输入第二个数字");
		  int b = sc.nextInt();
		  int c; //作为一个暂时的容器
		    c=a;//c的值赋予为3   a的值还是3
		    a=b;//a的值赋予是4   b的值还是4
		    b=c;//b的值赋予为3   c的值还是3
		  System.out.println(a+"+"+b);
		 */
	//利用循环，实现下面数据输出的结果
	//1-3+5-7+9-11+13-........-99+101
	//1.
		/*
		int c=0;
        int b=0;
        int m=0;
		for(int i=1;i<=101;i++){
		if(i%2!=0){ m++;
		if(m%2==0){b=i+b;
		}else{c=c+i;}
			}
		}System.out.println(c-b);
		*/
	//2.	
		/*
		 int v=0;
		 int x=0;
		 for(int i=1;i<102;i=i+4){
			 v=v+i;			
		 }
		 for(int t=3;t<102;t=t+4){
			 x=x+t;
		 }System.out.println(v-x);
		*/
	//本金10000存入银行，年利率为千分之三，每过一年，将本金和利息相加作为新的本金
	//计算五年后取回的钱是多少	
		//1.
		/*
		double a=10000;
		double b=0.003;
		for(int i=1;i<=5;i++ ){
			a=a*b+a;
		}System.out.println(a);
		*/
		//2.
		/*
		double a=10000;
		for(int i=1;i<=5;i++ ){
			a=a*1.003;
		}System.out.println(a);
		*/
	
	//写一段代码，从控制台输入两个数字，生成数字对应行列的矩形	
		
	//1.
	/*
	Scanner s = new Scanner(System.in);	
	System.out.println("请输入第一个数据");
	int a= s.nextInt();
	System.out.println("请输入第二个数据");
	int b= s.nextInt();
	for(int i=1;i<=a;i++){
		for(int q =1;q<=b;q++){
			System.out.print("*");
		}
		System.out.println();
	}
	*/
	//2.
	/*
	Scanner s = new Scanner(System.in);	
	System.out.println("请输入第一个数据");
	int a= s.nextInt();
	System.out.println("请输入第二个数据");
	int b= s.nextInt();
	for(int i=1;i<=a;i++){
		for(int q =1;q<=b;q++){
			if(i ==1|| i==a ||q==1 ||q ==b){
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
			
		}System.out.println();
		
	}
		
	*/	
	//打印空心等腰三角形，提示n行(n*2)-1列(最好是能通过控制台控制)

	
	
		
		
		
		
			
		
	}
}
