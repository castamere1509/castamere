package org.chengcai.day04;

public class Breakzuoye {
	public static void main(String[] args){
		//��ӡһ�����ĵľ���
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==1 || i==5 ||j ==1 ||j==5){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}System.out.println("");
		}
		//ʹ��forѭ����ӡ����������
		/******
		 *****
		 ****
		 ***
		 **
		 */
		for(int i=1;i<=6;i++){
			for(int j=6;j>=i;j--){
				System.out.print("*");
			}System.out.println("");
		}
		//��ӡ����������
		
		for(int i=5;i>=1;i--){
			for(int j=1;j<=9;j++){
				if(j>=i && j<= 10-i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}System.out.println("");
		}
		//��ӡ���ĵ���������
		
		for(int i=4;i>=1;i--){
			for(int j=1;j<=7;j++){
				if(j==i || j ==8-i || i==1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}System.out.println("");
		}
		//��ӡ��������
		
		for(int i=4;i>=1;i--){
			for(int j=1;j<=9;j++){
				if(j==i || j==10-i || i==1 || j==i+1 && i==4){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}System.out.println("");
		}
		
		
		
		
		
		
		
		
		
	}

}
