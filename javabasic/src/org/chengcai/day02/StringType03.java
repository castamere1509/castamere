package org.chengcai.day02;
/**
 * 类型转换
 * 
 *小-----------------------------------------大
 *byte   short  int  long  float    double
 */
public class StringType03 {
   public static void main(String[] args){
	   
	 byte a=10;//10默认的是int类型，把10转换byte类型
	 int b =a+10;//byte类型和int进行运算，因为int类型比byte类型，
	            //会把a直接转换成int类型进行运算
	 double db =b+10.5;//double类型比int类型大，会先把b转换成double类型后进行运算
	 
	 //2、强制类型转换，大转小，可能会造成精度丢失
	 int i=128;
	 byte bt =(byte)i;
	 System.out.println(bt);//打印-128，，精度丢失
	 
	 double de =100.3333333333333;
	 float ft =(float)de;
	 System.out.println(ft);
	 
	 double dl =1000.3333333333;
	 int j =(int)dl;
	 System.out.println(j);
	 
	 //String转化为int类型
	 String str="46465";
	 int k=Integer.parseInt(str);
	 System.out.println(k);
	 
	 //任何类型转换为String 直接加""
	 int k1=1234;
	 String str2 =k1+"";
	 System.out.println(str2);
	 
	 
	 
	 
	 
   }

}
