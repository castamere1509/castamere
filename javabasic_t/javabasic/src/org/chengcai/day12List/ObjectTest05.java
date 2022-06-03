package org.chengcai.day12List;

import java.util.ArrayList;
import java.util.List;

/**
 * Object类是所有类的父类，我们把它叫超类
 * 用法：当我们需要储存不同数据类型的时候，我们可以将集合泛型声明为object
 *
 */


public class ObjectTest05 {
	
	public static void main(String[] args) {
		//只要泛型声明为Object，那么该集合可以存放任意内容
		List<Object> st = new ArrayList<Object>();		
		
		st.add(1);//存入数据时会将数据转换为Object类型再存入
		st.add("小花");
		Role r1 = new Role("鲁班","射手","腿短");
		st.add(r1);
		int [] its={1,2,3,4,5};
		st.add(its);//3号位置
		
        //Object类型
		
		//int i =st.get(0); 代码报错，使用get获取的数据是Object类型，不能直接赋值给int
		
		int a =(int)st.get(0);//需要强制转换为int类型再赋值给a
		int[] arr=(int[])st.get(3);//需要强制转换为int[]类型再赋值给arr		
		Role le =(Role)st.get(2);//需要强制转换为Role类型再赋值给le
		String str = (String)st.get(1);
		System.out.println(le);
		System.out.println(str);
	}
	
	
	

}
