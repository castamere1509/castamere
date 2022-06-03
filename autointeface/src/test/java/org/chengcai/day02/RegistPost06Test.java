package org.chengcai.day02;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.chengcai.tools.ExcelUtils;
import org.chengcai.tools.JdbcMySQLTools;
import org.chengcai.tools.Log4jUtils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//第四步

public class RegistPost06Test {
	
	@DataProvider
	public Object[][] data(){
		                 //读取根目录下test_case.xlsx  第1页   第2行到第6 行   第3列到第5类
		Object[][] obj=ExcelUtils.read("/test_case.xlsx", 2, 2, 3, 1, 8);
		return obj;
	}

	@Test(dataProvider="data")
	public void loginPost(String caseId,String casePs,String username,String mima,String checkmima,String email,String isChecked,String exp) throws ClientProtocolException, IOException, SQLException{				
		String sql ="delete from userinfo where username =?";
		Object[] obj={username};
		JdbcMySQLTools.dataDml(sql, obj);
		
		CloseableHttpClient client = HttpClients.createDefault();				
		HttpPost post = new HttpPost("http://localhost:8080/interfacedemo/regist");				
		List<NameValuePair> lt = new ArrayList<NameValuePair>();		
		lt.add(new BasicNameValuePair("username",username));
		lt.add(new BasicNameValuePair("mima",mima));
		lt.add(new BasicNameValuePair("checkmima",checkmima));
		lt.add(new BasicNameValuePair("email",email));
		lt.add(new BasicNameValuePair("isChecked",isChecked));
		UrlEncodedFormEntity ue = new UrlEncodedFormEntity(lt,"UTF-8");		
		post.setEntity(ue);		
		CloseableHttpResponse response=client.execute(post);		
		int scode=response.getStatusLine().getStatusCode();
		System.out.println(scode);
		String entity =EntityUtils.toString(response.getEntity());
		System.out.println(entity);
		Assert.assertTrue(entity.contains(exp));
		
		//查验数据库
				String sql1 ="select * from userinfo where username=? and email =?";
				Object[] obj1 ={username,email};
				ResultSet res =JdbcMySQLTools.query(sql1, obj1);
				if(caseId.equals("注册_001")){
				boolean boo =res.next();
		       	 Assert.assertTrue(boo);
				}
				
				if(caseId.equals("注册_002")){
					boolean boo =res.next();
			       	 Assert.assertFalse(boo);
				}
	}
	
	
	

}
