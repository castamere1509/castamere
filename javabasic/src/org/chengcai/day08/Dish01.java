package org.chengcai.day08;
/**
 * ���������һ�����˼��
 * ʲô���ࣿ��ĳһ���������������ĳһ�������������
 * ʲô�Ƕ����Ǿ����һ��ʵ�����߱�������Ժͷ���
 * 
 * 
 * ��ô����һ���ࣿ
 * �Ѿ�̬�Ķ�������� ���ԡ�
 * �Ѷ�̬�Ķ�������� ������
 * 
 * 
 */
public class Dish01 {
   private  String name;//�˵�����
   private String caixi;//��ϵ
   private boolean isHunCai;//�ǲ��ǻ��
   private String type;//��˻����Ȳ�
   private String taste;//ζ��
   private double price;//�۸�
	
   public Dish01(){
	   
   }
   
   public Dish01(String name,String caixi,boolean isHunCai,String type,String taste,double price){
   
     this.name = name;
     this.caixi = caixi;
     this.isHunCai = isHunCai;
     this.type = type;
     this.taste = taste;
     this.price = price;
   }
   
   
   
	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCaixi() {
	return caixi;
}

public void setCaixi(String caixi) {
	this.caixi = caixi;
}

public boolean isHunCai() {
	return isHunCai;
}

public void setHunCai(boolean isHunCai) {
	this.isHunCai = isHunCai;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getTaste() {
	return taste;
}

public void setTaste(String taste) {
	this.taste = taste;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

	public static void byEat(){
		System.out.println("��ҧ���Һ���");
		//System.out.println(name);//���뱨��,��Ϊname��һ��ȫ��ʵ������,��̬�����޷�����
	}
	
}
