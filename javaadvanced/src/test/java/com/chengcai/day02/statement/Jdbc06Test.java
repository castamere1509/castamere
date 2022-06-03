package com.chengcai.day02.statement;

import java.sql.Connection;
import java.sql.DriverManager;
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
public class Jdbc06Test {
	//1.查询所有人的姓名和学号
	@Test
	public void testConn() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.85:1521:orcl", "scott", "1234");
		Statement st = conn.createStatement();
		ResultSet rs =st.executeQuery("select sname,sno from student");
		while (rs.next()){
			System.out.println(rs.getString(2)+" "+rs.getString(1));
		}
	//2.查询张三各个课程的成绩
		ResultSet ss =st.executeQuery("select sc.score from student s,sc where s.sno=sc.sno and s.sname='张三'");
		while (ss.next()){
			System.out.println(ss.getString("score"));
		}
	//3.创建一个学生表	
		 st.executeUpdate("drop table student_zzz");
		 st.executeUpdate("create table student_zzz as select * from student");
	//4.为自己创建的学生表添加一个新用户  //sno = s011  sname = xiaohua sage =18 ssex =nv	
		 st.executeUpdate("insert into student_zzz values('s011','小花',18,'女')");
	//5.更新自己创建的学生表中小花的年龄为25岁，性别为man	
		 st.executeUpdate("update student_zzz set ssex='男',sage=25 where sname ='小花'");
	//6.删除小花的数据
		 st.executeUpdate("delete from student_zzz where sname = '小花'");
	}
	
	
	
	
	
	

}
