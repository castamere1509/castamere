package org.chengcai.day03;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);//创建一个控制台扫描仪，扫描用户输入的内容
		System.out.println("请输入String类型数据");
		String str = s.nextLine();
		System.out.println(str);
		System.out.println("请输入一个数字");
		int i = s.nextInt();
		System.out.println(i);
		System.out.println("请输入一个小数");
		double db =s.nextDouble();
		System.out.println(db);
		
		
		
		
		
	}
}
