package org.chengcai.day09;

public class KongTiaoTest12 {

	public static void main(String[] args) {
		
		KongTiao11 kt =new KongTiao11();
		kt.setBrand("海尔");
		kt.setWeight(100);
		kt.setPower(1000);
		
		int i=kt.on();
		System.out.println(i);
		System.out.println(kt.getWendu());//25		
		i=kt.add();
		System.out.println(i);//25,因为kt.add,运行的是 wendu++,后++是先赋值给表达式
		System.out.println(kt.getWendu());//26
		
		kt.minus();
		System.out.println(kt.getWendu());//25
		
		kt.off();
		System.out.println(kt.getWendu());//0
		
		
		KongTiao11 kt1 = new KongTiao11(1.1,"格力",12,13);
		//无论属性是否私有，只要有有参构造器，都能直接给属性赋值
		
		
		
	}
	
	
	
	
}
