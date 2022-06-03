package org.chengcai.day10extends01;

public class Student01 extends Person01{
    private double score;
    public void study(){
    	System.out.println("≥…º®∫‹‘„");
    }
	public Student01() {
	}
	public Student01(double score) {
		this.score = score;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
}
