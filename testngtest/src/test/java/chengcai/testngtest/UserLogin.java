package chengcai.testngtest;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import chengcai.testngtest.JdbcUtils;
import chengcai.testngtest.Log4jUtils;

public class UserLogin {
	
	public static String login(String username,String password){
		Logger log =Log4jUtils.getLogger(UserLogin.class);
		
		String sql ="select * from userinfo_xc where username =? and password =?";
		Object[] obj ={username,password};
		ResultSet res = JdbcUtils.query(sql, obj);
		
		try {
			if(res.next()){
				log.info(username+"登陆成功");
				return "登陆成功";
			}else{
				log.error(username+"登陆失败");
				return "登陆失败";
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			log.error(username+"登陆时产生异常");
			return "登陆时异常";
		}
		
	}
	
	
	
	
	

}
