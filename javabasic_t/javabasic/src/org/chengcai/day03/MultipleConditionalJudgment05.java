package org.chengcai.day03;
/**
 * 
 * 双分支语句
 * 
 * if(条件){
 *   语句块1，如果if后面的条件结果是true，就运行该语句
 * }else{
 *   语句块2，如果if后面的条件结果是false，就运行该语句
 * }
 * 
 * 多分支语句：
   
   if(条件1){
         语句块1
   }else if(条件2){
         语句块2
   }else if(条件3){
         语句块3
   }else if(条件4){
         语句块4
   }else{
         语句块5
   }
 * 
 * 
 * 
 * 
 *
 */


public class MultipleConditionalJudgment05 {
	
	public static void main(String[] args) {
		int a =40;
		int b =30;
		if(a>b){
			System.out.println("a比b大");
		}else{
			System.out.println("a比b小或者相等");
		}
		
//登陆案例
		
		String username ="xiaohua"; //数据库里面的用户名
		int passwd =1234;		    //数据库里面的密码
		String shuruun ="xiaohua";  //用户输入的用户名
		int shurumm =1234;          //用户输入的密码
		if(shuruun.equals(username) && shurumm == passwd ){
			System.out.println("登陆成功");			
		}else{
			System.out.println("用户名或者密码错误，登陆失败");
		}
		
//考试成绩案例
		double score =80;
		if(score>=60){
			System.out.println("成绩合格");
		}else{
			System.out.println("不及格");
		}
		
//考试成绩案例
		score =100;
		if(score>=0 && score<60){
			System.out.println("不及格");
		}else if(score >=60 && score <80){
			System.out.println("成绩良好");
		}else if(score >=80 && score<100){
			System.out.println("成绩优秀");
		}else if(score ==100){
			System.out.println("非常完美");
		}else{
			System.out.println("成绩异常");
		}
		
		
		
		
	}
	
	

}
