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
public class Variable04 {
	
	
      public static void main(String[] args) {
		
    	  int station = 0;//初始站，站点号为0
    	  int peno =6;//公交车上有6个人
    	  
    	  //第一站
    	  station = station +1;
    	  peno = peno+1;
    	  System.out.println(station);//1
    	  System.out.println(peno);//7   	  
    	  
    	  //第二站
    	  station = station +1;
    	  peno = peno+3;
    	  peno = peno-1;
    	  System.out.println(station);//2
    	  System.out.println(peno);//9
    	  
    	  //第三站
    	  station = station +1;
    	  peno = peno+4;
    	  peno = peno-5;
    	  System.out.println(station);//3
    	  System.out.println(peno);//8
    	  
	}
	
          

}



