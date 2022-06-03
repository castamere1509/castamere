package org.chengcai.tools;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;

public class HttpUtils {
	/*调用get类型接口，并且对响应码和响应结果进行判定*/
   public static String get(String url,String exp){
	   String entity = null;
	   try{
	 //1、创建一个http的客户端对象，用来模拟http请求
	 		CloseableHttpClient client =  HttpClients.createDefault();
	 		//2、创建get请求
	 		HttpGet get = new HttpGet(url);
	 		//3、执行get请求，返回服务器响应结果
	 		CloseableHttpResponse response =  client.execute(get);
	 		//4、获取响应码
	 		int statusCode = response.getStatusLine().getStatusCode();
	 		System.out.println("响应码为："+statusCode);
	 		Assert.assertEquals(statusCode, 200);
	 		//5、获取相应体,并且通过 EntytyUtils将相应体转换为字符串
	 		 entity = EntityUtils.toString(response.getEntity());
	 		 System.out.println("响应体为："+entity);
	 		 Assert.assertTrue(entity.contains(exp)); 
	   }catch(Exception e){
		   e.printStackTrace();
	   }
	   return entity;     //返回响应结果
   }
   /*调用post类型接口，并且对响应码和响应结果进行判定*/
   public static String post(String url,List<NameValuePair> lst,String exp){
	   String entity =null;
	   try{
   	//1、创建一个http的客户端对象，用来模拟http请求
		CloseableHttpClient client =  HttpClients.createDefault();
		//2、创建post请求
		HttpPost post = new HttpPost(url);
		//3、创建一个储存参数名和参数值的list集合，把请求体数据存放在该list集合

		 //4、设置请求体数据的编码
		 UrlEncodedFormEntity ufe = new UrlEncodedFormEntity(lst,"UTF-8");
		 
		 //5、将Post请求和编码以后的请求体ufe进行关联
		 post.setEntity(ufe);
		 //	6、使用客户端对象执行post请求
		 CloseableHttpResponse response =  client.execute(post);
		 //7、获取响应码
			int statusCode = response.getStatusLine().getStatusCode();
			System.out.println("响应码为："+statusCode);
			Assert.assertEquals(statusCode, 200);
		 //8、获取相应体,并且通过 EntytyUtils将相应体转换为字符串
		 	 entity = EntityUtils.toString(response.getEntity());
			System.out.println("响应体为："+entity);
			Assert.assertTrue(entity.contains(exp));
	   }catch(Exception e){
		   e.printStackTrace();
	   }
	         return entity;//返回响应结果
   }
}
