package org.chengcai.day03;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.chengcai.tools.HttpUtils;
import org.testng.annotations.Test;

public class Update01Test {
	
	
	@Test
	public void updatePost(){
		String url="http://localhost:8080/interfacedemo/update";//接口的请求地址
		
		List<NameValuePair> lt = new ArrayList<NameValuePair>();//接口的请求体数据		
		lt.add(new BasicNameValuePair("username","xiaohuahua"));
		lt.add(new BasicNameValuePair("mima","123@abc"));
		lt.add(new BasicNameValuePair("newmima","1234@abcd"));
		
		HttpUtils.post(url, lt, "更新成功");//调post方法，去请求接口，验证响应的数据是否正确
		
	}
	
	
	
	

}
