package com.chengcai.day01;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.chengcai.dai01.IfDemo01;

/**
 * @DataProvider 数据提供者，用来提供测试数据，好处：可以将测试数据和测试逻辑分离
 * 注意：1.声明@DataProvider的方法必须返回Object[][]
 *     2.要使用dataProvider,必须在测试方法@Test之后携带(dataProvider="数据提供者的名字")
 *     3.数据提供者每个二维数组的长度必须和参数的使用者的入参长度和类型一致
 * 
 *
 */
public class DataProvider03Test {
	
	@DataProvider//声明该方法是一个数据提供者
	public Object[][] datas(){//数据提供者的名字叫datas
		Object[][] obj ={
				{50,50,"充值 成功"},
				{50,100,"充值 失败，退回50"},
				{100,50,"充值成功,找零50"}
		};
		return obj;
		
	}
	
	//这个方法在运行的时候，会把这个二维数组里面的每组数据循环读入到该方法的入参中；
	@Test(dataProvider="datas")//第一个声明这是一个测试方法，第二个声明数据提供者是datas
	public void chongZhiTest(int tb,int cz,String exp){
		String str = IfDemo01.cz(tb, cz);
		Assert.assertEquals(str, exp);
	}

}
