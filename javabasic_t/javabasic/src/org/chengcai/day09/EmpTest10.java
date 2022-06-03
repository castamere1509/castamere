package org.chengcai.day09;
//对象在调用方法的时候会把设定属性值，赋予给类里面的变量


public class EmpTest10 {

	public static void main(String[] args) {
		
		Emp09 ep =new Emp09();
		ep.setEname("smith");
		ep.setJob("salesman");
		ep.setSal(3000);
		ep.setComm(500);
		
		double ys=ep.yearsal();//将ep所有设定的属性值，传给方法
		System.out.println("年薪是"+ys+"元");
		
		double kgk=ep.kuanggong(180);
		System.out.println("旷工扣款"+kgk+"元");
		
		//把smith工资+1000		
		System.out.println(ep.getSal()+1000);
		
		ep.setSal(ep.getSal()+1000);//给smith的工资重新赋值
		System.out.println(ep.getSal());
	}
	
	
	
}
