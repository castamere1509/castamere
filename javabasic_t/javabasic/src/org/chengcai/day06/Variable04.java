package org.chengcai.day06;
  /**
   * 全局变量和局部变量的赋值使用
   * 局部变量需要先声明后赋值才能使用，全局变量可以不赋值，有默认值
   * 基本类型：整数默认为0   小数默认为0.0   char默认为' ',boolean默认为false
   * 所有引用类型默认为 null (空)
   *
   */

public class Variable04 {
        static int a;//全局变量
        static boolean bo;
        static String str;
        static char cr;
        public static void main(String[] args) {
			int b=10;//局部变量
        	System.out.println(a);//0  全局变量可以不进行赋值，有默认值的，整数类型默认为0
        	System.out.println(b);//10
        	
        	
        	int c;
        	//System.out.println(c);//该行代码保错，局部变量c必须先赋值，后使用
        	System.out.println(bo);//boolean默认为false
        	System.out.println(str);//所有引用类型默认为 null
        	System.out.println(cr);
		}
	
	  
	
}
