package org.chengcai.day08;

public class KongTiao07 {

	   double weight;//����
	   String brand;//Ʒ��
	   int power;//����
	   int wendu;//�¶�
	   
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
