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
public class HomeWork {

	

//1.复制一张EMP表
/*
@Test
public void createTb(){
Connection conn=JdbcUtils.getConnection();
    int res =1;

   PreparedStatement ps;
   try {
	ps = conn.prepareStatement("create table emp_td as select * from emp");
	ps.executeUpdate();
  } catch (SQLException e) {
	
	e.printStackTrace();
  }
   
  }
  */
	/*
	@Test
	public void testconn0() throws SQLException{
		//1
		String sql ="create table emp_td as select * from emp";
		Object[] obj1={};
		System.out.println(JdbcUtils.update(sql, obj1));}
	*/
//2.复制一张DEPT表
/*
@Test(priority=2)
public void createDept(){
Connection conn=JdbcUtils.getConnection();
    int res =1;

   PreparedStatement ps;
   try {
	ps = conn.prepareStatement("create table dept_td as select * from dept");
	ps.executeUpdate();
  } catch (SQLException e) {
	
	e.printStackTrace();
  }
   
  }
  */
//3.查询KING在什么地方上班
/*	
@Test
public void testconn() throws SQLException{
	JdbcUtils jd = new JdbcUtils();
	String sql ="select d.loc from emp_td e,dept_td d where e.deptno=d.deptno and e.ename=?";
	Object[] obj={"KING"};
	ResultSet dz=jd.query(sql, obj);
	while(dz.next()){
	System.out.println(dz.getString("loc"));
	}
}
*/
//4.给30部门所有的员工工资+100
	/*
@Test
public void testconn2() throws SQLException{
	//1
	String sql ="update emp_td set sal =sal+100 where deptno = 30";
	Object[] obj1={};
	System.out.println(JdbcUtils.update(sql, obj1));}

*/
//5.给EMP表插入一条数据
	/*
	@Test
	public void testconn1() throws SQLException{
		
		String sql ="insert into emp_td values(8000,'xiaohua','wangguan',null,to_date('2015-10-10','yyyy-mm-dd'),6000,1000,40)";
		Object[] obj1={};
		System.out.println(JdbcUtils.update(sql, obj1));}
*/
//6.将插入的这条数据入职时间改为2010-12-12
	/*
	@Test
	public void dateTest(){
		String sql = "update emp_td set hiredate=to_date(?,'yyyy-mm-dd') where ename = ?";
		Object[] obj ={20101212,"xiaohua"};
		JdbcUtils.update(sql, obj);
	}
	*/
//7.将插入的这条数据的职位换成，KING的下属的职位    领导编号换成KING的编号
	/*
	@Test
	public void zhuanhuan(){
		String sql = "update emp_td set job = (select distinct job from emp_td where mgr=(select empno from emp_td where ename ='KING')) where ename='xiaohua'";
		Object[] obj1 ={};
		JdbcUtils.update(sql, obj1);
	}
	
	@Test
	public void zhuanhuan2(){
		String sql = "update emp_td set empno =(select empno from emp_td where ename ='KING' ) where ename='xiaohua'";
		Object[] obj1 ={};
		JdbcUtils.update(sql, obj1);
	}
	*/
	
	//1.复制一张EMP表
	@Test
	public void cpEmp(){
		 
		String sql1 = "drop table emp_xc";
		Object[] obj1 = {};
		JdbcUtils.update(sql1, obj1);
		
		String sql = "create table emp_xc as select * from emp";
		Object[] obj = {};
		JdbcUtils.update(sql, obj);
	}
	 
	//2.复制一张DEPT表
     public void cpDept(){
    	String sql1 = "drop table dept_xc";
		Object[] obj1 = {};
		JdbcUtils.update(sql1, obj1);
		
		String sql = "create table dept_xc as select * from dept";
		Object[] obj = {};
		JdbcUtils.update(sql, obj);
    	 
     }
	
     //3.查询KING在什么地方上班
     @Test
     public void getKing() throws SQLException{
    	 
    	String sql = "select loc from emp e,dept d where e.deptno=e.deptno and ename =? ";
 		Object[] obj = {"KING"};
 		ResultSet res= JdbcUtils.query(sql, obj); 
 		while(res.next()){
 			System.out.println(res.getString(1));
 		}
    	 
     }
     
     //4.给30部门所有的员工工资+100
     @Test
     public void updateSal(){
    	String sql = "update emp_xc set sal = sal+100 where deptnp=?";
 		Object[] obj = {30};
 		JdbcUtils.update(sql, obj); 
    	 
     }
     
     //5.给EMP表插入一条数据
     @Test
     public void insertEmp(){
    	String sql = "insert into emp_xc values(?,?,?,?,todate(?,'yyyymmdd'),?,?,?)";
  		Object[] obj = {7778,"xiaohua","student",7698,"20191212",1780,300,20};
  		JdbcUtils.update(sql, obj);  
     }
     
     //6.将插入的这条数据入职时间改为2010-12-12
     @Test
     public void updateHiredate(){
    	String sql = "update emp_xc set hiredate = to_date(?,'yyyymmdd') where empno =?";
  		Object[] obj = {"20101212",7778};
  		JdbcUtils.update(sql, obj); 	 
     }
     
     //7.将插入的这条数据的职位换成，KING的下属的职位    领导编号换成KING的编号
     @Test
     public void updateXiaohua() throws SQLException{
    	//查KING的empno
    	String sql = "select empno from emp_xc where ename ='KING'";
  		Object[] obj = {};
  		ResultSet res = JdbcUtils.query(sql, obj); 	
  		res.next();
  		String kempno = res.getString(1);
  		
  		//通过king的empno查下属的职位
  		String sql1 = "select empno from emp_xc where mgr =?";
  		Object[] obj1 = {kempno};
  		ResultSet res1 = JdbcUtils.query(sql1, obj1); 	
  		res1.next();
  		String job = res1.getString(1);
  		
  		//将小花的数据进行变更
  		String sql2 = "update emp_xc set job=?,mgr=? where empno =7778";
  		Object[] obj2 = {job,kempno};
  		JdbcUtils.update(sql2, obj2);
  		
     }
     
     
     
     
	

}
