package chengcai.testngtest;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import chengcai.testngtest.JdbcUtils;
import chengcai.testngtest.Log4jUtils;
import chengcai.testngtest.PhoneUtils;

public class UserRegist {//注册
	
	
	public static String regist(String username,String password,String phone,String email){
		
		Logger log = Log4jUtils.getLogger(UserRegist.class);
		
		if(username.length()<6 || username.length()>15){
			log.error(username+"长度错误");
			return "用户名格式错误";
		}
		
		if(password.length()<8 || password.length()>16){
			log.error(password+"长度错误");
			return "密码格式错误";			
		}
		
		if(!PhoneUtils.phoneTe(phone)){
			log.error(phone+"格式不正确");
			return "手机号码格式不正确";
		}
		
		if(!email.contains("@") || !email.contains(".com")){
			log.error(email+"格式不正确");
			return "邮箱格式不正确";
		}
		
		
		String sql ="select * from userinfo_xc where username = ? or phone =?";
		Object [] obj = {username,phone};
		ResultSet res =JdbcUtils.query(sql, obj);
		
		try {
			
			if(res.next()){
				log.error(username+"或者"+phone+"已存在");
				return "存在重复数据";
			}
			
			String sql1 = "insert into userinfo_xc values(?,?,?,?)";
			Object[] obj1 ={username,password,phone,email};
			JdbcUtils.update(sql1, obj1);
						
		} catch (SQLException e) {
		    log.error("注册时发生了异常");
			e.printStackTrace();
			return "注册失败";
		}
		log.info(username+"注册完成");
		return "注册成功";
		
		
	}
	
	
	
	

}

