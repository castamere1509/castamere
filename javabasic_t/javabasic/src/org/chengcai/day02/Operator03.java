package org.chengcai.day02;
/**
 * java中的运算符：+  -  *  /   %
 *
 *
 */

public class Operator03 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);//30
		int d = a-b;
		System.out.println(d);//-10
		int e = a*b;
		System.out.println(e);//200
		int f =a / b;
		System.out.println(f);//0
		//a是int类型，b为int类型，a/b的结果为int类型，int的0.5 就是0
		
		double d1 =10;
		double d2 =d1 / b;
		System.out.println(d2);//0.5
		
		//取余  %
		//任何值对比它大的值取余都等于它本身
		//任何值对1取余都等于0
		//对2取余，偶数余0，奇数余1
		System.out.println(1%2);//1
		System.out.println(2%2);//0
		System.out.println(3%2);//1
		System.out.println(4%2);//0
		System.out.println(5%2);//1
		
		
		
		
	}
	
	

}
