package lianxiti;

public class Juxing01 {


	private double c;
	private double k;
	
	public void zc(){
		System.out.println("矩形的周长是"+(c+k)*2);
	}
	
	
	
	public Juxing01() {
	}

	public Juxing01(double bc, double c, double k) {

		this.c = c;
		this.k = k;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getK() {
		return k;
	}

	public void setK(double k) {
		this.k = k;
	}
	
	
	
	
}
