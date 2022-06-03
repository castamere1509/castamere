package org.chengcai.day12List;
/**
 * Exception:异常
 *
 * 1.运行时异常(RuntimeException) : 代码编译通过，在运行的过程中报错
 *   异常出现以后，会抛出异常对象，然后终止程序，异常出现位置以后的代码都不执行
 *
 */
public class Exception01 {
	
	
	public static void main(String[] args){
		
	 //这段代码写在main方法里面是没有直接报错的，但是运行的时候发生了错误
	System.out.println(10/0);//报java.lang.ArithmeticException    数学运算异常
	
	String str = null;
	System.out.println(str.equals("小花"));//java.lang.NullPointerException空指针异常
	
	int[] ins={1,2,3};
	System.out.println(ins[4]);//java.lang.ArrayIndexOutOfBoundsException  数组下标越界异常
	
	}

}
