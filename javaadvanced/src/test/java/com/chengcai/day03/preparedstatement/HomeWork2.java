package com.chengcai.day03.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.chengcai.tools.JdbcUtils;

/**
 * 使用封装的方法完成
 * 1.复制一张EMP表
 * 2.复制一张DEPT表
 * 3.查询KING在什么地方上班
 * 4.给30部门所有的员工工资+100
 * 5.给EMP表插入一条数据
 * 6.将插入的这条数据入职时间改为2010-12-12
 * 7.将插入的这条数据的职位换成，KING的下属的职位    领导编号换成KING的编号
 * 完成方式分两种：子查询和非子查询
 * 
 * 写方法
 * 通过地址（loc）查人(ename)
 * 通过（工作和部门编号）查询（ename）
 * 通过工资区间查人
 * 给某部门加100工资
 * 通过rownum查询工资第X到第y名的人    y>x
 * 
 */
public class HomeWork2 {
      //通过地址（loc）查人(ename)

	 public static void getName(String loc){
		 
		  
	 		try {
	 			String sql = "select name from emp e,dept d where e.deptno=e.deptno and loc =? ";
		 		Object[] obj = {loc};
		 		ResultSet res= JdbcUtils.query(sql, obj);
				while(res.next()){
					System.out.println(res.getString(1)); 
					
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	 }

	 //通过（工作和部门编号）查询（ename）
	 
	 public static void getName2(String job,int deptno){
		 try {
	 			String sql = "select ename from emp where job = ? and deptno = ? ";
		 		Object[] obj = {job,deptno};
		 		ResultSet res= JdbcUtils.query(sql, obj);
				while(res.next()){
					System.out.println(res.getString(1)); 
					
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}	 
	 }
	 //通过工资区间查人
	 
	 public static void getSal(int lowsal,int upsal){
		 try {
	 			String sql = "select ename from emp where sal >?  and sal = ? ";
		 		Object[] obj = {lowsal,upsal};
		 		ResultSet res= JdbcUtils.query(sql, obj);
				while(res.next()){
					System.out.println(res.getString(1)); 
					
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}	 
	 }
	 
	 //给某部门加100工资
	 public static void updateSal(String dname){
		 String sql = "update emp_xc set sal = sal +100 where deptno in (select deptno from dept where dname =?)";
		 Object[] obj={dname};
		 JdbcUtils.update(sql, obj);
	 }
	 //通过rownum查询工资第X到第y名的人    y>x
	 
	 public static void getName3(int x,int y){
		 
		try {
			String sql ="select ename from(select rownum rm,a.* from (select * from emp order by sal) a) where rm>=? and rm<=?";
			Object[] obj ={x,y}; 
			ResultSet  res =JdbcUtils.query(sql, obj);
			while(res.next()){
				System.out.println(res.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	 
	 
	 
	 
	 
     public static void main(String[] args){
    	 //调用方法1
    	 System.out.println("------调用方法1------");
    	 getName("NEW YORK");
    	//调用方法2
    	 System.out.println("------调用方法2------");
    	 getName2("SALESMAN",30);
    	//调用方法3
    	 System.out.println("------调用方法3------");
    	 getSal(1000,1500);
    	//调用方法4
    	 System.out.println("------调用方法4------");
    	 updateSal("SALES");
    	//调用方法5
    	 System.out.println("------调用方法5------");
    	 getName3(6,10);
     }
     
     
	
     
     
     
     
     
     
     

}
