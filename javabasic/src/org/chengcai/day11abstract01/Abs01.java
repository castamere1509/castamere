package org.chengcai.day11abstract01;
/**
 * 抽象方法：方法由abstract修饰,没有方法体,只声明方法 ,不实现方法
 * 抽象类：类名由abstract修饰,可以包含抽象方法和普通方法的类。
 *       一个类可以继承抽象类,一旦继承必须实现(覆盖)抽象类中的抽象方法
 */
public abstract class Abs01 {
	
	public abstract boolean login(String username,String password);//抽象方法
	
	public int add(int a,int b){//普通方法
		return a+b;
	}
	

}
