package com.chengcai.day04;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log4jDemo02 {
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("resources/log4j.properties");		
		Logger log = Logger.getLogger(Log4jDemo02.class);
		
		try{			
		int i=0;
		int res = 10/i;
		log.info(10+"/"+i+"的结果是："+res);
		}catch(Exception e){
			e.printStackTrace();
			log.error("数学运算出现异常");
		}
		
		
	}
	
	
}