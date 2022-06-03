package org.chengcai.day08;

public class KongTiaoTest08 {
	
	public static void main(String[] args){
		
		KongTiao07 kt =new KongTiao07();
		kt.setBrand("格力");
		kt.setWeigth(100);
		kt.setPower(1000);
		
		int i=kt.on();
		System.out.println(i);//25
		System.out.println(kt.getWendu());//25
		i=kt.add();
		System.out.println(i);//25 因为kt.add,运行的是wendu++,后++是先赋值给表达式
		System.out.println(kt.getWendu());//26;
		
		kt.minus();
		System.out.println(kt.getWendu());//25
		
		kt.off();
		System.out.println(kt.getWendu());//0
		
		System.out.println(kt.getBrand());
		System.out.println(kt.getWeigth());
		System.out.println(kt.getPower());
		
		KongTiao07 kt1 =new KongTiao07(1.1,"格力",12,13);
		//无论属性是否私有,只要有有参构造器,都能直接给属性赋值
	}
	

}
