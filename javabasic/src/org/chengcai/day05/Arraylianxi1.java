package org.chengcai.day05;

import java.util.Arrays;

public class Arraylianxi1 {
	public static void main(String[] args){
		
/*声明3个数组,第一个数组放姓名,第二个数组放性别,第三个数组放年龄	
这个三个数组的长度是一样的,姓名、性别和年龄是一一对应的。	
1.取出小黄的年龄。		
2.统计有多少个男的
3.统计有多少个女的
4.统计23岁以上的有几个
5.大于25岁的是谁

小红,小橙,小黄,小绿,小青,小蓝,小紫
  男  , 女 , 女 , 男 , 女  , 男 , 男
22 , 21, 23,25, 32 , 18,20   */
	String[] s={"小红","小橙","小黄","小绿","小青","小蓝","小紫"};
	char[]  x={'男','女','女','男','女','男','男'};
	int[] g={22,21,23,25,32,18,20};
	//取出小黄的年龄
	for( int i=0;i<s.length;i++){
		if(s[i].equals("小黄")){
		System.out.println(g[i]);}}	
	//2.统计有多少个男的	
     int ii=0;
    for(int i=0;i<x.length;i++){
    	if(x[i]=='男'){
    		ii++;
    	}
    }System.out.println(ii);
      
	
	//3.统计有多少个女的	
     int iii=0;
    for(int i=0;i<x.length;i++){
    	if(x[i]=='女'){
    		iii++;
    	}
    }System.out.println(iii);		
	//4.统计23岁以上的有几个
    int iiii=0;
    for(int i=0;i<s.length;i++){
    	if(g[i]>23){
    	iiii++;	
    	}
    }System.out.println(iiii);			
	//5.大于25岁的是谁
    for(int i=0;i<g.length;i++){
    	if(g[i]>25){
    		System.out.println(s[i]);	
    	}
    }
	
	int[] arr ={5,9,7,3,6,1};
	//{5,9,7,3,6,1};{5,7,9,3,6,1};{5,7,3,9,6,1};{5,7,3,6,9,1};{5,7,3,6,1,9};
	//{5,7,3,6,1,9};{5,3,7,6,1,9};{5,3,6,7,1,9};{5,3,6,1,7,9};{5,3,6,1,7,9};
	//{3,5,6,1,7,9};{3,5,1,6,7,9};{3,5,1,6,7,9};{3,5,1,6,7,9};{3,5,1,6,7,9};
	//{3,5,1,6,7,9};{3,1,5,6,7,9};{3,1,5,6,7,9};{3,1,5,6,7,9};{3,1,5,6,7,9};
	//{1,3,5,6,7,9};{3,1,5,6,7,9};{3,1,5,6,7,9};{3,1,5,6,7,9};{3,1,5,6,7,9};
	 //从小到大的排序[1,3,5,6,7,9]
	 //Arrays.sort(arr);
	 for(int j=0;j<arr.length-1;j++){
	 for(int i=0;i<arr.length-1;i++){
		 if(arr[i]>arr[i+1]){
			int  a=arr[i];
			   arr[i]=arr[i+1];
			   arr[i+1]=a;}
		 }
	 }System.out.println(Arrays.toString(arr));
	//从大到小的排序
	 for(int i=0;i<arr.length-1;i++){
	 for(int j=0;j<arr.length-1;j++){
	 if(arr[j]<arr[j+1]){
		 int a=arr[j];
		    arr[j]=arr[j+1];
		    arr[j+1]=a;
	 }
	 }
	 }System.out.println(Arrays.toString(arr));

	 
	 
	 
	
	}
}
