package org.chengcai.day04;

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

public class Delete02Test {
	@DataProvider
	public Object[][] data(){
		                 //读取根目录下test_case.xlsx  第1页   第2行到第6 行   第3列到第5类
		Object[][] obj=ExcelUtils.read("/test_case.xlsx", 4, 2, 6, 1, 5);
		return obj;
	}
	
	@Test(dataProvider="data")
	public void deleteTest(String caseId,String casePs,String username,String mima,String exp) throws SQLException{
		
		// 数据库初始化
		String sql ="delete from userinfo where username=? or username =?";
		Object[] obj={"xiaohua",username};
		JdbcMySQLTools.dataDml(sql, obj);
		
		String sql2="insert into userinfo(username,mima,checkmima,email,isChecked) values(?,?,?,?,?)";
		Object[] obj2={"xiaohua","fc76c4a86c56becc717a88f651264622","fc76c4a86c56becc717a88f651264622","123@qq.com","true"};
		JdbcMySQLTools.dataDml(sql2, obj2);
		
		String url="http://localhost:8080/interfacedemo/del";		
		List<NameValuePair> lst = new ArrayList<NameValuePair>();//接口的请求体数据		
		lst.add(new BasicNameValuePair("username",username));
		lst.add(new BasicNameValuePair("mima",mima));
		
		HttpUtils.post(url, lst, exp);
		
		String sql3="select * from userinfo where username =?";
		Object[] obj3={username};
		ResultSet res=JdbcMySQLTools.query(sql3, obj3);
		if(caseId.equals("注销_001")){
			Assert.assertFalse(res.next());
		}
		if(caseId.equals("注销_002")||caseId.equals("注销_003")){
			System.out.println("数据库不需要验证");
		}
		if(caseId.equals("注销_004")||caseId.equals("注销_005")){
			Assert.assertTrue(res.next());
		}
		
	}
	
	

}
