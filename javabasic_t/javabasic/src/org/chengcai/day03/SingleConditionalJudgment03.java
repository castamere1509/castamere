package org.chengcai.day03;

/*
 * ������֧���
 * if(����){
 *  ���飬���������Ϊtrue,��ִ�У����Ϊfalse,��ִ��
 * }
 * 
 */

public class SingleConditionalJudgment03 {
	
	public static void main(String[] args) {
		int age =30;
		//����֧���
		if(age>=30){			
			System.out.println("��ʼ������");
		}
		
		String username ="xiaohua";
		int passwd =1234;		
		String shuruun ="xiaohua";
		int shurumm =1234;
		if(shuruun.equals(username) && shurumm == passwd ){
			System.out.println("��½�ɹ�");			
		}
		
		
		String tianqi ="������";
		if(tianqi.equals("������")){
			System.out.println("�ؼ����·�");
			
		}
		
		
	}
	
	
}
