package com.chengcai.day01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
 * @Test 标识该方法为测试方法
 * @Test(enabled = false) 测试时忽略此方法
 * @BeforeSuite:  被注释的方法将在所有测试运行前运行  //suite代表测试套件
 * @AfterSuite:   被注释的方法将在所有测试运行后运行。
 * @BeforeClass:  被注释的方法将在当前类的第一个测试方法调用前运行。
 * @AfterClass:   被注释的方法将在当前类的所有测试方法调用后运行。
 * @BeforeMethod: 被注释的方法将在每一个@Test测试方法调用前运行。
 * @AfterMethod:  被注释的方法将在每一个@Test测试方法调用后运行。
 * 
 */
public class AnnotationDemo06Test {
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("开始执行测试方法");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("测试方法执行完成");
	}
	
	@Test
	public void test1(){
		System.out.println("@Test1");
	}

	@Test
	public void test2(){
		System.out.println("@Test2");
	}
	
	
}
