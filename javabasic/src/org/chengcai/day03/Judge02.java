package org.chengcai.day03;
/**
 * �߼������  &&(����)   ||(����)     !(ȡ��)
 *
 */
public class Judge02 {
	public static void main(String[] args){
	 //&&������(ȫ��Ϊ��):A����&&B����,��A������B����ͬʱ��������Ϊtrue
	 //A������B������һ��Ϊfalse,���������ʽ�Ľ��Ϊfalse	
		int a=10;
		int b=20;
		boolean bo1 =(a>0) && (b>0) && (a<b);
		System.out.println(bo1);//true
		
	 //	||������(ȫ��Ϊ��);A����||B����,��A������B������һ���������������ʽ��ֵ���ǳ���
	 // ��A������B��������������ʱ����ô�������ʽ��ֵ�ǲ�����	
		boolean bo2 =(a<0) || (b<0);
		System.out.println(bo2);//false
	
	 // ! ȡ��
		boolean boo = true;
		boolean boo2 = !boo;
		System.out.println(boo2);//false
		boolean boo3 = !false;
		System.out.println(boo3);//true
		boolean boo4 = !((a<0)||(b<0));//((a<0)||(b<0))���еĽ����false �����еĽ��ȡ����true
		System.out.println(boo4);//true
		
		//int a =10  int b =20 int c =30
		a =10;b =20;int c =30;
		// !(a<b) && (a<c) 
		System.out.println(!(a<b) && (a<c));//false
		// !((a<b) && (a<c)) 
		System.out.println(!((a<b) && (a<c)));//false
		// !(a<b) || (a<c)  
		System.out.println(!(a<b) || (a<c));//true
		// ��((a<b) || (a<c)) 
		System.out.println(!((a<b) || (a<c)));//false
		//(a<b) || (a>b) && (a<c)
		System.out.println((a<b) || (a>b) && (a<c));//true  û�����ű�ʾʱ,������&&                
		
	
		
	}

}
