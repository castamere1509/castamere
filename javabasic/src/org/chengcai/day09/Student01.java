package org.chengcai.day09;
/**
 * 构造方法: 是用来创建对象的方法
 * 无参构造方法:一般是系统默认提供,声明了有参构造方法后,无参构造方法也需要手动声明出来
 * 有参构造方法: 需要手动写 , 声明了有参构造方法后,无参构造方法也需要手动声明出来,
 * 系统提供的默认的无参构造方法失效
 *  
 * 什么是构造方法：构造方法是用来创建对象的,分无参构造器和有参数构造器
 *       (0、创建对象的时候,必须调用构造方法来创建。
 *   格式: 构造方法名和类名相同,并且不需要声明返回值。
 *       (2、如果类中没有声明构造方法,系统会默认提供一个无参构造方法。
 *       (3、如果类中有有参构造器,必须手动声明无参构造器,系统不会再
 *          提供默认的无参构造器。
 *  
 *  javaBean:是企业开发中一种约定俗成的习惯
 *
 *  要求:1.属性使用private修饰
 *      2.方法使用public修饰
 *      3.构造器一定要有提供无参构造器
 *  
 *  
 */

public class Student01 {
	
	
		String name;
		String id;
		int age;
		char sex;
	
		public Student01() {//无参构造方法
			
			
		}

        //有参构造方法
		public Student01(String name, String id, int age, char sex) {//1号
			this.name = name;
			this.id = id;
			this.age = age;
			this.sex = sex;
		}
		
		public Student01(String name){//有参构造方法2号
			this.name = name;
		}
		
		//  public Student01(String id)	{ this.id = id;} 该构造方法报错,
		//方法名和参数列表完全一样,系统无法识别
		
		public Student01(int age){//这个构造方法接收的是int 类型的数据和构造方法2不一样
			this.age= age;
		}
		
		
		public Student01(String name,String id){//有参构造方法3号
			this.name =name;
			this.id = id;
		}
		
		public Student01(String name,String id,int age){//有参构造方法4号
			this.name = name;
			this.id = id;
			this.age = age;
		}
		  
		//打印对象信息
		@Override//重写或者叫覆盖,改变该类的输出
		public String toString() {
			return "Student01 [name=" + name + ", id=" + id + ", age=" + age + ", sex=" + sex + "]";
		}
		
		
		

}
