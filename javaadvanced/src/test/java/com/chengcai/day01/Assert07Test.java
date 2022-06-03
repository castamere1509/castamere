package com.chengcai.day01;

import org.testng.Assert;
import org.testng.annotations.Test;



/**
 * Assert断言：用来判断结果是否正确，是否和预期一致
 * 
 *
 */
public class Assert07Test {
	
	@Test//相同断言
	public void testAssertEquals(){
		String str ="java";
		Assert.assertEquals(str, "java");//断言括号里面的内容是否相等
		//如果相等的结果输出运行成功，如果不相等报AssertionError,就是断言失败
	}

	@Test//不相同断言
	public void testAssertNotEquals(){
		String str ="java";
		Assert.assertNotEquals(str, "java1");//断言括号里面的内容是不相等
	}
	
	@Test//为真断言
	public void  testAssertTrue(){
		int a=10;
		int b=20;
		Assert.assertTrue(a<b);//断言括号里面的内容是true
	}
	@Test//为假断言
	public void testAssertFalse(){
		int a=10;
		int b=20;
		Assert.assertFalse(a>b);//断言括号里面的内容是false
	}
	
	@Test//为空断言
	public void testAssertNull(){
		Assert.assertNull(null);//断言括号里面为null
	}
	
	@Test//非空断言
	public void testAssertNotNull(){
		Assert.assertNotNull("你好");//断言括号里面是非空的
	}
	
	//如果断言包含 Assert.assertTrue(str.contains(exp))
	@Test//非空断言
	public void testContains(){
		String str = "恭喜您登录成功，本次登录时间为12:30分，本次登录地址：上海市XX区";
		String exp = "登录成功";
		Assert.assertTrue(str.contains(exp));
	}
	
}
