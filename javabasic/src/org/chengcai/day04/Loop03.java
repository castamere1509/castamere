package org.chengcai.day04;
/**
 * ѭ��03  forѭ��
 * 
 *for(���ʽ1;���ʽ2;���ʽ3){
 *
 *����
 *}
 */
public class Loop03 {
	public static void main(String[] args){
		//��ӡ1-100������
		int a=1;
		while(a<=100){
			System.out.println(a);
			a++;
		}
		
		//��ӡ1-100������
		//for�������������int i=1;�ڱ�ѭ��ȫ������ǰ��ֻ����һ��
		//i<=100,ÿ��ѭ������һ�Σ������ж�ѭ���Ƿ����
		//i++����ÿ��ѭ������������һ��
		//�жϡ������顷������++�����жϡ������顷������++�����жϡ�������...ֱ���жϲ�����
		for(int i=1;i<=100;i++){
			System.out.println(i);
		}
		
		//��ӡ1-100��ż��
		for(int i=1;i<=100;i++){
			if(i%2==0){
				System.out.println(i+"��ż��");
			}else{
				System.out.println(i+"������");
			}
		}
		
		//��ӡ1-2020�������
		for(int i=1;i<=2020;i++){
			if(i%4==0 && i%100 !=0 || i%400==0){
				System.out.println(i);
			}
		}
		
		//��ӡ1-2020�ж��ٸ�����
		int c=0;
		for(int i=1;i<=2020;i++){
			if(i%4==0 && i%100 !=0 || i%400==0){
				c++;
			}
		}System.out.println(c);
		
		//�������1-100
		for(int i=100;i>=1;i--){
				System.out.println(i);	
		}
		
		//��ӡ1-100�ĺ�
		int sum=0;
		for(int i=1;i<=100;i++){
			sum=sum+i;
		}System.out.println(sum);
			
	}

}
