package org.chengcai.day01;

public class Varable04 {
	
	public static void main(String[] args) {
		
		
		int station = 0;//��ʼվ��վ���Ϊ0
		int peno =6;//����������6����
		
		//��һվ
		station = station +1;
		peno = peno+1;
		System.out.println(station);//1
		System.out.println(peno);
		//�ڶ�վ
		station = station +1;
		peno = peno+3;
		peno = peno -1;
		System.out.println(station);//2
		System.out.println(peno);//9
		//����վ
		station =station +1;
		peno = peno +4;
		peno = peno-5;
		System.out.println(station);//3
		System.out.println(peno);//8
		
	}

}
