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
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TokenentryAccount01Test {
	
	@DataProvider
	public Object[][] data(){
		                 //读取根目录下test_case.xlsx        
		Object[][] obj=ExcelUtils.read("/test_case.xlsx", 7, 2, 14, 1, 6);//正常更新
		return obj;
	}

	@Test(dataProvider="data")
	public void updateTest(String caseId,String casePs,String name,String bankCardNo,String bankCardName,String exp) throws UnsupportedEncodingException, SQLException{
		
		//数据库初始化
		String sql ="delete from bank where name=? or name =?";
		Object[] obj ={name,"王小花"};
		JdbcMySQLTools.dataDml(sql, obj);
		
		String sql4="delete from userinfo where username=?";
		Object[] obj4 ={"xiaohua"};
		JdbcMySQLTools.dataDml(sql4, obj4);
		
		String sql3="insert into userinfo(username,mima,checkmima,email,isChecked) values(?,?,?,?,?)";
		Object[] obj3={"xiaohua","fc76c4a86c56becc717a88f651264622","fc76c4a86c56becc717a88f651264622","123@qq.com","true"};
		JdbcMySQLTools.dataDml(sql3, obj3);		
		
		//获取token
		String tk=TokenUid02Utils.getToken("xiaohua", "123@abc");
		String id=TokenUid02Utils.getUserid("xiaohua", "123@abc");
		if(caseId.equals("绑卡_002")){
			tk="";
		}else if(caseId.equals("绑卡_003")){
			tk="sdggfjserws";
		}else if(caseId.equals("绑卡_004")){
			id="";
		}else if(caseId.equals("绑卡_005")){
			id="asdafwerasddg";
		}else if(caseId.equals("绑卡_006")||caseId.equals("绑卡_011")||caseId.equals("绑卡_012")){
			tk=TokenUid02Utils.getToken("xiaohua", "123@abc");
			id=TokenUid02Utils.getUserid("xiaohua", "123@abc");
		}
		String url="http://localhost:8080/interfacedemo/entryAccount";
		List<NameValuePair> lst = new ArrayList<NameValuePair>();//接口的请求体数据	
		lst.add(new BasicNameValuePair("token",tk));
		lst.add(new BasicNameValuePair("userid",id));
		lst.add(new BasicNameValuePair("name",name));
		lst.add(new BasicNameValuePair("bankCardNo",bankCardNo));		
		lst.add(new BasicNameValuePair("bankCardName",bankCardName));
		HttpUtils.post(url, lst, exp);	
		
		//校验数据库
		String sql2="select * from bank where name=?";
        Object[] obj2={name};
        ResultSet res =JdbcMySQLTools.query(sql2, obj2);
        if(caseId.equals("绑卡_001")){
        	Assert.assertTrue(res.next());
        }
    
}
	
}
