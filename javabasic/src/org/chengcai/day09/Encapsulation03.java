package org.chengcai.day09;
/**
 * 
 * ��װ�����ǰ�����ʹ��private���Σ������ṩget,set����������ʹ��get��set������������
 *
 */
public class Encapsulation03 {
	
	private String name;//˽��Ȩ��,ֻ���ڵ�ǰ��ʹ��
	private int age;
	
	
	public String getName(){//��ȡ��ǰ����name���Ե�ֵ
		return this.name;
	}
	//����name���Ե�ֵ,�������������Ҫ����һ��String��������,���������ֵ�����name
	public void setName(String name){
		this.name=name;
	}
	
	public int getAge(){//��ȡ��ǰ����age���Ե�ֵ
		return this.age;
	}
	
	public void setAge(int age){//Ϊ��ǰ�����age��ֵ
		this.age=age;
	}

}
