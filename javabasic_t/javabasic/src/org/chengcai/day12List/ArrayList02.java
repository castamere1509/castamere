package org.chengcai.day12List;

import java.util.ArrayList;
import java.util.List;

import org.chengcai.day10extends01.Emp02;

/**
 * ��������������,�����Զ�������
 * 
 * 
 */


public class ArrayList02 {
	
	
	public static void main(String[] args) {
				
		//��������Լ���������Ķ���
		List<Emp02> eps = new ArrayList<Emp02>();//������һ�����Emp02�����ArrayList���ϣ�
		
		Emp02 ep1 = new Emp02("001",2000,1000);
		Emp02 ep2 = new Emp02();
		Emp02 ep3 = new Emp02();
		
		eps.add(ep1);//��eps���ϴ���Emp02�Ķ��� ep1
		eps.add(ep2);//��eps���ϴ���Emp02�Ķ��� ep2
		eps.add(ep3);//��eps���ϴ���Emp02�Ķ��� ep3
		eps.add(new Emp02());
		
		Emp02 epp =eps.get(0);//ʹ��Emp02���͵Ķ���epp��ȥ��ȡ0���±��ֵ
		System.out.println(epp);//ֱ�Ӵ�ӡ����������Ϣ
		
		System.out.println(epp.getSal());//��ӡ�ö���sal���Ե���Ϣ
		
		eps.get(0).getSal();//��ʾeps����0���±�����sal����
		
		
		
		
	}
	
	

}
