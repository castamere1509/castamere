package org.chengcai.day08;
//�����ڵ��÷�����ʱ�����趨����ֵ�������������ı���


public class EmpTest06 {

	public static void main(String[] args) {
		
		Emp05 ep =new Emp05();
		ep.ename="smith";
		ep.job="salesman";
		ep.sal=3000;
		ep.comm=500;
		
		double ys=ep.yearsal();//��ep�����趨������ֵ����������
		System.out.println("��н��"+ys+"Ԫ");
		
		double kgk=ep.kuanggong(180);
		System.out.println("�����ۿ�"+kgk+"Ԫ");
			
		
	}
	
	
	
}
