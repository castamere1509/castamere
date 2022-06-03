package chengcai.testngtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HomeWork01Test {
	@DataProvider
	public Object[][] tz(){
		Object [][] zl={
				{160,90,"偏瘦"},
				{170,50,"体重正常"},
			 	{180,50,"过重"},
				{175,40,"肥胖"},
				{180,300,"输入数据异常，无法计算"}
				
		};
		return zl;
	}
    
	@Test(dataProvider="tz")
	public void tzjs(double sz,double tz, String bz){
		String add = HomeWork01.bmi(sz, tz);
		Assert.assertEquals(add, bz);
	}
	
	
}
