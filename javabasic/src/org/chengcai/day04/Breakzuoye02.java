package org.chengcai.day04;

import java.util.Scanner;

/**
		*����5�Ľ׳ˣ�5!�Ľ����?
		*
		��ӡ�žų˷���
		
		*��ӡ���С�ˮ�ɻ�������ˮ�ɻ���ָ��ʱ��λ�������λ���ֵ������͵��ڸ�������
		*����153��-��ˮ�ɻ�������Ϊ153=1�����η�+5�����η�+3�����η�
		*
		*����̨��������κ�����
		*
		*��������1000�������в��ܱ�7����������֮��
		*
		*�ӿ���̨�����������֣����ñ��������������ֽ��л�����
		*����a����3��b����4��������aΪ4��bΪ3
		*
		*����ѭ����ʵ���������ݵ�������
		* 1-3+5- 7+9- 11+13......-99+101
		* 
		*����10000�������У�������Ϊǧ��֮����ÿ��һ�꣬���������Ϣ�����Ϊ�µı���,
		*����5���ȡ�ص�Ǯ�Ƕ���?
		*
 *
 */
public class Breakzuoye02 {
	public static void main(String[] args){
	//	����5�Ľ׳ˣ�5!�Ľ����?
		/*
		int s=1;
		for(int i=1;i<=5;i++){
			s=i*s;
		}System.out.println(s);
		*/
	//��ӡ�žų˷���
		/*
		for(int i=1;i<=9;i++){
		 for(int q=1;q<=i;q++){
			 System.out.print(i+"*"+q+"="+(i*q)+" ");
		 }System.out.println();
		}
		*/
	//*��ӡ���С�ˮ�ɻ�������ˮ�ɻ���ָ��ʱ��λ�������λ���ֵ������͵��ڸ�������
	//*����153��-��ˮ�ɻ�������Ϊ153=1�����η�+5�����η�+3�����η�	
    /*
     for(int i=100;i<=999;i++){
    	 int q=i/100;
    	 int w=(i-q*100)/10;
    	 int e=i-q*100-w*10;
    	 if(i==q*q*q+w*w*w+e*e*e){
    		 System.out.println(i);
    	 } 
     } 
     */
	/*	
     for(int i=100;i<=999;i++){
if(i==(i/100)*(i/100)*(i/100)+((i%100)/10)*((i%100)/10)*((i%100)/10)+(i%10)*(i%10)*(i%10)){
	System.out.println(i);
}
     }
		*/
    // *����̨��������κ�����		
	/*	
	for(int a=4;a>=1;a--){
		for(int b=1;b<=7;b++){
		if(b==a || b==8-a ){
			System.out.print("*");
		}else{
			System.out.print(" ");
		}
		}System.out.println("");
	}for(int i=2;i<=4;i++){
		for(int b=1;b<=7;b++){
		if(b==i||b==8-i){
			System.out.print("*");
		}else{
			System.out.print(" ");
		}
		} System.out.println("");	
	} */
		/*
	for(int i=6;i>=1;i--){
		for(int j=1;j<=11;j++){
		if(j>=i && j<=12-i ){
			System.out.print("*");
		}else{
			System.out.print(" ");
		}
		}System.out.println("");
	}
	*/
  //����̨
	/*	
  Scanner sc = new Scanner(System.in);
  System.out.println("�������һ������");
   int a = sc.nextInt();
	for(int i=a;i>=1;i--){
	for(int j=1;j<=a*2-1;j++){
	if(j>=i && j<=a*2-i){
		System.out.print("*");
	}else{
		System.out.print(" ");
	}
	}System.out.println("");
	}
	*/

	Scanner sc = new Scanner(System.in);
	System.out.println("�������һ������");
    int x = sc.nextInt();
  
	for(int a=x;a>=1;a--){
		for(int b=1;b<=x*2-1;b++){
		if(b==a || b==x*2-a ){
			System.out.print("*");
		}else{
			System.out.print(" ");
		}
		}System.out.println("");
	}for(int i=x/2;i<=x;i++){
		for(int b=1;b<=x*2-1;b++){
		if(b==i||b==x*2-i){
			System.out.print("*");
		}else{
			System.out.print(" ");
		}
		} System.out.println("");	
	} 
	//*��������1000�������в��ܱ�7����������֮��
	for(int i=1;i<=1000;i++){
		if(i%7!=0){
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
		
	}
}
