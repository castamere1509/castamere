package com.chengcai.day04;

import java.util.Scanner;

import org.apache.log4j.Logger;


import com.chengcai.tools.Log4jUtils;


public class Log4jDemo04 {
	
	public static void main(String[] args) {
		
		Logger log =Log4jUtils.getLogger(Log4jDemo04.class);
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try{					
		int res = a/b;
		log.info(a+"/"+b+"的结果是："+res);
		}catch(Exception e){
			e.printStackTrace();
			log.error("数学运算出现异常"+e.getClass()+"使用的数据是："+a+"    "+b);
		}
	
	}
	
	
	

}

