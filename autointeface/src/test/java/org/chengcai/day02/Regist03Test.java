package org.chengcai.day02;

import java.io.IOException;
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

public class Regist03Test {
	
	
	@DataProvider
	public Object[][] data(){
		                 //读取根目录下test_case.xlsx  第1页   第2行到第6 行   第3列到第5类
		Object[][] obj=ExcelUtils.read("/test2_case.xlsx", 2, 2, 23, 1, 8);
		return obj;
	}

	//使用httpclient模拟get请求
	@Test(dataProvider="data")
	public void loginGet(String caseId,String casePs,String username,String mima,String checkmima,String email,String isChecked,String exp){
		Logger log =Log4jUtils.getLogger(Regist02Test.class);
		log.info("开始执行测试案例："+caseId+",测试目的为："+casePs+"----------------------------------");		
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
		//2.创建一个httpPost请求
			HttpPost post = new HttpPost("http://localhost:8080/interfacedemo/regist");
		//3.创建一个list集合，用来存放请求体数据,请求体数据类型：NameValuePair
			List<NameValuePair> lt = new ArrayList<NameValuePair>();
			//NameValuePair a = new BasicNameValuePair("username","lixiaohua");
			//NameValuePair b = new BasicNameValuePair("mima","123@abc");
			//lt.add(a);
			//lt.add(b);
			lt.add(new BasicNameValuePair("username",username));
			lt.add(new BasicNameValuePair("mima",mima));
			lt.add(new BasicNameValuePair("checkmima",checkmima));
			lt.add(new BasicNameValuePair("email",email));
			lt.add(new BasicNameValuePair("isChecked",isChecked));
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
			
		} catch (Exception e) {			
			e.printStackTrace();
			log.error("执行测试案例："+caseId+"出现了异常");
		}
		
		
	} 
	
	

}
