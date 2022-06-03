package org.chengcai.day03;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.chengcai.tools.ExcelUtils;
import org.chengcai.tools.HttpUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Update02Test {
	
	@DataProvider
	public Object[][] data(){
		                 //读取根目录下test_case.xlsx  第1页   第2行到第6 行   第3列到第5类
		Object[][] obj=ExcelUtils.read("/test_case.xlsx", 3, 2, 2, 1, 6);
		return obj;
	}
	
	@Test(dataProvider="data")
	public void updatePost(String caseId,String casePs,String username,String mima,String newmima,String exp){
		String url="http://localhost:8080/interfacedemo/update";//接口的请求地址
		
		List<NameValuePair> lt = new ArrayList<NameValuePair>();//接口的请求体数据		
		lt.add(new BasicNameValuePair("username",username));
		lt.add(new BasicNameValuePair("mima",mima));
		lt.add(new BasicNameValuePair("newmima",newmima));
		
		HttpUtils.post(url, lt, exp);//调post方法，去请求接口，验证响应的数据是否正确
		
	}
	
	
	
	

}
