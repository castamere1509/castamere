package org.chengcai.day08;

import java.util.Arrays;

import org.chengcai.day07.Functionlianxi;

public class LianxiTest001 {
	
	public static void main(String[] args){
	LianXi001 dd =new LianXi001();
	dd.setName("�׿���");
	dd.setAge(500);
	dd.setCwname("��ɯ");
	dd.setDj(100);
	dd.setSex('��');
	dd.setZhiye("������");
	dd.setZy("����");
	dd.setZz("������");
	
	dd.kh();
		
	LianXi002 ss =new LianXi002();
	ss.setName("���ﰲ");
	ss.setCwname("������");
	ss.setDj(100);
	ss.setSex('��');
	ss.setAge(45);
	ss.setZhiye("��ս");
	ss.setZz("����");
	ss.setZy("����");
	
	ss.kh();
	
	Functionlianxi ee = new Functionlianxi();
	int[] tt ={9,6,4,3,7,2,8,1,5};
	Arrays.sort(tt);
	System.out.println(Arrays.toString(tt));
	
	int[] tt1={4,9,2,1,0,2,0,6,3};
	int[] tt2=ee.arraySort(tt1);
	System.out.println(Arrays.toString(tt2));
	
	for(int i=1;i<=4;i++){
	  for(int j=1;j<=i;j++){
		 
		  System.out.print("*");
	  }System.out.println(" ");
	}
	
	for(int i=4;i>=1;i--){
		for(int j=1;j<=7;j++){
		 if(j==i || j<i*2-1 || i==1){
			 System.out.print("*");
		 }else{
			 System.out.println(" ");
		 }
			
		}System.out.println("");
	}
	
	
	
	
	
	
		
	}

}
