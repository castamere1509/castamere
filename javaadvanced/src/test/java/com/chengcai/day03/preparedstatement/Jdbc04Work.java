package com.chengcai.day03.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

/**
 * 1.查询所有人的姓名和学号
 * 2.查询张三各个课程的成绩
 * 3.创建一个学生表
 * 4.为自己创建的学生表添加一个新用户  //sno = s011  sname = xiaohua sage =18 ssex =nv
 * 5.更新自己创建的学生表中小花的年龄为25岁，性别为man
 * 6.删除小花的数据
 */
public class Jdbc04Work {
	//1.查询所有人的姓名和学号
	@Test(priority=1)
		public void	snameSno() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.85:1521:orcl", "scott", "1234");
		PreparedStatement ps=conn.prepareStatement("select sname,sno from student");
        ResultSet res = ps.executeQuery();
		while(res.next()){
			System.out.println(res.getString("sno")+" "+res.getString("sname"));
		}	}
		
	//2.查询张三各个课程的成绩
		@Test(priority=2)
		public void score() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.32:1521:orcl", "scott", "1234");
		PreparedStatement  ps =conn.prepareStatement("select score from student s,sc where s.sno=sc.sno and s.sname=?");
		ps.setObject(1, "张三");
		ResultSet res =ps.executeQuery();
		while(res.next()){
			System.out.println(res.getString(1));
		}		
		}		
	//3.创建一个学生表	
		@Test(priority=3)
		public void createTb() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.32:1521:orcl", "scott", "1234");
		PreparedStatement ps =conn.prepareStatement("drop table stu_xc");
		ps.executeUpdate();
		ps =conn.prepareStatement("create table stu_xc as select * from student"); 
		ps.executeUpdate();
		}
	//4.为自己创建的学生表添加一个新用户  //sno = s011  sname = xiaohua sage =18 ssex =nv	
		@Test(priority=4)
		public void insertInto() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.32:1521:orcl", "scott", "1234");
		PreparedStatement ps = conn.prepareStatement("insert into stu_xc values(?,?,?,?)");
		ps.setObject(1, "s011");
		ps.setObject(2, "xiaohua");
		ps.setObject(3, 18);
		ps.setObject(4, "nv");
		ps.executeUpdate();
		}
	//5.更新自己创建的学生表中小花的年龄为25岁，性别为man	
		@Test(priority=5)
		public void updateTest() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.32:1521:orcl", "scott", "1234");
		PreparedStatement ps = conn.prepareStatement("update stu_xc set sage =?,ssex =? where sname=?");
		ps.setObject(1, 25);
		ps.setObject(2, "man");
		ps.setObject(3, "xiaohua");
		ps.executeUpdate();
		}
	//6.删除小花的数据
		@Test(priority=6)
		public void deletrxh() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.32:1521:orcl", "scott", "1234");
		PreparedStatement ps = conn.prepareStatement("delete from stu_xc where sname=?"); 
		ps.setObject(1, "xiaohua");
		ps.executeUpdate();
	}
	
	
	
	
	
	

}
