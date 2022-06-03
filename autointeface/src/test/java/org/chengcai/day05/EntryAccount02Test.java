package org.chengcai.day05;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.chengcai.tools.ExcelUtils;
import org.chengcai.tools.HttpUtils;
import org.chengcai.day05.TokenUid02Utils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EntryAccount02Test {
	
	@DataProvider
	public Object[][] data(){
		                 //读取根目录下test_case.xlsx        
		Object[][] obj=ExcelUtils.read("/test_case.xlsx", 7, 2, 2, 1, 6);//正常更新
		return obj;
	}
	
	
	
	@Test(dataProvider="data")
	public void entryAccountTest(String caseId,String casePs,String name,String bankCardNo,String bankCardName,String exp ) throws UnsupportedEncodingException{
		
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

}
}