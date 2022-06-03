package com.chengcai.tools;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class Log4jUtils {
	                              //声明一个Class类型的变量  他的泛型继承了Object
	public static Logger getLogger(Class<? extends Object> clazz){
		PropertyConfigurator.configure("resources/log4j.properties");//读取配置文件
		Logger log = Logger.getLogger(clazz);//获取记录器对象
		return log;//返回对象
		
	}
	


}
