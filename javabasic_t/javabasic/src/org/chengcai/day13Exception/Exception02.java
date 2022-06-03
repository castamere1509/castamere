package org.chengcai.day13Exception;

/**
 * Exception:异常
 *
 *非运行时异常(unRuntimeException):即便是代码没有问题，编译也会报错
 *在Java里面，有很多代码被认为是高风险代码,必须提前进行声明或者处理
 *
 *为什么会有非运行异常？
 *并不是你代码写的有问题，只是Java认为你现在使用的这个代码是比较容易出现异常的代码
 *
 *非运行时异常代码在运行前都需要进行声明或者处理；
 *处理方式1：使用throws 声明该类可能会出现异常
 *    
 *
 */


public class Exception02 {
                                 //声明方法体里面的代码有可能出现异常
	public static void testEx() throws ClassNotFoundException  {
		////加载数据库驱动类，容易出现找不到类异常
		Class.forName("oracle.jdbc.driver.OracleDriver");		
		
	}
	
    public static void main(String[] args) throws ClassNotFoundException {
    	testEx();
	}

	
}
