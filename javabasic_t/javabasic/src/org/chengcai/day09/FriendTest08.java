package org.chengcai.day09;

import java.util.Arrays;

import org.chengcai.day07.Function02;

//һ��������ж������

public class FriendTest08 {

	public static void main(String[] args) {
		
		Friend07 bfd =new Friend07();//����1
		bfd.setName("������");
		bfd.setAge(18);
		bfd.setSex('��');
		bfd.setHeight(187);
		bfd.setWeight(70);
		bfd.setYanzi("������");
		
		bfd.yueHui("�ɲ�ѧԺ");
		
		
		Friend07 gfd =new Friend07();//����2		
		gfd.setName("�����Ȱ�");
		gfd.setAge(18);
		gfd.setSex('Ů');
		gfd.setHeight(165);
		gfd.setWeight(50);
		gfd.setYanzi("��������");
		
		gfd.yueHui("����");
		
		Friend07 fd =new Friend07();//����3
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
