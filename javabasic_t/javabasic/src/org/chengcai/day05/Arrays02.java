package org.chengcai.day05;

import java.util.Arrays;

/*声明3个数组，第一个数组放姓名，第二个数组放性别，第三个数组放年龄
这个三个数组的长度是一样的，姓名、性别和年龄是一一对应的。
1.取出小黄的年龄。
2.统计有多少个男的
3统计有多少个女的
4.统计23岁以上的有几个
5.大于25岁的是谁

小红,小橙,小黄,小绿,小青,小蓝,小紫

男,女,女,男,女,男,男

22,21,23,25,32,18,20*/

public class Arrays02 {

   public static void main(String[] args) {
	
	   String[] names={"小红","小橙","小黄","小绿","小青","小蓝","小紫"};
	   char[] sex={'男','女','女','男','女','男','男'};
	   int[] age={22,21,23,25,32,18,20};
	   
	   //取出小黄的年龄
	   for(int i=0;i<names.length;i++){
		   if(names[i].equals("小黄")){
			   System.out.println("小黄的年龄是"+age[i]);
		   }
	   }
	   
	   //2.统计有多少男性
	   int count=0;
	   for(char cr:sex){
		   if(cr == '男'){
			   count++;
		   }
	   }
	   System.out.println("男性有："+count);
	   
	   //3.统计有多少个女性
	    count=0;
	   for(char cr:sex){
		   if(cr == '女'){
			   count++;
		   }
	   }
	   System.out.println("女性有："+count);	   
	   //4.统计23岁以上的有几个
	   count =0;
	   for(int i:age){
		   if(i>23){
			   count++;
		   }
	   }
	   System.out.println("23岁以上的有"+count);
	   
	   
	   
	   //5.大于25岁的是谁
	   for(int i=0;i<age.length;i++){
		   if(age[i]>25){
			   System.out.println("25岁以上的是"+names[i]);
		   }
	   }
	   
}
	
}
