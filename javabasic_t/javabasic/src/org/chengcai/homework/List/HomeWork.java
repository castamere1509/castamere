package org.chengcai.homework.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HomeWork {
	
	public static void main(String[] args) {

	//����list���Ϸ���Student03��Ķ���
	/** ����   ����    �Ա�    �ɼ�
	 *  С��    18       Ů        90
	 *  С��    19       Ů       63
	 *  С��    20       ��       59
	 *  С��    21        ��       98
	 * 
	 */
	
	List<Student03> stus = new ArrayList<Student03>();
	
	Student03 stu1 = new Student03();
	stu1.setAge(18);
	stu1.setName("С��");
	stu1.setSex("Ů");
    stu1.setScore(90);
	Student03 stu2 = new Student03();
	stu2.setAge(19);
	stu2.setName("С��");
	stu2.setSex("Ů");
    stu2.setScore(63);
	Student03 stu3 = new Student03();
	stu3.setAge(20);
	stu3.setName("С��");
	stu3.setSex("��");
    stu3.setScore(59);
	Student03 stu4 = new Student03();
	stu4.setAge(21);
	stu4.setName("С��");
	stu4.setSex("��");
    stu4.setScore(98);
    
    stus.add(stu1);//0
    stus.add(stu2);//1
    stus.add(stu3);//2
    stus.add(stu4);//3
    System.out.println(stus);
    
    
   
	//���˭�ĳɼ�����60
	for(int i =0;i<stus.size();i++){
		if(stus.get(i).getScore()>60){
			System.out.println(stus.get(i).getName());
		}
		
	}
		
	 System.out.println("-----��ѯŮ��������------");
	//��ѯŮ��������
	for(int i =0;i<stus.size();i++){
		if(stus.get(i).getSex().equals("Ů")){
			System.out.println(stus.get(i).getName());
		}
		
	}	
	System.out.println("------��˭�ĳɼ���С�׸�--------");
	//���˭�ĳɼ���С�׸ߣ���ʾ���Ȳ�С�׵ĳɼ�����ȥ�Ƚ�
	double xbsc=0;
	for(int i =0;i<stus.size();i++){
		if(stus.get(i).getName().equals("С��")){
			xbsc=stus.get(i).getScore();//С�׵ĳɼ�
		}
		
	}
	
	for(int i =0;i<stus.size();i++){
		if(stus.get(i).getScore()>xbsc){//�ø�������ĳɼ���С�ױ�
			System.out.println(stus.get(i).getName());//�����ߵİ����ִ�ӡ����
		}
		
	}
	
	
	
	//��С�׵ĳɼ�+10��
	for(int i =0;i<stus.size();i++){
		if(stus.get(i).getName().equals("С��")){
			//stus.get(i).getScore()+10----С�׵ķ���+10��ֵ
			stus.get(i).setScore(stus.get(i).getScore()+10);//��ֵ�����С�׵ķ���
		}
		
	}
	
	
	
	System.out.println("---ɾ����������ɼ�û����Ķ���--");
	//ɾ����������ɼ�û����Ķ���
	for(int i =0;i<stus.size();i++){
		if(stus.get(i).getScore()<60){
			stus.remove(i);
		}
		
	}
	System.out.println(stus);
	
	
	//����set���Ϸ���Student03��Ķ���
	/** ����   ����    �Ա�    �ɼ�
	 *  С��    18       Ů        90
	 *  С��    19       Ů       63
	 *  С��    20       ��       59
	 *  С��    21        ��       98
	 * 
	 */
	
Set<Student03> stust = new HashSet<Student03>();
	
	Student03 stut1 = new Student03();
	stut1.setAge(18);
	stut1.setName("С��");
	stut1.setSex("Ů");
    stut1.setScore(90);
	Student03 stut2 = new Student03();
	stut2.setAge(19);
	stut2.setName("С��");
	stut2.setSex("Ů");
    stut2.setScore(63);
	Student03 stut3 = new Student03();
	stut3.setAge(20);
	stut3.setName("С��");
	stut3.setSex("��");
    stut3.setScore(59);
	Student03 stut4 = new Student03();
	stut4.setAge(21);
	stut4.setName("С��");
	stut4.setSex("��");
    stut4.setScore(98);
    
    stust.add(stut1);
    stust.add(stut2);
    stust.add(stut3);
    stust.add(stut4);
	
	System.out.println("--------set---------");
	//���˭�ĳɼ�����60
    for(Student03 s:stust){
    	if(s.getScore()>60){
			System.out.println(s.getName());
		}
    	
    }
    
	System.out.println("-------��ѯ������������60������--------");
	//��ѯ������������60������
    for(Student03 s:stust){
    	if(s.getScore()>60 && s.getSex().equals("��")){
			System.out.println(s.getName());
		}
    	
    }
    
    System.out.println("-----���˭�ĳɼ���С�׸�------");
	//���˭�ĳɼ���С�׸ߣ���ʾ���Ȳ�С�׵ĳɼ�����ȥ�Ƚ�
    
    for(Student03 s:stust){
    	if(s.getName().equals("С��")){
			xbsc=s.getScore();
		}
    	
    }
    
    for(Student03 s:stust){
    	if(s.getScore()>xbsc){
			System.out.println(s.getName());
		}
    	
    }	
    
    
    
	//��С�ڵĳɼ�+10��
    for(Student03 s:stust){
    	if(s.getName().equals("С��")){
			//s.getScore()+10----С�ڵķ���+10��ֵ
			s.setScore(s.getScore()+10);//��ֵ�����С�ڵķ���
		}
    	
    }
	
	
	
	//�ֱ𴴽�list��set���ϴ��뱾��������������������л������͵İ�װ�������
    List<Object> lst = new ArrayList<Object>();
    lst.add((byte)1);//����byte��������ʱ��ǿ��ת��ΪObject
    lst.add((short)1);
    lst.add(1);
    lst.add(1L);
    lst.add(1.1F);
    lst.add(1.1);
    lst.add('a');
    lst.add(false);
    lst.add(new Student03(18,"xiaohua", "nv",90.5));
    lst.add(new Emp02());
    lst.add(new Person01());
    
    
    Set<Object> st = new HashSet<Object>();
    st.add((byte)1);//����byte��������ʱ��ǿ��ת��ΪObject
    st.add((short)1);
    st.add(1);
    st.add(1L);
    st.add(1.1F);
    st.add(1.1);
    st.add('a');
    st.add(false);
    st.add(new Student03(18,"xiaohua", "nv",90.5));
    st.add(new Emp02());
    st.add(new Person01());
	
	//������ӡ���������ϵ�����
	for(int i=0;i<lst.size();i++){
		System.out.println(lst.get(i));
	}
	
	System.out.println("-----set����-------");
	for(Object o:st){
		System.out.println(o);
	}
	

}
}