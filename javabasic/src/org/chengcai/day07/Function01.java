package org.chengcai.day07;
/**
 * �����������͵���
 * 
 * 1.��ʽ���ڷ�װһ�ξ����ض����ܵĴ���,���Ա���������
 * 2.����������Ҫ��:����Ȩ�ޡ�����ֵ���͡�����������Ρ�����
 * 3.return���������������صľ�������
 * 4.���������һ�������з���,��ô���������������return,���ҷ��صı����������ķ�������
 * 5.�����ĵ��ã����÷���ʹ��  ������(���) ������
 *               Ҫ�󣺷�������СдҪ��һ��
 *                   ��ε����ݱ���ͷ���������һ��,˳��ҲΪһ��
 * 6.ע��:�������������ʱ��,����ֵ����Ϊvoid����,����÷����޷���ֵ,�����в���ʹ��
 *       return xxxx;�����ڵ�����ɺ� û�н����ֵ������
 * 7.���������û����Σ����ǵ����ǲ���Ҫ�������
 * 
 */
public class Function01 {
	
//�з���ֵ����
	//�ӷ�����ķ���
	//public �Ƿ���Ȩ��
	//���д��static ����������Ǿ�̬����,�����д,��ô����һ���Ǿ�̬����
	public static int add(int a,int b){
		int c=a+b;
		return c;//��������������� int ����,���Ա����з���,���ҷ��صı�����int ����
	}
	//���һ����¼����
   //������     ��̬��	  ����String  ������login  ���usname��password
	public static String login(String usname,String password){
		if(usname.equals("xiaohua")&&password.equals("123456")){
			return"��¼�ɹ�";	
		}else{
			return"��¼ʧ��";
		}
	}
	
	//���һ���������㳤���ε���� :��*�� �����ø÷���
	public static double areas(double length,double width){
		
		return length * width;
	}
	
//�޷���ֵ����
	//���һ���������㳤���ε����: ��*��  �����ø÷���
	public static void areas1(double length,double width){
		//return length * width;//���д��뱨��,��Ϊ������void,���޷���ֵ��
		System.out.println(length * width);
	}
	
//�޷�������η�������
	//���һ������,���㳤��Ϊ10,���Ϊ20�ľ������;
	public static void  areas2(){//�������û�����,Ҳû�з���,����ִ��10*20
	   System.out.println(10*20);
	}
	
//�з��������,�÷��������ù̶�����1
 public static int add1(){
	 int c=1;
	 return c;
 }
 
 //-------------------------�����Ƿ���,������ʹ��main��������-------------------------------
	public static void main(String[] args){
		
	//�����з���ֵ����	
		//��main�е���add����,�������1��2
		int i=add(1,2);
		System.out.println(i);//3
		
		//��main�����е���login�������������"xiaohua","123456"
		String str=login("xiaohua","123456");
		System.out.println(str);//��¼�ɹ�
		
		String str1=login("123456","xiaohua");
		//��¼ʧ��,��Ϊ��123456 �����usname,��xiaohua��ֵ��password
		System.out.println(str1);
		
		System.out.println(areas(3.6,1.7));
		
		//�����޷���ֵ����
		areas1(3.5,1.7);//��ͬ��System.out.println(length*width)
		//double dbe = areas1(3.5,1.7);//���д��뱨��,���õķ����޷���ֵ,û��ֵ��dbe,���Ա���
		
		//��������η���
		areas2();//��ͬ��System.out.println(10*20);
		
		//�����з�������η���
		int j=add1();
		System.out.println(j);//1
	}

}
