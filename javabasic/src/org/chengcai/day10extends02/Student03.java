package org.chengcai.day10extends02;

public class Student03 extends Person01{
	
    private double score;
    
    public void study(){
    	System.out.println("�ú�����");
    }
    public void  eat(){
        System.out.println("ϲ��������");
     }
    
	public Student03() {
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
