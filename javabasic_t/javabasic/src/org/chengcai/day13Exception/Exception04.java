package org.chengcai.day13Exception;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * Exception:异常
 *
 *非运行时异常(unRuntimeException):即便是代码没有问题，编译也会报错
 *在Java里面，有很多代码被认为是高风险代码,必须提前进行声明或者处理
 *
 *非运行时异常代码在运行前都需要进行处理；
 *处理方式2：
 *      try{
 *      
 *      }catch(异常对象){
 *      
 *      }
 *
 */


public class Exception04 {

	public static void  main(String[] args) {

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "1234");
			} catch (Exception e) {//只要出现异常，都进行处理
				System.out.println("代码运行时出现了异常，请处理");
				e.printStackTrace();//打印e的里面的内容
				
			}
			
         
			
	}

}
