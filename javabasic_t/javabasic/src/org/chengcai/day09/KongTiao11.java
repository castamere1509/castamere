package org.chengcai.day09;

public class KongTiao11 {

	private double weight;//重量
	private String brand;//品牌
	private int power;//功率
	private int wendu;//温度
	   
	
	   public KongTiao11() {
		
	}
	   
	   
	public KongTiao11(double weight, String brand, int power, int wendu) {
		
		this.weight = weight;
		this.brand = brand;
		this.power = power;
		this.wendu = wendu;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	
	
	public int add(){
		   return wendu++;
	   }
	   public int minus(){
		   return wendu--;
	   }
	   public int on(){
		   wendu =25;
		   return wendu;		   
	   }
	   public int off(){
		   wendu =0;
		   return wendu;		   
	   }


	public double getWeight() {
		return weight;
	}


	

	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getPower() {
		return power;
	}


	public void setPower(int power) {
		this.power = power;
	}


	public int getWendu() {
		return wendu;
	}


	public void setWendu(int wendu) {
		this.wendu = wendu;
	}
	
	   
	   
}
