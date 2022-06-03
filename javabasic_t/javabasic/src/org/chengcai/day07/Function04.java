package org.chengcai.day07;

import org.chengcai.day06.TestKuaBao1;//自动引入了testkuabao包下面TestKuaBao1类，也可手动导入

//跨包调用------------------------------------




/**
 * 1.所有的方法都支持同类调用
 * 2.同一个包下相互调用，不能使用private,私有的只在本类可用
 * 3.跨包调用，被调用的方法必须是public的
 */


public class Function04 {
		
	public static void main(String[] args) {
		
		//跨类调用
		int i =Function03.add(1, 2);//静态方法，可以直接使用类名.方法名调用，前提是权限足够
		System.out.println(i);
		
		//跨包调用
		int j=TestKuaBao1.add(5, 2);//跨包调用必须引入包
		System.out.println(j);
		
		//跨类调用private权限
		//Function03.adds(1,2); //代码直接报错，私有的只在本类可用，其他地方不可用
		
	}
	

}
