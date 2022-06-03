package com.chengcai.day01;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.chengcai.dai01.IfDemo01;

public class DataProviderlianxiTest {
	@DataProvider
	public Object[][] zuoye(){
		Object [][] rn={
		{2020,"2020是闰年"},
		{2015,"2015不是闰年"}
	};
		return rn;
	}
	
    @Test(dataProvider="zuoye")
    public void rncx(int nd,String pd){
    	String add = IfDemo01.lo(nd);
    	Assert.assertEquals(add, pd);
    }
	
}
