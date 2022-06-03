package com.chengcai.day01;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.chengcai.dai01.HomeWork02;

public class HomeWork02Test {
	
	
	@DataProvider//声明该方法是一个数据提供者
	public Object[][] aaaaa(){//数据提供者的名字叫datas		
		Object[][] obj ={
				{2000,"2000是闰年"},
				{2001,"2001不是闰年"},
				{2004,"2004年是闰年"}				
		};		
		return obj;
	}

  @Test(dataProvider="aaaaa")
  public void loTest(int year,String exp) {
	  
   String str =HomeWork02.lo(year);
    Assert.assertEquals(str, exp);
   
  }
}
