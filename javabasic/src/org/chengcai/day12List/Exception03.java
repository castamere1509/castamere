package org.chengcai.day12List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Exception:异常
 * 
 * 非运行时异常(unRuntimeException):即便是代码没有问题，编译也会报错
 * 在Java里面，有很多代码被认为是高风险代码,必须提前进行声明或者处理
 *
 *非运行时异常代码在运行前都需要进行处理；
 *处理方式2：
 *     try{
 *     
 *     }catch(异常对象){ //执行try中的语句块,使用catch 抓取异常对象，进行处理
 *     
 *     }
 *     
 *     
 */
public class Exception03 {
	
	
	public static void main(String[] args) {
	
	//如果发生了ClassNotFoundException异常，才会运行 catch后面的内容	
	try {//尝试运行
	//加载数据库驱动类，容易出现找不到类异常
	Class.forName("oracle.jdbc.driver.OracleDriver");
	}catch (ClassNotFoundException e) {//出现找不到类异常进行处理
		//处理异常
		//TODO Auto-generated catch block
		System.out.println("没有找到驱动类，可能是包没有导入");
		e.printStackTrace();//打印堆栈信息
	}
		
	//代码功能：通过数据库IP地址，端口号，用户名，密码连接数据库，这段代码容易出现SQL语句异常
	
	try{
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521 : orcl","scott","1234");
	}catch(SQLException e){
		System.out.println("可能是IP地址，端口号，用户名，密码输入错误");
		e.printStackTrace();
	}	
	}
	
	}


	

