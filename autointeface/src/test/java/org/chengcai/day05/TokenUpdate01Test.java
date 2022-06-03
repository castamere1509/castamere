package org.chengcai.day05;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.chengcai.tools.HttpUtils;
import org.chengcai.tools.SignUtil;
import org.chengcai.day05.TokenUidUtils;
import org.testng.annotations.Test;

public class TokenUpdate01Test {
	
	
	@Test
	public void updateTest() throws UnsupportedEncodingException{
		
	    //获取token
		String tk=TokenUidUtils.getToken("xiaohua", "123@abc");
		
		String url="http://localhost:8080/interfacedemo/tokenUpdate";
		List<NameValuePair> lst = new ArrayList<NameValuePair>();//接口的请求体数据	
		lst.add(new BasicNameValuePair("token",tk));
		lst.add(new BasicNameValuePair("username","xiaohua"));
		lst.add(new BasicNameValuePair("mima","123@abc"));		
		lst.add(new BasicNameValuePair("newmima","1234@abcd"));
		HttpUtils.post(url, lst, "更新成功");		

}
}