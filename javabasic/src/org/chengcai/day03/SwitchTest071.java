package org.chengcai.day03;
/**
 * �ж�ѧ���ĳɼ���ʲô�ȼ�
 */
import java.util.Scanner;

public class SwitchTest071 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int score=sc.nextInt();
		switch(score/10){
		case 10:
			System.out.println("ţ��");
			break;
		case 9:
			System.out.println("����");
			break;
		case 8:
			System.out.println("������");
			break;
		case 7:
			System.out.println("����");
			break;
		case 6:
			System.out.println("�պ�");
			break;
		case 5:
			System.out.println("�Դ�");
			break;
		case 4:
			System.out.println("̫��");
			break;
		case 3:
			System.out.println("�˼�");
			break;
		case 2:
			System.out.println("����");
			break;
		case 1:
			System.out.println("����");
			break;
		case 0:
			System.out.println("ȥ�����");
			break;
		default://��switch����ı�������case���棬��ô������default��������
			System.out.println("�㻹������");
		}
	}

}
