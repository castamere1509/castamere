package org.chengcai.day02;
/**
 * ����ת��
 * 
 *С-----------------------------------------��
 *byte   short  int  long  float    double
 */
public class StringType03 {
   public static void main(String[] args){
	   
	 byte a=10;//10Ĭ�ϵ���int���ͣ���10ת��byte����
	 int b =a+10;//byte���ͺ�int�������㣬��Ϊint���ͱ�byte���ͣ�
	            //���aֱ��ת����int���ͽ�������
	 double db =b+10.5;//double���ͱ�int���ʹ󣬻��Ȱ�bת����double���ͺ��������
	 
	 //2��ǿ������ת������תС�����ܻ���ɾ��ȶ�ʧ
	 int i=128;
	 byte bt =(byte)i;
	 System.out.println(bt);//��ӡ-128�������ȶ�ʧ
	 
	 double de =100.3333333333333;
	 float ft =(float)de;
	 System.out.println(ft);
	 
	 double dl =1000.3333333333;
	 int j =(int)dl;
	 System.out.println(j);
	 
	 //Stringת��Ϊint����
	 String str="46465";
	 int k=Integer.parseInt(str);
	 System.out.println(k);
	 
	 //�κ�����ת��ΪString ֱ�Ӽ�""
	 int k1=1234;
	 String str2 =k1+"";
	 System.out.println(str2);
	 
	 
	 
	 
	 
   }

}
