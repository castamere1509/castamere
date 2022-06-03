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

public class AaccountCharge02Test {

	@DataProvider
	public Object[][] data(){
		                 //读取根目录下test_case.xlsx        
		Object[][] obj=ExcelUtils.read("/test_case.xlsx", 8, 2, 16, 1, 7);//正常更新
		return obj;
	}

	@Test(dataProvider="data")
	public void updateTest(String caseId,String casePs,String toName,String toBankCardNo,String toBankCardName,String charge,String exp) throws UnsupportedEncodingException, SQLException{
		
		//数据库初始化
		String sql ="delete from bank where name =?";
		Object[] obj ={"王小花"};
		JdbcMySQLTools.dataDml(sql, obj);
		
		String sql9 ="delete from bank where name =?";
		Object[] obj9 ={"钱小花"};
		JdbcMySQLTools.dataDml(sql9, obj9);
		
		String sql4="delete from userinfo where username=?";
		Object[] obj4 ={"xiaohua"};
		JdbcMySQLTools.dataDml(sql4, obj4);
		
		String sql0="delete from userinfo where username=?";
		Object[] obj0 ={"lixiaohua"};
		JdbcMySQLTools.dataDml(sql0, obj0);
		
		String sql3="insert into userinfo(username,mima,checkmima,email,isChecked) values(?,?,?,?,?)";
		Object[] obj3={"xiaohua","fc76c4a86c56becc717a88f651264622","fc76c4a86c56becc717a88f651264622","123@qq.com","true"};
		JdbcMySQLTools.dataDml(sql3, obj3);	
		
		String sql11="insert into userinfo(username,mima,checkmima,email,isChecked) values(?,?,?,?,?)";
		Object[] obj11={"lixiaohua","fc76c4a86c56becc717a88f651264622","fc76c4a86c56becc717a88f651264622","123@qq.com","true"};
		JdbcMySQLTools.dataDml(sql11, obj11);
					
		//获取token
		String id=TokenUid02Utils.getUserid("xiaohua", "123@abc");
		String tk=TokenUid02Utils.getToken("xiaohua", "123@abc");
		
		
		String id1=TokenUid03Utils.getUserid01("lixiaohua", "123@abc");
		String tk1=TokenUid03Utils.getToken01("lixiaohua", "123@abc");
		
		String url1="http://localhost:8080/interfacedemo/entryAccount";
		List<NameValuePair> lst1 = new ArrayList<NameValuePair>();//接口的请求体数据	
		lst1.add(new BasicNameValuePair("token",tk));
		lst1.add(new BasicNameValuePair("userid",id));
		lst1.add(new BasicNameValuePair("name","王小花"));
		lst1.add(new BasicNameValuePair("bankCardNo","123456"));		
		lst1.add(new BasicNameValuePair("bankCardName","建设银行"));
		HttpUtils.post(url1, lst1, "银行卡信息验证成功");
	
		
		String url2="http://localhost:8080/interfacedemo/entryAccount";
		List<NameValuePair> lst2 = new ArrayList<NameValuePair>();//接口的请求体数据	
		lst2.add(new BasicNameValuePair("token",tk1));
		lst2.add(new BasicNameValuePair("userid",id1));
		lst2.add(new BasicNameValuePair("name","钱小花"));
		lst2.add(new BasicNameValuePair("bankCardNo","12345678"));		
		lst2.add(new BasicNameValuePair("bankCardName","建设银行"));
		HttpUtils.post(url2, lst2, "银行卡信息验证成功");
		
		String sql7="update bank set  charge = ? where name= '王小花'";
		Object[] obj7={1000000};
		JdbcMySQLTools.dataDml(sql7, obj7);
		
		String url="http://localhost:8080/interfacedemo/accountCharge";
		List<NameValuePair> lst = new ArrayList<NameValuePair>();//接口的请求体数据	
		lst.add(new BasicNameValuePair("token",tk));
		lst.add(new BasicNameValuePair("userid",id));
		lst.add(new BasicNameValuePair("toName",toName));
		lst.add(new BasicNameValuePair("toBankCardNo",toBankCardNo));		
		lst.add(new BasicNameValuePair("toBankCardName",toBankCardName));
		lst.add(new BasicNameValuePair("charge",charge));
		HttpUtils.post(url, lst, exp);	
		
		//校验数据库
		String sql2="select * from bank where name=? or name=?";
        Object[] obj2={"王小花","钱小花"};
        ResultSet res =JdbcMySQLTools.query(sql2, obj2);
        if(caseId.equals("转账_001")){
        	Assert.assertTrue(res.next());
        }
    
}
	
}
