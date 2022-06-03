package com.chengcai.day02.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;
/**
 * 使用jdbc进行增删改
 *      
 * //操作对象使用executeUpdate(SQL)  返回影响的行数  //增删改使用该方法
 * //操作对象使用executeQuery(SQL)   返回的一个ResultSet类型的结果集    //查询使用该方法    
 *
 */
public class Jdbc04 {
	
	@Test
	public void testConn() throws ClassNotFoundException, SQLException{
		//第一步加载驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");//加载数据库驱动
		//第二步获取连接对象
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.85:1521:orcl", "scott", "1234");
		//第三步获取操作对象(Statement对象)
		Statement st = conn.createStatement();//通过连接对象获取Statement对象，该对象可以取操作数据库分为 查询 和 增删改
		//第四步使用st对象去进行增删改，返回行数
		int res=st.executeUpdate("delete from emp_xc1 where sal <1000");
		System.out.println(res);//2,因为上面的sql语句删除了两行
        //操作对象使用executeUpdate(SQL)  返回影响的行数  //增删改使用该方法
		//操作对象使用executeQuery(SQL)   返回的一个ResultSet类型的结果集    //查询使用该方法
		
	}

}
