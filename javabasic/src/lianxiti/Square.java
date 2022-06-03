package lianxiti;


public class Square extends Rectangle {//子类：正方形

	private double ttt;
	
	public void area(){
		System.out.println(getSide()*getSide()+"正方形面积");
	}

	public double getTtt() {
		return ttt;
	}

	public void setTtt(double ttt) {
		this.ttt = ttt;
	}
	
	
	
}