package org.chengcai.day05;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.chengcai.tools.HttpUtils;
import org.chengcai.tools.SignUtil;

public class UseridTokenUtils {
	
	public static String userid(String username,String mima){
		String sign;
		String userid = null;
		try {
			sign = SignUtil.getSign(username, mima);
			String url = "http://localhost:8080/interfacedemo/tokenlogin";
			List<NameValuePair> lst = new ArrayList<NameValuePair>();
			lst.add(new BasicNameValuePair("username", username));
			lst.add(new BasicNameValuePair("mima", mima));
			lst.add(new BasicNameValuePair("sign", sign));
	         String      resultToken = HttpUtils.post(url, lst,"登录成功");
	         userid = resultToken.substring(resultToken.indexOf("userid")+8,resultToken.indexOf("token")-2);      
	         System.out.println(userid);
		} catch (Exception e) {	
			e.printStackTrace();
		}
		return userid;
	}
	
	public static String token(String username,String mima){
		String sign;
		String token = null;
		try {
			sign = SignUtil.getSign(username, mima);
			String url = "http://localhost:8080/interfacedemo/tokenlogin";
			List<NameValuePair> lst = new ArrayList<NameValuePair>();
			lst.add(new BasicNameValuePair("username", username));
			lst.add(new BasicNameValuePair("mima", mima));
			lst.add(new BasicNameValuePair("sign", sign));
	         String      resultToken = HttpUtils.post(url, lst,"登录成功");
	         token = resultToken.substring(resultToken.indexOf("token")+8,resultToken.indexOf("result")-3);      
	         System.out.println(token);
		} catch (Exception e) {	
			e.printStackTrace();
		}
		return token;
	}
	

}
