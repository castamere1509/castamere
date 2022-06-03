package com.chengcai.day02.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;
/**
 * 什么是JDBC：jdbc是一种中间件，可以通过他使用Java代码对数据库进行操作
 * 怎么使用Jdbc:
 * 1.因为jdbc属于第三方提供的jar包，所以需要先导包(在pom文件里面进行声明，但是jdbc比较
 * 特殊，需要手动导入jar包
 * 2.连接数据库
 *      (1):加载数据库驱动包
 *      (2):提供需要连接的数据库的:IP地址，端口号，数据库实例名，用户名  密码  连接数据库(这些信息去公司后，公司会提供)
 *      
 *
 */
public class Jdbc02 {
	
	@Test
	public void testConn() throws ClassNotFoundException, SQLException{
		//第一步加载驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");//加载数据库驱动
		//第二步获取连接对象
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.85:1521:orcl", "scott", "1234");
		//第三步获取操作对象(Statement对象)
		Statement st = conn.createStatement();//通过连接对象获取Statement对象，该对象可以取操作数据库分为 查询 和 增删改
		//第四步使用Statement  对象 st执行sql语句,然后将结果给一个ResultSet类型的集合
		ResultSet rs = st.executeQuery("select * from emp");
		//第五步：遍历结果集
		rs.next();//相当于每运行一次，结果集往下一行
		while(rs.next()){//re.next()表示的是这个re结果集的下一行数据，如果下一行有数据就返回true,如果没有数据返回false
			System.out.println(rs.getString("empno")+" "+rs.getString("ename")+" "+rs.getString("job"));	
		}
		System.out.println(rs.next());//false,上面的循环一级运行15次rs.next(),已经运行结束，rs里面的数据已经运行结束了
		
		//rs=st.executeQuery("delete form emp_xc");//写法不规范，executeQuery这个API后面只能有查询语句，增删改有专用API，可以返回影响行数
		
	}

}
