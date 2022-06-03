package chengcai.testngtest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import chengcai.testngtest.JdbcUtils;

public class UserLoginTest {
	@DataProvider
	public Object[][] datas(){
		
		Object[][] obj ={
				{"xiaohuahua","123456789","登陆成功"},
				{"xiaohuahua","123456789","登陆失败"}
		};	
		return obj;
	}
	
	

  @Test(dataProvider ="datas")
  public void login(String username,String password,String exp) {
	  
	  if(exp.equals("登陆成功")){
		  String sql1 ="insert into userinfo_xc values(?,?,?,?)";
		  Object[] obj1={"xiaohuahua","123456789","15815515555","150@qq.com"};
		  JdbcUtils.update(sql1, obj1);
	  }
	  
	  if(exp.equals("登陆失败")){
		  String sql ="delete from userinfo_xc where username =?";
		  Object[] obj={username};
           JdbcUtils.update(sql, obj);
	  }
	  
    String str = UserLogin.login(username, password);
	  
	 Assert.assertEquals(str, exp);
	  
	  
	  
    
  }
}
