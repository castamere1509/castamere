package chengcai.testngtest;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;







/**
 * 1.在testngtest项目中完成
 * 2.开发一个注册和登陆的API
 * 3.要求：和数据库产生交互，注册成功会在数据库插入用户名和密码   ，如果该用户已经存在那么注册会失败，登录时需要去数据库进行验证，用户数据是否存在，存在就是登陆成功，
 * 不存在就是登陆失败
 * 4.要求：用户名  6-15位字符         密码要求  8-16位字符
 * 
 * 5.要求记录日志
 * 
 * 6.使用@DataProvider去调用写好的API ，生成测试报告 
 * 
 *
 */

public class HomeWorkzuoye {
	
	
	public String  register(String username,String password){
		PropertyConfigurator.configure("resources/log4j.properties");
		Logger log = Log4jUtils.getLogger(HomeWorkzuoye.class);
		
	  try{
		log.info(username+"注册");

		if(username.length()>=6 && username.length()<=15){
			log.info("用户名位数符合要求");
		}else{log.error("用户名位数不符合要求");
			return "用户名位数不符合要求";
			
		}
		
		if(password.length()>=8 && password.length()<=16){
			log.info("密码位数符合要求");
		}else{log.error("密码位数不符合要求");
			return "密码位数不符合要求";
		}
         String sql ="select * from zy where username=?";
         Object[] obj ={username};
         ResultSet s =JdbcUtils.query(sql, obj);
         
        	 if(s.next()){
        		 log.error("用户名重复");
        		 return "用户名重复";
        	 }else{
        		 
         sql="insert into zy values(?,?)";
         Object[] obj1 ={username,password};
         JdbcUtils.update(sql, obj1);
        	 }
		return "注册成功";
	}catch(SQLException e){
		e.printStackTrace();
	}return null;
		
	}
	
	

	
	
}
