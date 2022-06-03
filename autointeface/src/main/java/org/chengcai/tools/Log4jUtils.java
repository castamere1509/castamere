package org.chengcai.tools;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

 
public class Log4jUtils {  
	
    public static Logger getLogger(Class<? extends Object> clazz){
    	PropertyConfigurator.configure("resource/log4j.properties");
		//第二步：创建当前类的 logger对象。
		Logger logger = Logger.getLogger(clazz); 
    	return logger;
    }
}