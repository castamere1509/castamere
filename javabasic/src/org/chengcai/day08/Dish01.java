package org.chengcai.day08;
/**
 * 面向对象：是一种设计思想
 * 什么是类？是某一类事物的声明，对某一类事物进行描述
 * 什么是对象？是具体的一个实例，具备类的属性和方法
 * 
 * 
 * 怎么创建一个类？
 * 把静态的东西抽象成 属性。
 * 把动态的东西抽象成 方法。
 * 
 * 
 */
public class Dish01 {
   private  String name;//菜的名字
   private String caixi;//菜系
   private boolean isHunCai;//是不是荤菜
   private String type;//冷菜还是热菜
   private String taste;//味道
   private double price;//价格
	
   public Dish01(){
	   
   }
   
   public Dish01(String name,String caixi,boolean isHunCai,String type,String taste,double price){
   
     this.name = name;
     this.caixi = caixi;
     this.isHunCai = isHunCai;
     this.type = type;
     this.taste = taste;
     this.price = price;
   }
   
   
   
	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCaixi() {
	return caixi;
}

public void setCaixi(String caixi) {
	this.caixi = caixi;
}

public boolean isHunCai() {
	return isHunCai;
}

public void setHunCai(boolean isHunCai) {
	this.isHunCai = isHunCai;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getTaste() {
	return taste;
}

public void setTaste(String taste) {
	this.taste = taste;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

	public static void byEat(){
		System.out.println("你咬的我好疼");
		//System.out.println(name);//代码报错,因为name是一个全局实例变量,静态方法无法访问
	}
	
}
