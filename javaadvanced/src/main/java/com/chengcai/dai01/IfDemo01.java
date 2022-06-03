package com.chengcai.dai01;

import java.util.Scanner;

public class IfDemo01 {
	public static String cz(int a,int b){
		if(a==50){
			if(b==50){
				return "充值成功";
			}else if(b==100){
				return "充值失败，退回50";
			}else{
				return "充值金额输入异常,请重新输入";
			}			
		}else if(a==100){
			if(b==50){
				return "充值成功,找零50";
			}else if(b==100){
				return "充值成功";
			}else{
				return "充值金额输入异常,请重新输入";
			}			
		}else{
			return "投币金额异常";
		}
		
	}
	
	
	public static int add(int a,int b){
		int c=a+b;
		return c;
		
	}
	
    // 8、设计一个闰年判定器，用户在控制台输入年份，方法返回 是闰年/不是闰年 。并且在main方法中调用
    public static String lo(int year){//调用方法：就是运行这个方法体里面的代码
  	 
  	  if(year%4==0 && year%100!=0 || year%400==0){
  		  return year+"是闰年";
  	  }else{
  		return year+"不是闰年";
  	  }  	  
    }
	
	

}
