package org.chengcai.day02;
/**
 * java中的运算符：+= , -= ,*= , /= ,%= ,++ ,--
 *
 *
 */

public class Operator04 {
	
	  public static void main(String[] args) {
		
		  int a = 10;
		  a+=1; //为a自增1，相当于a = a+1;
		  a-=1;//为a自减1，相当于a = a-1;
		  a*=1;//为a自乘1，相当于a = a*1;
		  a/=1;//为a自除1，相当于a = a/1;
		  a%=1;//为a自取余1，相当于a = a%1
		  System.out.println(a);//0
		  
		  int b = 10;
		  b++;//相当于b+=1  或者 b = b+1
		  ++b;//相当于b+=1  或者 b = b+1
		  b--;//相当于b-=1  或者 b = b-1
		  --b;//相当于b-=1  或者 b = b-1
		  System.out.println(b);
		  
		//b++ 和 ++b 的区别
		  b =10;
		  int c =b++;//后++，b++会把先把b的值赋予给表达式，在为b加1
		  System.out.println(c);//10
		  System.out.println(b);//11
		  
		  
		  b = 10;
		  int d = ++b;//前++， ++b会先把b的值+1，再把b的值赋予给表达式
		  System.out.println(d);
		  System.out.println(b);
		  
		  //b-- 和 --b
		  b = 10;
		  int f =b--;//后--    b-- 会把先把b的值赋予给表达式，在为b减1
		  System.out.println(f);//10
		  System.out.println(b);//9
		  
		  b = 10;
		  int g = --b;//前--   --b会先把b的值减1，再把b的值赋予给表达式
		  System.out.println(g);//9
		  System.out.println(b);//9
		  
		  int i =10;
		  System.out.println((i++)+(++i)-(--i));//11
		  //                  10     12    11
		  System.out.println(i);//11
		  i =10;
		  System.out.println((++i)+(i--)-(i++)-(++i));//0
		  //                   11    11    10    12
		  System.out.println(i);//12
		  
		  i =10;
		  int it =i++ + ++i - --i + ++i - --i;//12
		  //       10   12    11    12    11
		  System.out.println(it);
		  
		  //练习
		  //int i =10;  i =i+++i+i---i 求i的值
		  i =10;
		  i=i + ++i +i- --i;
		  // 10 11  11   10
		  //10  11  11   10
		  System.out.println(i);
	}

}
