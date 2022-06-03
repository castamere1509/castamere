package org.chengcai.day03;
/**
 * 逻辑运算符  &&(并且)   ||(或者)     !(取反)
 *
 */
public class Judge02 {
	public static void main(String[] args){
	 //&&的特征(全真为真):A条件&&B条件,当A条件和B条件同时成立则结果为true
	 //A条件和B条件有一个为false,则整个表达式的结果为false	
		int a=10;
		int b=20;
		boolean bo1 =(a>0) && (b>0) && (a<b);
		System.out.println(bo1);//true
		
	 //	||的特征(全假为假);A条件||B条件,当A条件和B条件有一个成立，整个表达式的值就是成立
	 // 当A条件和B条件都不成立的时候那么整个表达式的值是不成立	
		boolean bo2 =(a<0) || (b<0);
		System.out.println(bo2);//false
	
	 // ! 取反
		boolean boo = true;
		boolean boo2 = !boo;
		System.out.println(boo2);//false
		boolean boo3 = !false;
		System.out.println(boo3);//true
		boolean boo4 = !((a<0)||(b<0));//((a<0)||(b<0))运行的结果是false 给运行的结果取反是true
		System.out.println(boo4);//true
		
		//int a =10  int b =20 int c =30
		a =10;b =20;int c =30;
		// !(a<b) && (a<c) 
		System.out.println(!(a<b) && (a<c));//false
		// !((a<b) && (a<c)) 
		System.out.println(!((a<b) && (a<c)));//false
		// !(a<b) || (a<c)  
		System.out.println(!(a<b) || (a<c));//true
		// ！((a<b) || (a<c)) 
		System.out.println(!((a<b) || (a<c)));//false
		//(a<b) || (a>b) && (a<c)
		System.out.println((a<b) || (a>b) && (a<c));//true  没用括号表示时,先运行&&                
		
	
		
	}

}
