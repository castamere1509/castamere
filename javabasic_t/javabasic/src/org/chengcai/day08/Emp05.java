package org.chengcai.day08;

public class Emp05 {

	String empno;
	String ename;
	String job;
	double sal;
	double comm;
	
	//计算年薪
	public double yearsal(){
		
		return (this.sal+this.comm)*12;//this指的是调用这个方法的实例对象
	}

	
	//旷工扣工资
	public double kuanggong(double days){
		
		double kgkk=sal/30*days;		
		return kgkk;
	}
	
}
