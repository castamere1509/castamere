package org.chengcai.day09;

public class KongTiaoTest12 {

	public static void main(String[] args) {
		
		KongTiao11 kt =new KongTiao11();
		kt.setBrand("����");
		kt.setWeight(100);
		kt.setPower(1000);
		
		int i=kt.on();
		System.out.println(i);
		System.out.println(kt.getWendu());//25		
		i=kt.add();
		System.out.println(i);//25,��Ϊkt.add,���е��� wendu++,��++���ȸ�ֵ�����ʽ
		System.out.println(kt.getWendu());//26
		
		kt.minus();
		System.out.println(kt.getWendu());//25
		
		kt.off();
		System.out.println(kt.getWendu());//0
		
		
		KongTiao11 kt1 = new KongTiao11(1.1,"����",12,13);
		//���������Ƿ�˽�У�ֻҪ���вι�����������ֱ�Ӹ����Ը�ֵ
		
		
		
	}
	
	
	
	
}
