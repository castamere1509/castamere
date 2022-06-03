package org.chengcai.day12List;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 
 * 
HashMap:map集合的一种，以 KEY(键)---value(值) 的形式保存
 *
 */

public class HashMap07 {

	public static void main(String[] args) {
		
		Map<String,String> mp = new HashMap<String,String>();
		
	//1.map集合存入数据时用  .put(key, value)	
		mp.put("name", "xiaohua");
		mp.put("job", "student");
		mp.put("age", "18");
		mp.put("sex", "女");
		//mp.put("name", "小白");//可以重复存放key，但是会覆盖前面那个key的value;用key去获取值只能获取到后存放的哪个value
		
		mp.get("name");
		System.err.println(mp.get("name"));//小白
		System.out.println(mp);//打印mp集合，存放的数据时无序的，但是键和值对应
		
	//2.获取map集合中的值，通过key获取value     value = mp.get(key)
		
		String str = mp.get("name");//只能通过key取value
		System.out.println(str);
		
	//3.删除数据   .remove(key)
		//mp.remove("age");
		
	//4.判断是否为空  .isEmpty()
		System.out.println(mp.isEmpty());//false
		
	//5.获取长度   .size()
		System.out.println(mp.size());//3
		
	//6.清空集合 .clear()	
	   //mp.clear();	
	   System.out.println(mp.isEmpty());//运行完清空返回  true
	   
	   
	  //7.集合的遍历  
      //先把key查出来；  mp.keySet()  
	   Set<String> st =mp.keySet();//获取mp的所有key值,返回的是一个set集合
	   System.out.println(st+"key的set集合");//[sex, name, job, age]
	   
	   for(String s:st){
		   //mp.get(s);----s是key值，通过mp集合的get(key)方法获取value
		   System.out.println(s+"="+mp.get(s));		   
	   }//sex=女  name=小白 job=student age=18
	   
		//通过循环找出mp中age的值
	   
	   System.out.println(mp.get("age"));
	   
	   Set<String> st1 =mp.keySet();
	   
	   for(String s:st1){
		   if(s.equals("age")){
			   System.out.println(mp.get(s));
		   }
	   }
	   		
		//通过循环找出小花对应的key
	   
	   for(String s:st1){
		   if(mp.get(s).equals("小花")){
			   System.out.println(s);
		   }
	   }
	   
	}
	

	
}
