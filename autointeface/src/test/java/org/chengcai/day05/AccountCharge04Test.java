package org.chengcai.day05;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.chengcai.tools.ExcelUtils;
import org.chengcai.tools.HttpUtils;
import org.chengcai.tools.JdbcMySQLTools;
import org.chengcai.day05.TokenUidUtils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AccountCharge04Test {
	
	
	@DataProvider
	public Object[][] data(){
		                 //读取根目录下test_case.xlsx        
		Object[][] obj=ExcelUtils.read("/test_case.xlsx", 8, 2, 14, 1, 7);
		return obj;
	}
	
	
	@Test(dataProvider="data")
	public void accountCharge(String caseId,String casePs,String toName,String toBankCardNo,String toBankCardName,String charge,String exp) throws SQLException{		
		
		
		
		//删除转出和转入的绑卡信息
		String sql2="delete from bank where userid in(select id from userinfo where username =? or username=?)";
		Object[] obj2 ={"xiaohua","xiaohuahua"};
		JdbcMySQLTools.dataDml(sql2, obj2);			
		//清除转出和转入账户的用户数据
		String sql ="delete from userinfo where username=? or username =?";
		Object[] obj ={"xiaohua","xiaohuahua"};
		JdbcMySQLTools.dataDml(sql, obj);
		
//----------------------------------------------------------------------------------------------//
		
		//插入小花的用户表数据				
		String sql1="insert into userinfo(username,mima,checkmima,email,isChecked) values(?,?,?,?,?)";
		Object[] obj1={"xiaohua","fc76c4a86c56becc717a88f651264622","fc76c4a86c56becc717a88f651264622","123@qq.com","true"};
		JdbcMySQLTools.dataDml(sql1, obj1);
		
		//插入小花花的用户数据
		String sql4="insert into userinfo(username,mima,checkmima,email,isChecked) values(?,?,?,?,?)";
		Object[] obj4={"xiaohuahua","fc76c4a86c56becc717a88f651264622","fc76c4a86c56becc717a88f651264622","123@qq.com","true"};
		JdbcMySQLTools.dataDml(sql4, obj4);
		
		//获取转出账户userid
		String uid =TokenUid02Utils.getUserid("xiaohua", "123@abc");
		//获取转出账户token
		String tk=TokenUid02Utils.getToken("xiaohua", "123@abc");			
		//插入小花的绑卡数据	
		String sql3="insert into bank(userid,name,bank_card,bank_name,charge) values(?,?,?,?,?)";
		Object[] obj3={uid,"小花","123456","工商银行",10000.00};
		JdbcMySQLTools.dataDml(sql3, obj3);
		
		//获取转入账户的userid
		String uid2 =TokenUid02Utils.getUserid("xiaohuahua", "123@abc");
		//插入小花花的绑卡数据
		String sql5="insert into bank(userid,name,bank_card,bank_name,charge) values(?,?,?,?,?)";
		Object[] obj5={uid2,"小花花","666666","工商银行",0.0};
		JdbcMySQLTools.dataDml(sql5, obj5);
		
       
		if(caseId.equals("转账_010")){
			String sql8="delete from bank where userid=?";
			Object[] obj8={uid};
			JdbcMySQLTools.dataDml(sql8, obj8);
		}	
		
//-------------------------------------------------------------------------------------------------//

		String url="http://localhost:8080/interfacedemo/accountCharge";
		List<NameValuePair> lst = new ArrayList<NameValuePair>();//接口的请求体数据	
		lst.add(new BasicNameValuePair("token",tk));
		lst.add(new BasicNameValuePair("userid",uid));
		lst.add(new BasicNameValuePair("toName",toName));
		lst.add(new BasicNameValuePair("toBankCardNo",toBankCardNo));
		lst.add(new BasicNameValuePair("toBankCardName",toBankCardName));
		lst.add(new BasicNameValuePair("charge",charge));
		HttpUtils.post(url, lst, exp);

		//验证数据库
		//先查转出账户
		String sql6 ="select * from bank where userid =? and charge=?";	
		double accountOut=10000.00;//转出账户余额
		if(caseId.equals("转账_001")){
		 accountOut =9500.00;
		}else{
			accountOut=10000.00;
		}		
		Object[] obj6={uid,accountOut};
		ResultSet zcres =JdbcMySQLTools.query(sql6, obj6);
		
		//再查转入账户
		String sql7 ="select * from bank where userid =? and charge=?";
		double accountIn=0.0;//转入账户余额
		if(caseId.equals("转账_001")){
			accountIn =500.00;
		}else{
				accountIn=0.0;
			}				
		Object[] obj7={uid2,accountIn};
		ResultSet zrres =JdbcMySQLTools.query(sql7, obj7);
		
		if(caseId.equals("转账_010")){
			Assert.assertTrue(zrres.next());
			Assert.assertFalse(zcres.next());
		}else{
			Assert.assertTrue(zcres.next() && zrres.next());
		}
		
		
	    
		
		
		
		
	}
	

	

}
