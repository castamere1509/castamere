package org.chengcai.day08;

public class KongTiaoTest08 {
	
	public static void main(String[] args){
		
		KongTiao07 kt =new KongTiao07();
		kt.setBrand("����");
		kt.setWeigth(100);
		kt.setPower(1000);
		
		int i=kt.on();
		System.out.println(i);//25
		System.out.println(kt.getWendu());//25
		i=kt.add();
		System.out.println(i);//25 ��Ϊkt.add,���е���wendu++,��++���ȸ�ֵ�����ʽ
		System.out.println(kt.getWendu());//26;
		
		kt.minus();
		System.out.println(kt.getWendu());//25
		
		kt.off();
		System.out.println(kt.getWendu());//0
		
		System.out.println(kt.getBrand());
		System.out.println(kt.getWeigth());
		System.out.println(kt.getPower());
		
		KongTiao07 kt1 =new KongTiao07(1.1,"����",12,13);
		//���������Ƿ�˽��,ֻҪ���вι�����,����ֱ�Ӹ����Ը�ֵ
	}
	

}
