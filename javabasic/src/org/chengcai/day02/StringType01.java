package org.chengcai.day02;
/**
 * Java�г���8�ֻ����������⣬����������������
 * String���;���һ���������ͣ���������Ͳ����ַ���
 *
 */
public class StringType01 {
public static void main(String[] args) {
	
String str1 = "����";
System.out.println(str1);

//�ַ������������κ����ͺ��ַ�����Ӷ���ƴ�ӣ�������Ӻ������Ϊ�ַ�������
//ע������ƴ�Ӻ����������
String str2 ="�������죬��������";
String str3 =str1+str2;
System.out.println(str3);

String str4="���ǰ༶��"+43+"��";
System.out.println(str4);

System.out.println("1+1");//1+1
System.out.println("1"+1);//��ӡ����һ���ַ������͵�11
System.out.println("1"+1+1);//111
System.out.println(1+1+"1");//21
System.out.println(1+1+""+1);//21
System.out.println(""+1+1);//11
//���������תΪ�ַ���������ֱ�Ӻ�""���
System.out.println(""+1*2);//2
System.out.println(""+(1+1));//2

int count = 2;
System.out.println("��ǰ"+count+"����");//��ǰ������
System.out.println("��ǰ"+"count"+"����");//��ǰcount����

//ƴ��a+b�Ľ��
int a =10;
int b =30;
System.out.println(a+"+"+b+"�Ľ����:"+(a+b));
  //               10 +  30 �Ľ����:    40

//�ַ�������API(����)
String str = "һ������ѧjava��!!!";
String str5 =new String("adsdasdasd");//����һ��String���͵Ķ���

//1��.isEmpty()���������ж��ַ����Ƿ�Ϊ�գ�����ǿյķ���true,������ǿյķ���false

boolean bn =str.isEmpty();//�����൱��1�����ʽ,��ʾstr�ǿյ�
System.out.println(bn);

//2��.length()���������ַ����ĳ���
int i = str.length();
System.out.println("str�ĳ�����:"+i);

//3��.charAt(int��������) ����ĳ���±�λ�õ��ַ���
//�±�λ�ô�0��ʼ���÷������Ի�ȡ���±�λ�ö�Ӧ���ַ���
char cr1 = str.charAt(0);//�±�����Ϊ0����ʾ��ȡ�ַ����ĵ�һ���ַ�
System.out.println(cr1);
char cr2 = str.charAt(3);
System.out.println(cr2);
//��ȡһ�κܳ��ܳ����ַ��������һλ�ַ�
char cr3 =str.charAt(str.length()-1);
System.out.println(cr3);
System.out.println(str.charAt(str.length()-1));

//4��.contains(String��������)�����ж��ַ����Ƿ����ĳЩ����
str.contains("java");
boolean bn2 = str.contains("java");//����true
System.out.println(bn2);
boolean bn3 =str.contains("");//����true,��Ϊ���е��ַ������������ַ�
System.out.println(bn3);

//5��.indexOf(String��������) ��������ָ���ַ����ڵ�һ�γ��ֵ��±�

 int j = str.indexOf("java");//java�ĵ�һ���ַ���str�ַ����г��ֵ�λ����6���±�
 System.out.println(j);//6

 //6��.substring(int��������) �ַ����Ľ�ȡ
 
 String str6 =str.substring(2);//���ַ�����2���±꿪ʼ��ȡ��һֱ�����ĩβΪֹ
 System.out.println(str6);//����ѧjava��!!!
 
 String str7=str.substring(6,10);//��6���±꿪ʼ,��10�Ž���,������10��λ
 System.out.println(str7);//java
 
 //��ϰ��ȡstr�е� ���
 int str8 =str.indexOf("���");
 System.out.println(str8);
 
 String str9 =str.substring(2,4);//��һ��
 System.out.println(str9);
 
System.out.println(str.substring(2,4));//�ڶ���
 
System.out.println(str.substring(str.indexOf("��"),str.indexOf("��")+1));//������

String str10 = str.substring(str8,str8+2);
System.out.println(str10);//������

//��ϰ����һ���ַ����������ˣ�username:xiaohua;token;DLAJKLXalDLAJALALKSF;age:3}
//���ȡtoken��ֵ��ע��token��user/age��ֵ���ȿ���ÿ�η����仯
//.indexOf(Stiring s);   .substring(int i,int j);
String sti = "username:xiaohua;token;DLAJKLXalDLAJALALKSF;age:3";
int ti1 =sti.indexOf("token");
System.out.println(ti1+6);
int ti2 =sti.indexOf("age");
System.out.println(ti2-1);
String ti3=sti.substring(23,43);
System.out.println(ti3);//��һ��

System.out.println(sti.substring(sti.indexOf("token")+6,sti.indexOf("age")-1));//�ڶ���
String ti4=sti.substring(ti1+6,ti2-1);
System.out.println(ti4);//������


}

}
