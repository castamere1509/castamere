package com.chengcai.day04;



import org.apache.log4j.Logger;

import org.testng.annotations.Test;

import com.chengcai.tools.JdbcUtils;
import com.chengcai.tools.Log4jUtils;


public class Log4jDemo05 {
	
	@Test
	public void insertEmp(){
		Logger log = Log4jUtils.getLogger(Log4jDemo05.class);
		
		
		log.info("开始插入数据");
		String sql ="insert into emp_xc values(?,?,?,?,to_date(?,'yyyymmdd'),?,?,?)";
		Object[] obj ={7777,"xiaohua","student",7698,"20191212",1780,300,20};
		int res =JdbcUtils.update(sql, obj);
		if(res == 1){
			log.info("数据插入成功");			
		}
		
		
	}
		
		
		
		
	
	
	

}


