package org.chengcai.day08;
/**
 * 面向对象：是一种设计思想
 * 什么是类？是某一类事务的声明，对某一类事物进行描述。
 * 什么是对象？是具体的一个实例，具备类的属性和方法。
 * 
 * 
 * 怎么创建一个类？
 * 把静态的东西抽象成 属性。
      把动态的东西抽象成 方法。

 * 
 *
 */

public class Dish01 {

	String name;//菜的名字
	String caixi;//菜系
	boolean isHunCai;//是不是荤菜
	String type;//冷菜还是热菜
	String taste;//味道
	double price;//价格
	


	public static void byEat(){
		System.out.println("你咬的我好疼");
		//System.out.println(name);//代码报错，因为name是一个全局实例变量，静态方法无法访问
	}
	
}
