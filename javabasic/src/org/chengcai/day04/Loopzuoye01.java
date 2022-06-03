package org.chengcai.day04;
/**
 * 用while 打印1-100内555的因数
 * 用while 打印1-100内包含5或者5的倍数的整数
 *用do...while打印5的阶乘
 *用do...while统计1-100内包含5或者5的倍数的整数有多少个
 *结合Scanner统计 int a有多少个因数
 */
public class Loopzuoye01 {
 public static void main(String[] args){
	int i=1;
	
	 while(i<=100 ){
		 if(555%i==0){
			 System.out.println(i);	
		 } i++; 
	 }
	// 用while 打印包含5或者5的倍数的整数
	 i=1;
	 while(i<=100){
		 if(i%5==0 || (i+"").contains("5")){
			 System.out.println(i);
			
		 }i++;
		
	 }
	 
	 //用do...while打印5的阶乘
	int t =1;
	    i=1;
	 do{ 
		 t=i*t;
		 i++;
	 }while(i<=5);
	 System.out.println(t);
	 
	 //用do...while统计1-100内包含5或者5的倍数的整数有多少个
	 
	 i=1;
	 String q="";
	 String sq=q+i;
	 int count =0;
	 while(i<=100){
		 if(i%5==0 || sq.contains("5")){
			 count=count+1;
		 }	
		 i++;
		 sq=q+i;
	 }System.out.println(count);
	 
	 i=1;
	 String e="";
	 String se=e+i;
	 int countt =0;
	 
	 do{
		 if(i%5==0 || se.contains("5")){
			 countt=countt+1; 
		 }i++;
		 se=e+i;
	 }while(i<=100);System.out.println(countt); 
 }
}
