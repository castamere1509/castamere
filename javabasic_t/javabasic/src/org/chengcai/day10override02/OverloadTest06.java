package org.chengcai.day10override02;
//��������
//��һ������߸�����֮�䣬�з�������ͬ�������б�ͬ����������ȡѡ����÷���

public class OverloadTest06 {

	public static void main(String[] args) {
		
		Overload05 ov = new Overload05();		
		ov.add(1,2);
		ov.add(1, 2,3);
		ov.add(1, 1.1);
		//���ݲ�ͬ����Σ���ѡ���Ե��ò�ͬ�ķ���
		Emp02 ep = new Emp02();
		ep.sleep();//���õĸ���ķ���
		ep.sleep(1);//���õ��Լ��ķ���
		
		
	}
	
	
}
