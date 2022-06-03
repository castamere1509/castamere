package com.chengcai.day03.preparedstatement;



import java.sql.Date;


import org.testng.annotations.Test;

import com.chengcai.tools.JdbcUtils;

public class JdbcDate07 {
	//数据库插入时间
	
	@Test
	public void dateTest(){
		String sql = "insert into emp_xc values(?,?,to_date(?,'yyyymmdd'))";
		Object[] obj ={7777,"xiaohua","20191701"};
		JdbcUtils.update(sql, obj);
		
		
		Date da = new Date(2019-1900,10-1,10);
		 System.out.println(da);//2019-10-10
	}

	 
}
