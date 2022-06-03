package org.chengcai.day05;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.chengcai.tools.HttpUtils;
import org.chengcai.day05.TokenUid02Utils;
import org.testng.annotations.Test;

public class EntryAccount01Test {
	
	
	@Test
	public void entryAccountTest() throws UnsupportedEncodingException{
		
		//获取userid
		String uid =TokenUid02Utils.getUserid("xiaohua", "123@abc");
	    //获取token
		String tk=TokenUid02Utils.getToken("xiaohua", "123@abc");
		
		String url="http://localhost:8080/interfacedemo/entryAccount";
		List<NameValuePair> lst = new ArrayList<NameValuePair>();//接口的请求体数据	
		lst.add(new BasicNameValuePair("token",tk));
		lst.add(new BasicNameValuePair("userid",uid));
		lst.add(new BasicNameValuePair("name","小花"));
		lst.add(new BasicNameValuePair("bankCardNo","123456"));
		lst.add(new BasicNameValuePair("bankCardName","工商银行"));
		HttpUtils.post(url, lst, "银行卡信息验证成功");	

}
}