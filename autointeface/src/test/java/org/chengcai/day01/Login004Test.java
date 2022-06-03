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
import org.apache.log4j.Logger;
import org.chengcai.tools.ExcelUtils;
import org.chengcai.tools.Log4jUtils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



//使用httpclient模拟请求(get和post)
//集成Testng
//使用封装的poi类操作Excel,实现代码和数据分离
//集成log4j

public class Login004Test {
	
	@DataProvider
	public Object[][] data(){
		                 //读取根目录下test_case.xlsx  第1页   第2行到第6 行   第3列到第5类
		Object[][] obj=ExcelUtils.read("/test_case.xlsx", 1, 2, 6, 1, 5);
		return obj;
	}
     /*
	//使用httpclient模拟get请求
	@Test(dataProvider="data")
	public void loginGet(String caseId,String casePs,String username,String mima,String exp){
		Logger log =Log4jUtils.getLogger(Login004Test.class);
		log.info("开始执行测试案例"+"测试编号为："+caseId+",测试目的为："+casePs);
				
		try{
		//1.创建一个http的客户端对象，用来模拟http请求
		CloseableHttpClient client = HttpClients.createDefault();
		
		//2.创建get请求
		HttpGet get = new HttpGet("http://localhost:8080/interfacedemo/login?username="+username+"&mima="+mima);
		
		//3.执行get请求，返回响应数据   CloseableHttpResponse这个是响应
		CloseableHttpResponse response =client.execute(get);
		
		//4.获取响应体中的响应码
		int scode=response.getStatusLine().getStatusCode();
		System.out.println(scode);//200
		
		//5.获取响应体
		HttpEntity ht =response.getEntity();
		
		//6.获取相应体里面的内容 EntityUtils.toString(ht)//将响应的数据转换为字符串类型		
		String entity = EntityUtils.toString(ht);
		System.out.println(entity);//这个entity是转换为字符串后的响应体
		//7.添加断言  使用包含断言		
		Assert.assertTrue(entity.contains(exp));//断言括号里面的内容是true		
		//entity.contains(exp)返回的是boolean类型，如果响应体包含exp预期结果，那么就返回true,反之返回false
		log.info("测试案例执行通过,"+"测试编号为："+caseId+",测试目的为："+casePs+"-----------------------------------------------");
		}catch(Exception e){
			e.printStackTrace();
			log.error("测试案例执行失败"+"测试编号为："+caseId+",测试目的为："+casePs);
			
		}
		
	}
	
	*/
	//使用httpclient模拟post请求
	@Test(dataProvider="data")
	public void loginPost(String caseId,String casePs,String username,String mima,String exp){
		Logger log = Log4jUtils.getLogger(Login004Test.class);
		log.info("开始执行测试案例："+caseId);
		
		try{
		//1.创建一个http的客户端对象，用来模拟http请求
		CloseableHttpClient client = HttpClients.createDefault();
		
		//2.创建一个httpPost请求
		HttpPost post = new HttpPost("http://localhost:8080/interfacedemo/login");
		
		//3.创建一个list集合，用来存放请求体数据  ,请求体数据类型：NameValuePair
		List<NameValuePair> lt = new ArrayList<NameValuePair>();		
		//NameValuePair a=new BasicNameValuePair("username","xiaohua");
		//NameValuePair b=new BasicNameValuePair("mima","123@abc");
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
		
		//9.添加断言  使用包含断言		
		Assert.assertTrue(entity.contains(exp));//断言括号里面的内容是true
		log.info("测试案例:"+casePs+"执行通过");
		}catch(Exception e){
			e.printStackTrace();
			log.error("测试案例"+caseId+"执行时发生异常");
		}
		
	}
	
	
	
	

}
