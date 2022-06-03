package org.chengcai.day12List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 	ArrayList集合的遍历,这个集合的遍历和数组相同
 * 
 *
 */
public class ArrayList03 {

	public static void main(String[] args){
		
	  //数组-----------------------------------------------------
		String[] strs1 = new String[6];//创建一个数组，长度设定为6位
		//数组赋值
		strs1[0] ="张学友";
		strs1[1] ="刘德华";
		System.out.println(strs1[3]);//3号下标位置没有值,打印出来 null
		strs1[2] ="郭富城";
		strs1[3] ="黎明";
		strs1[4] ="李克勤";
		strs1[5] ="周杰伦";
		strs1[4] ="谭咏麟";//给数组某个下标位置重新赋值
		System.out.println(strs1[4]);
		//打印数组使用Arrays.toString(数组名)
		System.out.println(Arrays.toString(strs1));
		
		//数组的循环遍历1，使用for循环进行遍历；数组可以通过下标进行遍历
		//打印strs1数组的所有值
		for(int i=0;i<strs1.length;i++){
			System.out.println(strs1[i]);
			
		//数组的循环遍历2,使用for ...each
		System.out.println("使用 for ...each---------------------");
		for(String s:strs1){ //会在获取所有的值，全部遍历完后结束，遍历6次
			System.out.println(s);
		}
			
		
		//集合-----------------------------------------------------
		System.out.println("---------------集合遍历---------------");
		List<String> ls = new ArrayList<String>();
		ls.add("张学友");//0	
		ls.add("刘德华");
		ls.add("郭富城");
		ls.add("黎明");
		ls.add("李克勤");
		ls.add("周杰伦");
		
		//使用for循环进行遍历
		for(int j=0;j<ls.size();j++){
			System.out.println(ls.get(j));
		}
			
		//for ...each对集合进行遍历
		
		for(String str:ls){
			System.out.println(str);
		}
			
			
			
			
		}

		
	}
	
}
