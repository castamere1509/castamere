package org.chengcai.day01;
/**
 * 
 * ������8�ֻ�������
 *
 */
public class VariableType05 {
public static void main(String[] args) {
	//�����������������ͣ�byte  short  int  long
	byte bt = 127;//byte������������������ķ�Χ����-128��127֮��
	short st =32000;//short������������������ķ�Χ��������������
	int i =2100000000;//int�������������������ֵ��Χ������21������
	long lg =100000000000000L;//�������������������ͺ����L����l,���������Ϊlong����
	
	//ע�⣺java�����е���������Ĭ��int���ͣ��ڸ�ֵ��ʱ�������Զ�����ת��
	//ע�⣺��java�е�����ĳ�����͵����ֵʱ�ټ�1����ô������Сֵ
	//����Ϊlong ���͵�ʱ����Ҫ�����ֺ���Ӵ�д��L����Сд��l
	
	//����С���������� float  ,double
	
	float f1=3.5F;//�������ΪС�����ͣ�Ĭ����double���ͣ���������float������ʱ������F����f��
	              //�������С����float
	double db =3.5;//�����ں����D����d��ʾ�Ǹ�double���ͣ����ǲ���Ҫ����ΪС��Ĭ��Ϊdouble����
	
	//ע��double���͵ľ��ȱ�float���ȸߣ����Ա���С��һ����double
	System.out.println(10.0D/3);//3.3333333333333335
	System.out.println(10.0F/3);//3.3333333
	
	//���浥���ַ�ʹ��char
	char cr='a';//ע��char������������ֵʱʹ�õ��ǵ�����
	System.out.println(cr);
	
	//boolean�������������ж�������������ֻ������ֵ��true �� false
	boolean b1 =true;//�棬������
	boolean b2 =false;//�٣�������
	
	int a=10;
	int b=20;
	boolean b3 =a>b;
	System.out.println(b3);//false
	boolean b4 =a<b;
	System.out.println(b4);//true
	
	//8�ֻ�����������Ķ����������ͣ������ַ���ʹ��String����
	String str ="����";
	System.out.println(str);
	
	
}
}
