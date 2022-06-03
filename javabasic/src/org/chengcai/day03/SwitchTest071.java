package org.chengcai.day03;
/**
 * 判断学生的成绩是什么等级
 */
import java.util.Scanner;

public class SwitchTest071 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int score=sc.nextInt();
		switch(score/10){
		case 10:
			System.out.println("牛逼");
			break;
		case 9:
			System.out.println("厉害");
			break;
		case 8:
			System.out.println("好样的");
			break;
		case 7:
			System.out.println("还行");
			break;
		case 6:
			System.out.println("凑合");
			break;
		case 5:
			System.out.println("稍次");
			break;
		case 4:
			System.out.println("太次");
			break;
		case 3:
			System.out.println("菜鸡");
			break;
		case 2:
			System.out.println("垃圾");
			break;
		case 1:
			System.out.println("滚！");
			break;
		case 0:
			System.out.println("去你妈的");
			break;
		default://当switch后面的变量不在case里面，那么就运行default后面的语句
			System.out.println("你还是人吗？");
		}
	}

}
