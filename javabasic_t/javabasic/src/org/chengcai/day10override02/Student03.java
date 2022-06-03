package org.chengcai.day10override02;

public class Student03 extends Person01 {

	private double score;	
	public void study(){
		System.out.println("ºÃºÃÌý¿Î");
	}

    public void  eat(){
        System.out.println("Ï²»¶³ÔÀ±Ìõ"+this.getName());
     }

	public Student03() {

	}

	public Student03(int age, String name, String sex) {
		super(age, name, sex);
		
	}

	public Student03(double score) {

		this.score = score;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
    




	
	
	
}
