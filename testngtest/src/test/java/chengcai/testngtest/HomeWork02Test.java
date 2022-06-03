package chengcai.testngtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HomeWork02Test {
	/*
	@DataProvider
	public Object[][] cj(){
		Object [][] cjj={
				{58,"不及格"},
				{61,"及格"},
			 	{101,"成绩异常"}
		
		};
		return cjj;
	}
	
	@Test(dataProvider="cj")
	public void cjjs(double fs,String hz){
		String ad =HomeWork02.scores(fs);
		Assert.assertEquals(ad, hz);
	}
	*/
	@DataProvider
	public Object[][] datas(){
		Object[][] obj ={
				{"userna722","password722","注册成功"},
				{"userna833","password833","注册成功"},
				{"userna944","password944","注册成功"},
				{"userna55","password55","注册成功"}
		};
		return obj;	
	}
	
	
	
	@Test(dataProvider="datas")
	 public void test(String username,String password,String exp){
		 HomeWorkzuoye s=new HomeWorkzuoye();
	   String sd=	s.register(username,password );
	   Assert.assertEquals(sd, exp);
	 }



}
