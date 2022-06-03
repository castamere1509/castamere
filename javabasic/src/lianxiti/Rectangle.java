package lianxiti;

public class Rectangle {//父类：矩形
	
	private double lenght;//长
	private double width;//宽
	private double side;//边长
	
	public void perimeter(double a,double b){//长方形周长
		this.lenght=a;
		this.width=b;
		System.out.println((lenght+width)*2);
	}
	
	public void perimeter(double a){//正方形周长
		   this.side=a;
			System.out.println(side*4);
		}
	
	public void area(){
		System.out.println(lenght*width+"矩形面积");
	}
	
	
	
	public Rectangle() {
		
	}
	
	public Rectangle(double lenght, double width, double side) {
	
		this.lenght = lenght;
		this.width = width;
		this.side = side;
	}
	
	public double getLenght() {
		return lenght;
	}
	
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
		
		
	
	
	
	}
