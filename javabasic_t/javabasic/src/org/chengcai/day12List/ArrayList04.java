package org.chengcai.day12List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.chengcai.day10extends01.Emp02;

/** ��ɫ��  ְҵ  �س�  
 *  ³��     ����  �ȶ�
 *  ���     �̿�  ��
 *  ������  ��ʦ  Ư��
 */

public class ArrayList04 {
		
	public static void main(String[] args) {
		//1������һ�����ϣ����Role���͵Ķ���
		List<Role> tr = new ArrayList<Role>();//������һ��Role���͵ļ��ϣ����ֽ�tr
		
		Role r1 = new Role("³��","����","�ȶ�");
		Role r2 = new Role("���","�̿�","��");
		Role r3 = new Role();
		r3.setRoleName("������");
		r3.setJob("��ʦ");
		r3.setSpeciality("Ư��");
		Role r4 = new Role("����","����","666");
		
		tr.add(r1);//0
		tr.add(r2);//1
		tr.add(r3);//2
		tr.add(r4);//3
		System.out.println(tr);
		
        //2����׵��س���ʲô��
		for(int i =0;i<tr.size();i++){
			if(tr.get(i).getRoleName().equals("���")){
				System.out.println(tr.get(i).getSpeciality());
			}
			
		}

		for(Role r:tr){
			if(r.getRoleName().equals("���")){
				System.out.println(r.getSpeciality());
			}
			
		}
		
		//3���� ���� ���س�ȫ����Ϊ ������
		
		for(Role r:tr){
			if(r.getJob().equals("����")){				
				r.setSpeciality("������");
			}
			
			
		}
		
		System.out.println(tr);

}
}
