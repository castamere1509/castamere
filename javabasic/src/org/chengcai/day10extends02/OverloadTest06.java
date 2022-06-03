package org.chengcai.day10extends02;
//方法重载
//在一个类或者父子类之间，有方法名相同，参数列表不同，会根据入参去选择调用方法
/**
 * 1.什么情况会发送重载？
 *——方法名相同,参数列表不同,调用的时候根据入参选择方法
 *
 * 2.什么情况会发生重写
 * 前提：继承关系下,父类和子类之间有方法名和参数列表完全一致的方法时会发生重写，子类重写了父类的方法
 * 体现：发生重写时会调用子类的方法
 * 
 * 3.什么是多态？
 * 什么时候发生：
 *          1.在继承关系下
 *          2.父类类型指向子类对象        例如:Person01 pe = new Emp02();
 *          3.子类重写了父类的方法
 * 体现：发生多态时会调用子类的方法          
 */

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
