package org.chengcai.day12List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 	ArrayList���ϵı���,������ϵı�����������ͬ
 * 
 *
 */
public class ArrayList03 {

	public static void main(String[] args){
		
	  //����-----------------------------------------------------
		String[] strs1 = new String[6];//����һ�����飬�����趨Ϊ6λ
		//���鸳ֵ
		strs1[0] ="��ѧ��";
		strs1[1] ="���»�";
		System.out.println(strs1[3]);//3���±�λ��û��ֵ,��ӡ���� null
		strs1[2] ="������";
		strs1[3] ="����";
		strs1[4] ="�����";
		strs1[5] ="�ܽ���";
		strs1[4] ="̷ӽ��";//������ĳ���±�λ�����¸�ֵ
		System.out.println(strs1[4]);
		//��ӡ����ʹ��Arrays.toString(������)
		System.out.println(Arrays.toString(strs1));
		
		//�����ѭ������1��ʹ��forѭ�����б������������ͨ���±���б���
		//��ӡstrs1���������ֵ
		for(int i=0;i<strs1.length;i++){
			System.out.println(strs1[i]);
			
		//�����ѭ������2,ʹ��for ...each
		System.out.println("ʹ�� for ...each---------------------");
		for(String s:strs1){ //���ڻ�ȡ���е�ֵ��ȫ������������������6��
			System.out.println(s);
		}
			
		
		//����-----------------------------------------------------
		System.out.println("---------------���ϱ���---------------");
		List<String> ls = new ArrayList<String>();
		ls.add("��ѧ��");//0	
		ls.add("���»�");
		ls.add("������");
		ls.add("����");
		ls.add("�����");
		ls.add("�ܽ���");
		
		//ʹ��forѭ�����б���
		for(int j=0;j<ls.size();j++){
			System.out.println(ls.get(j));
		}
			
		//for ...each�Լ��Ͻ��б���
		
		for(String str:ls){
			System.out.println(str);
		}
			
			
			
			
		}

		
	}
	
}
