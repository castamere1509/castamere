package chengcai.testngtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtils {
	
	//封装数据库连接，可以使用GetConnection方法获取Connection对象
	public static Connection getConnection(){
		
		Connection conn =null;
         try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.85:1521:orcl", "scott", "1234");  
         } catch (Exception e) {		
			e.printStackTrace();
		}				
		return conn;
		
	}
	
	
	//String sql =  select * from emp where deptno = ?  and sal > ? and  job = ?
	//Object[] obj =  {30,1000,"SALESMAN"}
	
	
	//String sql = “select * from student where sno =? and sname =? and sage >? and ssex = ?”
	//Object[] obj = {"s001","张三",15,"男"}
	 

	
	
	//封装 数据库查询
	public static ResultSet query(String sql,Object[] obj){				
		Connection conn = getConnection();//获取连接对象
		ResultSet res =null;//声明一个结果集准备用来获取查询的结果		
		try {
			PreparedStatement ps =conn.prepareStatement(sql);//使用连接对象获取ps对象			
			//使用for循环给占位符赋值，补全sql语句
			for(int i =1;i<=obj.length;i++){				
				ps.setObject(i, obj[i-1]);
			}			
			res=ps.executeQuery();//执行查询获取结果集，赋值给 res			
		} catch (Exception e) {
			
			e.printStackTrace();
		}				
		return res;   //返回res
		
	}
	

	
	//封装数据库 增删改  update	
	public static int update(String sql,Object[] obj){
		Connection conn = getConnection();//获取连接对象
		int res =-1;  
		PreparedStatement ps = null;
		try {
		    ps =conn.prepareStatement(sql);//使用连接对象获取ps对象		    
		    //使用for循环给占位符赋值，补全sql语句
			for(int i =1;i<=obj.length;i++){				
				ps.setObject(i, obj[i-1]);
			}	
			res =ps.executeUpdate();//支持update，将行数给res
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally{  //最后操作，不管catch是否执行，都要执行finally里面的内容 
			close(conn,ps,null);//关闭数据库各个对象
		}				
		return res; ///返回res
	}
	
	
	//关闭数据库对象，清除缓存
	
	public static void close(Connection conn,Statement st,ResultSet res){
		
			try {
				
				if(conn!=null){
				conn.close();   //关闭连接对象
				}				
				if(st!=null){
					st.close();  //关闭Statement对象或者它子类的对象
				}				
				if(res!=null){
					res.close();  //关闭结果集					
				}				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String sql="select * from student where sno =? and sname =? and sage >? and ssex = ?";
		
		Object[] obj = {"s001","张三",15,"男"};
		
		query(sql,obj);
		
	}
	
	
	

}

