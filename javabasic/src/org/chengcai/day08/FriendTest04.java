package org.chengcai.day08;

import java.util.Arrays;

import org.chengcai.day07.Function02;
import org.chengcai.day07.Functionlianxi;

//һ��������ж������

public class FriendTest04 {
	
	public static void main(String[] args){
	  
		Friend03 bfd = new Friend03();//����1
		bfd.setName("������");
		bfd.setAge(18);
		bfd.setSex('��');
		bfd.setHeight(187);
		bfd.setWeight(70);
		bfd.setYanzhi("������");
		
		bfd.yueHui("�ɲ�ѧԺ");
		
		
		Friend03 gfd =new Friend03();//����2
		gfd.setName("�����Ȱ�");
		gfd.setAge(18);
		gfd.setSex('Ů');
		gfd.setHeight(165);
		gfd.setWeight(50);
		gfd.setYanzhi("��������");
		
		gfd.yueHui("����");
		
		Friend03 fd =new Friend03();//����3
		//һ�������ӵ�ж������
		
		
		int[] arr={1,3,6,2,4};
		Arrays.sort(arr);//��java�Դ���API
		Functionlianxi.arraySort(arr);
		
		Functionlianxi.arraySort(arr);//�Լ�д�ľ�̬�������д���
		
		//��ϰ����Functionlianxi�Ķ������arraySort�����������������
		int[] ar={1,3,6,2,4};
		Functionlianxi fut =new Functionlianxi();
		int[] ar2=fut.arraySort(ar);//newһ������ȥ���÷���
		System.out.println(Arrays.toString(ar2));
		
		fut.lo();//ʹ�ö�����������жϵ�API	
		
		String str=fut.cz(50, 50);//ʹ�ö�����ó�ֵAPI
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
	}

}
