package org.chengcai.day09;

public class Student02 {
	
	
	public static void main(String[] args){
		
		Student01 stu =new Student01();//�����޲ι��췽����������
		stu.name="С��";
		stu.id="s001";
		stu.age=18;
		stu.sex='Ů';
		
		Student01 stu1 =new Student01("С��","s002",19,'��');//�����вι��췽����������
		System.out.println(stu.name);
		System.out.println(stu1);
		
		Student01 stu2 =new Student01("С��");//����2�Ź�����
		stu2.id="s003";
		stu2.age=20;
		stu2.sex='��';
		
		Student01 stu3 =new Student01("С��","s004");//��3�Ź�����
		Student01 stu4 =new Student01("С��","s005",15);//��4�Ź�����

	}

}
