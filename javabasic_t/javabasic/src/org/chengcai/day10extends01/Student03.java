package org.chengcai.day10extends01;

public class Student03 extends Person01 {

	private double score;
	
	public void study(){
		System.out.println("ºÃºÃÌý¿Î");
	}

	public Student03() {
		
	}

	public Student03(double score) {
		super();
		this.score = score;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}


	
	
	
}
