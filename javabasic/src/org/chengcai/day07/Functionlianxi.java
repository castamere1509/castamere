package org.chengcai.day07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1、设计一个方法用来计算矩形的面积。方法设计完成后，在main方法中调用。
 * 2、设计一个方法用来计算正方形的周长。方法设计完成后，在main方法中调用。
 * 3、设计一个方法用来计算长方体的体积。方法设计完成后，在main方法中调用。
 * 4、设计一个方法，传入任意整数类型的数组，能够将数组从大到小进行排序。并且在main方法中调用。
 * 5、设计一个方法，入参为投币金额（仅限投币50、100）和充值金额（仅限充值50、100）
 *            根据不同的投币和充值金额，返回不同的结果。方法设计完成后，在main方法中调用。
 * 7、设计一个成绩判定器，并且在main方法中调用
 * 8、设计一个闰年判定器，用户在控制台输入年份，方法返回 是闰年/不是闰年 。并且在main方法中调用
 * 9、设计一个nn乘法口诀打印器 ,用户在控制台输入 n的值 ,打印出对应的结果，并且在main方法中调用
 * 10、设计一个方法用来判断体重是否符合标准。
 * 方法设计时应该考虑到： 
 * 1、方法是通用的，逻辑是正确的，不能遗漏逻辑。
 * 2、方法应该传入什么内容，返回什么内容。
 *
 * 
 */
public class Functionlianxi {
	//1、设计一个方法用来计算矩形的面积。方法设计完成后，在main方法中调用。
	public static double mj(double a,double b){
		double c=a*b;
		return c;
	}
   //2、设计一个方法用来计算正方形的周长。方法设计完成后，在main方法中调用。
	public static double zc(double bc){
		
		return bc*4;
	}
   //3、设计一个方法用来计算长方体的体积。方法设计完成后，在main方法中调用。
	public static double tj(double cc,double kk,double gg){
		return cc*kk*gg;
	}
   //4、设计一个方法，传入任意整数类型的数组，能够将数组从大到小进行排序。并且在main方法中调用。
	/*
	public static void zs (int[] n){
	for(int i=0;i<n.length-1;i++){
		for(int j=0;j<n.length-1;j++){
			if(n[j]<n[j+1]){
			int a=n[j];n[j]=n[j+1];n[j+1]=a;
			}}}System.out.println(Arrays.toString(n));}	
			*/
	public static int[] arraySort(int[] arr){
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]<arr[j+1]){
					int a=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
			}
		}return arr;
	}
	
   //5、设计一个方法，入参为投币金额（仅限投币50、100）和充值金额（仅限充值50、100）	
   //   根据不同的投币和充值金额，返回不同的结果。方法设计完成后，在main方法中调用。
	/*
	public static String tb(int ws,int yb,int cw,int cy ){
		if(ws >=cw && yb>=cw && yb>=cy){return "充值成功";
		}else{return "充值失败";}}
		*/
	public static String cz(int a,int b){if(a==50){if(b==50){return"充值成功";}else if(b==100){return"充值失败,退回50";}else{return"充值金额异常";}
		}else if(a==100){if(b==50){return"充值成功,找零50";}else if(b==100){return"充值成功";}else{return"充值金额异常";}
		}else{return"投币金额异常";}
	    }
   //7、设计一个成绩判定器，并且在main方法中调用
	/*
	 public static String cj(double kscj){
		 if(kscj>=60){return"成绩合格";}else{return"不及格";}}
		 */
	public static void score(double a){
		if(a<60 && a>=0){System.out.println("不及格");
		}else if(a>=60 && a<=100){System.out.println("及格");
		}else{System.out.println("成绩异常");}
	    }
   //8、设计一个闰年判定器，用户在控制台输入年份，方法返回 是闰年/不是闰年 。并且在main方法中调用
	/*
	 public static String rn(int nf){
		 if(nf%4==0 && nf%100!=0 || nf%400==0){return"是闰年呀";}else{return"不是闰年呀";}
	 }
	 */
	public static void lo(){
		Scanner sc = new Scanner(System.in);
		int year =sc.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"不是闰年");
		}
	}
   //9、设计一个nn乘法口诀打印器 ,用户在控制台输入 n的值 ,打印出对应的结果，并且在main方法中调用
	/*
	public static void sz(int n){
		for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){System.out.print(i+"*"+j+"="+(i*j)+" ");
		}System.out.println("");}
	    }
	    */
	public static void mul(){
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print(i+"*"+j+"="+i*j+" ");
			}System.out.println("");
			}
	    }
	//10、设计一个方法用来判断体重是否符合标准。
	/*
	public static String tz(double sg,double zl){
		if(zl/(sg*sg)>18.5 && zl/(sg*sg)<23.9){return"平均水平";
		}else if(zl/(sg*sg)>24 && zl/(sg*sg)<27.9){return"超重:偏胖";
		}else if(zl/(sg*sg)>=28 && zl/(sg*sg)<35){return"超重:肥胖";
		}else if(zl/(sg*sg))>=35 && zl/(sg*sg)<39.9){return"超重:重度肥胖";
		}else if(zl/(sg*sg)>=40){return"超重:极重度肥胖";
		}else if(zl/(sg*sg)<18.5 && zl/(sg*sg)>15){return"偏瘦";
		}else{return"输入数据异常(未成年人、运动员、孕妇、老人等无法依据此数据进行计算)";
		}
	    }
	*/
	public static void bmi(double h,double w){
		double bm =w/(h*h);
		if(bm<18.5){
			System.out.println("偏瘦");
		}else if(bm>=18.5 && bm<=23.9){
			System.out.println("体重正常");
		}else if(bm>=24 && bm<=27.9){
			System.out.println("过重");
		}else if(bm>=27.9){
			System.out.println("肥胖");
		}else{
			System.out.println("数据异常");
		}
	}
	
	
