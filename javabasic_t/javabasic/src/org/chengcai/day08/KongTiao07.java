package org.chengcai.day08;

public class KongTiao07 {

	   double weight;//重量
	   String brand;//品牌
	   int power;//功率
	   int wendu;//温度
	   
	   public int add(){
		   return wendu++;
	   }
	   public int minus(){
		   return wendu--;
	   }
	   public int on(){
		   wendu =25;
		   return wendu;		   
	   }
	   public int off(){
		   wendu =0;
		   return wendu;		   
	   }
	
}
