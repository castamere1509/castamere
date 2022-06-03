package org.chengcai.day04;

public class Break {

	   public static void main(String[] args) {
		//打印1-10的整数		   
		   for(int i=1;i<=10;i++){			   
			   if(i == 5){
				   break;//终止这个for的所有循环  
				   //continue;//跳过当前循环，进行下次循环
			   }			   
			   System.out.println(i);
		   }
		   
		//打印1-100的整数，要求逢7过
		   for(int i=1;i<=100;i++){
			   if(i%7==0 || (i+"").contains("7")){
				   
				   continue;
			   }
	          System.out.println(i);
		   }
		   
 
	}

}
