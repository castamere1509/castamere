package org.chengcai.day03;

import java.util.Scanner;

/**
 * switch(����)
 *    case 1:
 *         ����1
 *    case 2:
 *         ����2
 *    case 3:
 *         ����3
 *  //switch��������ı����Ƕ���,��ô�������ĸ�case�µ�����
 *
 *
 */
public class SwitchTest07 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		switch(i){
		case 1:
			System.out.println("��һ���Ȱ���1��2��3��");
			break;
		case 2:
			System.out.println("��һ���Ȱ���4��5��6��");
			break;
		case 3:	
			System.out.println("��һ���Ȱ���7��8��9��");
			break;
		case 4:
			System.out.println("��һ���Ȱ���10��11��12��");
			break;
		}
	}

}
