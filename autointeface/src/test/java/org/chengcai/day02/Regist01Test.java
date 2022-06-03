package org.chengcai.day02;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.chengcai.tools.ExcelUtils;
import org.chengcai.tools.JdbcMySQLTools;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Regist01Test {
	
	
	@DataProvider
	public Object[][] data(){
		                 //读取根目录下test_case.xlsx  第1页   第2行到第6 行   第3列到第5类
		Object[][] obj=ExcelUtils.read("/test2_case.xlsx", 2, 2, 23, 1, 8);
		return obj;
	}

	//使用httpclient模拟get请求
	@Test(dataProvider="data")
	public void loginGet(String caseId,String casePs,String username,String mima,String checkmima,String email,String isChecked,String exp){
		try {
			
			//初始化数据库测试数据
			String sql ="delete from userinfo where username=?";
			Object[] obj ={username};
			JdbcMySQLTools.dataDml(sql, obj);
			
			if(caseId.equals("注册_004")){//只有在执行测试案例 注册_004的时候给数据库插入数据
				String sql2="insert into userinfo(username,mima,checkmima,email,isChecked) values(?,?,?,?,?)";
				Object[] obj2={username,mima,checkmima,email,isChecked};
				JdbcMySQLTools.dataDml(sql2, obj2);
			}

			//1.创建一个http的客户端对象，用来模拟http请求
			CloseableHttpClient client = HttpClients.createDefault();		
			//2.创建get请求
			HttpGet get = new HttpGet("http://localhost:8080/interfacedemo/regist?username="+username+"&mima="+mima+"&checkmima="+checkmima+"&email="+email+"&isChecked="+isChecked);		
			//3.执行get请求，返回响应数据   CloseableHttpResponse这个是响应
			CloseableHttpResponse response;
			response = client.execute(get);
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
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		
	}
	
	

}
