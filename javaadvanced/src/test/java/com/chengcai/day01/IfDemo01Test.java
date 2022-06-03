package com.chengcai.day01;

import org.testng.Assert;//断言的功能引入
import org.testng.annotations.Test;//@Test的功能引入

import com.chengcai.dai01.IfDemo01;

/**
 * Testng是一种测试框架，可以进行断言，注解，参数化，生成测试套件
 * 
 * @Testng是一种测试框架，可以进行断言，注解，参数化，生成测试套件
 * 
 * Testng提供了一个断言的功能  Assert:对结果进行判断，在一个测试方法里面，只要发生了断言失败那么这个
 *                             方法就是测试失败，断言失败后后续代码不运行了
 * Testng进行测试，有比较详细的结果报告                            
 *
 */
public class IfDemo01Test {

	@Test
	public void addTest(){  //addTest是一个测试方法
		int i =IfDemo01.add(1,2);
		Assert.assertEquals(i, 3);//断言是否相同，判断IfDemo01.add(1,2)返回的结果是否为3
		i = IfDemo01.add(50, 100);
		Assert.assertEquals(i, 150);
		
		IfDemo01 ad = new IfDemo01();
		i=ad.add(20,30);
		Assert.assertEquals(i, 50);
		
	}
	@Test
	public void chongZhiTest(){//chongZhiTest测试方法
		String str =IfDemo01.cz(50, 100);
		//Assert.assertEquals(str,"充值失败");
		
		str =IfDemo01.cz(100, 100);
		Assert.assertEquals(str, "充值成功");
		
		str =IfDemo01.cz(100, 50);
		Assert.assertEquals(str, "充值成功,找零50");
		
		Assert.assertEquals(IfDemo01.cz(100, 100), "充值成功");
	}
	
	
	
	
	
}
