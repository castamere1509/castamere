package org.chengcai.day05;

public class Arrayzuoye01 {
	public static void main(String[] args){
		
/*����3������,��һ�����������,�ڶ���������Ա�,���������������	
�����������ĳ�����һ����,�������Ա��������һһ��Ӧ�ġ�	
1.ȡ��С�Ƶ����䡣		
2.ͳ���ж��ٸ��е�
3.ͳ���ж��ٸ�Ů��
4.ͳ��23�����ϵ��м���
5.����25�����˭

С��,С��,С��,С��,С��,С��,С��
  ��  , Ů , Ů , �� , Ů  , �� , ��
22 , 21, 23,25, 32 , 18,20   */
	String[] s={"С��","С��","С��","С��","С��","С��","С��"};
	char[]  x={'��','Ů','Ů','��','Ů','��','��'};
	int[] g={22,21,23,25,32,18,20};
	//ȡ��С�Ƶ�����
	for(int i=0;i<s.length;i++){
		if(s[i]=="С��"){	
		System.out.println(g[i]);
		}
	}
	//2.ͳ���ж��ٸ��е�	
	int xxx=0;
	for(int xx=0;xx<x.length;xx++){
		if(x[xx]=='��'){	
			xxx++;
		}
	}	System.out.println(xxx);
		
	//3.ͳ���ж��ٸ�Ů��	
	int n=0;
	for(int xx=0;xx<x.length;xx++){
		if(x[xx]=='Ů'){	
			n++;
		}
	}	System.out.println(n);
		
	//4.ͳ��23�����ϵ��м���
	int l=0;
	for(int xx=0;xx<g.length;xx++){
		if(g[xx]>23){	
			l++;
		}
	}	System.out.println(l);		
	//5.����25�����˭
	for(int i=0;i<g.length;i++){
		if(g[i]>25){	
		System.out.println(s[i]);
		}
	}	
	}
}
