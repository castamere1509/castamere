package org.chengcai.day03;

import java.util.Scanner;

/**
 * ��ϰ��
		  ��Ŀ1�� ����һ��int ���͵ı����� ����ʹ��if...else ��ӡ������ż����������
		                ��ʾ��ż����2ȡ��Ϊ0
 * 
 *��Ŀ2��  �ж��Ƿ�Ϊ����
		         year ��4�����Ҳ��ܱ�100������year ������400�ı�����������
 */
public class ScannerTest07 {
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("����������");
		int q = i.nextInt();
		if ( q%2  == 0 && q != 0){
			System.out.println("ż��");
		}else if(q%2 ==1){
			System.out.println("����");
		}
		Scanner y = new Scanner(System.in);
		System.out.println("����������");
		int yy =y.nextInt();
		if (yy%4 == 0 && yy%100 !=0 || yy%400 ==0){
			System.out.println("����");
		}else if(yy%4 !=0 && yy%100 ==0 || yy%400 !=0){
			System.out.println("ƽ��");
		}
		
		
		}

	}
