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

//第一步

public class Regist05Test {
	
	@DataProvider
	public Object[][] data(){
		                 //读取根目录下test_case.xlsx  第1页   第2行到第6 行   第3列到第5类
		Object[][] obj=ExcelUtils.read("/test_case.xlsx", 4, 2, 6, 1, 5);
		return obj;
	}

	
	@Test(dataProvider="data")
	public void loginPost(String caseId,String casePs,String username,String mima,String exp) throws ClientProtocolException, IOException, SQLException{
		Logger log =Log4jUtils.getLogger(Regist02Test.class);
		log.info("开始执行测试案例："+caseId+",测试目的为："+casePs+"----------------------------------");
		try
		{
		String sql ="delete from userinfo where username=?";
		Object[] obj ={"xiaohua"};
		JdbcMySQLTools.dataDml(sql, obj);
		
		
		String sql2="insert into userinfo(username,mima,checkmima,email,isChecked) values(?,?,?,?,?)";
		Object[] obj2={"xiaohua","fc76c4a86c56becc717a88f651264622","fc76c4a86c56becc717a88f651264622","123@qq.com","true"};
		JdbcMySQLTools.dataDml(sql2, obj2);
		
		 
		CloseableHttpClient client = HttpClients.createDefault();				
		HttpPost post = new HttpPost("http://localhost:8080/interfacedemo/del");				
		List<NameValuePair> lt = new ArrayList<NameValuePair>();		
		lt.add(new BasicNameValuePair("username",username));
		lt.add(new BasicNameValuePair("mima",mima));
		UrlEncodedFormEntity ue = new UrlEncodedFormEntity(lt,"UTF-8");		
		post.setEntity(ue);		
		CloseableHttpResponse response=client.execute(post);		
		int scode=response.getStatusLine().getStatusCode();
		System.out.println(scode);
		String entity =EntityUtils.toString(response.getEntity());
		System.out.println(entity);
		Assert.assertTrue(entity.contains(exp));
		
		
		
		String sql1 ="select * from userinfo where username=? and mima =?";
		Object[] obj1 ={username,mima};
		ResultSet res =JdbcMySQLTools.query(sql1, obj1);
		while(res.next()){
			if(res.toString().equals("fc76c4a86c56becc717a88f651264622")){
				 boolean boo=res.equals(obj1);
				  Assert.assertFalse(boo);
	}
		}
		}catch(Exception e){
		e.printStackTrace();
		log.error("执行测试案例："+caseId+"出现了异常");
	}
	
	
	
	}	
}
