package org.chengcai.day08;

import java.util.Arrays;

import org.chengcai.day07.Function02;

//һ��������ж������

public class FriendTest04 {

	public static void main(String[] args) {
		
		Friend03 bfd =new Friend03();//����1
		bfd.name="������";
		bfd.age =18;
		bfd.sex='��';
		bfd.height=187;
		bfd.weight=70;
		bfd.yanzi="������";
		
		bfd.yueHui("�ɲ�ѧԺ");
		
		
		Friend03 gfd =new Friend03();//����2		
		gfd.name ="�����Ȱ�";
		gfd.age =18;
		gfd.sex='Ů';
		gfd.height=165;
		gfd.weight=50;
		gfd.yanzi="��������";
		
		gfd.yueHui("����");
		
		Friend03 fd =new Friend03();//����3
		//һ�������ӵ�ж������
		
		
		int[] arr={1,3,6,2,4};
		Arrays.sort(arr);//��java�Դ���API
		
		Function02.arraySort(arr);//�Լ�д�ľ�̬�������д���
		
		//��ϰ����Function02�Ķ������arraySort�����������������
		int[] ar={1,3,6,2,4};		
		Function02 fut =new Function02();
		int[] ar2=fut.arraySort(ar);//newһ������ȥ���÷���
		System.out.println(Arrays.toString(ar2));
		
		fut.lo();//ʹ�ö�����������жϵ�API
		
		String str =fut.cz(50, 50);//ʹ�ö�����ó�ֵAPI
		System.out.println(str);
		
		
	}
	
	
	
	
}
