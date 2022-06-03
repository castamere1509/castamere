package org.chengcai.day03;

import java.util.Scanner;

/**
 * 练习：
		  题目1： 定义一个int 类型的变量， 并且使用if...else 打印出它是偶数还是奇数
		                提示：偶数对2取余为0
 * 
 *题目2：  判断是否为闰年
		         year 被4整除且不能被100整除，year 必须是400的倍数才是闰年
 */
public class ScannerTest07 {
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("请输入数据");
		int q = i.nextInt();
		if ( q%2  == 0 && q != 0){
			System.out.println("偶数");
		}else if(q%2 ==1){
			System.out.println("奇数");
		}
		Scanner y = new Scanner(System.in);
		System.out.println("请输入数据");
		int yy =y.nextInt();
		if (yy%4 == 0 && yy%100 !=0 || yy%400 ==0){
			System.out.println("闰年");
		}else if(yy%4 !=0 && yy%100 ==0 || yy%400 !=0){
			System.out.println("平年");
		}
		
		
		}

	}
