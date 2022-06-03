package com.chengcai.day03.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

/**
 * 通过PreparedStatement对象操作数据库,并且使用占位符
 * 
 * 使用PreparedStatement对象进行增删改操作
 *
 */
public class Jdbc03 {
	
	@Test
	public void prepared() throws ClassNotFoundException, SQLException{
			Class.forName("oracle.jdbc.driver.OracleDriver");//加载数据库驱动
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.85:1521:orcl", "scott", "1234");
			
			//第三步使用Connection对象获取preparedstatement对象
			PreparedStatement ps =conn.prepareStatement("update emp_xc set sal = sal+100 where job =? and deptno=?");
			//这里的？是占位符，可以使用 setObject()给占位符赋值                                                                                                                       1号                            2号
			//占位符只能作为值，一般只放在where后面使用
			ps.setObject(1, "MANAGER");//1表示的是第几个占位符，给1号占位符赋值 MANAGER
			ps.setObject(2, 30);//2表示的是第二个占位符，给2号占位符赋值  30
			
			//第四步，执行ps对象获取结果集
			int rs = ps.executeUpdate();
			System.out.println(rs);
			
			
			
         }
	
}