package chengcai.testngtest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import chengcai.testngtest.JdbcUtils;

public class UserRegist2Test {
	@DataProvider
	public Object[][] datas(){
		
		Object[][] obj ={
				{"xiaohuahua","123456789","15815515555","150@qq.com","注册成功"},
				{"xiaoh","123456789","15815515555","150@qq.com","用户名格式错误"},
				{"xiaohuahua","1234567","15815515555","150@qq.com","密码格式错误"},
				{"xiaohuahua","123456789","12345678910","150@qq.com","手机号码格式不正确"},
				{"xiaohuahua","123456789","15815515555","150qq.com","邮箱格式不正确"},
				{"xiaohuahua","123456789","15815515555","150@qq.com","存在重复数据"}
		};	
		return obj;
	}
	
  @Test(dataProvider ="datas")
  public void regist(String username,String password,String phone,String email,String exp) {	  
	  if(exp.equals("注册成功")||exp.equals("密码格式错误")||exp.equals("手机号码格式不正确")||exp.equals("邮箱格式不正确")){
		  String sql ="delete from userinfo_xc where username =?";
		  Object[] obj={username};
           JdbcUtils.update(sql, obj);
	  }
	  
	  if(exp.equals("存在重复数据")){
		  String sql1 ="insert into userinfo_xc values(?,?,?,?)";
		  Object[] obj1={"xiaohuahua","123456789","15815515555","150@qq.com"};
		  JdbcUtils.update(sql1, obj1);
	  }
	  
	 String str= UserRegist.regist(username, password, phone, email);
	  System.out.println(str);
	  Assert.assertEquals(str, exp);
   
  }
  
   
}
