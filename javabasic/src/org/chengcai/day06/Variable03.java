package org.chengcai.day06;
/**
 * 
 * 全局变量:
 * 分为全局实例变量和全局静态变量,他们的区别在于:全局静态变量会被static修饰
 *                                    能使用  类名.变量名  直接调用
 */
public class Variable03 {
       static int a;//全局静态变量
	   int b;//全局实例变量
	   public static void main(String[] args){
		   a = 10;
		   Variable03.a = 20;//全局静态变量可以使用  类名.变量名  直接调用
		   System.out.println(a);//20  变量a的值被20覆盖
		   System.out.println(Variable03.a);//20
		   
	   }
	
	public void add(){
		a =20;
		b =10;
	}	
}
