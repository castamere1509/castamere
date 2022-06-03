package org.chengcai.day04;
/**
 * 结合Scanner统计 int a有多少个因数
 */
import java.util.Scanner;

public class Loopzuoye02 {
	public static void main(String[] args){
	
	  	Scanner	w=new Scanner(System.in);
    	System.out.println("请输入要测试的数字");
    	int a=w.nextInt();
    	int d=1;
    	int c=0;
    	while(d<=a){
    		if(a%d==0){
    			c++;
    		}d++;
    	}System.out.println(a+"的因数有"+c+"个");
    	
    	
    	
	}
}

