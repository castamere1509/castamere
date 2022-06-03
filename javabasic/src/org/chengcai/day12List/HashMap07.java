package org.chengcai.day12List;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap:map���ϵ�һ�֣��� KEY(��)---value(ֵ) ����ʽ����
 *
 *
 */
public class HashMap07 {
	
	public static void main(String[] args){
		
		Map<String,String> mp = new HashMap<String,String>();
		
	//1.map���ϴ�������ʱ�� .put(key, value)
		mp.put("name", "С��");
		mp.put("job", "student");
		mp.put("age", "18");
		mp.put("sex", "Ů");
		
		System.out.println(mp);//��ӡmp���ϣ���ŵ�����������ģ����Ǽ���ֵ��Ӧ
		
	//2.��ȡmap�����е�ֵ��ͨ��key��ȡvalue    value = mp.get(key)
		
		String str = mp.get("name");
		System.out.println(str);
		
	//3.ɾ������   .remove(key)
		//mp.remove("age");
		
	//4.�ж��Ƿ�Ϊ�� isEmpty()
		System.out.println(mp.isEmpty());//false
		
	//5.��ȡ���� ��size()
		System.out.println(mp.size());//3
		
	//6.��ռ���  .clear()
		//mp.clear();
		System.out.println(mp.isEmpty());
	
	//7.���ϵı���
	//�Ȱ�key������� .keySet()  ��ȡmp������keyֵ
	 Set<String> st =mp.keySet();//��ȡmp������keyֵ�����ص���һ��set����
	 System.out.println(st);//[sex,name,job]
		
	 for(String s:st){
		 mp.get(s);//s��keyֵ��ͨ��mp���ϵ�get(key)������ȡvalue
		 System.out.println(mp.get(s));
		 
	 }
		
		//ͨ��ѭ���ҳ�mp��age��ֵ
	 Set<String> tt =mp.keySet();
	 for(String s:tt){
		 mp.get("age");	 
	 }
	    //ͨ��ѭ���ҳ�С����Ӧ��key
	 Set<String> tr =mp.keySet();
	 for(String s:tr){
		 String a =mp.get(s);
		if(a.equals("С��")){
			System.out.println(s);
	 }
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
	}
}
