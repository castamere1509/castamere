package org.chengcai.day08;

public class Emp05 {
	
	private String empno;
	private String ename;
	private String job;
	private double sal;
	private double comm;
	
	
	
	public Emp05() {
		
	}



	public Emp05(String empno, String ename, String job, double sal, double comm) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.comm = comm;
	}

	
	
	public String getEmpno() {
		return empno;
	}



	public void setEmpno(String empno) {
		this.empno = empno;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public String getJob() {
		return job;
	}



	public void setJob(String job) {
		this.job = job;
	}



	public double getSal() {
		return sal;
	}



	public void setSal(double sal) {
		this.sal = sal;
	}



	public double getComm() {
		return comm;
	}



	public void setComm(double comm) {
		this.comm = comm;
	}



	//计算年薪
	public double yearsal(){
		return(this.sal+this.comm)*12;//this指的是调用这个方法的实例对象
	}
	
	//旷工扣工资
	public double kuanggong(double days){
		
		double kgkk=sal/30*days;
		return kgkk;
		
	}

}
