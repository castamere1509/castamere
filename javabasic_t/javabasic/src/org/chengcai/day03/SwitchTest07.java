package org.chengcai.day03;

import java.util.Scanner;

/**
 * switch(����)
 *   case 1:
 *        ����1
 *   case 2:
 *        ����2
 *   case 3:
 *        ����3
 *   case 4:
 *        ����4
 *   case 5:
 *        ����5
 *   case 6:
 *        ����6
 *   case 7:
 *        ����7
 *   //switch��������ı����Ƕ��٣���ô�������ĸ�case�µ�����
 * 
 *
 */

public class SwitchTest07 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		 switch(i){
		 case 1:
			 System.out.println("��һ���Ȱ���1��2��3��");
		     break;
		 case 2:
			 System.out.println("�ڶ����Ȱ���4��5��6��");
			 break;
		 case 3:
			 System.out.println("�������Ȱ���7��8��9��");
			 break;
		 case 4:
			 System.out.println("���ļ��Ȱ���10��11��12��");
			 break;
		   }
		
	}

}
