package org.chengcai.day11abstract01;

public class AbsTest04 {

	public static void main(String[] args) {
		
		Abs01 a1 =new Abs02();//��̬����������ָ���������
		Abs01 a2 =new Abs03();//��̬����������ָ���������
		
		boolean b1=a1.login("С��", "123456");
		System.out.println(b1);
		boolean b2=a2.login("��", "1234");
		System.out.println(b2);
		
		//�����߼��л�
		Abs01 a3 = new Abs02();//a3��Abs02�Ķ���a3.login���õ�Abs02��login����
		a3.login("", "");//���õ�Abs02��login��
		a3 = new Abs03();//a3��ֵ�����ǳ�Abs03�Ķ�������a3.login���õ�Abs03��login����
		a3.login("", "");//���õ�Abs03��login��
		
		//a3�Ǹ�����������װ����һ��Abs01���͵Ķ���
		//a3���Ա����¸�ֵ������ֵΪ˭�Ķ���͵���˭�ķ���
		
		
		
		//�򵥵�½����
		Abs01 a4 = null;//����һ��Abs01 ���͵ı��� a4
		String denglufangs=null;//�û���������ֵ		
		String a=null;//�û���������ֵ	
		String b=null;//�û���������ֵ	
		if(denglufangs.equals("�ֻ������½")){
			a4=new Abs02();
		}else if(denglufangs.equals("�û�����½")){
			a4=new Abs03();
		}
		
		a4.login(a, b);
		
		
		
	}
	
	
	
}
