package chengcai.testngtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HomeWork03Test {
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
	public Object[][] datas1(){
		Object[][] obj ={
				{"username1","password1","登录成功"},
				{"username2","password2","登录成功"},
				{"username5","password5","登录成功"},
				{"username4","password4","登录成功"}
		};
		return obj;	
	}

@Test(dataProvider="datas1")
public void test02(String username,String password,String exp){
	 HomeWork22 s=new HomeWork22();
  String sd=	s.denglu(username,password );
  Assert.assertEquals(sd, exp);
}

}
