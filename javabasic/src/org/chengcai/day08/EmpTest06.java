package org.chengcai.day08;
//对象在调用方法的时候会把设定属性值,赋予给类里面的变量



public class EmpTest06 {
	
	public static void main(String[] args){
		
		Emp05 ep = new Emp05();
		ep.setEname("smith");
		ep.setJob("salesman");
		ep.setSal(3000);
		ep.setComm(500);
		
		double ys=ep.yearsal();//将ep所有设定的属性值,传给方法
		System.out.println("年薪是"+ys+"元");
		
		double kgk=ep.kuanggong(180);
		System.out.println("旷工扣款"+kgk+"元");
		
	
	}

}
