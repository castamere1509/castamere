package org.chengcai.day12List;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet���ϣ�set���ϵ�һ�֣��������
 * ������set���ϴ������������ģ�û���±�
 *     list���ϴ�������������
 * ����ʹ��ʲô���ϣ������ȵ���
 *
 */
public class HashSet06 {

	public static void main(String[] args){
	
		Set<Role> st = new HashSet<Role>();
		
		Role re1 = new Role("³��","����","�ȶ�");
		Role re2 = new Role("���","�̿�","��");
		Role re3 = new Role("������","��ʦ","Ư��");	//�޲�
		Role re4 = new Role("����","����","666");
		
		//�������ʹ�� add()
		st.add(re1);
		st.add(re2);
		st.add(re3);
		st.add(re4);
		
		//���Ͽ���ֱ�Ӵ�ӡ
		System.out.println(st);
		
		//�޷�ʹ��get()��������Ϊ�����򼯺ϣ�����û���±�
		//st.get(1);
		
		//�ж��Ƿ�Ϊ��   .isEmpty();
		st.isEmpty();
		System.out.println(st.isEmpty());//false
		
		//���ϳ���  .size()
		int a =st.size();
		System.out.println(a);//4
		
		//��ռ���  .clear()
		//st.clear();
		System.out.println(st.isEmpty());//true
		
		//������ʽ ֻ���� for ...each,����ʹ��forѭ�������±����
		
		for(Role r:st){
			System.out.println(r);
		}
		
		//��׵��س���ʲô��
		for(Role r:st){
			if(r.getRoleName().equals("���")){
				System.out.println(r.getSpeciality());
			}
		}
		//���������ֵ��ز���Ϊ ������
		for(Role r:st){
			if(r.getJob().equals("����")){
				r.setSpeciality("������");
			}
		}
		System.out.println(st);
		
	}

}
