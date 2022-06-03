package org.chengcai.day05;

public class Arrayzuoye01 {
	public static void main(String[] args){
		
/*声明3个数组,第一个数组放姓名,第二个数组放性别,第三个数组放年龄	
这个三个数组的长度是一样的,姓名、性别和年龄是一一对应的。	
1.取出小黄的年龄。		
2.统计有多少个男的
3.统计有多少个女的
4.统计23岁以上的有几个
5.大于25岁的是谁

小红,小橙,小黄,小绿,小青,小蓝,小紫
  男  , 女 , 女 , 男 , 女  , 男 , 男
22 , 21, 23,25, 32 , 18,20   */
	String[] s={"小红","小橙","小黄","小绿","小青","小蓝","小紫"};
	char[]  x={'男','女','女','男','女','男','男'};
	int[] g={22,21,23,25,32,18,20};
	//取出小黄的年龄
	for(int i=0;i<s.length;i++){
		if(s[i]=="小黄"){	
		System.out.println(g[i]);
		}
	}
	//2.统计有多少个男的	
	int xxx=0;
	for(int xx=0;xx<x.length;xx++){
		if(x[xx]=='男'){	
			xxx++;
		}
	}	System.out.println(xxx);
		
	//3.统计有多少个女的	
	int n=0;
	for(int xx=0;xx<x.length;xx++){
		if(x[xx]=='女'){	
			n++;
		}
	}	System.out.println(n);
		
	//4.统计23岁以上的有几个
	int l=0;
	for(int xx=0;xx<g.length;xx++){
		if(g[xx]>23){	
			l++;
		}
	}	System.out.println(l);		
	//5.大于25岁的是谁
	for(int i=0;i<g.length;i++){
		if(g[i]>25){	
		System.out.println(s[i]);
		}
	}	
	}
}
