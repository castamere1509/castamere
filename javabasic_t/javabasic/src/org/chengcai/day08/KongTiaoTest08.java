package org.chengcai.day08;

public class KongTiaoTest08 {

	public static void main(String[] args) {
		
		KongTiao07 kt =new KongTiao07();
		kt.brand="海尔";
		kt.weight=100;
		kt.power=1000;
		
		int i=kt.on();
		System.out.println(i);
		System.out.println(kt.wendu);//25		
		i=kt.add();
		System.out.println(i);//25,因为kt.add,运行的是 wendu++,后++是先赋值给表达式
		System.out.println(kt.wendu);//26
		
		kt.minus();
		System.out.println(kt.wendu);//0
		
		kt.off();
		System.out.println(kt.wendu);//0
	}
	
	
	
	
}
