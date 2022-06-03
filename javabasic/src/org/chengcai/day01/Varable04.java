package org.chengcai.day01;

public class Varable04 {
	
	public static void main(String[] args) {
		
		
		int station = 0;//初始站，站点号为0
		int peno =6;//公交车上有6个人
		
		//第一站
		station = station +1;
		peno = peno+1;
		System.out.println(station);//1
		System.out.println(peno);
		//第二站
		station = station +1;
		peno = peno+3;
		peno = peno -1;
		System.out.println(station);//2
		System.out.println(peno);//9
		//第三站
		station =station +1;
		peno = peno +4;
		peno = peno-5;
		System.out.println(station);//3
		System.out.println(peno);//8
		
	}

}
