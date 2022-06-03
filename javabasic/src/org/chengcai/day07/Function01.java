package org.chengcai.day07;
/**
 * 方法的声明和调用
 * 
 * 1.方式用于封装一段具有特定功能的代码,可以被反复调用
 * 2.方法的声明要素:访问权限、返回值类型、方法名、入参、出参
 * 3.return用来声明方法返回的具体数据
 * 4.如果有声明一个方法有返回,那么这个方法必须运行return,而且返回的必须是声明的返回类型
 * 5.方法的调用：调用方法使用  方法名(入参) 来调用
 *               要求：方法名大小写要求一致
 *                   入参的数据必须和方法声明的一致,顺序也为一致
 * 6.注意:如果方法声明的时候,返回值定义为void类型,代表该方法无返回值,方法中不能使用
 *       return xxxx;并且在调用完成后 没有结果赋值给变量
 * 7.如果方法中没有入参，我们调用是不需要传入参数
 * 
 */
public class Function01 {
	
//有返回值案例
	//加法运算的方法
	//public 是访问权限
	//如果写上static 这个方法就是静态方法,如果不写,那么就是一个非静态方法
	public static int add(int a,int b){
		int c=a+b;
		return c;//这个方法声明返回 int 类型,所以必须有返回,而且返回的必须是int 类型
	}
	//设计一个登录功能
   //公开的     静态的	  返回String  方法名login  入参usname和password
	public static String login(String usname,String password){
		if(usname.equals("xiaohua")&&password.equals("123456")){
			return"登录成功";	
		}else{
			return"登录失败";
		}
	}
	
	//设计一个方法计算长方形的面积 :长*宽 并调用该方法
	public static double areas(double length,double width){
		
		return length * width;
	}
	
//无返回值案例
	//设计一个方法计算长方形的面积: 长*宽  并调用该方法
	public static void areas1(double length,double width){
		//return length * width;//该行代码报错,因为声明是void,是无返回值的
		System.out.println(length * width);
	}
	
//无返回无入参方法案例
	//设计一个方法,计算长度为10,宽度为20的矩形面积;
	public static void  areas2(){//这个方法没有入参,也没有返回,单独执行10*20
	   System.out.println(10*20);
	}
	
//有返回无入参,该方法被调用固定返回1
 public static int add1(){
	 int c=1;
	 return c;
 }
 
 //-------------------------以上是方法,以下是使用main方法调用-------------------------------
	public static void main(String[] args){
		
	//调用有返回值方法	
		//在main中调用add方法,传入参数1和2
		int i=add(1,2);
		System.out.println(i);//3
		
		//在main方法中调用login方法，传入参数"xiaohua","123456"
		String str=login("xiaohua","123456");
		System.out.println(str);//登录成功
		
		String str1=login("123456","xiaohua");
		//登录失败,因为把123456 赋予给usname,把xiaohua赋值给password
		System.out.println(str1);
		
		System.out.println(areas(3.6,1.7));
		
		//调用无返回值方法
		areas1(3.5,1.7);//等同于System.out.println(length*width)
		//double dbe = areas1(3.5,1.7);//这行代码报错,调用的方法无返回值,没有值给dbe,所以报错
		
		//调用无入参方法
		areas2();//等同于System.out.println(10*20);
		
		//调用有返回无入参方法
		int j=add1();
		System.out.println(j);//1
	}

}
