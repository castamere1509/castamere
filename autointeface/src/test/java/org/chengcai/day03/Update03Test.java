package org.chengcai.day03;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.chengcai.tools.ExcelUtils;
import org.chengcai.tools.HttpUtils;
import org.chengcai.tools.JdbcMySQLTools;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Update03Test {
	
	@DataProvider
	public Object[][] data(){
		                 //读取根目录下test_case.xlsx        
		Object[][] obj=ExcelUtils.read("/test_case.xlsx", 3, 2, 2, 1, 6);
		return obj;
	}
	
	@Test(dataProvider="data")
	public void updatePost(String caseId,String casePs,String username,String mima,String newmima,String exp){
		String sql="delete from userinfo where username=?";
		Object[] obj ={"xiaohua"};
		JdbcMySQLTools.dataDml(sql, obj);
		
		String sql2="insert into userinfo(username,mima,checkmima,email,isChecked) values(?,?,?,?,?)";
		Object[] obj2={"xiaohua","fc76c4a86c56becc717a88f651264622","fc76c4a86c56becc717a88f651264622","123@qq.com","true"};
		JdbcMySQLTools.dataDml(sql2, obj2);
		
		
		String url="http://localhost:8080/interfacedemo/update";//接口的请求地址
		
		List<NameValuePair> lt = new ArrayList<NameValuePair>();//接口的请求体数据		
		lt.add(new BasicNameValuePair("username",username));
		lt.add(new BasicNameValuePair("mima",mima));
		lt.add(new BasicNameValuePair("newmima",newmima));
		
		HttpUtils.post(url, lt, exp);//调post方法，去请求接口，验证响应的数据是否正确
		
	}
	
	
	
	

}
