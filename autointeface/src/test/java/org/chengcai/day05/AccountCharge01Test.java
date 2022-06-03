package org.chengcai.day05;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.chengcai.tools.HttpUtils;
import org.chengcai.day05.TokenUidUtils;
import org.testng.annotations.Test;

public class AccountCharge01Test {
	
	@Test
	public void accountCharge(){
		
		//获取userid
		String uid =TokenUid02Utils.getUserid("xiaohua", "123@abc");
		//获取token
		String tk=TokenUidUtils.getToken("xiaohua", "123@abc");
		
		
		String url="http://localhost:8080/interfacedemo/accountCharge";
		List<NameValuePair> lst = new ArrayList<NameValuePair>();//接口的请求体数据	
		lst.add(new BasicNameValuePair("token",tk));
		lst.add(new BasicNameValuePair("userid",uid));
		lst.add(new BasicNameValuePair("toName","小花花"));
		lst.add(new BasicNameValuePair("toBankCardNo","666666"));
		lst.add(new BasicNameValuePair("toBankCardName","工商银行"));
		lst.add(new BasicNameValuePair("charge","500.00"));
		HttpUtils.post(url, lst, "转账成功");
		
	}
	

	

}
