package org.chengcai.day08;
//�����ڵ��÷�����ʱ�����趨����ֵ,�����������ı���



public class EmpTest06 {
	
	public static void main(String[] args){
		
		Emp05 ep = new Emp05();
		ep.setEname("smith");
		ep.setJob("salesman");
		ep.setSal(3000);
		ep.setComm(500);
		
		double ys=ep.yearsal();//��ep�����趨������ֵ,��������
		System.out.println("��н��"+ys+"Ԫ");
		
		double kgk=ep.kuanggong(180);
		System.out.println("�����ۿ�"+kgk+"Ԫ");
		
	
	}

}
