package org.chengcai.day09;
//�����ڵ��÷�����ʱ�����趨����ֵ�������������ı���


public class EmpTest10 {

	public static void main(String[] args) {
		
		Emp09 ep =new Emp09();
		ep.setEname("smith");
		ep.setJob("salesman");
		ep.setSal(3000);
		ep.setComm(500);
		
		double ys=ep.yearsal();//��ep�����趨������ֵ����������
		System.out.println("��н��"+ys+"Ԫ");
		
		double kgk=ep.kuanggong(180);
		System.out.println("�����ۿ�"+kgk+"Ԫ");
		
		//��smith����+1000		
		System.out.println(ep.getSal()+1000);
		
		ep.setSal(ep.getSal()+1000);//��smith�Ĺ������¸�ֵ
		System.out.println(ep.getSal());
	}
	
	
	
}
