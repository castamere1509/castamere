package org.chengcai.day09;
/**
 * ���췽��: ��������������ķ���
 * �޲ι��췽��:һ����ϵͳĬ���ṩ,�������вι��췽����,�޲ι��췽��Ҳ��Ҫ�ֶ���������
 * �вι��췽��: ��Ҫ�ֶ�д , �������вι��췽����,�޲ι��췽��Ҳ��Ҫ�ֶ���������,
 * ϵͳ�ṩ��Ĭ�ϵ��޲ι��췽��ʧЧ
 *  
 * ʲô�ǹ��췽�������췽�����������������,���޲ι��������в���������
 *       (0�����������ʱ��,������ù��췽����������
 *   ��ʽ: ���췽������������ͬ,���Ҳ���Ҫ��������ֵ��
 *       (2���������û���������췽��,ϵͳ��Ĭ���ṩһ���޲ι��췽����
 *       (3������������вι�����,�����ֶ������޲ι�����,ϵͳ������
 *          �ṩĬ�ϵ��޲ι�������
 *  
 *  javaBean:����ҵ������һ��Լ���׳ɵ�ϰ��
 *
 *  Ҫ��:1.����ʹ��private����
 *      2.����ʹ��public����
 *      3.������һ��Ҫ���ṩ�޲ι�����
 *  
 *  
 */

public class Student01 {
	
	
		String name;
		String id;
		int age;
		char sex;
	
		public Student01() {//�޲ι��췽��
			
			
		}

        //�вι��췽��
		public Student01(String name, String id, int age, char sex) {//1��
			this.name = name;
			this.id = id;
			this.age = age;
			this.sex = sex;
		}
		
		public Student01(String name){//�вι��췽��2��
			this.name = name;
		}
		
		//  public Student01(String id)	{ this.id = id;} �ù��췽������,
		//�������Ͳ����б���ȫһ��,ϵͳ�޷�ʶ��
		
		public Student01(int age){//������췽�����յ���int ���͵����ݺ͹��췽��2��һ��
			this.age= age;
		}
		
		
		public Student01(String name,String id){//�вι��췽��3��
			this.name =name;
			this.id = id;
		}
		
		public Student01(String name,String id,int age){//�вι��췽��4��
			this.name = name;
			this.id = id;
			this.age = age;
		}
		  
		//��ӡ������Ϣ
		@Override//��д���߽и���,�ı��������
		public String toString() {
			return "Student01 [name=" + name + ", id=" + id + ", age=" + age + ", sex=" + sex + "]";
		}
		
		
		

}
