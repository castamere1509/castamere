package org.chengcai.day03;

import java.util.Scanner;

/**
 * ��Ŀ3�� ���Ϻ���������4�ɳ���
		          0-7�� ��  BS001���г�
		          9-12�� ��  BS002���г�
		          14-16�� BS003
		          18-20�� �� BS004
		                ����ʱ���޳�������дһ�γ����ж���ͬ��ʱ���ӡ����Ӧ�ĳ���
 * 
 *
 */
public class ScannerTest08 {
	public static void main(String[] args){
		Scanner b = new Scanner(System.in);
		System.out.println("������ʱ��");
		int bs = b.nextInt();
		if(bs >=0 && bs <=7){
			System.out.println("����BS001���г�");
		}else if(bs>=9 && bs <=12){
			System.out.println("����BS002���г�");
		}else if(bs>=14 && bs<=16){
			System.out.println("����BS003���г�");
		}else if(bs>=18 && bs<=20){
			System.out.println("����BS004���г�");
		}else if(bs>=21){
			System.out.println("����ô������,����ô����,˾����������?�°���,��!!!");	
		}else{
			System.out.println("������,ĥĥ����,��!!!");
		}
		
		
	}

}
