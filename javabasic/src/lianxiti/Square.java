package lianxiti;


public class Square extends Rectangle {//���ࣺ������

	private double ttt;
	
	public void area(){
		System.out.println(getSide()*getSide()+"���������");
	}

	public double getTtt() {
		return ttt;
	}

	public void setTtt(double ttt) {
		this.ttt = ttt;
	}
	
	
	
}