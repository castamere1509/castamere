package com.chengcai.day04;


import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

public class Log4jDemo01 {

	public static void main(String[] args){
		
		//第一步：读取配置文件
		PropertyConfigurator.configure("resources/log4j.properties");
		//第二步：创建当前类的logger对象
		Logger log = Logger.getLogger(Log4jDemo01.class);
		//第三步：使用log.日志级别（） 来记录日志：
		log.debug("debug通常用来记录调试信息，项目上线后，一般不使用");
		log.info("用来记录重要信息");
		log.warn("warn记录警告信息");
		log.error("error通常用于记录错误");
		
		
	}
	
	
	
	
	
	
}
