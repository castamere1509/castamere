package org.chengcai.day07;
/**
 * 
 *  ����Ȩ��             ��   ��  ����  ������
  ��������  public        ��   ��    ��     ��          �����κ��˶��ǿ��õģ�
   �������� protecte  ��   ��   ��      �������� ���̳е�����Է����Լ���privateһ����Ȩ�ޣ�
   �������� default       ��   ��    ��       �������� ��������Ȩ�ޣ������������ھ��ɱ����ʣ�
   �������� private        ��   ��    ��       �������� �����͵��ڲ�����֮����κ��˶����ܷ��ʵ�Ԫ�أ�

 *           
 *           
 *           
 *           
 */

public class Function03 {
	//����Ȩ�޷���
	public static int add(int a,int b){
		return a+b;
	}
	
	//˽��Ȩ�޷���
	private static int adds(int a,int b){
		return a+b;
	}
	
	public static void main(String[] args) {
		
		int i =add(1,2);
		System.out.println(i);
		
		
		i = adds(1,2);//ͬ���£��ɵ���privateȨ�޷���
		System.out.println(i);
	}
	

}
