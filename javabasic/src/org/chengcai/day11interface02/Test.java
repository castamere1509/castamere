package org.chengcai.day11interface02;

public class Test {
	public static void main(String[] args){
		
			Inc01 i1 = new Inc02();//多态：父类类型指向子类对象
			Inc01 i2 = new Inc03();//多态：父类类型指向子类对象
			
			i1.login("","");//调用Inc02类的login方法
			i2.login("", "");//调用Inc03类的login方法
			
			//快速逻辑切换
			Inc01 in =null;//声明一个Inc01类型的变量 in
			in = new Inc02();
			in.login("", "");//调用Inc02类的login方法
			
			in = new Inc03();
			in.login("", "");//调用Inc03类的login方法
		
	}

}
