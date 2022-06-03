package org.chengcai.day03;

import java.util.Scanner;

/**
 * switch(变量)
 *    case 1:
 *         语句块1
 *    case 2:
 *         语句块2
 *    case 3:
 *         语句块3
 *  //switch括号里面的变量是多少,那么就运行哪个case下的语句块
 *
 *
 */
public class SwitchTest07 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		switch(i){
		case 1:
			System.out.println("第一季度包含1、2、3月");
			break;
		case 2:
			System.out.println("第一季度包含4、5、6月");
			break;
		case 3:	
			System.out.println("第一季度包含7、8、9月");
			break;
		case 4:
			System.out.println("第一季度包含10、11、12月");
			break;
		}
	}

}
