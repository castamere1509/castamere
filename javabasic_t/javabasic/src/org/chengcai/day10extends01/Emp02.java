package org.chengcai.day10extends01;


//       ◊”¿‡Emp02  ºÃ≥–    ∏∏¿‡Person01
public class Emp02 extends Person01 {
	
	   private String id;
	   private double sal;
	   private double comm;
	   
	   

	  public void  eat(){
	        System.out.println("œ≤ª∂∫»øß∑»");
	     }

	   

	  public void work(){
		  System.out.println("…œ∞‡∫‹¿€");
	  }

	public Emp02() {

	}



	public Emp02(String id, double sal, double comm) {
		
		this.id = id;
		this.sal = sal;
		this.comm = comm;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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



	@Override
	public String toString() {
		return "Emp02 [id=" + id + ", sal=" + sal + ", comm=" + comm +  "]";
	}

	  
	  
}
