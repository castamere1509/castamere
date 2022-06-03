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

public class HomeWork22 {
	
	public String denglu(String username, String password) {

		Logger log = Log4jUtils.getLogger(HomeWork22.class);
		JdbcUtils jd = new JdbcUtils();
		log.info(username + "登录");

		if (!(username.length() >= 6 && username.length() <= 15)) {
			log.error("用户名位数不符合要求");
			return "用户名位数不符合要求";
		} else if (!(password.length() >= 8 && password.length() <= 16)) {
			log.error("密码位数不符合要求");
			return "密码位数不符合要求";
		}
		String sql = "select * from zy ";
		Object[] obj = {};
		ResultSet rs = jd.query(sql, obj);
		try {
			while(rs.next()) {
				if (rs.getString("username").equals(username)) {
					
					
					if (rs.getString("password").equals(password)) {
						log.info(username + "，登录成功");
						return "登录成功";
					} else {
						log.error(password + "密码错误");
						return "密码错误。请重新输入";
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		log.error("账号错误");
		return "登陆失败，请重新输入";
	}
	

	
	
}
