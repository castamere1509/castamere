package org.chengcai.day03;
/**
 * 
 * ˫��֧���
 *
 *if(����){
 * ����1,���if��������������true,�����и����
 * }else{
 * ����2,���if��������������false,�����и����
 * }
 * 
 * ���֧��䣺
 *
 * if(����1){
 * ����1
 * }else if(����2){
 * ����2
 * }else if(����3){
 *  ����3
 * }else if(����4){
 *  ����4
 * }else{
 *  ����5
 * }
 * 
 * 
 * 
 */
public class MultipleConditionalJudgment {
	public static void main(String[] args){
		int a =20;
		int b =30;
		if(a>b){
			System.out.println("a��b��");
		}else{
			System.out.println("a��С�����");
		}
		
//��¼����		
		 String username = "xiaohua";
		   int passwd = 1234;
		   
		   String shuruun ="xiaohua";
		   int shurumm = 12345;
		   if (shuruun.equals(username) && shurumm == passwd){
			   System.out.println("��¼�ɹ�");
		   }else{
			   System.out.println("�û��������������,��¼ʧ��");
		   }
		
//���Գɼ�����
		 double score =50;
		 if(score>=60){
			 System.out.println("�ɼ��ϸ�");
		 }else{
			 System.out.println("������");
		 }

//���Գɼ�����
		score =80;
		if(score>=0 && score<60){
			System.out.println("������");
		}else if(score >=60 && score <80){
			System.out.println("�ɼ�����");
		}else if(score >=80 && score<100){
			System.out.println("�ɼ�����");
		}else if(score ==100){
			System.out.println("�ǳ�����");
		}else{
			System.out.println("�ɼ��쳣");
		}
		
		
	}

}
