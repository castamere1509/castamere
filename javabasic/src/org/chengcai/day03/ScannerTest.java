package org.chengcai.day03;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);//����һ������̨ɨ���ǣ�ɨ���û����������
		System.out.println("������String��������");
		String str = s.nextLine();
		System.out.println(str);
		System.out.println("������һ������");
		int i = s.nextInt();
		System.out.println(i);
		System.out.println("������һ��С��");
		double db =s.nextDouble();
		System.out.println(db);
		
		
		
		
		
	}
}
