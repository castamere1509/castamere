package org.chengcai.day13Exception;

import java.sql.Connection;
import java.sql.DriverManager;

/**  
 *
 *
 *
 *
 */

public class Exception07Test {

	public static void main(String[] args) throws Exception07 {
		
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "1234");		    
		} catch (Exception e) {				
			e.printStackTrace();//可能会打印出大量的信息，导致不方便定位问题		
			System.out.println("数据库连接出现了问题");//只做了提示，没法定位问题
			//Exception07 ex = new Exception07("数据库连接出现了问题");
			//throw ex;//即做出了提示，而且还能找到出现异常的代码在哪里
			throw new Exception07("数据库连接出现了问题");//抛出Exception07对象
			
		}

	}



}
