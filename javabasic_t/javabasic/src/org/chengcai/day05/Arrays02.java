package org.chengcai.day05;

import java.util.Arrays;

/*����3�����飬��һ��������������ڶ���������Ա𣬵��������������
�����������ĳ�����һ���ģ��������Ա��������һһ��Ӧ�ġ�
1.ȡ��С�Ƶ����䡣
2.ͳ���ж��ٸ��е�
3ͳ���ж��ٸ�Ů��
4.ͳ��23�����ϵ��м���
5.����25�����˭

С��,С��,С��,С��,С��,С��,С��

��,Ů,Ů,��,Ů,��,��

22,21,23,25,32,18,20*/

public class Arrays02 {

   public static void main(String[] args) {
	
	   String[] names={"С��","С��","С��","С��","С��","С��","С��"};
	   char[] sex={'��','Ů','Ů','��','Ů','��','��'};
	   int[] age={22,21,23,25,32,18,20};
	   
	   //ȡ��С�Ƶ�����
	   for(int i=0;i<names.length;i++){
		   if(names[i].equals("С��")){
			   System.out.println("С�Ƶ�������"+age[i]);
		   }
	   }
	   
	   //2.ͳ���ж�������
	   int count=0;
	   for(char cr:sex){
		   if(cr == '��'){
			   count++;
		   }
	   }
	   System.out.println("�����У�"+count);
	   
	   //3.ͳ���ж��ٸ�Ů��
	    count=0;
	   for(char cr:sex){
		   if(cr == 'Ů'){
			   count++;
		   }
	   }
	   System.out.println("Ů���У�"+count);	   
	   //4.ͳ��23�����ϵ��м���
	   count =0;
	   for(int i:age){
		   if(i>23){
			   count++;
		   }
	   }
	   System.out.println("23�����ϵ���"+count);
	   
	   
	   
	   //5.����25�����˭
	   for(int i=0;i<age.length;i++){
		   if(age[i]>25){
			   System.out.println("25�����ϵ���"+names[i]);
		   }
	   }
	   
}
	
}
