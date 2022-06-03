package org.chengcai.day11interface02;

/**
 *接口：使用 interface修饰，jdk1.7版本和之前的版本只能放抽象方法，1.8及以后版本可以放静态方法
 * 
 *      注意：1、 接口不能实例化。（就是不能直接 new 接口名() ）
              2、 一个类要实现一个接口，必须实现接口中的所有抽象方法。
              3、 一个类只能继承一个类，但是可以实现多个接口。
 * 
 *  jdk1.8新特性：接口中可以有抽象方法和静态方法
 */


public interface Inc01 {
	
	public abstract boolean login(String username,String password);//抽象方法
	
	public abstract int add(int a,int b);//抽象方法
    
	public static int jian(int a,int b){//静态方法
		return a-b;
	}

}
