package org.chengcai.day11abstract01;

public class AbsTest04 {

	public static void main(String[] args) {
		
		Abs01 a1 =new Abs02();//多态：父类类型指向子类对象
		Abs01 a2 =new Abs03();//多态：父类类型指向子类对象
		
		boolean b1=a1.login("小花", "123456");
		System.out.println(b1);
		boolean b2=a2.login("大花", "1234");
		System.out.println(b2);
		
		//快速逻辑切换
		Abs01 a3 = new Abs02();//a3是Abs02的对象，a3.login调用的Abs02的login方法
		a3.login("", "");//调用的Abs02的login方
		a3 = new Abs03();//a3的值被覆盖成Abs03的对象，现在a3.login调用的Abs03的login方法
		a3.login("", "");//调用的Abs03的login方
		
		//a3是个变量，里面装的是一个Abs01类型的对象
		//a3可以被重新赋值，被赋值为谁的对象就调用谁的方法
		
		
		
		//简单登陆代码
		Abs01 a4 = null;//声明一个Abs01 类型的变量 a4
		String denglufangs=null;//用户传过来赋值		
		String a=null;//用户传过来赋值	
		String b=null;//用户传过来赋值	
		if(denglufangs.equals("手机号码登陆")){
			a4=new Abs02();
		}else if(denglufangs.equals("用户名登陆")){
			a4=new Abs03();
		}
		
		a4.login(a, b);
		
		
		
	}
	
	
	
}
