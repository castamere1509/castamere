package org.chengcai.day03;

import java.util.Scanner;

public class Test {
 public static void main(String[] args){
	 //��λ���ӷ�������
	 Scanner sc = new Scanner(System.in);
	 System.out.println("�������һ�����֣�");
	 int i = sc.nextInt();
	 System.out.print("������ڶ�������");
	 int x =sc.nextInt();
	 if(i>-999999999 && i<999999999 && x>-999999999 && x<999999999 ){
		 System.out.println("������:"+(i+x));
	 }else{
		 System.out.println("��������ȷ������");
	 }
 }
}
