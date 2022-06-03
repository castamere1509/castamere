package com.chengcai.day03.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

/**
 * 通过PreparedStatement对象操作数据库
 * 
 *
 */
public class Jdbc01 {
	
	@Test
	public void prepared() throws ClassNotFoundException, SQLException{
	        //第一步加载驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");//加载数据库驱动
			//第二步获取连接对象
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.85:1521:orcl", "scott", "1234");
			//第三步获取操作对象(Statement对象)
			//Statement st = conn.createStatement();//通过连接对象获取Statement对象，该对象可以取操作数据库分为 查询 和 增删改
			
			//第三部使用Connection对象获取preparedstatement对象
			
			PreparedStatement ps =conn.prepareStatement("select * from student");//获取preparedstatement操作对象
			
			//第四步，执行ps对象获取结果集
			ResultSet res =ps.executeQuery();
			
			//第五步 遍历结果集
			while(res.next()){//rs.next()表示的是这个rs结果集的下一行数据，如果下一行有数据就返回true，如果没有数据就返回false
				System.out.println(res.getString("sno")+" "+res.getString("sname")+" "+res.getString("sage")+" ");
			}		
         }
	
}