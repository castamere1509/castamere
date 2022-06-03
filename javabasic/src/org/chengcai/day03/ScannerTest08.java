package org.chengcai.day03;

import java.util.Scanner;

/**
 * 题目3： 从上海到北京有4躺车，
		          0-7点 坐  BS001躺列车
		          9-12点 坐  BS002躺列车
		          14-16坐 BS003
		          18-20点 坐 BS004
		                其他时间无车可坐。写一段程序判定不同的时间打印出相应的车次
 * 
 *
 */
public class ScannerTest08 {
	public static void main(String[] args){
		Scanner b = new Scanner(System.in);
		System.out.println("请输入时间");
		int bs = b.nextInt();
		if(bs >=0 && bs <=7){
			System.out.println("请坐BS001躺列车");
		}else if(bs>=9 && bs <=12){
			System.out.println("请坐BS002躺列车");
		}else if(bs>=14 && bs<=16){
			System.out.println("请坐BS003躺列车");
		}else if(bs>=18 && bs<=20){
			System.out.println("请坐BS004躺列车");
		}else if(bs>=21){
			System.out.println("都特么几点了,还特么坐车,司机不是人吗?下班了,滚!!!");	
		}else{
			System.out.println("发车了,磨磨唧唧,滚!!!");
		}
		
		
	}

}
