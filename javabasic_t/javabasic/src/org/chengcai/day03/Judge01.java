package org.chengcai.day03;

/**
 *��ϵ����� <С�ڣ�  >���ڣ�  !=�����ڣ�  >=���ڵ��ڣ�  <=С�ڵ��ڣ�  ==���ڣ��жϷ������ߵ������Ƿ���ȣ�
 * 
 * ���Ϲ�ϵ������ŵó��Ľ������boolean���ͣ�Ҫô��true ������Ҫô��false ������
 *
 * �����String����ȡ���Ա�ʹ��  A.equals(B)  ����
 *
 */

public class Judge01 {
       public static void main(String[] args) {
    	   
    	   int a = 10;
    	   int b = 20;
    	   boolean bo1 = a>b;
    	   System.out.println(bo1);//false
    	   boolean bo2 = a<b;
	       System.out.println(bo2);//true
	       boolean bo3 = a>=b;
	       System.out.println(bo3);//false
	       boolean bo4 = a<=b;
	       System.out.println(bo4);//true
	       boolean bo5 = a!=b;
	       System.out.println(bo5);//true
	       boolean bo6 = a==b;
	       System.out.println(bo6);//false
	       
	       //String���ͱȽ�
	       String str="10";
	      // boolean bo7 = a==str; �ᱨ����Ϊa��int���ͣ�str ��String���ͣ��޷��Ƚ�
	       String str1 ="abcada456��������465--da";
	       String str2 ="abdada4545---��sdsa";
	       boolean bo7 = str1 == str2;//һ��Java������ô�Ƚ�String���ͣ���Ҫ����д
	       System.out.println(bo7);//false
	       
	       //һ��ʹ��  �ַ���.equals(���Ƚϵ�����),����������ַ����Ա��κ�����
	       boolean bo8 =str1.equals(str2);
	       System.out.println(bo8);//false
	       
	       
}

	  
	
	
}
