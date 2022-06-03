package org.chengcai.day03;

import java.util.Scanner;

public class Test {
	

	 public static void main(String[] args) {
		
		 /**
			 *   1、条件嵌套练习：
			 *    对暗号：
			 *      如果第一句暗号正确 则需要兑第二句暗号。
			 *      如果第一句暗号不正确则直接不需要兑第二句暗号。
			 *     要求：
			 *     1、用户输入正确的第一句暗号 程序继续运行 让用户输入第二句暗号 ，
			 *     并且判断第二句暗号是否正确
			 *     2、如果第二句暗号正确 给出提示，反之 也给出相应的提示。
			 *     
			 */
		 
		 System.out.println("天王盖地虎，兄台，请对暗号");
		 Scanner s =new Scanner(System.in);
		 String str1 =s.nextLine();
		 if(str1.equals("小鸡炖蘑菇")){
			 System.out.println("西北玄天一片云");
			 String str2 =s.nextLine();
			 if(str2.equals("乌鸦落进凤凰群")){
				 System.out.println("请进");
			 }else{
				 System.out.println("你是谁？");				 
			 }			 
		 }else{			 
			System.out.println("走开"); 
		 }
		 
		 
		 
	}

	
	
	
	
}
