package org.chengcai.day07;
/**
 * �����������͵���
 * 
 *   1����ʽ���ڷ�װһ�ξ����ض����ܵĴ��룬���Ա���������
     2������������Ҫ�أ�����Ȩ�ޡ�����ֵ���͡� ����������Ρ�����
     3��return���������������صľ������ݡ�
 *   4.���������һ�������з��أ���ô���������������return������return�ı����������ķ�������
 *   5.�����ĵ��ã����÷���ʹ��   ������(���) ������
 *                 Ҫ�󣺷�������СдҪ��һ��
 *                       ��ε����ݱ���ͷ���������һ��,˳��ҲΪһ��
 *   6.ע�⣺�������������ʱ�򣬷���ֵ����Ϊvoid���ͣ�����÷����޷���ֵ�������в���ʹ��
 *           return XXXX;�����ڵ�����ɺ�  û�н����ֵ������
 *   7.  ���������û����Σ����ǵ����ǲ���Ҫ�������              
 */

public class Function01 {
	
//�з���ֵ����
	//�ӷ�����ķ���
	//public �Ƿ���Ȩ��
	//���д��static ����������Ǿ�̬�����������д����ô����һ���Ǿ�̬����
	public static int add(int a,int b){
		int c=a+b;
		return c;//��������������� int ���ͣ����Ա����з��أ����ҷ��صı�����int ����		
	}
	
	//���һ����¼����
	//����   ��̬��  ����String  ������login  ���username��password
	public static String login(String username,String password){
		if(username.equals("xioahua")&&password.equals("123456")){
			return "��¼�ɹ�";
		}else{
			return "��¼ʧ��";
		}
		
	}
	
	//���һ���������㳤���ε��������*�� �����ø÷���
	public static double areas(double length,double width){
		
		return length * width;
	}
	
//�޷���ֵ����
	//���һ���������㳤���ε��������*�� �����ø÷���
	public static void areas1(double length,double width){
		//return length * width;//���д��뱨����Ϊ������void ,���޷���ֵ��
		System.out.println(length*width);
	}
	
//�޷�������η�������
	//���һ�����������㳤��Ϊ10�����Ϊ20�ľ��������
    public static void 	areas2(){//�������û����Σ�Ҳû�з��أ�����ִ��10*20    	
    	System.out.println(10*20);
    }
		
 //�з�������� ,�÷��������ù̶�����1
    public static int add1(){
		int c=1;
		return c;
    }
    
 //-----------------------�����Ƿ�����������ʹ��main��������--------------------------------------------------------   
	public static void main(String[] args) {


		
	//�����з���ֵ����
		//��main�����е���add�������������1��2
		int i=Function01.add(1,2);
		System.out.println(i);//3
		
		//��main�����е���login�������������"xioahua","123456"
		String str=Function01.login("xioahua","123456");
		System.out.println(str);//��¼�ɹ�
		
		String str1=Function01.login("123456","xioahua");
		//��¼ʧ��,��Ϊ��123456 �����username ����xioahua��ֵ��password
		System.out.println(str1);
				
		System.out.println(areas(3.6,1.7));
	
		//�����޷���ֵ����
		areas1(3.5,1.7);//��ͬ��System.out.println(length*width)		
		//double dbe = areas1(3.5,1.7);//���д��뱨�����õķ����޷���ֵ��û��ֵ��dbe,���Ա�����
		
		
		//��������η���
		areas2();//��ͬ��System.out.println(10*20);
		
		//�����з�������η���
		int j=add1();
		System.out.println(j);//1
	}
	
	
	

}
