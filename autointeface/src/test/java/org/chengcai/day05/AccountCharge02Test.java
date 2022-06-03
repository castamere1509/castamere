package org.chengcai.day05;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.chengcai.tools.ExcelUtils;
import org.chengcai.tools.HttpUtils;
import org.chengcai.day05.TokenUidUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AccountCharge02Test {
	
	
	@DataProvider
	public Object[][] data(){
		                 //读取根目录下test_case.xlsx        
		Object[][] obj=ExcelUtils.read("/test_case.xlsx", 8, 2, 2, 1, 7);//正常更新
		return obj;
	}
	
	
	@Test(dataProvider="data")
	public void accountCharge(String caseId,String casePs,String toName,String toBankCardNo,String toBankCardName,String charge,String exp){		
		//获取userid
		String uid =TokenUid02Utils.getUserid("xiaohua", "123@abc");
		//获取token
		String tk=TokenUidUtils.getToken("xiaohua", "123@abc");

		String url="http://localhost:8080/interfacedemo/accountCharge";
		List<NameValuePair> lst = new ArrayList<NameValuePair>();//接口的请求体数据	
		lst.add(new BasicNameValuePair("token",tk));
		lst.add(new BasicNameValuePair("userid",uid));
		lst.add(new BasicNameValuePair("toName",toName));
		lst.add(new BasicNameValuePair("toBankCardNo",toBankCardNo));
		lst.add(new BasicNameValuePair("toBankCardName",toBankCardName));
		lst.add(new BasicNameValuePair("charge",charge));
		HttpUtils.post(url, lst, exp);
		
	}
	

	

}
