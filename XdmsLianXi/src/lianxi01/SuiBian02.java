package lianxi01;

public class SuiBian02 {
	private int a;

	
	
	public void ad(int c){
		for(a=1;a<=c;a++){
		for(int b=1;b<=a;b++){
			System.out.print(a+"X"+b+"="+a*b+" ");
		}System.out.println("");
		}
	}

	public SuiBian02() {

	}

	public SuiBian02(int a) {
		this.a = a;

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}



}
