package org.chengcai.day12List;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap:map集合的一种，以 KEY(键)---value(值) 的形式保存
 *
 *
 */
public class HashMap07 {
	
	public static void main(String[] args){
		
		Map<String,String> mp = new HashMap<String,String>();
		
	//1.map集合存入数据时用 .put(key, value)
		mp.put("name", "小花");
		mp.put("job", "student");
		mp.put("age", "18");
		mp.put("sex", "女");
		
		System.out.println(mp);//打印mp集合，存放的数据是无序的，但是键和值对应
		
	//2.获取map集合中的值，通过key获取value    value = mp.get(key)
		
		String str = mp.get("name");
		System.out.println(str);
		
	//3.删除数据   .remove(key)
		//mp.remove("age");
		
	//4.判断是否为空 isEmpty()
		System.out.println(mp.isEmpty());//false
		
	//5.获取长度 。size()
		System.out.println(mp.size());//3
		
	//6.清空集合  .clear()
		//mp.clear();
		System.out.println(mp.isEmpty());
	
	//7.集合的遍历
	//先把key查出来： .keySet()  获取mp的所有key值
	 Set<String> st =mp.keySet();//获取mp的所有key值，返回的是一个set集合
	 System.out.println(st);//[sex,name,job]
		
	 for(String s:st){
		 mp.get(s);//s是key值，通过mp集合的get(key)方法获取value
		 System.out.println(mp.get(s));
		 
	 }
		
		//通过循环找出mp中age的值
	 Set<String> tt =mp.keySet();
	 for(String s:tt){
		 mp.get("age");	 
	 }
	    //通过循环找出小花对应的key
	 Set<String> tr =mp.keySet();
	 for(String s:tr){
		 String a =mp.get(s);
		if(a.equals("小花")){
			System.out.println(s);
	 }
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
	}
}
