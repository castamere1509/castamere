package lianxiti;

public class Rectangle {//���ࣺ����
	
	private double lenght;//��
	private double width;//��
	private double side;//�߳�
	
	public void perimeter(double a,double b){//�������ܳ�
		this.lenght=a;
		this.width=b;
		System.out.println((lenght+width)*2);
	}
	
	public void perimeter(double a){//�������ܳ�
		   this.side=a;
			System.out.println(side*4);
		}
	
	public void area(){
		System.out.println(lenght*width+"�������");
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
