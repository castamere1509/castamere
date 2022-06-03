package org.chengcai.day08;

public class KongTiao07 {
	private double weigth;//重量
	private String brand;//品牌
	private int power;//功率
	private int wendu;//温度
	
	
	
	public KongTiao07() {
		
	}

	
	
	public KongTiao07(double weigth, String brand, int power, int wendu) {
		this.weigth = weigth;
		this.brand = brand;
		this.power = power;
		this.wendu = wendu;
	}



	public double getWeigth() {
		return weigth;
	}



	public void setWeigth(double weigth) {
		this.weigth = weigth;
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
		wendu=0;
		return wendu;
	}
	
	
	
	

}
