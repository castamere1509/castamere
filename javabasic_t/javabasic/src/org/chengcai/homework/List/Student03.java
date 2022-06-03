package org.chengcai.homework.List;

public class Student03 extends Person01 {

	private double score;
	
	public void study(){
		System.out.println("ºÃºÃÌý¿Î");
	}



  



	public Student03() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student03(int age, String name, String sex,double score) {
		
		
		super(age, name, sex);
		this.score=score;
		// TODO Auto-generated constructor stub
	}

   





	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}



	@Override
	public String toString() {
		return "Student03 [score=" + score + ", getAge()=" + getAge() + ", getName()=" + getName() + ", getSex()="
				+ getSex() + "]";
	}


	
	
	
}
