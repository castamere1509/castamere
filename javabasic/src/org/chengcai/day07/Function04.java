package org.chengcai.day07;

import testkuabao.TestKuaBao01;

/**
 * 
 */
public class Function04 {
	
 public static void main(String[] args){
	//跨类调用
	int i =Function03.add(1,2);//静态方法,可以直接使用类名,方法名调用,前提是权限足够
	System.out.println(i);
	
	//跨包调用
	int j=TestKuaBao01.add(5, 2);//跨包调用必须引入包
	System.out.println(j);
	
	//跨类调用private权限
	//Function03.adds(1,2); //代码直接报错,私有的只在本类可用,其他地方不可用
	
	
}
	
	
}
