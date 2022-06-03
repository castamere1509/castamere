package org.chengcai.day06;
  /**
   * 静态的方法中使用全局变量必须是静态变量，必须是被Static修饰
   * 
   *
   */

public class Variable05 {

	 static int a;//全局静态
	 int b;//全局实例
	 public static void main(String[] args) {
		System.out.println(a);
		//System.out.println(b);代码报错，静态方法必须使用全局变量必须是静态的
	}
	 
	
	
}
