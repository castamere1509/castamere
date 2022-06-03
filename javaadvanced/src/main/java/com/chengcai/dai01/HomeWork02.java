package com.chengcai.dai01;

public class HomeWork02 {
	
	  // 8、设计一个闰年判定器，用户在控制台输入年份，方法返回 是闰年/不是闰年 。并且在main方法中调用
    public static String lo(int year){//调用方法：就是运行这个方法体里面的代码
  	  
  	  if(year%4==0 && year%100!=0 || year%400==0){
  		  return year+"年是闰年";
  	  }else{
  		return year+"年不是闰年";
  	  }  	  
    }
	
    
    

}
