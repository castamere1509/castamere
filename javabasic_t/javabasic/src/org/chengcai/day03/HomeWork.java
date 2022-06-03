package org.chengcai.day03;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		
		/**
		练习：
		  题目1： 定义一个int 类型的变量， 并且使用if...else 打印出它是偶数还是奇数
		                提示：偶数对2取余为0

		  题目2：  判断是否为闰年
		         year 被4整除且不能被100整除，year 必须是400的倍数才是闰年

		  题目3： 从上海到北京有4躺车，
		          0-7点 坐  BS001躺列车
		          9-12点 坐  BS002躺列车
		          14-16坐 BS003
		          18-20点 坐 BS004
		                其他时间无车可坐。写一段程序判定不同的时间打印出相应的车次
		 * 
		 */	
		
		
		
		
		
	//定义一个int 类型的变量， 并且使用if...else 打印出它是偶数还是奇数
		Scanner s =new Scanner(System.in);
		System.out.println("请输入需要判断奇偶的整数");
		int a =s.nextInt();
		if(a%2 == 0){
			System.out.println(a+"是偶数");
		}else{
			System.out.println(a+"是奇数");
		}
		
	//判断是否为闰年
		System.out.println("请输入年份");
		int year =s.nextInt();
		if(year%4==0 && year%100 !=0 || year%400==0){
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"不是闰年");
		}
		/*
		  题目3： 从上海到北京有4躺车，
          0-7点 坐  BS001躺列车
          9-12点 坐  BS002躺列车
          14-16坐 BS003
          18-20点 坐 BS004
                其他时间无车可坐。写一段程序判定不同的时间打印出相应的车次
 * 
 */	    
		System.out.println("请输入时间");
		int time =s.nextInt();
		if(time >=0 && time<=7){
			System.out.println("坐 BS001躺列车");
		}else if(time >=9 && time<=12){
			System.out.println("坐 BS002躺列车");
		}else if(time >=14 && time <=16){
			System.out.println("坐 BS003躺列车");
		}else if(time >=18 && time <=20){
			System.out.println("坐 BS004躺列车");
		}else{
			System.out.println("无车可坐");
		}
		
		
		
		
		/**
		 *   1、条件嵌套练习：
		 *    兑暗号：
		 *      如果第一句暗号正确 则需要兑第二句暗号。
		 *      如果第一句暗号不正确则直接不需要兑第二句暗号。
		 *     要求：
		 *     1、用户输入正确的第一句暗号 程序继续运行 让用户输入第二句暗号 ，并且判断第二句暗号是否正确
		 *     2、如果第二句暗号正确 给出提示，反之 也给出相应的提示。
		 *     
		 */
		
		
		
		
		
	}
	

}
