package org.chengcai.day05;

import java.util.Arrays;

/**
 * 
 *二维数组
 *
 */

public class Array02 {
	
	public static void main(String[] args){
	//二维数组的声明
	String[][] names={
			{"小花","小黄"},//外数组的0号下标
			{"小白","小黑"},//外数组的1号下标
			{"小兰","小紫"}//外数组的2号下标
			//里0     //里1		
	        };
		
	//数组的长度
	System.out.println("外层数组的长度"+names.length);
	System.out.println(names[0].length);
		
	//二维数组的遍历
	/*
	for(int i=0;i<names.length;i++){
		for(int j=0;j<names[i].length;j++){
			System.out.println(names[i][j]);
		}
	}
	*/
		//打印小兰的位置
	for(int i=0;i<names.length;i++){
		for(int j=0;j<names[i].length;j++){
			if(names[i][j].equals("小兰")){
			System.out.println("小兰所在的外数组是:"+i+",内数组是:"+j);
			}
		}
	}
		
	//使用for...each遍历
	for(String[] str:names){
		System.out.println(Arrays.toString(str));
	}
	}
}
