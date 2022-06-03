package org.chengcai.day13Exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Exception:异常
 *
 *非运行时异常(unRuntimeException):即便是代码没有问题，编译也会报错
 *在Java里面，有很多代码被认为是高风险代码,必须提前进行声明或者处理
 *
 *非运行时异常代码在运行前都需要进行处理；
 *处理方式2：
 *      try{//尝试运行	
 *      
 *      }catch(异常对象){ //执行try中的语句块，使用catch 抓取异常对象 ，进行处理
 *        只要出现了异常，就运行catch后面的语句块
 *      }
 *
 *     catch后面的语句块，只是大部分只是进行提示，告诉开发者异常出现在声明地方，需要开发者
 *     手动去解决异常，不是直接帮开发者将异常解决；
 *
 */


public class Exception03 {

	public static void  main(String[] args){
		
		//如果发生了ClassNotFoundException异常，才会运行 catch后面的内容
		try {		
		////加载数据库驱动类，容易出现找不到类异常
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println(10/0);
		} catch (Exception e) {//出现找不到类异常进行处理
			// 处理异常,大部分都是给打一个异常信息，提示程序员去定位错误
			System.out.println("没有找到驱动类，可能是包没有导入");
			e.printStackTrace();//打印堆栈信息
		}		
		
		//代码功能：通过数据库IP地址，端口号，用户名，密码连接数据库，这段代码容易出现SQL语句异常
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "1234");
		} catch (SQLException e) {//出现SQL异常，进行处理
			System.out.println("可能是IP地址，端口号，用户名，密码输入错误");
			e.printStackTrace();
		}
		
		
	}
	
   

	
}
