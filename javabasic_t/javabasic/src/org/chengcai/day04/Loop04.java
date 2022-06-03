package org.chengcai.day04;

/**
 * 循环0  for循环嵌套
 * 
 * for(表达式1;表达式2;表达式3){
 *        for(表达式1;表达式2;表达式3){
 *           
 *        }
 * }
 * 
 *
 */

public class Loop04 {
	  public static void main(String[] args) {
		//print和println  区别 print 不换行打印  ,println是换行打印
		  
	  //打印出4行*，每行5个*
//外循环  内循环
//第一次外循环 i =1;  第一次内循环 j=1; 第二次内循环 j=2;第三次j=3;第四次j=4;第五次j=5;第六次j=6判断不成立，结束内循环
//第二次外循环i=2 ; 第一次内循环j=1;第二次内循环 j=2;第三次j=3;第四次j=4;第五次j=5;第六次j=6判断不成立，结束内循环  
//第三次外循环i=3 ; 第一次内循环j=1;第二次内循环 j=2;第三次j=3;第四次j=4;第五次j=5;第六次j=6判断不成立，结束内循环  
//第四次外循环i=4 ; 第一次内循环j=1;第二次内循环 j=2;第三次j=3;第四次j=4;第五次j=5;第六次j=6判断不成立，结束内循环  		  
//第五次i<=4不成立，不运行	  
         for(int i=1;i<=4;i++){
        	 for(int j=1;j<=5;j++){
        		 
        		 System.out.print("*");
        	 }       	 
        	 System.out.println("");
         }
		
     System.out.println("----------------------------------------------------");    
         
	//打印一个5行5列的直角三角形
 //第一次外循环i=1; 第一次内循环j=1;第二次内循环j=2,不符合j<=i,结束循环    
//第二次外循环i=2;  第一次内循环j=1; 第二次内循环j=2;  第三次内循环j=3，不符合j<=i,结束循环 
//第三次外循环i=3； 第一次内循环j=1; 第二次内循环j=2;  第三次内循环j=3，第四次j=4，不符合j<=i,结束循环
//第四次外循环i=4；  第一次内循环j=1; 第二次内循环j=2;  第三次内循环j=3，第四次j=4；第五次j=5,不符合j<=i,结束循环  
//第五次外循环i=5;  第一次内循环j=1; 第二次内循环j=2;  第三次内循环j=3，第四次j=4；第五次j=5;第六次j=6,不符合j<=i,结束循环  
//第六次外循环i=6，不符合i<=5,结束循环	  
     for(int i=1;i<=5;i++){
			  for(int j=1;j<=i;j++){
				  System.out.print("*");
			  }
			System.out.println("");  
		  }
     
		  
		//打印一个乘法口诀表  
		 for(int i=1;i<=9;i++){
             for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+" ");           	 
			  }
			 
			 System.out.println("");
		 } 
		  
		  
		 //用*打印一个空心的矩形
		 
		 for(int i=1;i<=5;i++){
			 for(int j=1;j<=5;j++){
				 if(i==1 || i==5 || j==1 ||j==5){
					 System.out.print("*");
				 }else{
					 System.out.print(" ");
				 }
				 
			 }
 
			 System.out.println("");
		 }
	 
		//使用for循环打印200-300所有的奇数和偶数
		//使用for循环打印10的阶乘结果是多少？  			
	  //使用for循环打印如下三角形
		for(int i=1;i<=6;i++){
			for(int j=6;j>=i;j--){
				System.out.print("*");
			}
			System.out.println("");
		} 
		 
		 
			/******
			 *****
			 ****
			 ***
			 **
			 */
		//使用for循环打印任意空心三角形
		
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
				if(j==1 || i==6 || j==i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
				
			}
			System.out.println("");
		}
		
		
		
		
		
		//使用for循环打印等腰三角形：如下图 
		
		
		
		//打印等腰三角形  列数  =  行数*2  -  1
	    for(int i=4;i>=1;i--){
	    	for(int j=1;j<=7;j++){
	    		if(j>=i && j<=8-i){
	    			System.out.print(j); 
	    		}else{
	    			System.out.print(" ");
	    		}
	    	}
	    	System.out.println("");
	    }

		
		//打印空心等腰三角形，提示n行  (n*2)-1列
		for(int i=4;i>=1;i--){
			for(int j=1;j<=7;j++){
				if(j==i || j==8-i || i==1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	
		
		int a=8;//控制行
		for(int i=a;i>=1;i--){
			for(int j=1;j<=(a*2)-1;j++){
				if(j==i || j==((a*2)-i) || i==1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		
		for(int i=4;i>=1;i--){
			for(int j=1;j<=9;j++){
				if(j ==i || j==10-i || i==1 || j==i+1 && i==4){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		
		
		
		int b=8;
		for(int i=b;i>=1;i--){
			for(int j=1;j<=b*2+1;j++){
				if(j==i || j==(b*2+2)-i || j==i+1 && i==b || i==1 ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		

		
		
		  
	}
	
	

}
