package org.chengcai.day05;

import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.chengcai.tools.ExcelUtils;
import org.chengcai.tools.HttpUtils;
import org.chengcai.tools.JdbcMySQLTools;
import org.chengcai.day05.TokenUid02Utils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EntryAccount03Test {
	
	@DataProvider
	public Object[][] data(){
		                 //读取根目录下test_case.xlsx        
		Object[][] obj=ExcelUtils.read("/test_case.xlsx", 7, 2, 2, 1, 6);//正常更新
		return obj;
	}
	
	
	
	@Test(dataProvider="data")
	public void entryAccountTest(String caseId,String casePs,String name,String bankCardNo,String bankCardName,String exp ) throws UnsupportedEncodingException, SQLException{
		
		//数据库初始化
		//清除小花的数据
		String sql ="delete from userinfo where username=?";
		Object[] obj ={"xiaohua"};
		JdbcMySQLTools.dataDml(sql, obj);
		//插入小花的用户表数据				
		String sql1="insert into userinfo(username,mima,checkmima,email,isChecked) values(?,?,?,?,?)";
		Object[] obj1={"xiaohua","fc76c4a86c56becc717a88f651264622","fc76c4a86c56becc717a88f651264622","123@qq.com","true"};
		JdbcMySQLTools.dataDml(sql1, obj1);
		//删除小花的绑卡信息
		String sql2="delete from bank where userid in(select id from userinfo where username =?) or bank_card ='123456'";
		Object[] obj2 ={"xiaohua"};
		JdbcMySQLTools.dataDml(sql2, obj2);
				
		//获取userid
		String uid =TokenUid02Utils.getUserid("xiaohua", "123@abc");
	    //获取token
		String tk=TokenUidUtils.getToken("xiaohua", "123@abc");
		
		String url="http://localhost:8080/interfacedemo/entryAccount";
		List<NameValuePair> lst = new ArrayList<NameValuePair>();//接口的请求体数据	
		lst.add(new BasicNameValuePair("token",tk));
		lst.add(new BasicNameValuePair("userid",uid));
		lst.add(new BasicNameValuePair("name",name));
		lst.add(new BasicNameValuePair("bankCardNo",bankCardNo));
		lst.add(new BasicNameValuePair("bankCardName",bankCardName));
		HttpUtils.post(url, lst, exp);	

		//数据库验证
		String sql3="select * from bank where userid =? and name =? and bank_card =? and bank_name =?";
		Object[] obj3={uid,name,bankCardNo,bankCardName};
		ResultSet res =JdbcMySQLTools.query(sql3, obj3);
		if(caseId.equals("绑卡_001")){
			Assert.assertTrue(res.next());
		}
}
}