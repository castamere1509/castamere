package org.chengcai.day04;
/**
 * ���Scannerͳ�� int a�ж��ٸ�����
 */
import java.util.Scanner;

public class Loopzuoye02 {
	public static void main(String[] args){
	
	  	Scanner	w=new Scanner(System.in);
    	System.out.println("������Ҫ���Ե�����");
    	int a=w.nextInt();
    	int d=1;
    	int c=0;
    	while(d<=a){
    		if(a%d==0){
    			c++;
    		}d++;
    	}System.out.println(a+"��������"+c+"��");
    	
    	
    	
	}
}

