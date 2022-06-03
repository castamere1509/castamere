package org.chengcai.day07;
/**
 * 值传递:java传递数据时传递变量的值,而不是变量本身
 * 
 */
public class Function05 {
	public static int add(int a,int b){
		a =a+10;//a=20;
		b =b+10;//b=30;
		
		return a+b;
	}

	
public static void main(String[] args){
	
	int a=10;
	int b=20;
	int i=add(a,b);//传送给方法的是10和20两个值,不是a和b这两个变量容器
	System.out.println(i);//50
}
	
	
}
