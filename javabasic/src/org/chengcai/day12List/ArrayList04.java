package org.chengcai.day12List;

import java.util.ArrayList;
import java.util.List;

/** 角色名  职业  特长  
 *  鲁班     射手  腿短
 *  李白     刺客  秀
 *  安琪拉  法师  漂亮
 */

public class ArrayList04 {
		
	public static void main(String[] args) {
		//1、声明一个集合，存放Role类型的对象。			
       
		
 //1.声明一个集合，存放Role类型的对象。
  List<Role> re= new ArrayList<Role>();//创建了一个Role类型的集合，名字叫re
  
	Role re1 = new Role("鲁班","射手","腿短");
	Role re2 = new Role("李白","刺客","秀");
	Role re3 = new Role();	//无参
	re3.setRoleName("安琪拉");	
	re3.setJob("法师");
	re3.setSpeciality("漂亮");
	Role re4 = new Role("后羿","射手","666");
	re.add(re1);
	re.add(re2);
	re.add(re3);
	re.add(re4);
	System.out.println(re);
	//2、李白的特长是什么？
	//for循环法
	for(int i=0;i<re.size();i++){
		if(re.get(i).getRoleName().equals("李白")){
			System.out.println(re.get(i).getSpeciality());
		}		
	}
	//for ...each法
	for(Role r:re){
		if(r.getRoleName().equals("李白")){
			System.out.println(r.getSpeciality());
		}
	}

	//3、把 射手 的特长全部改为 攻击高
	
	for(Role r:re){
		if(r.getJob().equals("射手")){
			r.setSpeciality("攻击高");
		}
	}
	System.out.println(re);
	
	
}
}
