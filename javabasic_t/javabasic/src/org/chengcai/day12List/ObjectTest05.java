package org.chengcai.day12List;

import java.util.ArrayList;
import java.util.List;

/**
 * Object����������ĸ��࣬���ǰ����г���
 * �÷�����������Ҫ���治ͬ�������͵�ʱ�����ǿ��Խ����Ϸ�������Ϊobject
 *
 */


public class ObjectTest05 {
	
	public static void main(String[] args) {
		//ֻҪ��������ΪObject����ô�ü��Ͽ��Դ����������
		List<Object> st = new ArrayList<Object>();		
		
		st.add(1);//��������ʱ�Ὣ����ת��ΪObject�����ٴ���
		st.add("С��");
		Role r1 = new Role("³��","����","�ȶ�");
		st.add(r1);
		int [] its={1,2,3,4,5};
		st.add(its);//3��λ��
		
        //Object����
		
		//int i =st.get(0); ���뱨��ʹ��get��ȡ��������Object���ͣ�����ֱ�Ӹ�ֵ��int
		
		int a =(int)st.get(0);//��Ҫǿ��ת��Ϊint�����ٸ�ֵ��a
		int[] arr=(int[])st.get(3);//��Ҫǿ��ת��Ϊint[]�����ٸ�ֵ��arr		
		Role le =(Role)st.get(2);//��Ҫǿ��ת��ΪRole�����ٸ�ֵ��le
		String str = (String)st.get(1);
		System.out.println(le);
		System.out.println(str);
	}
	
	
	

}
