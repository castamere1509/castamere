package org.chengcai.day09;

public class Emp09 {

	private String empno;
	private String ename;
	private String job;
	private double sal;
	private double comm;
	
	
	
	
	
	//������н
	public double yearsal(){
		
		return (this.sal+this.comm)*12;//thisָ���ǵ������������ʵ������
	}

	
	//�����۹���
	public double kuanggong(double days){
		
		double kgkk=sal/30*days;		
		return kgkk;
	}


	public Emp09() {
	
	}


	public Emp09(String empno, String ename, String job, double sal, double comm) {
	
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
	
	
	
	
	
}
