package org.chengcai.day04;

import java.util.Scanner;

public class Break {
	public static void main(String[] args){
		//��ӡ1-10������
		for(int i=1;i<=10;i++){
			if(i == 5){
				//break;//��ֹ���for������ѭ��
				continue;//������ǰѭ��,�����´�ѭ��
			}	System.out.println(i);
		}
		
		//��ӡ1-100������,Ҫ���7��	
		for(int i=1;i<=100;i++){
			if(i%7 ==0 || (i+"").contains("7")){
				continue;//������ǰѭ��,�����´�ѭ��
			}	System.out.println(i);
		}
		
		//��*��ӡһ�����ĵľ���
		int l= 9;
		int h= 7;
		for (int i=0;i<h;i++) {
			for (int j=0;j<l;j++) {
				if ( i == 0 ) {
					System.out.print("*");
				}
				else if (i == h-1) {
				System.out.print("*");
			}
				else if (j == 0 || j == l-1) {
					System.out.print("*");
				}
				else {
				System.out.print(" ");
			}
			}
			System.out.println();
		}
	//ʹ��forѭ����ӡ200-300���е�������ż��
		for(int i=200;i<=300;i++){
				System.out.println(i);
		}	
	//ʹ��forѭ����ӡ10�Ľ׳˽���Ƕ��٣�
		int s = 1;
		for(int i = 1;i <= 10;i++){
			s = s * i; 
			}
		System.out.println(s);
		//ʹ��forѭ����ӡ����������
		/******
		 *****
		 ****
		 ***
		 **
		 */

		 for(int i=7;i>0;i--){
			 for(int j=1;j<i;j++){	 
				 System.out.print("*"); 	
			 }System.out.println("");
		 }

		//ʹ��forѭ����ӡ�������ͼ��
		 int a = 11;
		 int b = 6;
		 for (int i=0;i<b;i++) {
				for (int j=0;j<a;j++) {
					if ( i == 0 ) {
						System.out.print("@");
					}else if(i == b-1 ){
						System.out.print("@");
					
					}else if(j ==0 || j== a-1){
						System.out.print("@");
					}else {
						System.out.print(" ");
					}
				}System.out.println();
		 }
	
		//ʹ��forѭ����ӡ�������������
		
		for(int i=4;i>=1;i--){
			for(int j=1;j<=7;j++){
				if(j==i || j==(8-i) && i!=4 || i==1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		//ʹ��forѭ����ӡ����������
		
		for(int i=4;i>=1;i--){
			for(int j=1;j<=7;j++){
				if(j==i || j==(8-i) && i!=4 || i==1){
					System.out.print("*");
				}else{
				System.out.print(" ");
				}
		}System.out.println();
		}
		
	//��ӡ���еġ�ˮ�ɻ�������ˮ�ɻ���ָ������λ�������λ���ֵ������͵��ڸ�������
		
		    for(int i=100;i<=999;i++){
			int q = i/100;
			int w = (i-q*100)/10;
			int g = i-q*100 -w*10;
			if(i==q*q*q + w*w*w + g*g*g){
				System.out.println(i);
			}
		}
		
	//����̨��������κ�����	
		
		
		
	
		
		
		
	//��������1000�������в��ܱ�7����������֮��
		
		int x=1;
		int f = 0;
		do{
			if(x%7!=0){
			f = f+x;
			}x++;
			}while(x<=1000);
		System.out.println(f);
	
		
	//�ӿ���̨�����������֣����ñ��������������ֽ��л�����	
	//����a���յ�3��b���յ�4��������aΪ4��bΪ3
		/*
      Scanner sc = new Scanner(System.in);
      System.out.println("�������һ������");     
      int a = sc.nextInt();
      System.out.println("������ڶ�������");
	  int b = sc.nextInt();
	  int c = a+b;
	  System.out.println(a=c-a);
	  System.out.println(b=c-b);
	 */
		/*
		Scanner sc = new Scanner(System.in);
	      System.out.println("�������һ������");     
	      int a = sc.nextInt();
	      System.out.println("������ڶ�������");
		  int b = sc.nextInt();
		  int c; //��Ϊһ����ʱ������
		    c=a;//c��ֵ����Ϊ3   a��ֵ����3
		    a=b;//a��ֵ������4   b��ֵ����4
		    b=c;//b��ֵ����Ϊ3   c��ֵ����3
		  System.out.println(a+"+"+b);
		 */
	//����ѭ����ʵ��������������Ľ��
	//1-3+5-7+9-11+13-........-99+101
	//1.
		/*
		int c=0;
        int b=0;
        int m=0;
		for(int i=1;i<=101;i++){
		if(i%2!=0){ m++;
		if(m%2==0){b=i+b;
		}else{c=c+i;}
			}
		}System.out.println(c-b);
		*/
	//2.	
		/*
		 int v=0;
		 int x=0;
		 for(int i=1;i<102;i=i+4){
			 v=v+i;			
		 }
		 for(int t=3;t<102;t=t+4){
			 x=x+t;
		 }System.out.println(v-x);
		*/
	//����10000�������У�������Ϊǧ��֮����ÿ��һ�꣬���������Ϣ�����Ϊ�µı���
	//���������ȡ�ص�Ǯ�Ƕ���	
		//1.
		/*
		double a=10000;
		double b=0.003;
		for(int i=1;i<=5;i++ ){
			a=a*b+a;
		}System.out.println(a);
		*/
		//2.
		/*
		double a=10000;
		for(int i=1;i<=5;i++ ){
			a=a*1.003;
		}System.out.println(a);
		*/
	
	//дһ�δ��룬�ӿ���̨�����������֣��������ֶ�Ӧ���еľ���	
		
	//1.
	/*
	Scanner s = new Scanner(System.in);	
	System.out.println("�������һ������");
	int a= s.nextInt();
	System.out.println("������ڶ�������");
	int b= s.nextInt();
	for(int i=1;i<=a;i++){
		for(int q =1;q<=b;q++){
			System.out.print("*");
		}
		System.out.println();
	}
	*/
	//2.
	/*
	Scanner s = new Scanner(System.in);	
	System.out.println("�������һ������");
	int a= s.nextInt();
	System.out.println("������ڶ�������");
	int b= s.nextInt();
	for(int i=1;i<=a;i++){
		for(int q =1;q<=b;q++){
			if(i ==1|| i==a ||q==1 ||q ==b){
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
			
		}System.out.println();
		
	}
		
	*/	
	//��ӡ���ĵ��������Σ���ʾn��(n*2)-1��(�������ͨ������̨����)

	
	
		
		
		
		
			
		
	}
}
