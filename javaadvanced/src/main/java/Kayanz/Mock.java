package Kayanz;

public class Mock {
	
	public static String mock(String name,String bankCardNo,String bankCardName,String tel){
		
		if(name.equals("诸葛亮") && bankCardNo.equals("1001") && bankCardName.equals("工商银行") && tel.equals("12345678")){
			return "卡冻结";			
		}
		if(name.equals("孙权") && bankCardNo.equals("1002") && bankCardName.equals("工商银行") && tel.equals("123456789")){
			return "卡不存在";			
		}
		if(name.equals("曹操") && bankCardNo.equals("1004") && bankCardName.equals("北京银行") && tel.equals("123456788")){
			return "卡已注销";		
		}		
		if(name.equals("刘备") && bankCardNo.equals("1003") && bankCardName.equals("农业银行") && tel.equals("123456799")){
			return "姓名和卡不匹配";			
		}
        if(name.equals("关羽") && bankCardNo.equals("1005") && bankCardName.equals("建设银行") && tel.equals("123456879")){
        	return "手机号码和卡不匹配";
        }
        if(name.equals("张飞") && bankCardNo.equals("1006") && bankCardName.equals("交通银行") && tel.equals("123456877")){
        	return "开户行和卡不匹配";
        }
		return "卡验证成功";
	}
	
	

}
