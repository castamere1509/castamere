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
 *      尝试运行该语句块
 *      }catch(异常对象){
 *      如果发生了异常就运行本语句块     
 *      }finally{
 *      该语句块不管有没有发生异常，都会进行执行！！！一般用来进行收尾
 *      }
 *
 */


public class Exception05 {
             
	public static void testTry(){
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "1234");		    
		} catch (Exception e) {			
			e.printStackTrace();
		}finally{			
			System.out.println("finally里面的代码不管有没有发生异常都会执行");
		}
	
	}
      public static void main(String[] args) {
    	  testTry();
	}

}