public static void main(String[] args){
	//1、设计一个方法用来计算矩形的面积。方法设计完成后，在main方法中调用。
	double mj1=mj(4.5,3.5);
	System.out.println(mj1);  
	//2、设计一个方法用来计算正方形的周长。方法设计完成后，在main方法中调用。
	System.out.println(zc(3.5));
	//3、设计一个方法用来计算长方体的体积。方法设计完成后，在main方法中调用。
	System.out.println(tj(3.5,2.5,2.5));
	//4、设计一个方法，传入任意整数类型的数组，能够将数组从大到小进行排序。并且在main方法中调用。
	/*
	 int[] z ={5,9,7,8,4,6};
	 zs(z);
	 */
	int [] ints={5,9,1,3,8,7};
	int [] ins=arraySort(ints);
	System.out.println(Arrays.toString(ins));
	//5、设计一个方法，入参为投币金额（仅限投币50、100）和充值金额（仅限充值50、100）	
	//   根据不同的投币和充值金额，返回不同的结果。方法设计完成后，在main方法中调用。
	/*
     String je = tb(50,100,50,100);
	 System.out.println(je);
	 */
	 String str = cz(100,50);
	 System.out.println(str);
	//7、设计一个成绩判定器，并且在main方法中调用
	 /*
	 System.out.println(cj(60));
	 */
	 score(60);
	//8、设计一个闰年判定器，用户在控制台输入年份，方法返回 是闰年/不是闰年 。并且在main方法中调用
	 /*
	System.out.println(rn(2020));
	*/
	 lo();
	//9、设计一个nn乘法口诀打印器 ,用户在控制台输入 n的值 ,打印出对应的结果，并且在main方法中调用
	 /*
	Scanner kj = new Scanner(System.in);
	System.out.println("请输入数字");
	int a =kj.nextInt();
	sz(a);
	*/
	 mul();
	//10、设计一个方法用来判断体重是否符合标准。
	 /*
	System.out.println(tz(1.70,70));
	*/
	bmi(1.70,70);
}	
}
