package org.chengcai.day12List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.chengcai.day10extends01.Emp02;

/** 角色名  职业  特长  
 *  鲁班     射手  腿短
 *  李白     刺客  秀
 *  安琪拉  法师  漂亮
 */

public class ArrayList04 {
		
	public static void main(String[] args) {
		//1、声明一个集合，存放Role类型的对象。
		List<Role> tr = new ArrayList<Role>();//创建了一个Role类型的集合，名字叫tr
		
		Role r1 = new Role("鲁班","射手","腿短");
		Role r2 = new Role("李白","刺客","秀");
		Role r3 = new Role();
		r3.setRoleName("安琪拉");
		r3.setJob("法师");
		r3.setSpeciality("漂亮");
		Role r4 = new Role("后羿","射手","666");
		
		tr.add(r1);//0
		tr.add(r2);//1
		tr.add(r3);//2
		tr.add(r4);//3
		System.out.println(tr);
		
        //2、李白的特长是什么？
		for(int i =0;i<tr.size();i++){
			if(tr.get(i).getRoleName().equals("李白")){
				System.out.println(tr.get(i).getSpeciality());
			}
			
		}

		for(Role r:tr){
			if(r.getRoleName().equals("李白")){
				System.out.println(r.getSpeciality());
			}
			
		}
		
		//3、把 射手 的特长全部改为 攻击高
		
		for(Role r:tr){
			if(r.getJob().equals("射手")){				
				r.setSpeciality("攻击高");
			}
			
			
		}
		
		System.out.println(tr);

}
}
