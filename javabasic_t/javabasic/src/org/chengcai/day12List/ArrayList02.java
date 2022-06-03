package org.chengcai.day12List;

import java.util.ArrayList;
import java.util.List;

import org.chengcai.day10extends01.Emp02;

/**
 * 集合里面放入对象,放入自定义类型
 * 
 * 
 */


public class ArrayList02 {
	
	
	public static void main(String[] args) {
				
		//存放我们自己创建的类的对象
		List<Emp02> eps = new ArrayList<Emp02>();//创建了一个存放Emp02对象的ArrayList集合；
		
		Emp02 ep1 = new Emp02("001",2000,1000);
		Emp02 ep2 = new Emp02();
		Emp02 ep3 = new Emp02();
		
		eps.add(ep1);//在eps集合存入Emp02的对象 ep1
		eps.add(ep2);//在eps集合存入Emp02的对象 ep2
		eps.add(ep3);//在eps集合存入Emp02的对象 ep3
		eps.add(new Emp02());
		
		Emp02 epp =eps.get(0);//使用Emp02类型的对象epp，去获取0号下标的值
		System.out.println(epp);//直接打印对象所有信息
		
		System.out.println(epp.getSal());//打印该对象sal属性的信息
		
		eps.get(0).getSal();//表示eps集合0号下标对象的sal属性
		
		
		
		
	}
	
	

}
