package org.chengcai.day12List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HomeWork {
	
	public static void main(String[] args){
	//����list���Ϸ���Student03��Ķ���
		/** ����   ����    �Ա�    �ɼ�
		 *  С��    18       Ů        90
		 *  С��    19       Ů       63
		 *  С��    20       ��       59
		 *  С��    21        ��       98
		 * 
		 */
	List<Student03> st = new ArrayList<Student03>();
	 Student03 st1 = new Student03("С��",18,"Ů",90);
	 Student03 st2 = new Student03("С��",19,"Ů",63);
	 Student03 st3 = new Student03("С��",20,"��",59);
	 Student03 st4 = new Student03("С��",21,"��",98); 
	 st.add(st1);
	 st.add(st2);
	 st.add(st3);
	 st.add(st4);
		//���˭�ĳɼ�����60
	 System.out.println("���˭�ĳɼ�����60----------------------");
		for(Student03 s:st){
			if(s.getScore()>60){
				System.out.println(s.getName());
			}
		}
		//��ѯŮ��������
		System.out.println("��ѯŮ��������----------------------");
		for(Student03 s:st){
			if(s.getSex().equals("Ů")){
				System.out.println(s.getName());
			}
		}
		//���˭�ĳɼ���С�׸ߣ���ʾ���Ȳ�С�׵ĳɼ�����ȥ�Ƚ�
		System.out.println("���˭�ĳɼ���С�׸ߣ���ʾ���Ȳ�С�׵ĳɼ�����ȥ�Ƚ�-------------------");
		int aa =0;
		for(Student03 a:st){
			if(a.getName().equals("С��")){
				 aa =a.getScore();
				System.out.println(aa);
			}
		}
		for(Student03 s:st){
			if(s.getScore()>aa){
				System.out.println(s.getName());
			}
		}
		//��С�׵ĳɼ�+10��
		System.out.println("��С�׵ĳɼ�+10��-------------------------");
		int bb =0;
		for(Student03 b:st){
			if(b.getName().equals("С��")){
				bb =b.getScore();
				System.out.println(bb);
			}
		}
		for(Student03 s:st){
			if(s.getName().equals("С��")){
				s.setScore(bb+10);
			}
		}
		for(Student03 s:st){
			if(s.getName().equals("С��")){
				System.out.println(s.getScore());
			}
		}
		
		//ɾ����������ɼ�û����Ķ���
		System.out.println("ɾ����������ɼ�û����Ķ���-------------------------");

		for(Student03 s:st){
			if(s.getScore()<60){
				st.remove(s);
			}
		}
       System.out.println(st);
		//����set���Ϸ���Student03��Ķ���
		/** ����   ����    �Ա�    �ɼ�
		 *  С��    18       Ů        90
		 *  С��    19       Ů       63
		 *  С��    20       ��       59
		 *  С��    21        ��       98
		 * 
		 */
Set<Student03> sd = new HashSet<Student03>();
		
   Student03 sd1 = new Student03("С��",18,"Ů",90);
   Student03 sd2 = new Student03("С��",19,"Ů",63);
   Student03 sd3 = new Student03("С��",20,"��",59);	
   Student03 sd4 = new Student03("С��",21,"��",98);
   sd.add(sd1);
   sd.add(sd2);
   sd.add(sd3);
   sd.add(sd4);
		//���˭�ĳɼ�����60
   System.out.println("���˭�ĳɼ�����60-------------------------");

		for(Student03 s:sd){
			if(s.getScore()>60){
				System.out.println(s.getName());
			}
		}
		//��ѯ������������60������
		System.out.println("��ѯ������������60������-------------------------");

		for(Student03 s:sd){
			if(s.getScore()>60&&s.getSex().equals("��")){
				System.out.println(s.getName());
			}
		}
		//���˭�ĳɼ���С�׸ߣ���ʾ���Ȳ�С�׵ĳɼ�����ȥ�Ƚ�
		System.out.println("���˭�ĳɼ���С�׸ߣ���ʾ���Ȳ�С�׵ĳɼ�����ȥ�Ƚ�-------------------------");

		int cc =0;
		for(Student03 a:sd){
			if(a.getName().equals("С��")){
				 cc =a.getScore();
			
			}
		}
		for(Student03 c:sd){
			if(c.getScore()>cc){
				System.out.println(c.getName());
			}
		}
		
		
		//��С�ڵĳɼ�+10��
		System.out.println("��С�ڵĳɼ�+10��-------------------------");

		int dd =0;
		for(Student03 b:sd){
			if(b.getName().equals("С��")){
				dd =b.getScore();
				System.out.println(dd);
			}
		}
		for(Student03 s:sd){
			if(s.getName().equals("С��")){
				s.setScore(dd+10);
			}
		}
		//�ֱ𴴽�list��set���ϴ��뱾��������������������л������͵İ�װ�������
		List<Object> ob = new ArrayList<Object>();
		
		ob.add((byte)1);
		ob.add((short)1);
		ob.add(1);
		ob.add(1L);
		ob.add(1.1f);
		ob.add(1.1);
		ob.add('a');
		ob.add(false);
		ob.add(new Student03());
		ob.add(new Emp02());
		ob.add(new Person01());
		Set<Object> oo = new HashSet<Object>();
		Object oo1 = new Student03();
		Object oo2 = new Person01();
		Object oo3 = new Emp02();
		oo.add(oo1);
		oo.add(oo2);
		oo.add(oo3);
		//������ӡ���������ϵ�����
		System.out.println("������ӡ���������ϵ�����-------------------------");

		for(Object o:ob){
			System.out.println(o);
		}
		
		for(Object r:oo){
			System.out.println(r);
		}
		
	}
}
