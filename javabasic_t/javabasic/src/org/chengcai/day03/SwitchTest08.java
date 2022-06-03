package org.chengcai.day03;

import java.util.Scanner;

/**
 * 
 *   //switch括号里面的变量是多少，那么就运行哪个case下的语句块
 * 
 *
 */

public class SwitchTest08 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score=sc.nextInt();
		 //判断学生的成绩是什么等级
		switch(score/10){
		
		case 10:
			System.out.println("完美");
		    break;
		case 9:
			System.out.println("优秀");
		    break;			
		case 8:
			System.out.println("良好");
		    break;
		case 7:
			System.out.println("普通");
		    break;
		case 6:
			System.out.println("及格");
		    break;
		default://当switch后面的变量不在case里面，那么就运行default后面的语句
			System.out.println("不及格或者分数异常");
			
		}
		
		
	}

}
