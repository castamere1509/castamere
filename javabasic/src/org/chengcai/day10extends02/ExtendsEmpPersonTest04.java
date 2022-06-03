package org.chengcai.day10extends02;
/**
 * 方法重写(方法覆盖):
 * 发生在父子类之间,子类继承父类,子类和父类拥有相同的方法名,参数列表和返回值,
 * 会先调用子类的方法,这种现象称为  方法重写或方法覆盖。
 */
public class ExtendsEmpPersonTest04 {
	
	public static void main(String[] args){
		Emp02 ep =new Emp02();
		ep.eat();//子类和父类都有eat方法,因为对象是子类的类型 指向 子类的对象,所以调用的是子类的方法
		
		Student03 stu = new Student03();
		stu.eat();//子类和父类都有eat方法,因为对象是子类的类型 指向 子类的对象,所以调用的是子类的方法
		
		Person01 ps = new Person01();
		ps.eat();//子类和父类都有eat方法,因为对象是父类的类型 指向 父类的对象,调用的是父类方法
		
		//多态     只发生在父子类之间,父类类型指向  子类对象,如果发生了重写,会动态调用子类的方法
		//类型        变量名      值
		Person01 pe = new Emp02();//父类类型指向 子类对象
		pe.eat();//如果发生了重写,会动态调用子类Emp02的方法
		
		Person01 pst=new Student03();//父类类型指向 子类对象
		pst.eat();//因为Student03类重写了父类Person01的eat方法，调用子类Student03的方法
		//不能直接调子类的属性和方法
	}
}
