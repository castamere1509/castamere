package org.chengcai.day12List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Exception:异常
 * 
 * 两种异常处理的优缺点
 * 处理方式1:使用throws 声明该类可能会出现异常
 *使用throws 声明的方法，在调用时需要再次处理或者声明
 *
 *处理方式2： try....catch
 *使用try....catch处理的，可以直接解决问题，调用者不需要再去处理异常    
 *     
 *     
 *     
 */
public class Exception06 {
	
	
	public static void main(String[] args) throws ClassNotFoundException {
	//testEx()这个方法没有进行异常的处理，仅仅进行了声明，所以调用者必须再次进行声明或者处理	
   Exception02.textEx();

   //testTry()方法一级使用try....catch进行了处理，所以调用者不需要再次声明或者处理
	Exception05.testTry();	
	
	
	}


	
}
