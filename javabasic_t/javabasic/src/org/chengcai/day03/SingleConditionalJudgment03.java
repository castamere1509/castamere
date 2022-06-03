package org.chengcai.day03;

/*
 * 条件分支语句
 * if(条件){
 *  语句块，当条件结果为true,则执行，结果为false,则不执行
 * }
 * 
 */

public class SingleConditionalJudgment03 {
	
	public static void main(String[] args) {
		int age =30;
		//单分支语句
		if(age>=30){			
			System.out.println("开始变老了");
		}
		
		String username ="xiaohua";
		int passwd =1234;		
		String shuruun ="xiaohua";
		int shurumm =1234;
		if(shuruun.equals(username) && shurumm == passwd ){
			System.out.println("登陆成功");			
		}
		
		
		String tianqi ="下雨了";
		if(tianqi.equals("下雨了")){
			System.out.println("回家收衣服");
			
		}
		
		
	}
	
	
}
