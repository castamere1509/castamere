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
import org.chengcai.day05.TokenUidUtils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TokenUpdate02Test {
	
	@DataProvider
	public Object[][] data(){
		                 //读取根目录下test_case.xlsx        
		Object[][] obj=ExcelUtils.read("/test_case.xlsx", 6, 2, 10, 1, 6);//正常更新
		return obj;
	}
	
	@Test(dataProvider="data")
	public void updateTest(String caseId,String casePs,String username,String mima,String newmima,String exp) throws UnsupportedEncodingException, SQLException{
		
		//数据库初始化
		String sql ="delete from userinfo where username=? or username =?";
		Object[] obj ={username,"xiaohua"};
		JdbcMySQLTools.dataDml(sql, obj);
				
		String sql1="insert into userinfo(username,mima,checkmima,email,isChecked) values(?,?,?,?,?)";
		Object[] obj1={"xiaohua","fc76c4a86c56becc717a88f651264622","fc76c4a86c56becc717a88f651264622","123@qq.com","true"};
		JdbcMySQLTools.dataDml(sql1, obj1);
				
		//获取token
		String tk=null;		
		if(caseId.equals("更新_001")||caseId.equals("更新_009")){
			tk=TokenUidUtils.getToken("xiaohua","123@abc");
			}else if(caseId.equals("更新_002")){
			tk="";
		}else if(caseId.equals("更新_003")){
			tk="asdasdasd";
		}else if(caseId.equals("更新_004")||caseId.equals("更新_005")||caseId.equals("更新_006")){
			tk=TokenUidUtils.getToken("xiaohua","123@abc");
		}
				
		String url="http://localhost:8080/interfacedemo/tokenUpdate";
		List<NameValuePair> lst = new ArrayList<NameValuePair>();//接口的请求体数据	
		lst.add(new BasicNameValuePair("token",tk));
		lst.add(new BasicNameValuePair("username",username));
		lst.add(new BasicNameValuePair("mima",mima));		
		lst.add(new BasicNameValuePair("newmima",newmima));
		HttpUtils.post(url, lst, exp);	
		
		//校验数据库
		String sql2="select * from userinfo where username=? and mima=?";
        Object[] obj2={username,"93bcab4ab719fde430e5ad90656a240e"};//密码1234@abcd 对应密文93bcab4ab719fde430e5ad90656a240eda
        ResultSet res =JdbcMySQLTools.query(sql2, obj2);
      
        if(caseId.equals("更新_002")||caseId.equals("更新_003")||caseId.equals("更新_006")){
        	Assert.assertFalse(res.next());
        }
        if(caseId.equals("更新_004")||caseId.equals("更新_005")){
        	System.out.println("无法验证数据库");
        }
}
}