package org.chengcai.day05;

import java.util.Arrays;

/**
 * 
 *��ά����
 *
 */

public class Array02 {
	
	public static void main(String[] args){
	//��ά���������
	String[][] names={
			{"С��","С��"},//�������0���±�
			{"С��","С��"},//�������1���±�
			{"С��","С��"}//�������2���±�
			//��0     //��1		
	        };
		
	//����ĳ���
	System.out.println("�������ĳ���"+names.length);
	System.out.println(names[0].length);
		
	//��ά����ı���
	/*
	for(int i=0;i<names.length;i++){
		for(int j=0;j<names[i].length;j++){
			System.out.println(names[i][j]);
		}
	}
	*/
		//��ӡС����λ��
	for(int i=0;i<names.length;i++){
		for(int j=0;j<names[i].length;j++){
			if(names[i][j].equals("С��")){
			System.out.println("С�����ڵ���������:"+i+",��������:"+j);
			}
		}
	}
		
	//ʹ��for...each����
	for(String[] str:names){
		System.out.println(Arrays.toString(str));
	}
	}
}
