package org.chengcai.day09;

/**
 * 
 * 
 *
 */

public class Encapsulation04 {
	

	public static void main(String[] args) {
		Encapsulation03 en =new Encapsulation03();
		//en.age=10;
		//en.name="xiaohua";//���д��뱨����Ϊ���������Զ���˽�еģ��ڱ����޷�ֱ�ӷ���

		en.setName("xiaohua");//���������setName����Ϊname��ֵΪ  xiaohua		
		String str=en.getName();//���������getName����ȡ�˵�ǰ����name��ֵ
		System.out.println(str);
		
		en.setAge(18);//���������setAge��������age��ֵ18
		en.getAge();//��ȡ��ǰ����age��ֵ
		System.out.println(en.getAge());
	}
	

}
