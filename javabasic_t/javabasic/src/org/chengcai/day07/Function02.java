package org.chengcai.day07;

import java.util.Arrays;
import java.util.Scanner;

/**
 *   
 * 
 * 1、设计一个方法用来计算矩形的面积。方法设计完成后，在main方法中调用。
 * 2、设计一个方法用来计算正方形的周长。方法设计完成后，在main方法中调用。
 * 3、设计一个方法用来计算长方体的体积。方法设计完成后，在main方法中调用。
 * 4、设计一个方法，传入任意整数类型的数组，能够将数组从大到小进行排序。并且在main方法中调用。
   5、设计一个方法，入参为投币金额（仅限投币50、100）和充值金额（仅限充值50、100）
          根据不同的投币和充值金额，返回不同的结果。方法设计完成后，在main方法中调用。
   7、设计一个成绩判定器，并且在main方法中调用
   8、设计一个闰年判定器，用户在控制台输入年份，方法返回 是闰年/不是闰年 。并且在main方法中调用
   9、设计一个nn乘法口诀打印器 ,用户在控制台输入 n的值 ,打印出对应的结果，并且在main方法中调用
   10、设计一个方法用来判断体重是否符合标准。http://www.coozhi.com/shenghuojiaju/shenghuochangshi/42930.html   

   方法设计时应该考虑到： 
      1、方法是通用的，逻辑是正确的，不能遗漏逻辑。
      2、方法应该传入什么内容，返回什么内容。 
 *                             
 *                
 */

public class Function02 {
	
	//1、设计一个方法用来计算矩形的面积。方法设计完成后，在main方法中调用	
	public static double area(double length,double width){		
		return length*width;
	}
	
	//2、设计一个方法用来计算正方形的周长。方法设计完成后，在main方法中调用。
	public static double perimeter(double side){		
		return side*4;
	}
	
	//3、设计一个方法用来计算长方体的体积。方法设计完成后，在main方法中调用。
	public static double volume(double length,double width,double heigth){		
		return length*width*heigth;
	}
	
	//4、设计一个方法，传入任意整数类型的数组，能够将数组从大到小进行排序。并且在main方法中调用。
	public static int[] arraySort(int[] arr){
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]<arr[j+1]){
					int a=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
			}
		}		
		return arr;
	}
	
	//  5、设计一个方法，入参为投币金额（仅限投币50、100）和充值金额（仅限充值50、100）
    //根据不同的投币和充值金额，返回不同的结果。方法设计完成后，在main方法中调用。
	public static String cz(int a,int b){
		if(a==50){
			if(b==50){
				return "充值成功";
			}else if(b==100){
				return "充值失败，退回50";
			}else{
				return "充值金额输入异常,请重新输入";
			}			
		}else if(a==100){
			if(b==50){
				return "充值成功,找零50";
			}else if(b==100){
				return "充值成功";
			}else{
				return "充值金额输入异常,请重新输入";
			}			
		}else{
			return "投币金额异常";
		}
		
	}
	// 7、设计一个成绩判定器，并且在main方法中调用
      public static void scores(double a){
		if(a<60 && a>=0){
			System.out.println("不及格");
		}else if(a>=60 && a<=100){
			System.out.println("及格");
		}else{
			System.out.println("成绩异常");				
		}
	}
	
    // 8、设计一个闰年判定器，用户在控制台输入年份，方法返回 是闰年/不是闰年 。并且在main方法中调用
      public static void lo(){//调用方法：就是运行这个方法体里面的代码
    	  Scanner sc = new Scanner(System.in);
    	  int year =sc.nextInt();
    	  if(year%4==0 && year%100!=0 || year%400==0){
    		  System.out.println(year+"是闰年");
    	  }else{
    		  System.out.println(year+"不是闰年");
    	  }  	  
      }
    
      //9、设计一个nn乘法口诀打印器 ,用户在控制台输入 n的值 ,打印出对应的结果，并且在main方法中调用
      public static void mul(){
    	  Scanner sc = new Scanner(System.in); 
    	  int n=sc.nextInt();
    	  for(int i=1;i<=n;i++){
    		  for(int j=1;j<=i;j++){
    			  System.out.print(j+"X"+i+"="+i*j+" ");
    		  }
    		  System.out.println("");
    	  }    	  
      }
      
      //10、设计一个方法用来判断体重是否符合标准。http://www.coozhi.com/shenghuojiaju/shenghuochangshi/42930.html
      public static void bmi(double h,double w ){
    	  double bm =w/(h*h);
    	  if(bm<18.5){
    		  System.out.println("偏瘦");
    	  }else if(bm>=18.5 && bm<=23.9){
    		  System.out.println("体重正常");
    	  }else if(bm>23.9 && bm<=27.9){
    		  System.out.println("过重");
    	  }else if(bm>27.9){
    		  System.out.println("肥胖");    		  
    	  }else{
    		  System.out.println("输入数据异常，无法计算");
    	  }
    	  
    	  
      }
      
      
      
      
//------------------------------------------------------------------------------------------------	
     public static void main(String[] args) {
		
    	 System.out.println(area(11,20));//200.0
    	 
    	 System.out.println(perimeter(5.5));//22.0
    	 
    	 System.out.println(volume(5.5,6.5,7.5));//268.125
    	 
    	 int[] ints={5,9,1,3,8,7};
    	 int[] ins=arraySort(ints);
    	 System.out.println(Arrays.toString(ins));
    	 
    	 String str =cz(20,100);
    	 System.out.println(str);
    	 
    	 scores(100);
    	 
    	 lo();
    	 
    	 mul();
    	 
    	 bmi(1.85,70);
	}
	
     
     
	
}
