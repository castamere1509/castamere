package org.chengcai.day08;

public class Friend03 {
	
	String name;
	private char sex;
	private int age;
	private double height;
	private double weight;
	private String yanzhi;
	
	
	
	public Friend03() {
		
	}

	
	public Friend03(String name, char sex, int age, double height, double weight, String yanzhi) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.yanzhi = yanzhi;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public char getSex() {
		return sex;
	}


	public void setSex(char sex) {
		this.sex = sex;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getYanzhi() {
		return yanzhi;
	}


	public void setYanzhi(String yanzhi) {
		this.yanzhi = yanzhi;
	}


	public static void yueHui(String didian){
		System.out.println("今天去"+didian+"一起愉快的玩耍吧");
		
		
		
	}

}
