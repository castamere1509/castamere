package com.chengcai.day02.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.Test;

/**
 * 什么是JDBC：jdbc是一种中间件，可以通过他使用Java代码对数据库进行操作
 * 怎么使用Jdbc:
 * 1.因为jdbc属于第三方提供的jar包，所以需要先导包(在pom文件里面进行声明，但是jdbc比较
 * 特殊，需要手动导入jar包
 * 2.连接数据库
 *      (1):加载数据库驱动包
 *      (2):提供需要连接的数据库的:IP地址，端口号，数据库实例名，用户名  密码  连接数据库(这些信息去公司后，公司会提供)
 *      
 *
 */
public class Jdbc01 {
	
	@Test
	public void testConn() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDdiver");//加载数据库驱动
		
		//连接数据库获取连接对象
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.85:1521:orcl","scott","1234");
		//Connection类型
		//conn 是个变量，里面放的是一个  连接对象
		//DriverManager.getConnection()获取连接对象的方法
		//("jdbc:oracle:thin:@192.168.0.32:1521:orcl","scott","1234"); 是方法的入参
		                      //IP         端口号  数据库名    用户名	         密码
		System.out.println(conn);//如果打印出来有结果，说明已经连接数据库成功，如果报错就是没有连接上
	}
	

}
