package org.chengcai.day02;
/**
 * Java中除了8种基本类型以外，其他都是引用类型
 * String类型就是一个引用类型，用来储存和操作字符串
 *
 */
public class StringType01 {
public static void main(String[] args) {
	
String str1 = "今天";
System.out.println(str1);

//字符串的特征：任何类型和字符串相加都会拼接，并且相加后的类型为字符串类型
//注意区分拼接和运算的区别
String str2 ="天气凉快，心情愉悦";
String str3 =str1+str2;
System.out.println(str3);

String str4="我们班级有"+43+"人";
System.out.println(str4);

System.out.println("1+1");//1+1
System.out.println("1"+1);//打印的是一个字符串类型的11
System.out.println("1"+1+1);//111
System.out.println(1+1+"1");//21
System.out.println(1+1+""+1);//21
System.out.println(""+1+1);//11
//如果数字想转为字符串，可以直接和""相加
System.out.println(""+1*2);//2
System.out.println(""+(1+1));//2

int count = 2;
System.out.println("门前"+count+"棵树");//门前两棵树
System.out.println("门前"+"count"+"棵树");//门前count棵树

//拼接a+b的结果
int a =10;
int b =30;
System.out.println(a+"+"+b+"的结果是:"+(a+b));
  //               10 +  30 的结果是:    40

//字符串常用API(方法)
String str = "一起愉快的学java吧!!!";
String str5 =new String("adsdasdasd");//创建一个String类型的对象

//1、.isEmpty()方法用来判断字符串是否为空，如果是空的返回true,如果不是空的返回false

boolean bn =str.isEmpty();//后面相当于1个表达式,表示str是空的
System.out.println(bn);

//2、.length()方法计算字符串的长度
int i = str.length();
System.out.println("str的长度是:"+i);

//3、.charAt(int类型数据) 查找某个下标位置的字符，
//下标位置从0开始，该方法可以获取到下标位置对应的字符，
char cr1 = str.charAt(0);//下标输入为0，表示获取字符串的第一个字符
System.out.println(cr1);
char cr2 = str.charAt(3);
System.out.println(cr2);
//获取一段很长很长的字符串的最后一位字符
char cr3 =str.charAt(str.length()-1);
System.out.println(cr3);
System.out.println(str.charAt(str.length()-1));

//4、.contains(String类型数据)用来判断字符串是否包含某些内容
str.contains("java");
boolean bn2 = str.contains("java");//返回true
System.out.println(bn2);
boolean bn3 =str.contains("");//返回true,因为所有的字符串都包含空字符
System.out.println(bn3);

//5、.indexOf(String类型数据) 用来返回指定字符串在第一次出现的下标

 int j = str.indexOf("java");//java的第一个字符在str字符串中出现的位置是6号下标
 System.out.println(j);//6

 //6、.substring(int类型数据) 字符串的截取
 
 String str6 =str.substring(2);//从字符串的2号下标开始截取，一直到最后末尾为止
 System.out.println(str6);//愉快的学java吧!!!
 
 String str7=str.substring(6,10);//从6号下标开始,到10号结束,不包含10号位
 System.out.println(str7);//java
 
 //练习截取str中的 愉快
 int str8 =str.indexOf("愉快");
 System.out.println(str8);
 
 String str9 =str.substring(2,4);//第一种
 System.out.println(str9);
 
System.out.println(str.substring(2,4));//第二种
 
System.out.println(str.substring(str.indexOf("愉"),str.indexOf("快")+1));//第三种

String str10 = str.substring(str8,str8+2);
System.out.println(str10);//第四种

//练习：有一个字符串，包含了｛username:xiaohua;token;DLAJKLXalDLAJALALKSF;age:3}
//请获取token的值，注意token、user/age的值长度可能每次发生变化
//.indexOf(Stiring s);   .substring(int i,int j);
String sti = "username:xiaohua;token;DLAJKLXalDLAJALALKSF;age:3";
int ti1 =sti.indexOf("token");
System.out.println(ti1+6);
int ti2 =sti.indexOf("age");
System.out.println(ti2-1);
String ti3=sti.substring(23,43);
System.out.println(ti3);//第一种

System.out.println(sti.substring(sti.indexOf("token")+6,sti.indexOf("age")-1));//第二种
String ti4=sti.substring(ti1+6,ti2-1);
System.out.println(ti4);//第三种


}

}
