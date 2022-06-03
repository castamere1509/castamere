package org.chengcai.day10override02;
//方法重载
//在一个类或者父子类之间，有方法名相同，参数列表不同，会根据入参取选择调用方法

public class OverloadTest06 {

	public static void main(String[] args) {
		
		Overload05 ov = new Overload05();		
		ov.add(1,2);
		ov.add(1, 2,3);
		ov.add(1, 1.1);
		//根据不同的入参，会选择性调用不同的方法
		Emp02 ep = new Emp02();
		ep.sleep();//调用的父类的方法
		ep.sleep(1);//调用的自己的方法
		
		
	}
	
	
}
