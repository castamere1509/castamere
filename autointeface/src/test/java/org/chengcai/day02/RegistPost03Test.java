package org.chengcai.day02;

import java.io.IOException;
import java.sql.ResultSet;
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

//第一步

public class RegistPost03Test {

	
	@Test
	public void loginPost() throws ClientProtocolException, IOException{				
		CloseableHttpClient client = HttpClients.createDefault();				
		HttpPost post = new HttpPost("http://localhost:8080/interfacedemo/regist");				
		List<NameValuePair> lt = new ArrayList<NameValuePair>();		
		lt.add(new BasicNameValuePair("username","xiaohua"));
		lt.add(new BasicNameValuePair("mima","123@abc"));
		lt.add(new BasicNameValuePair("checkmima","123@abc"));
		lt.add(new BasicNameValuePair("email","123@qq.com"));
		lt.add(new BasicNameValuePair("isChecked","true"));
		UrlEncodedFormEntity ue = new UrlEncodedFormEntity(lt,"UTF-8");		
		post.setEntity(ue);		
		CloseableHttpResponse response=client.execute(post);		
		int scode=response.getStatusLine().getStatusCode();
		System.out.println(scode);
		String entity =EntityUtils.toString(response.getEntity());
		System.out.println(entity);
		
	}
	
	
	

}
