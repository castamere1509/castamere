package org.chengcai.day05;

import java.util.Arrays;

/**
 * 
 * ���飺����������ͬ���͵�һ������
 *
 */
public class Array01 {
 public static void main(String[] args){
	//��������,��ʽ1:ֱ������һ�����飬����ֵ
	 int[] ages={15,16,18,23,26};
	 String[] strs={"С��","С��","С��","С��"};
	 
	 //����ĳ�����.length
	 int len=strs.length;
	 System.out.println(len);
	 
	 //������±�,������±��0��ʼ,�����±�Ϊ���ֵĳ���-1,strs.length-1
	 System.out.println(strs[0]);//��ӡ��ʽ  ������[index] �����ĳ���±��Ӧ��ֵ
	 System.out.println(strs[strs.length-1]);//��ӡ���������һλ�±��ֵ
	 
	 //��������ķ�ʽ2:����һ�������Ŀ�����;
	 String[] strs1 = new String[6];//����һ������,�����趨Ϊ6λ
	 //���鸳ֵ
	 strs1[0] ="��ѧ��";
	 strs1[1] ="���»�";
	 System.out.println(strs1[3]);//3���±�λ��û��ֵ,��ӡ����  null
	 strs1[2] ="������";
	 strs1[3] ="����";
	 strs1[4] ="����";
	 strs1[5] ="�ܽ���";
	 //��ӡ����ʹ��Arrays.toString(������)
	 System.out.println(Arrays.toString(strs1));
	 
	 //�����ѭ������1,ʹ��forѭ�����б���;�������ͨ���±���б���
	 //��ӡstrs1���������ֵ
	 for(int i=0;i<strs1.length;i++){
		 System.out.println(strs1[i]);
	 }
	 
	 //�����ѭ������2,ʹ��for ...each
	 System.out.println("ʹ��for ...each-----------------------");
	 for(String s:strs1){  //���ڻ�ȡ���е�ֵ,ȫ������������,����6��
		 System.out.println(s);
	 }
	 
	 int[] as={18,19,30,77,66};
	 for(int i:as){//����5��,�����Ĵ�����������ĳ���
		 System.out.println(i);
	 }

	 //��ϰ��ʹ�����ֱ�����ʽ,���� ���� �Ƿ������strs1 ��������
	 
	 String res ="������";
	 for(String i:strs1){
		 if(i.equals("����")){
			 res ="����";
		 }
		 
	 }System.out.println(res);
	 
	 int l=strs.length;
	 for(int a=0;a<strs1.length;a++){
		 if(strs1[l].equals("����")){
			 res ="����";
		 }
		 }System.out.println(res);
 
 }
}
