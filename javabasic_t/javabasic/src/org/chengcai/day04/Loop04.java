package org.chengcai.day04;

/**
 * ѭ��0  forѭ��Ƕ��
 * 
 * for(���ʽ1;���ʽ2;���ʽ3){
 *        for(���ʽ1;���ʽ2;���ʽ3){
 *           
 *        }
 * }
 * 
 *
 */

public class Loop04 {
	  public static void main(String[] args) {
		//print��println  ���� print �����д�ӡ  ,println�ǻ��д�ӡ
		  
	  //��ӡ��4��*��ÿ��5��*
//��ѭ��  ��ѭ��
//��һ����ѭ�� i =1;  ��һ����ѭ�� j=1; �ڶ�����ѭ�� j=2;������j=3;���Ĵ�j=4;�����j=5;������j=6�жϲ�������������ѭ��
//�ڶ�����ѭ��i=2 ; ��һ����ѭ��j=1;�ڶ�����ѭ�� j=2;������j=3;���Ĵ�j=4;�����j=5;������j=6�жϲ�������������ѭ��  
//��������ѭ��i=3 ; ��һ����ѭ��j=1;�ڶ�����ѭ�� j=2;������j=3;���Ĵ�j=4;�����j=5;������j=6�жϲ�������������ѭ��  
//���Ĵ���ѭ��i=4 ; ��һ����ѭ��j=1;�ڶ�����ѭ�� j=2;������j=3;���Ĵ�j=4;�����j=5;������j=6�жϲ�������������ѭ��  		  
//�����i<=4��������������	  
         for(int i=1;i<=4;i++){
        	 for(int j=1;j<=5;j++){
        		 
        		 System.out.print("*");
        	 }       	 
        	 System.out.println("");
         }
		
     System.out.println("----------------------------------------------------");    
         
	//��ӡһ��5��5�е�ֱ��������
 //��һ����ѭ��i=1; ��һ����ѭ��j=1;�ڶ�����ѭ��j=2,������j<=i,����ѭ��    
//�ڶ�����ѭ��i=2;  ��һ����ѭ��j=1; �ڶ�����ѭ��j=2;  ��������ѭ��j=3��������j<=i,����ѭ�� 
//��������ѭ��i=3�� ��һ����ѭ��j=1; �ڶ�����ѭ��j=2;  ��������ѭ��j=3�����Ĵ�j=4��������j<=i,����ѭ��
//���Ĵ���ѭ��i=4��  ��һ����ѭ��j=1; �ڶ�����ѭ��j=2;  ��������ѭ��j=3�����Ĵ�j=4�������j=5,������j<=i,����ѭ��  
//�������ѭ��i=5;  ��һ����ѭ��j=1; �ڶ�����ѭ��j=2;  ��������ѭ��j=3�����Ĵ�j=4�������j=5;������j=6,������j<=i,����ѭ��  
//��������ѭ��i=6��������i<=5,����ѭ��	  
     for(int i=1;i<=5;i++){
			  for(int j=1;j<=i;j++){
				  System.out.print("*");
			  }
			System.out.println("");  
		  }
     
		  
		//��ӡһ���˷��ھ���  
		 for(int i=1;i<=9;i++){
             for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+" ");           	 
			  }
			 
			 System.out.println("");
		 } 
		  
		  
		 //��*��ӡһ�����ĵľ���
		 
		 for(int i=1;i<=5;i++){
			 for(int j=1;j<=5;j++){
				 if(i==1 || i==5 || j==1 ||j==5){
					 System.out.print("*");
				 }else{
					 System.out.print(" ");
				 }
				 
			 }
 
			 System.out.println("");
		 }
	 
		//ʹ��forѭ����ӡ200-300���е�������ż��
		//ʹ��forѭ����ӡ10�Ľ׳˽���Ƕ��٣�  			
	  //ʹ��forѭ����ӡ����������
		for(int i=1;i<=6;i++){
			for(int j=6;j>=i;j--){
				System.out.print("*");
			}
			System.out.println("");
		} 
		 
		 
			/******
			 *****
			 ****
			 ***
			 **
			 */
		//ʹ��forѭ����ӡ�������������
		
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
				if(j==1 || i==6 || j==i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
				
			}
			System.out.println("");
		}
		
		
		
		
		
		//ʹ��forѭ����ӡ���������Σ�����ͼ 
		
		
		
		//��ӡ����������  ����  =  ����*2  -  1
	    for(int i=4;i>=1;i--){
	    	for(int j=1;j<=7;j++){
	    		if(j>=i && j<=8-i){
	    			System.out.print(j); 
	    		}else{
	    			System.out.print(" ");
	    		}
	    	}
	    	System.out.println("");
	    }

		
		//��ӡ���ĵ��������Σ���ʾn��  (n*2)-1��
		for(int i=4;i>=1;i--){
			for(int j=1;j<=7;j++){
				if(j==i || j==8-i || i==1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	
		
		int a=8;//������
		for(int i=a;i>=1;i--){
			for(int j=1;j<=(a*2)-1;j++){
				if(j==i || j==((a*2)-i) || i==1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		
		for(int i=4;i>=1;i--){
			for(int j=1;j<=9;j++){
				if(j ==i || j==10-i || i==1 || j==i+1 && i==4){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		
		
		
		int b=8;
		for(int i=b;i>=1;i--){
			for(int j=1;j<=b*2+1;j++){
				if(j==i || j==(b*2+2)-i || j==i+1 && i==b || i==1 ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		

		
		
		  
	}
	
	

}
