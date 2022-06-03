package org.chengcai.day09;

public class Friend07 {

	private String name;
	private char sex;
	private int age;
	private double height;
	private double weight;
	private String yanzi;
	

	public Friend07() {

	}

	public Friend07(String name, char sex, int age, double height, double weight, String yanzi) {		
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.yanzi = yanzi;
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




	public String getYanzi() {
		return yanzi;
	}




	public void setYanzi(String yanzi) {
		this.yanzi = yanzi;
	}




	public static void yueHui(String didian){
		System.out.println("今天去"+didian+"一起愉快的玩耍吧");
	}
	
	
}
