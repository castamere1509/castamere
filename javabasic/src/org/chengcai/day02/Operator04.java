package org.chengcai.day02;
/**
 * java�е������:+=, -= ,*=,/= ,%= ,++ ,--
 * 
 *
 */
public class Operator04 {
	public static void main(String[] args){
	
	int a = 10;
	a+=1; //Ϊa����1���൱��a=a+1;
	a-=1; //Ϊa�Լ�1���൱��a=a-1;	
	a*=1; //Ϊa�Գ�1���൱��a=a*1;
	a/=1; //Ϊa�Գ�1���൱��a=a/1;
	a%=1; //Ϊa��ȡ��1���൱��a=a%1;
	System.out.println(a);//0
	
	int b = 10;
	b++; //�൱��b+=1 ���� b = b+1
	++b; //�൱��b+=1 ���� b = b+1	
	b--; //�൱��b-=1 ���� b = b-1
	--b; //�൱��b-=1 ���� b = b-1
	System.out.println(b);//10
	
	//b++ �� ++b ������
	b =10;
	int c =b++;//��++,b++����Ȱ�b�ĸ�������ʽ,��Ϊb��1
	System.out.println(c);//10
	System.out.println(b);//11
	
	b =10;
	int d =++b;//ǰ++,++b����Ȱ�b��ֵ+1,�ٰ�b��ֵ��������ʽ
	System.out.println(d);//11
	System.out.println(b);//11
	
	//b-- �� --b 
	b =10;
	int f =b--;//��--,b--����Ȱ�b�ĸ�������ʽ,��Ϊb��1
	System.out.println(b);//9
	System.out.println(f);//10
	
	b =10;
	int g =--b;//ǰ--,--b����Ȱ�b��ֵ-1,�ٰ�b��ֵ��������ʽ
	System.out.println(b);//9
	System.out.println(g);//9
	
	int i =10;
	System.out.println((i++)+(++i)-(--i));//11
	//                  10    12     11
	System.out.println(i);//11
	i = 10;
	System.out.println((++i)+(i--)-(i++)-(++i));//0
	//                  11    11    10    12
	System.out.println(i);//12
	
	i = 10;
	int it =i++ + ++i - --i + ++i - --i;//12
	//       10   12    11    12    11
	System.out.println(it);//12
	
	
	
	}

}
