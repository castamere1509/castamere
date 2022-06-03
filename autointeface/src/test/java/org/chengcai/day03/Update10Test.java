package org.chengcai.day03;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.chengcai.tools.ExcelUtils;
import org.chengcai.tools.HttpUtils;
import org.chengcai.tools.JdbcMySQLTools;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Update10Test {
	
	@DataProvider
	public Object[][] data(){
		                 //读取根目录下test_case.xlsx        
		Object[][] obj=ExcelUtils.read("/test_case.xlsx", 3, 2, 8, 1, 6);//新旧密码一致
		return obj;
	}
	
	@Test(dataProvider="data")
	public void updatePost(String caseId,String casePs,String username,String mima,String newmima,String exp) throws SQLException{
		String sql="delete from userinfo where username=?";
		Object[] obj ={"xiaohua"};
		JdbcMySQLTools.dataDml(sql, obj);
		
		String sql2="insert into userinfo(username,mima,checkmima,email,isChecked) values(?,?,?,?,?)";
		Object[] obj2={"xiaohua","fc76c4a86c56becc717a88f651264622","fc76c4a86c56becc717a88f651264622","123@qq.com","true"};
		JdbcMySQLTools.dataDml(sql2, obj2);
		
		if(caseId.equals("更新_002")||caseId.equals("更新_003")){
			String sql4="delete from userinfo where username=?";
			Object[] obj4 ={username};
			JdbcMySQLTools.dataDml(sql4, obj4);			
		}
		
		
		String url="http://localhost:8080/interfacedemo/update";//接口的请求地址
		
		List<NameValuePair> lt = new ArrayList<NameValuePair>();//接口的请求体数据	
		lt.add(new BasicNameValuePair("username",username));
		lt.add(new BasicNameValuePair("mima",mima));
		lt.add(new BasicNameValuePair("newmima",newmima));
		
		HttpUtils.post(url, lt, exp);//调post方法，去请求接口，验证响应的数据是否正确
		
		String sql3="select * from userinfo where username =? and mima=?";
		Object[] obj3={username,"93bcab4ab719fde430e5ad90656a240e"};
		if(caseId.equals("更新_006")||caseId.equals("更新_007")){//当新密码为空时，预期该用户密码不会变化，使用旧密码密文能查到数据
			obj3[1]="fc76c4a86c56becc717a88f651264622";
		}
		ResultSet res =JdbcMySQLTools.query(sql3, obj3);
		if(caseId.equals("更新_001")||caseId.equals("更新_006")||caseId.equals("更新_007")){
			Assert.assertTrue(res.next());			
		}
		if(caseId.equals("更新_002")||caseId.equals("更新_003")){
			System.out.println("不需要验证数据库");
		}
		if(caseId.equals("更新_004")||caseId.equals("更新_005")){
			Assert.assertFalse(res.next());
		}
		
	}
	
	
	
	

}
