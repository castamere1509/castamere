package com.chengcai.day04;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log4jDemo03 {
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("resources/log4j.properties");		
		Logger log = Logger.getLogger(Log4jDemo03.class);
		
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

