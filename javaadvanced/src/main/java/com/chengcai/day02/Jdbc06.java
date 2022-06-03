package com.chengcai.day02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.chengcai.dai01.HomeWork02;

/**
 * 设计一个方法 使用 学号 查询  姓名
 */
public class Jdbc06 {
	
	
	public String stuQuery(String sno) throws ClassNotFoundException, SQLException{
		
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.85:1521:orcl", "scott", "1234");
		Statement st = conn.createStatement();
	    
		ResultSet res=st.executeQuery("select sname from student where sno ='"+sno+"'");
	    while(res.next()){
	    	return res.getString(1);
	    }
		}catch(Exception e){
			e.printStackTrace();
		}
		return "没有查询到数据";
	}
		
		
}
