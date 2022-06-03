package Kayanz;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.chengcai.tools.JdbcUtils;

public class EntryAccount {
	
	public String EntryA(String token,String wechatid,String name,String id,String tel,String bankCardNo,String bankCardName) throws SQLException{
		
		String sql="select * from token where id in(select max(id) from token where userid =?) and token = ?";
		Object[] obj={wechatid,token};
		ResultSet res=JdbcUtils.query(sql, obj);
		if(!res.next()){
			return "token失效或过期";
		}
		String str=Mock.mock(name, bankCardNo, bankCardName, tel);
		if(str.equals("卡验证成功")){
			return "绑卡成功";
		}
		
		return str;
	}
      
}
