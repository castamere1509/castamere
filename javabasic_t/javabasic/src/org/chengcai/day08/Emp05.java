package org.chengcai.day08;

public class Emp05 {

	String empno;
	String ename;
	String job;
	double sal;
	double comm;
	
	//������н
	public double yearsal(){
		
		return (this.sal+this.comm)*12;//thisָ���ǵ������������ʵ������
	}

	
	//�����۹���
	public double kuanggong(double days){
		
		double kgkk=sal/30*days;		
		return kgkk;
	}
	
}
