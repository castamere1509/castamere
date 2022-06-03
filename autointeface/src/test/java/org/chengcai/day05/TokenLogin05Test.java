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
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TokenLogin05Test {
	
	@DataProvider
	public Object[][] data(){
		                 //读取根目录下test_case.xlsx        
		Object[][] obj=ExcelUtils.read("/test_case.xlsx", 5, 2, 2, 1, 5);//正常更新
		return obj;
	}
	
	@Test(dataProvider="data")
	public void loginTest(String caseId,String casePs,String username,String mima,String exp) throws UnsupportedEncodingException, SQLException{
		
		//数据库初始化
		String sql ="delete from userinfo where username=? or username =?";
		Object[] obj ={username,"xiaohua"};
		JdbcMySQLTools.dataDml(sql, obj);
		
		String sql1="insert into userinfo(username,mima,checkmima,email,isChecked) values(?,?,?,?,?)";
		Object[] obj1={"xiaohua","fc76c4a86c56becc717a88f651264622","fc76c4a86c56becc717a88f651264622","123@qq.com","true"};
		JdbcMySQLTools.dataDml(sql1, obj1);
		
		
		String sign = SignUtil.getSign(username,mima);
		if(caseId.equals("token登录_002")){
			sign="";
		}else if(caseId.equals("token登录_003")){
			sign="adasdassdjh";
		}
		
		
		String url="http://localhost:8080/interfacedemo/tokenlogin";
		List<NameValuePair> lst = new ArrayList<NameValuePair>();//接口的请求体数据		
		lst.add(new BasicNameValuePair("username",username));
		lst.add(new BasicNameValuePair("mima",mima));
		lst.add(new BasicNameValuePair("sign",sign));
		HttpUtils.post(url, lst, exp);
		
		String sql2 ="select * from token where userid in(select id from userinfo where username =?)";
		Object[] obj2={username};
		ResultSet res =JdbcMySQLTools.query(sql2, obj2);
		if(caseId.equals("token登录_001")){
			Assert.assertTrue(res.next());
		}else{
			Assert.assertFalse(res.next());
		}
		
		
	}

}
