package org.chengcai.day01;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
import org.chengcai.tools.ExcelUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

//使用httpclient模拟请求(get和post)

//集成Testng

public class Login003Test {
	@DataProvider
	public Object[][] data(){
		
		Object[][] obj=ExcelUtils.read("/test_case.xlsx", 1, 2, 6, 3, 5);
		return obj;	
				
}
		
	

//使用httplient模拟post请求
@Test(dataProvider="data")
public void loginPost(String username,String mima,String exp) throws ClientProtocolException, IOException{
	
	//1.创建一个http的客户端对象，用来模拟http请求
		CloseableHttpClient client = HttpClients.createDefault();
	//2.创建一个httpPost请求
		HttpPost post = new HttpPost("http://localhost:8080/interfacedemo/login");
	//3.创建一个list集合，用来存放请求体数据,请求体数据类型：NameValuePair
		List<NameValuePair> lt = new ArrayList<NameValuePair>();
		//NameValuePair a = new BasicNameValuePair("username","lixiaohua");
		//NameValuePair b = new BasicNameValuePair("mima","123@abc");
		//lt.add(a);
		//lt.add(b);
		lt.add(new BasicNameValuePair("username",username));
		lt.add(new BasicNameValuePair("mima",mima));
		
		//4.将请求的数据进行编码，转换为UTF-8格式
		UrlEncodedFormEntity ue = new UrlEncodedFormEntity(lt,"UTF-8");
		//5.把数据放入到post请求里面，相当于关联post请求和请求的数据
		post.setEntity(ue);
		//6.执行post请求，返回响应数据
		CloseableHttpResponse response=client.execute(post);
		//7.获取响应体中的响应码
		int scode=response.getStatusLine().getStatusCode();
		System.out.println(scode);//200
		//8.获取响应体
		//response.getEntity()获取响应里面的响应体
		//EntityUtils.toString(response.getEntity())将响应体里面的数据转换为String类型
		String entity =EntityUtils.toString(response.getEntity());
		System.out.println(entity);//[{"result":"登录成功"}]
		//9.添加断言
		Assert.assertTrue(entity.contains(exp));
		
}
}
