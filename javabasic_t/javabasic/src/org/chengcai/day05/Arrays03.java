package org.chengcai.day05;

import java.util.Arrays;

/**
 * 
 * ��ά����
 *
 */


public class Arrays03 {

	public static void main(String[] args) {
        //��ά���������
		String[][] names={ 
				          {"С��","С��"},//�������0���±�
				          {"С��","С��"},//�������1���±�
				          {"С��","С��"} //�������2���±�
		};                //��0         ��1 
		
		//��ά���������
		String[][] strs=new String[3][2];
		strs[0][0]="a";
		strs[0][1]="b";
		
		//����ĳ���
		System.out.println("�������ĳ���"+names.length);
		System.out.println("�������ĳ���"+names[0].length);
		//��ӡ����
		System.out.println(names[0][0]);
		System.out.println(names[0][1]);
		
		//��λ����ı���
		for(int i=0;i<names.length;i++){
			for(int j=0;j<names[0].length;j++){				
				System.out.println(names[i][j]);
			}
			
		}
		  //��ӡС����λ�ã�
		for(int i=0;i<names.length;i++){
			for(int j=0;j<names[0].length;j++){	
				if(names[i][j].equals("С��")){
					System.out.println("С����λ����"+i+","+j);
				}
				
			}
			
		}		 
		 
		//��for...each����
		for(String[] str:names){
			System.out.println(Arrays.toString(str));			
		}
		
		for(String[] str:names){
			for(String s:str){
				System.out.println(s);
			}			
		}
		
	}
   
	
	
}
