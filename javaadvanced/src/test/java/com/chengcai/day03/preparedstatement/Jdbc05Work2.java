package com.chengcai.day03.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import org.testng.annotations.Test;

/**
 * 通过emp查询员工的所有信息
 *
 */
public class Jdbc05Work2 {
	
	
	@Test
	public void prepared() throws ClassNotFoundException, SQLException{
			Class.forName("oracle.jdbc.driver.OracleDriver");//加载数据库驱动
			//第二步获取连接对象
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.85:1521:orcl", "scott", "1234");

			PreparedStatement ps =conn.prepareStatement("select * from emp");
	
			ResultSet res =ps.executeQuery();
			
			while(res.next()){
				System.out.println(res.getString(1)+"        "+res.getString(2)+"        "+res.getString(3)+"        "+res.getString(4)+"        "+res.getString(5)+"        "+res.getString(6)+"        "+res.getString(7)+"        "+res.getString(8));
			}		
         }


}
