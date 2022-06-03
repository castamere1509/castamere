package org.chengcai.day05;

import java.util.Arrays;

/**
 * 
 * 数组：用来保存相同类型的一组数据
 *
 */
public class Array01 {
 public static void main(String[] args){
	//创建数组,方式1:直接声明一个数组，并赋值
	 int[] ages={15,16,18,23,26};
	 String[] strs={"小花","小兰","小白","小王"};
	 
	 //数组的长度用.length
	 int len=strs.length;
	 System.out.println(len);
	 
	 //数组的下标,数组的下标从0开始,最大的下标为数字的长度-1,strs.length-1
	 System.out.println(strs[0]);//打印方式  数组名[index] 代表的某个下标对应的值
	 System.out.println(strs[strs.length-1]);//打印的数组最后一位下标的值
	 
	 //创建数组的方式2:创建一个定长的空数组;
	 String[] strs1 = new String[6];//创建一个数组,长度设定为6位
	 //数组赋值
	 strs1[0] ="张学友";
	 strs1[1] ="刘德华";
	 System.out.println(strs1[3]);//3号下标位置没有值,打印出来  null
	 strs1[2] ="郭富城";
	 strs1[3] ="黎明";
	 strs1[4] ="闰土";
	 strs1[5] ="周杰伦";
	 //打印数组使用Arrays.toString(数组名)
	 System.out.println(Arrays.toString(strs1));
	 
	 //数组的循环遍历1,使用for循环进行遍历;数组可以通过下标进行遍历
	 //打印strs1数组的所有值
	 for(int i=0;i<strs1.length;i++){
		 System.out.println(strs1[i]);
	 }
	 
	 //数组的循环遍历2,使用for ...each
	 System.out.println("使用for ...each-----------------------");
	 for(String s:strs1){  //会在获取所有的值,全部遍历完后结束,遍历6次
		 System.out.println(s);
	 }
	 
	 int[] as={18,19,30,77,66};
	 for(int i:as){//遍历5次,遍历的次数就是数组的长度
		 System.out.println(i);
	 }

	 //练习，使用两种遍历方式,查找 闰土 是否存在于strs1 数组里面
	 
	 String res ="不存在";
	 for(String i:strs1){
		 if(i.equals("闰土")){
			 res ="存在";
		 }
		 
	 }System.out.println(res);
	 
	 int l=strs.length;
	 for(int a=0;a<strs1.length;a++){
		 if(strs1[l].equals("闰土")){
			 res ="存在";
		 }
		 }System.out.println(res);
 
 }
}
