package org.chengcai.day12List;

public class Student03 extends Person01 {

	private int score;
	
	public void study(){
		System.out.println("ºÃºÃÌý¿Î");
	}

	public Student03() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student03(String name,int age, String sex,int score) {
		super(age, name, sex);
		// TODO Auto-generated constructor stub
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student03 [score=" + score + ", getAge()=" + getAge() + ", getName()=" + getName() + ", getSex()="
				+ getSex() + "]";
	}

}
