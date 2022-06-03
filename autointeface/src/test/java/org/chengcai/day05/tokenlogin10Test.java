package org.chengcai.day05;

import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.chengcai.tools.ExcelUtils;
import org.chengcai.tools.HttpUtils;
import org.chengcai.tools.JdbcMySQLTools;
import org.chengcai.tools.SignUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class tokenlogin10Test {
	
	@DataProvider
	public Object[][] data(){
		                 //读取根目录下test_case.xlsx        
		Object[][] obj=ExcelUtils.read("/test_case.xlsx", 5, 2, 8, 1, 5);//新旧密码一致
		return obj;
	}
	
	@Test(dataProvider="data")
	public void tokenPost(String caseId,String casePs,String username,String mima,String exp) throws SQLException, UnsupportedEncodingException{
		String sql="delete from userinfo where username=?";
		Object[] obj ={"xiaohua"};
		JdbcMySQLTools.dataDml(sql, obj);
		
		String sql2="insert into userinfo(username,mima,checkmima,email,isChecked) values(?,?,?,?,?)";
		Object[] obj2={"xiaohua","fc76c4a86c56becc717a88f651264622","fc76c4a86c56becc717a88f651264622","123@qq.com","true"};
		JdbcMySQLTools.dataDml(sql2, obj2);
		
		String sign = SignUtil.getSign(username,mima);
		if(caseId.equals("登录_007")){
			sign="sdfglkjjwijhdah";
		}
		
		String url="http://localhost:8080/interfacedemo/tokenlogin";//接口的请求地址
		
		List<NameValuePair> lt = new ArrayList<NameValuePair>();//接口的请求体数据	
		lt.add(new BasicNameValuePair("username",username));
		lt.add(new BasicNameValuePair("mima",mima));
		lt.add(new BasicNameValuePair("sign",sign));
		
		HttpUtils.post(url, lt, exp);//调post方法，去请求接口，验证响应的数据是否正确
		
		String sql3="select * from token where userid in(select id from userinfo where username =?)";
		Object[] obj3={username}; 
		ResultSet res =JdbcMySQLTools.query(sql3, obj3);
		if(caseId.equals("登录_001")){
			Assert.assertTrue(res.next());			
		}else{
			Assert.assertFalse(res.next());
		}
		
		}
        
	
	
	
	
	

}
