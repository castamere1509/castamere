package org.chengcai.day12List;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 
 * 
HashMap:map���ϵ�һ�֣��� KEY(��)---value(ֵ) ����ʽ����
 *
 */

public class HashMap07 {

	public static void main(String[] args) {
		
		Map<String,String> mp = new HashMap<String,String>();
		
	//1.map���ϴ�������ʱ��  .put(key, value)	
		mp.put("name", "xiaohua");
		mp.put("job", "student");
		mp.put("age", "18");
		mp.put("sex", "Ů");
		//mp.put("name", "С��");//�����ظ����key�����ǻḲ��ǰ���Ǹ�key��value;��keyȥ��ȡֵֻ�ܻ�ȡ�����ŵ��ĸ�value
		
		mp.get("name");
		System.err.println(mp.get("name"));//С��
		System.out.println(mp);//��ӡmp���ϣ���ŵ�����ʱ����ģ����Ǽ���ֵ��Ӧ
		
	//2.��ȡmap�����е�ֵ��ͨ��key��ȡvalue     value = mp.get(key)
		
		String str = mp.get("name");//ֻ��ͨ��keyȡvalue
		System.out.println(str);
		
	//3.ɾ������   .remove(key)
		//mp.remove("age");
		
	//4.�ж��Ƿ�Ϊ��  .isEmpty()
		System.out.println(mp.isEmpty());//false
		
	//5.��ȡ����   .size()
		System.out.println(mp.size());//3
		
	//6.��ռ��� .clear()	
	   //mp.clear();	
	   System.out.println(mp.isEmpty());//��������շ���  true
	   
	   
	  //7.���ϵı���  
      //�Ȱ�key�������  mp.keySet()  
	   Set<String> st =mp.keySet();//��ȡmp������keyֵ,���ص���һ��set����
	   System.out.println(st+"key��set����");//[sex, name, job, age]
	   
	   for(String s:st){
		   //mp.get(s);----s��keyֵ��ͨ��mp���ϵ�get(key)������ȡvalue
		   System.out.println(s+"="+mp.get(s));		   
	   }//sex=Ů  name=С�� job=student age=18
	   
		//ͨ��ѭ���ҳ�mp��age��ֵ
	   
	   System.out.println(mp.get("age"));
	   
	   Set<String> st1 =mp.keySet();
	   
	   for(String s:st1){
		   if(s.equals("age")){
			   System.out.println(mp.get(s));
		   }
	   }
	   		
		//ͨ��ѭ���ҳ�С����Ӧ��key
	   
	   for(String s:st1){
		   if(mp.get(s).equals("С��")){
			   System.out.println(s);
		   }
	   }
	   
	}
	

	
}
