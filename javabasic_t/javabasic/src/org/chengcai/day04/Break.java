package org.chengcai.day04;

public class Break {

	   public static void main(String[] args) {
		//��ӡ1-10������		   
		   for(int i=1;i<=10;i++){			   
			   if(i == 5){
				   break;//��ֹ���for������ѭ��  
				   //continue;//������ǰѭ���������´�ѭ��
			   }			   
			   System.out.println(i);
		   }
		   
		//��ӡ1-100��������Ҫ���7��
		   for(int i=1;i<=100;i++){
			   if(i%7==0 || (i+"").contains("7")){
				   
				   continue;
			   }
	          System.out.println(i);
		   }
		   
 
	}

}
