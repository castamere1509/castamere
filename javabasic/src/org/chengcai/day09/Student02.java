package org.chengcai.day09;

public class Student02 {
	
	
	public static void main(String[] args){
		
		Student01 stu =new Student01();//调用无参构造方法创建对象
		stu.name="小花";
		stu.id="s001";
		stu.age=18;
		stu.sex='女';
		
		Student01 stu1 =new Student01("小王","s002",19,'男');//调用有参构造方法创建对象
		System.out.println(stu.name);
		System.out.println(stu1);
		
		Student01 stu2 =new Student01("小王");//调用2号构造器
		stu2.id="s003";
		stu2.age=20;
		stu2.sex='男';
		
		Student01 stu3 =new Student01("小王","s004");//调3号构造器
		Student01 stu4 =new Student01("小白","s005",15);//调4号构造器

	}

}
