package org.chengcai.day01;
/**
 * 变量的声明和使用
 *      1、在Java语言中，所有的变量必须先声明才能使用
 *      2、变量可以声明一次，可以多次赋值，后面赋值会覆盖前面的值
 *      3、变量在同一个作用域不能声明两次
 * 
 * 
 *
 */
public class Variable03 {
	
	
      public static void main(String[] args) {
		//int代表整数类型，该行代码声明了一个整数类型的变量，变量的名称叫I，I是用来存放整数类型的数据;
    	  int i;
    	  i = 10;//把整数10赋值给i,所以i的值为10;
    	     	  
    	 System.out.println(i); //打印10
    
    	 
    	 int j = 10;//可以将声明和赋值放在同一行代码，声明变量并且赋值
    	 System.out.println(j);//打印10
    	 j =30;
    	 System.out.println(j);//打印为30，变量j被重新赋值
    	 
    	 //int j;//会报错，可以重复给变量赋予不同的值，但是类型只能声明一次
    	 
    	 //覆盖案例
    	 int money =10000;
    	 money = money - 1000;
    	 System.out.println(money);//打印9000
    	 
    	//可以一次性声明或者赋值多个变量
    	 int a,b,c,d;//一次声明多个变量的类型
    	 //a =1,b=2,c=3,d =4;//不能一次单赋值多个，必须分好分割
    	 
    	 int e=100,f=200,g=300;//可以声明且赋值多个

    	 System.out.println(e+f);//两个变量可以直接进行运算，打印300
    	    	 
	}
	
          

}



