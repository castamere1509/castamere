package org.chengcai.tools;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sign01Util {

	public static String createSign(Map<String, String> params, boolean encode) throws UnsupportedEncodingException {
		Set<String> keysSet = params.keySet();
		Object[] keys = keysSet.toArray();
		Arrays.sort(keys);
		StringBuffer temp = new StringBuffer();
		boolean first = true;
		for (Object key : keys) {
			if (first) {
				first = false;
			} else {
				temp.append("&");
			}
			temp.append(key).append("=");
			Object value = params.get(key);
			String valueString = "";
			if (null != value) {
				valueString = String.valueOf(value);
			}
			if (encode) {
				temp.append(URLEncoder.encode(valueString, "UTF-8"));
			} else {
				temp.append(valueString);
			}
		}

		return MD5Util2.encode(temp.toString()).toUpperCase();
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		Map<String,String> mp = new HashMap<String,String>();
		mp.put("username", "lixiaohua");
		mp.put("mima", "123@abc");

		String str = createSign(mp, true);
		System.err.println(str);
	}

	public static String getSign(String username,String mima){
		String sign = null;
	 try{
		Map<String,String> mp = new HashMap<String,String>();
		mp.put("username", username);
		mp.put("mima", mima);
		sign = createSign(mp,true);	
	 }catch(UnsupportedEncodingException e){
		 e.printStackTrace();
	 }
		return sign;
		
		
	}
	
	
}
