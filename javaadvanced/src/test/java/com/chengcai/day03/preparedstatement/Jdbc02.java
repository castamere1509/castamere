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
 * 1.加载驱动
 * 2.获取连接对象
 * 3.获取preparedstatement操作对象
 * 4.如果有占位符使用setObject()给占位符赋值
 * 5.执行SQL语句，获取结果集
 * 6.遍历结果集
 * 
 * 使用占位符传过去的数据，给占位符赋值什么类型数据，数据库那边接收对应类型的数据
 *    String  ==  varchar2
 *    int double == number
 */
public class Jdbc02 {
	
	@Test
	public void prepared() throws ClassNotFoundException, SQLException{
			Class.forName("oracle.jdbc.driver.OracleDriver");//加载数据库驱动
			//第二步获取连接对象
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.85:1521:orcl", "scott", "1234");
			
			//第三步使用Connection对象获取preparedstatement对象
			PreparedStatement ps =conn.prepareStatement("select * from student where sno =? and sname =?");
			//这里的？是占位符，可以使用 setObject()给占位符赋值                                                                                               1号                            2号
			//占位符只能作为值，一般只放在where后面使用
			ps.setObject(1, "s002");//1表示的是第几个占位符，给1号占位符赋值 s001
			ps.setObject(2, "李四");//2表示的是第二个占位符，给2号占位符赋值  张三
			
			//第四步，执行ps对象获取结果集
			ResultSet res =ps.executeQuery();
			
			//第五步 遍历结果集
			while(res.next()){
				System.out.println(res.getString("sno")+" "+res.getString("sname")+" "+res.getString("sage"));
			}		
         }
	
}