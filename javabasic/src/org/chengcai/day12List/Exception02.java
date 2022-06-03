package org.chengcai.day12List;
/**
 * Exception:异常
 * 
 * 非运行时异常(unRuntimeException):即便是代码没有问题，编译也会报错
 * 在Java里面，有很多代码被认为是高风险代码,必须提前进行声明或者处理
 *
 *非运行时异常代码在运行前都需要进行处理；
 *处理方式1：使用throws 声明该类可能会出现异常
 *   缺点：一个方法时throws声明异常后，其他方法调用该方法时还需要对这个异常进行处理
 */
public class Exception02 {
	
	                           //声明方法体里面的代码有可能出现异常
	public static void textEx() throws ClassNotFoundException{
	//加载数据库驱动类，容易出现找不到类异常
	Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
	}

	public static void main(String[] args) throws ClassNotFoundException{
		textEx();
	}
	
	
}
