package org.chengcai.day01;
/**
 * 
 * 变量的8种基本类型
 *
 */
public class VariableType05 {
public static void main(String[] args) {
	//保存整数的四种类型：byte  short  int  long
	byte bt = 127;//byte用来保存整数，保存的范围是在-128到127之间
	short st =32000;//short用来保存整数，保存的范围在正负三万左右
	int i =2100000000;//int用来保存整数，保存的值范围在正负21亿左右
	long lg =100000000000000L;//保存整数，在整数类型后面加L或者l,代表改数字为long类型
	
	//注意：java中所有的整数字面默认int类型，在赋值的时候会进行自动类型转换
	//注意：在java中当到了某个类型的最高值时再加1，那么会变成最小值
	//声明为long 类型的时候需要在数字后面加大写的L或者小写的l
	
	//保存小数的有两种 float  ,double
	
	float f1=3.5F;//如果数字为小数类型，默认是double类型，所以声明float声明的时候必须加F或者f，
	              //代表这个小数是float
	double db =3.5;//可以在后面加D或者d表示是个double类型，但是不需要，因为小数默认为double类型
	
	//注意double类型的精度比float精度高，所以保存小数一般用double
	System.out.println(10.0D/3);//3.3333333333333335
	System.out.println(10.0F/3);//3.3333333
	
	//保存单个字符使用char
	char cr='a';//注意char类型声明，赋值时使用的是单引号
	System.out.println(cr);
	
	//boolean类型用来保存判定结果，这个类型只有两个值，true 和 false
	boolean b1 =true;//真，成立的
	boolean b2 =false;//假，不成立
	
	int a=10;
	int b=20;
	boolean b3 =a>b;
	System.out.println(b3);//false
	boolean b4 =a<b;
	System.out.println(b4);//true
	
	//8种基本类型以外的都是引用类型，保存字符串使用String类型
	String str ="您好";
	System.out.println(str);
	
	
}
}
