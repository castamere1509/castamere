package org.chengcai.day09;
/**
 * 
 * 封装：就是把属性使用private修饰，并且提供get,set方法，对象使用get和set方法访问属性
 *
 */
public class Encapsulation03 {
	
	private String name;//私有权限,只能在当前类使用
	private int age;
	
	
	public String getName(){//获取当前对象name属性的值
		return this.name;
	}
	//设置name属性的值,调用这个方法需要传入一个String类型数据,把这个数据值赋予给name
	public void setName(String name){
		this.name=name;
	}
	
	public int getAge(){//获取当前对象age属性的值
		return this.age;
	}
	
	public void setAge(int age){//为当前对象的age赋值
		this.age=age;
	}

}
