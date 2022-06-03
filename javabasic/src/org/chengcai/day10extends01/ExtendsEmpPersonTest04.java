package org.chengcai.day10extends01;
/**
 * Emp继承了Person,那么Emp的对象能访问父类Person的方法和属性,也能访问自己的方法和属性
 * 
 *
 */
public class ExtendsEmpPersonTest04 {
	
	public static void main(String[] args){
		Emp02 ep= new Emp02();//创建Emp类的对象
		ep.setName("小花");//访问父类的属性和方法
		ep.setAge(18);//访问了父类的属性和方法
		ep.setSex("女");//访问了父类的属性和方法
		ep.setId("1001");//访问自己的属性和方法
		ep.setSal(10000);//访问自己的属性和方法
		ep.setComm(1000);//访问自己的属性和方法
		
		ep.sleep();//访问了父类的属性和方法
		ep.eat();//访问了父类的属性和方法
		ep.work();//访问自己的属性和方法
		
		Student01 stu =new Student01();
	    stu.setName("小王");//访问了父类的属性和方法
		stu.setAge(18);//访问了父类的属性和方法
		stu.setSex("男");//访问了父类的属性和方法
		stu.setScore(100);//访问自己的属性和方法
		stu.sleep();//访问了父类的属性和方法
		stu.study();//访问自己的属性和方法
		
		Person01 ps= new Person01();//创建父类Person01的对象
		ps.setName("小明");//这个是调用自己的方法
		//ps.setId("1002");//报错，父类不能访问子类的属性和方法
		//ps.work();//报错，父类不能访问子类的属性和方法
		
		//子类直接互调
		//stu.work();//报错,子类之间不能互相访问	
	}
}
