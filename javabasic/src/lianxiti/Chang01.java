package lianxiti;

public class Chang01 extends Juxing01 {
	
	private double c;
	private double k;
	
    public void mj(){
    	System.out.println("长方形面积是"+c*k);
    }
	
	public void zc(){
		System.out.println("长方形的周长是"+(c+k)*2);
	}
	
	
	public Chang01() {

	}

	public Chang01(double c, double k) {
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
