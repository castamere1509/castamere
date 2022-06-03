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
import org.chengcai.tools.MD5Util;
import org.chengcai.tools.SignUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class tokenupdate10Test {
	
	@DataProvider
	public Object[][] data(){
		                 //读取根目录下test_case.xlsx        
		Object[][] obj=ExcelUtils.read("/test_case.xlsx", 6, 6, 6, 1, 6);//新旧密码一致
		return obj;
	}
	
	@Test(dataProvider="data")
	public void tokenPost(String caseId,String casePs,String username,String mima,String newmima,String exp) throws SQLException, UnsupportedEncodingException{
		String sql="delete from userinfo where username=? or username =?";
		Object[] obj ={username,"xiaohua"};
		JdbcMySQLTools.dataDml(sql, obj);
		
		String sql2="insert into userinfo(username,mima,checkmima,email,isChecked) values(?,?,?,?,?)";
		Object[] obj2={"xiaohua","fc76c4a86c56becc717a88f651264622","fc76c4a86c56becc717a88f651264622","123@qq.com","true"};
		JdbcMySQLTools.dataDml(sql2, obj2);
		String tk =null;
		if(caseId.equals("更新_001")){
		tk=TokenUidUtils.getToken("xiaohua","123@abc");
		}else if(caseId.equals("更新_002")){
			tk="";
		}else if(caseId.equals("更新_003")){
			tk="asdafsdfga";
		}else if(caseId.equals("更新_004")){
			tk=UseridTokenUtils.token("xiaohua",mima);
		}else if(caseId.equals("更新_005")){
			tk=UseridTokenUtils.token("xiaohuaasd","123@abc");
		}
		String url="http://localhost:8080/interfacedemo/tokenUpdate";//接口的请求地址
		
		List<NameValuePair> lt = new ArrayList<NameValuePair>();//接口的请求体数据
		
		lt.add(new BasicNameValuePair("token",tk));
		lt.add(new BasicNameValuePair("username",username));
		lt.add(new BasicNameValuePair("mima",mima));
		lt.add(new BasicNameValuePair("newmima",newmima));
		HttpUtils.post(url, lt, exp);//调post方法，去请求接口，验证响应的数据是否正确
		
		String sql3 ="select * from userinfo where username=? and mima=?";
		Object[] obj3={username,"83b57177908a43dba7845e86bfab2f69"};//密码1234@abcd 对应密文83b57177908a43dba7845e86bfab2f69
		ResultSet res =JdbcMySQLTools.query(sql3, obj3);
	
		if(caseId.equals("更新_002")||caseId.equals("更新_003")||caseId.equals("更新_006")||caseId.equals("更新_007")||caseId.equals("更新_008")){
			Assert.assertFalse(res.next());
		}
		if(caseId.equals("更新_004")){
			System.out.println("无法验证数据库");
		
	}
	
	
	
	}

}
