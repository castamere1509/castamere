package org.chengcai.day04;

/**
 * ѭ��02
 * 
 * do{
 * ����
 * }while(����)
 *do ....while ѭ�������ԣ���ִ��һ�����飬�ٽ����жϣ����Ը�ѭ������ִ��һ��
 *
 */

public class Loop02 {
	
	
	public static void main(String[] args) {
		
			//��ӡ1-100������
		  int i =1;
		  do{
			  System.out.println(i);
			  i++;
		  }while(i<=100);
		
		//��ӡ1-100��ż��
		  i=1;
		  do{
			  if(i%2==0){
				  System.out.println(i);
			  }
			  i++;
		  }while(i<=100);
		
		  //��ӡ1-2020�������
		  i=1;
		  do{
			  if(i%4==0 && i%100!=0 || i%400==0){
				  System.out.println(i);
			  }
			  i++;
		  }while(i<=2020);
		  
		  
		  
		  
		  //��ӡ1-100��ż����
		  i=1;
		  int sum=0;
		  do{
			  if(i%2==0){
				  sum =sum+i;
			  }
			  i++;
		  }while(i<=100);
		  System.out.println(sum);
		  
		  
		  
		  //ͳ��1-2020���ж��ٸ�����
		i=1;
		int count=0;
		do{
			if(i%4==0 && i%100!=0 || i%400==0){
				count++;
			}
			i++;
		}while(i<=2020);
		System.out.println(count);
		 
		  
		  
		  
	}
	

}
