package org.chengcai.day05;

import java.util.Arrays;

public class Arraylianxi1 {
	public static void main(String[] args){
		
/*����3������,��һ�����������,�ڶ���������Ա�,���������������	
�����������ĳ�����һ����,�������Ա��������һһ��Ӧ�ġ�	
1.ȡ��С�Ƶ����䡣		
2.ͳ���ж��ٸ��е�
3.ͳ���ж��ٸ�Ů��
4.ͳ��23�����ϵ��м���
5.����25�����˭

С��,С��,С��,С��,С��,С��,С��
  ��  , Ů , Ů , �� , Ů  , �� , ��
22 , 21, 23,25, 32 , 18,20   */
	String[] s={"С��","С��","С��","С��","С��","С��","С��"};
	char[]  x={'��','Ů','Ů','��','Ů','��','��'};
	int[] g={22,21,23,25,32,18,20};
	//ȡ��С�Ƶ�����
	for( int i=0;i<s.length;i++){
		if(s[i].equals("С��")){
		System.out.println(g[i]);}}	
	//2.ͳ���ж��ٸ��е�	
     int ii=0;
    for(int i=0;i<x.length;i++){
    	if(x[i]=='��'){
    		ii++;
    	}
    }System.out.println(ii);
      
	
	//3.ͳ���ж��ٸ�Ů��	
     int iii=0;
    for(int i=0;i<x.length;i++){
    	if(x[i]=='Ů'){
    		iii++;
    	}
    }System.out.println(iii);		
	//4.ͳ��23�����ϵ��м���
    int iiii=0;
    for(int i=0;i<s.length;i++){
    	if(g[i]>23){
    	iiii++;	
    	}
    }System.out.println(iiii);			
	//5.����25�����˭
    for(int i=0;i<g.length;i++){
    	if(g[i]>25){
    		System.out.println(s[i]);	
    	}
    }
	
	int[] arr ={5,9,7,3,6,1};
	//{5,9,7,3,6,1};{5,7,9,3,6,1};{5,7,3,9,6,1};{5,7,3,6,9,1};{5,7,3,6,1,9};
	//{5,7,3,6,1,9};{5,3,7,6,1,9};{5,3,6,7,1,9};{5,3,6,1,7,9};{5,3,6,1,7,9};
	//{3,5,6,1,7,9};{3,5,1,6,7,9};{3,5,1,6,7,9};{3,5,1,6,7,9};{3,5,1,6,7,9};
	//{3,5,1,6,7,9};{3,1,5,6,7,9};{3,1,5,6,7,9};{3,1,5,6,7,9};{3,1,5,6,7,9};
	//{1,3,5,6,7,9};{3,1,5,6,7,9};{3,1,5,6,7,9};{3,1,5,6,7,9};{3,1,5,6,7,9};
	 //��С���������[1,3,5,6,7,9]
	 //Arrays.sort(arr);
	 for(int j=0;j<arr.length-1;j++){
	 for(int i=0;i<arr.length-1;i++){
		 if(arr[i]>arr[i+1]){
			int  a=arr[i];
			   arr[i]=arr[i+1];
			   arr[i+1]=a;}
		 }
	 }System.out.println(Arrays.toString(arr));
	//�Ӵ�С������
	 for(int i=0;i<arr.length-1;i++){
	 for(int j=0;j<arr.length-1;j++){
	 if(arr[j]<arr[j+1]){
		 int a=arr[j];
		    arr[j]=arr[j+1];
		    arr[j+1]=a;
	 }
	 }
	 }System.out.println(Arrays.toString(arr));

	 
	 
	 
	
	}
}
