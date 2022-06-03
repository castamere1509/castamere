package org.chengcai.day05;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.chengcai.tools.SignUtil;
import org.testng.Assert;

public class TokenUid02Utils {
	//封装获取token的方法
	public static String getToken(String username,String mima){
		String tk=null;	
		try{			
			//获取sign值，这是登录必须要有的参数
			String sign =SignUtil.getSign(username, mima);	           			
			//登录流程
			CloseableHttpClient client =  HttpClients.createDefault();			
			HttpPost post = new HttpPost("http://localhost:8080/interfacedemo/tokenlogin");			
			List<NameValuePair> lst = new ArrayList<NameValuePair>();//接口的请求体数据		
			lst.add(new BasicNameValuePair("username",username));
			lst.add(new BasicNameValuePair("mima",mima));
			lst.add(new BasicNameValuePair("sign",sign));
			UrlEncodedFormEntity ufe = new UrlEncodedFormEntity(lst,"UTF-8");			 
			post.setEntity(ufe);			
			CloseableHttpResponse response =  client.execute(post);
			String entity = EntityUtils.toString(response.getEntity());
			System.out.println(entity);//[{"userid":160,"token":"8c3bb3ff6ba24e2d9b30f35ed52be984","result":"登录成功"}]		
			int a=entity.indexOf("token");
			int b=entity.indexOf("result");
			tk =entity.substring(a+8,b-3);
			}catch(Exception e){
				e.printStackTrace();
				System.err.println("因为异常导致截取失败");
			}		
			return tk;
	}
	
	public static String getUserid(String username,String mima){
		String id=null;	
		try{			
			//获取sign值，这是登录必须要有的参数
			String sign =SignUtil.getSign(username, mima);	           			
			//登录流程
			CloseableHttpClient client =  HttpClients.createDefault();			
			HttpPost post = new HttpPost("http://localhost:8080/interfacedemo/tokenlogin");			
			List<NameValuePair> lst = new ArrayList<NameValuePair>();//接口的请求体数据		
			lst.add(new BasicNameValuePair("username",username));
			lst.add(new BasicNameValuePair("mima",mima));
			lst.add(new BasicNameValuePair("sign",sign));
			UrlEncodedFormEntity ufe = new UrlEncodedFormEntity(lst,"UTF-8");			 
			post.setEntity(ufe);			
			CloseableHttpResponse response =  client.execute(post);
			String entity = EntityUtils.toString(response.getEntity());
			System.out.println(entity);//[{"userid":160,"token":"8c3bb3ff6ba24e2d9b30f35ed52be984","result":"登录成功"}]		
			int c=entity.indexOf("userid");
			int d=entity.indexOf("token");
			id =entity.substring(c+8,d-2);
			}catch(Exception e){
				e.printStackTrace();
				System.err.println("因为异常导致截取失败");
			}		
			return id;
	}
	
	
	
	public static void main(String[] args) {
		getToken("xiaohua","123@abc");
		getUserid("xiaohua","123@abc");
	}
	
	
}
