package org.chengcai.day03;
/**
 * 条件分支语句
 * if(条件){
 *语句块,当条件结果为true,则执行,结果为false,则不执行
 *}
 */
public class SingleConditionalJudgment04 {
	public static void main(String[] args) {
		
		int a =10;
		int b =20;
		if(a<b){
			a++;
		}
		System.out.println(a);//11
	//张XX买了一张彩票，如果中了500万,就去买房,买房要花300万.
		String jieguo ="中奖了"; //中奖结果
		int zjjine =5000000;   //中奖金额
		int maifang =3000000;  //买房花费
		int yue = zjjine;      //余额
		if(jieguo.equals("中奖了") && zjjine ==5000000){
			yue = zjjine -maifang;
		}
		System.out.println(yue);
		
		
		
		
		
	}
 

}
