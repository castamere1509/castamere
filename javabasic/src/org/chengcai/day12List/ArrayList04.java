package org.chengcai.day12List;

import java.util.ArrayList;
import java.util.List;

/** ��ɫ��  ְҵ  �س�  
 *  ³��     ����  �ȶ�
 *  ���     �̿�  ��
 *  ������  ��ʦ  Ư��
 */

public class ArrayList04 {
		
	public static void main(String[] args) {
		//1������һ�����ϣ����Role���͵Ķ���			
       
		
 //1.����һ�����ϣ����Role���͵Ķ���
  List<Role> re= new ArrayList<Role>();//������һ��Role���͵ļ��ϣ����ֽ�re
  
	Role re1 = new Role("³��","����","�ȶ�");
	Role re2 = new Role("���","�̿�","��");
	Role re3 = new Role();	//�޲�
	re3.setRoleName("������");	
	re3.setJob("��ʦ");
	re3.setSpeciality("Ư��");
	Role re4 = new Role("����","����","666");
	re.add(re1);
	re.add(re2);
	re.add(re3);
	re.add(re4);
	System.out.println(re);
	//2����׵��س���ʲô��
	//forѭ����
	for(int i=0;i<re.size();i++){
		if(re.get(i).getRoleName().equals("���")){
			System.out.println(re.get(i).getSpeciality());
		}		
	}
	//for ...each��
	for(Role r:re){
		if(r.getRoleName().equals("���")){
			System.out.println(r.getSpeciality());
		}
	}

	//3���� ���� ���س�ȫ����Ϊ ������
	
	for(Role r:re){
		if(r.getJob().equals("����")){
			r.setSpeciality("������");
		}
	}
	System.out.println(re);
	
	
}
}
