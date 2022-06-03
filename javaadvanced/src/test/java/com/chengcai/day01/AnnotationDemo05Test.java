package com.chengcai.day01;

import org.testng.annotations.Test;

/**
 * 注解的使用
 * 
 * 一个测试套件下可以包含多个类，一个类下可以包含多个测试方法。
 * 
 * pom可以同时指定运行多个套件 Suite
 * 套件里面可以有多个模块 test
 * 模块里面可以有多个类 class
 * 类里面可以有多个方法
 * 每个方法可以有多种场景
 * 
 * 使用Priority可以指定执行顺序(默认值为0)，数值越小，越靠前执行
 * 
 */
public class AnnotationDemo05Test {
	
	@Test(priority=1)
	public void Test01(){
		System.out.println("第二个执行");
	}
	
	@Test(priority=0)
	public void Test02(){
		System.out.println("第一个执行");
	}
	
	@Test(priority=1)
	public void Test03(){
		System.out.println("第三个执行");
	}
	
	@Test(priority=1)
	public void Test04(){
		System.out.println("第四个执行");
	}
	
}
