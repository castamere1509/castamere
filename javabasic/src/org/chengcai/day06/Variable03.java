package org.chengcai.day06;
/**
 * 
 * ȫ�ֱ���:
 * ��Ϊȫ��ʵ��������ȫ�־�̬����,���ǵ���������:ȫ�־�̬�����ᱻstatic����
 *                                    ��ʹ��  ����.������  ֱ�ӵ���
 */
public class Variable03 {
       static int a;//ȫ�־�̬����
	   int b;//ȫ��ʵ������
	   public static void main(String[] args){
		   a = 10;
		   Variable03.a = 20;//ȫ�־�̬��������ʹ��  ����.������  ֱ�ӵ���
		   System.out.println(a);//20  ����a��ֵ��20����
		   System.out.println(Variable03.a);//20
		   
	   }
	
	public void add(){
		a =20;
		b =10;
	}	
}
