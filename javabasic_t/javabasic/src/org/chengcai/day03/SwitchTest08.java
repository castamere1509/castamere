package org.chengcai.day03;

import java.util.Scanner;

/**
 * 
 *   //switch��������ı����Ƕ��٣���ô�������ĸ�case�µ�����
 * 
 *
 */

public class SwitchTest08 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score=sc.nextInt();
		 //�ж�ѧ���ĳɼ���ʲô�ȼ�
		switch(score/10){
		
		case 10:
			System.out.println("����");
		    break;
		case 9:
			System.out.println("����");
		    break;			
		case 8:
			System.out.println("����");
		    break;
		case 7:
			System.out.println("��ͨ");
		    break;
		case 6:
			System.out.println("����");
		    break;
		default://��switch����ı�������case���棬��ô������default��������
			System.out.println("��������߷����쳣");
			
		}
		
		
	}

}
