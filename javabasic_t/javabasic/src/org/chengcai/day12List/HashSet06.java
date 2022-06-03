package org.chengcai.day12List;

import java.util.HashSet;
import java.util.Set;//不管使用什么集合，必须先导包

/**
 * 
 * HashSet集合：set集合的一种，存放数据
 * 特征：set集合存放数据时无序的，没有下标
 *      list集合存放数据时有序的
 *
 *
 *
 */


public class HashSet06 {

	public static void main(String[] args) {
		
		Set<Role> st = new HashSet<Role>();
		
		Role r1 = new Role("鲁班","射手","腿短");
		Role r2 = new Role("李白","刺客","秀");
		Role r3 = new Role("安琪拉","法师","漂亮");
		Role r4 = new Role("后羿","射手","666");
		
		//存放数据使用  add()
		st.add(r1);
		st.add(r2);
		st.add(r3);
		st.add(r4);
       
		//集合可以直接打印
		System.out.println(st);
		
		//无法使用get()方法,因为是无序集合，所以没有下标
		//st.get(1);
		
		//判断是否为空   .isEmpty();
		st.isEmpty();
		System.out.println(st.isEmpty());//false
		
		//集合长度 .size()
		int a =st.size();
		System.out.println(a);//4
		
		
		//清空集合使用 .clear()
		//st.clear();
		System.out.println(st.isEmpty());//true
		

		//遍历方式 只能用  for ...each,不能使用for循环进行下标遍历
		
		for(Role r:st){
			System.out.println(r);
		}
		
		//李白的特长是什么？
		for(Role r:st){
			if(r.getRoleName().equals("李白")){
				System.out.println(r.getSpeciality());
			}
		}
		//将所有射手的特产改为 攻击高
		
		for(Role r:st){
			if(r.getJob().equals("射手")){
				r.setSpeciality("攻击高");
			}
		}
		
		System.out.println(st);
	}
	
	
	
}
