package org.chengcai.day04;
/**
 * ��while ��ӡ1-100��555������
 * ��while ��ӡ1-100�ڰ���5����5�ı���������
 *��do...while��ӡ5�Ľ׳�
 *��do...whileͳ��1-100�ڰ���5����5�ı����������ж��ٸ�
 *���Scannerͳ�� int a�ж��ٸ�����
 */
public class Loopzuoye01 {
 public static void main(String[] args){
	int i=1;
	
	 while(i<=100 ){
		 if(555%i==0){
			 System.out.println(i);	
		 } i++; 
	 }
	// ��while ��ӡ����5����5�ı���������
	 i=1;
	 while(i<=100){
		 if(i%5==0 || (i+"").contains("5")){
			 System.out.println(i);
			
		 }i++;
		
	 }
	 
	 //��do...while��ӡ5�Ľ׳�
	int t =1;
	    i=1;
	 do{ 
		 t=i*t;
		 i++;
	 }while(i<=5);
	 System.out.println(t);
	 
	 //��do...whileͳ��1-100�ڰ���5����5�ı����������ж��ٸ�
	 
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
