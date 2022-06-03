package com.chengcai.day03.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

/**
 * Sql注入
 * PreparedStatement 可以防止Sql注入测试
 * 
 * 字符串类型的密码 使用 任意字符 + ' or 1 = '1  进行测试
 * 数字类型的密码  使用 任意字符 + or 1 = 1  进行测试
 *
 */

public class Jdbc06 {
	
	//使用学号 查 姓名
	
    public static String stuQuery(String sno) {

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.85:1521:orcl", "scott", "1234");
				Statement st = conn.createStatement();
				ResultSet res=st.executeQuery("select sname from student where sno ='"+sno+"'");
				while(res.next()){
					return res.getString(1);
			
			}
		} catch (Exception e) {
			
			e.printStackTrace();

    }
       return "没有查到数据";
    }
    //通过empno查询对应的员工信息
    public static String getEmp(String ename){
    	
    	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.32:1521:orcl", "scott", "1234");
			PreparedStatement ps = conn.prepareStatement("select * from emp where ename = ?");
			ps.setObject(1, ename);
			ResultSet res=ps.executeQuery();
			while(res.next()){
				return res.getString(1)+"  "+res.getShort(2)+"  "+res.getShort(3)+"  "+res.getShort(4);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "查询结果为空";
    }

    @Test
    public void testSqlZhuRu(){
    	
    	String str = stuQuery("asdasdasdasdsad' or 1 = '1");
    	System.out.println(str);//Statement对象  可以进行sql注入
    	
    	
    	str = getEmp("asdasdasdasdsad' or 1 = '1");
    	System.out.println(str);//PreparedStatement对象 不可以进行 sql注入
    }
    
    
    
    
}
