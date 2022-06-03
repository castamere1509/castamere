package org.chengcai.day03;

/**
 *关系运算符 <小于，  >大于，  !=不等于，  >=大于等于，  <=小于等于，  ==等于（判断符号两边的数字是否相等）
 * 
 * 以上关系运算符号得出的结果都是boolean类型，要么是true 成立，要么是false 不成立
 *
 * 如果是String类型取做对比使用  A.equals(B)  方法
 *
 */

public class Judge01 {
       public static void main(String[] args) {
    	   
    	   int a = 10;
    	   int b = 20;
    	   boolean bo1 = a>b;
    	   System.out.println(bo1);//false
    	   boolean bo2 = a<b;
	       System.out.println(bo2);//true
	       boolean bo3 = a>=b;
	       System.out.println(bo3);//false
	       boolean bo4 = a<=b;
	       System.out.println(bo4);//true
	       boolean bo5 = a!=b;
	       System.out.println(bo5);//true
	       boolean bo6 = a==b;
	       System.out.println(bo6);//false
	       
	       //String类型比较
	       String str="10";
	      // boolean bo7 = a==str; 会报错，因为a是int类型，str 是String类型，无法比较
	       String str1 ="abcada456唔唔唔唔465--da";
	       String str2 ="abdada4545---王sdsa";
	       boolean bo7 = str1 == str2;//一般Java不会这么比较String类型，不要这样写
	       System.out.println(bo7);//false
	       
	       //一般使用  字符串.equals(被比较的数据),可以让这个字符串对比任何类型
	       boolean bo8 =str1.equals(str2);
	       System.out.println(bo8);//false
	       
	       
}

	  
	
	
}
