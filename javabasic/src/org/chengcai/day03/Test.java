package org.chengcai.day03;

import java.util.Scanner;

public class Test {
 public static void main(String[] args){
	 //两位数加法计算器
	 Scanner sc = new Scanner(System.in);
	 System.out.println("请输入第一个数字：");
	 int i = sc.nextInt();
	 System.out.print("请输入第二个数字");
	 int x =sc.nextInt();
	 if(i>-999999999 && i<999999999 && x>-999999999 && x<999999999 ){
		 System.out.println("计算结果:"+(i+x));
	 }else{
		 System.out.println("请输入正确的数字");
	 }
 }
}
