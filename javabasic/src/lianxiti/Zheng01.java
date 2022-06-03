package lianxiti;

public class Zheng01 extends Juxing01 {
	private double c;
	
	public void mj(){
		System.out.println("正方形的面积是"+c*4);
	}
	
	public void zc(){
		System.out.println("正方形的周长是"+c*4);
	}

	public Zheng01() {
	}

	public Zheng01(double c) {
		super();
		this.c = c;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	
	
	

}
