package org.chengcai.day12List;

import java.util.ArrayList;
import java.util.List;

import org.chengcai.day10extends01.Emp02;

/**
 * ���ϣ���������Ĵ������,�������ݼ���
 * ʲô����������:����8�������������Ķ�����������
 * 
 * ���Ϻ����������:���Ƕ�����������һ������,�������ڼ����ǿɱ䳤�ģ������Զ�����
 *               �����Ƕ����ġ�����ֻ�ܴ��������������
 * ArrayList���ϣ���������񣬶����±꣬����ʹ���±��������
 * 
 * ����ʹ��ʲô���ϣ������ȵ���
 * 
 * <>����Ƿ��ͣ������涨���ϴ�ŵ����ݵ����ͣ������<>ֻ�����������ͣ������ǻ�������
 * 
 * ���ϲ��ܴ�Ż�������,���ǿ��Դ�Ű��ֻ������͵İ�װ������ͣ�       
 * ��װ��ͻ������Ϳ����Զ�ת��       
 *    int----->Integer 
 *    byte---->Byte
 *    short--->Short 
 *    long---->Long
 *    float--->Float
 *    double--->Double    
 *    char----->Character    
 *    boolean--->Boolean    
 */
public class ArrayList01 {
	
	public static void main(String[] args){
		//����8�������������Ķ�����������
		String str = new String();//String ����������
		Emp02 ep = new Emp02();//Emp02��������
	
	List<String> st = new ArrayList<String>();//����һ������String����ArrayList���ϣ�	
	//st��һ����String���͵ļ���,�ܷ���String������
	
	//add()����,�����������������
	st.add("xiaohua");//Ϊ���Ϸ�������,���±�0��������
	st.add("С��");//Ϊ�±�1��������
	st.add("С��");//Ϊ�±�2��������
		
	//��ӡ����
	System.out.println(st);//[xiaohua,С��,С��]
			
	//size();��ȡ���ϵĳ���
	int sz = st.size();
	System.out.println(sz);//3
	
	//get(index);ͨ���±��ȡ������϶�Ӧ��ֵ
	String stt = st.get(2);
	System.out.println(stt);//С��
		
	//isEmpty();�ж�Ϊ��
	boolean bo = st.isEmpty();
	System.out.println(bo);//false
	
	//contains(XXX)  �Ƿ����XXX����
	boolean bo1 = st.contains("xiaohua");
	System.out.println(bo1);//true
	
	//remove(index)  ɾ����Ӧ�±�λ�õ�ֵ,�����˱�ɾ����ֵ
	String sttt = st.remove(0);
	System.out.println(sttt);//xiaohua
	
	System.out.println(st.get(0));//xiaohua��ɾ��,С����1���±��ƶ���0���±�
	
	//clear();��ռ���
	st.clear();
	System.out.println(st.isEmpty());//true
	
	//��Ż�ȡ8��������͵İ�װ��
	List<Integer> ls = new ArrayList<Integer>();//����һ������Integer����ArrayList����
	ls.add(1);
	ls.add(2);
	ls.add(3);
	
	int a =ls.get(0);//ȡ��������Integer����,�Զ�ת����int���ͺ�ֵ��a
	System.out.println(a);

	}

}
