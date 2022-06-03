package org.chengcai.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

/**
 * 
 * 数据库操作工具类
 */
public class JdbcUtils {

	
	/*数据库连接方法*/
	public static Connection getConnection(){
		   Connection conn = null;
		   try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.130.177:1521:orcl", "scott", "1234");
		   }catch(Exception e){
			   e.printStackTrace();
			   System.out.println("数据库连接失败");
		   }
		   return conn;
	}

	
	  /*封装 数据库查询*/ 
		public static ResultSet query(String sql, Object[] obj) {
			ResultSet rs = null;
			Connection conn = null;
			PreparedStatement statement = null;
			try {
				conn = getConnection();
				// 获取PreparedStatement对象
				statement = conn.prepareStatement(sql);// 预编译sql的功能，可以防止sql注入
				for (int i = 1; i <= obj.length; i++) {
					statement.setObject(i, obj[i - 1]);  
				}
				// 执行查询
				rs = statement.executeQuery();
			} catch (Exception e) {
				e.printStackTrace();
			}
			    return rs;
		}
		
	
		
		
	   /*封装 增删改*/ 
		public static int dataDml(String sql, Object[] obj) {
			Connection conn = null;
			PreparedStatement statement = null;
			int count = -1;
			try {
				conn = getConnection();
				// 获取PreparedStatement对象
				statement = conn.prepareStatement(sql);
				
				for (int i = 1; i <= obj.length; i++) {
					statement.setObject(i, obj[i - 1]);     
				}
				// 执行查询
				 count = statement.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				close(conn,statement,null);
			}
			   return count;
		}
		

		
/**用jdbc插入date类型数据
* 2.使用Date类代表指定时间

　　Date date = new Date(2016-1900,8-1,28); 
   System.out.println(date);
　　使用带参的构造方法，可以构造指定日期的Date类对象，Date类中年份的参数应该是实际需要代表的年份减去1900，实际需要代表的月份减去1以后的值。显示结果如下：
　　Sun Aug 28 00:00:00 CST 2016  代表的日期就是2016年8月28号

*/
		@Test
	    public void insertTest1() throws ParseException{
			Date date = new Date(2015-1900,10-1,10); 
			Date ds =  new java.sql.Date(date.getTime());
			
			String sql = "insert into emp values(?,?,?,?,?,?,?,?)";
			Object[] obj = {1114,"xiaohua","beijing",2222,ds,4544,120,20};
			int count = JdbcUtils.dataDml(sql,obj);
			System.out.println(count);
	    }
		
	
		
		
		/*关闭数据库*/
		public static void close(Connection conn, Statement stat, ResultSet rs) {
			if (conn != null) {
						try {
							conn.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					
			   }
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
   }
