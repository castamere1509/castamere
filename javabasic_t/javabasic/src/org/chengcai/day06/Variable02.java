package org.chengcai.day06;
  /**
   * 
   * 变量的作用域01：变量的作用域分为全局变量和局部变量
   * 全局变量在整个类里面都有效，局部变量只在该方法体内有效
   */

public class Variable02 {

	   int c =10;//全局变量
       
	public static void main(String[] args) {
		int a=10;//局部变量
		
	}
	
	  public void fun(){
		  
		  b =20;//b声明在方法体外是全局变量，其他方法都能使用
		  int a =20;//a声明在main方法里面，只在main中有效，所以这行代码保存		  
		  c =10;
	  }
	
	  int b=10;//全局变量
	  //a=20;//a声明在main方法里面，只在main中有效，所以这行代码保存
}
