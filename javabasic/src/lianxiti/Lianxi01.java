package lianxiti;

public class Lianxi01 {
	
	public static void main(String[] args){
//打印1-100的整数
		/*
		for(int i=1;i<=100;i++){
			System.out.println(i);}
			*/
//打印1-100的偶数
		/*
		for(int i=1;i<=100;i++){
			if(i%2==0){System.out.println(i);}}
			*/
//打印1-2020年的闰年
		/*
		for(int i=1;i<=2020;i++){
			if(i%4==0 && i%100!=0 || i%400==0){System.out.println(i);}}
			*/
//打印1-2020有多少个闰年
		/*
		int count =0;
		for(int i=1;i<=2020;i++){
			if(i%4==0 && i%100!=0 || i%400==0){count++;}}System.out.println(count);
			*/
//倒序输出1-100
		/*
		for(int i=100;i>=1;i--){System.out.println(i);}
		*/
//打印1-100的和
		/*
		int s=0;
		for( int i=1;i<=100;i++){s=s+i;}System.out.println(s);
		*/
//打印出四行*，每行五个*
		/*
		for(int i=1;i<=4;i++){for(int j=1;j<=5;j++){System.out.print("*");}System.out.println(" ");}
        */
//打印一个5行五列的直角三角形	
	/*
	for(int i=1;i<=5;i++){
	for(int j=1;j<=i;j++){
		System.out.print("*");
	}System.out.println(" ");
	}
	*/
//打印一个乘法口诀表		
	/*
	for(int i=1;i<=9;i++){
	for(int j=1;j<=i;j++){
		System.out.print(i+"*"+j+"="+(i*j)+" ");
	}System.out.println(" ");
	}
	*/
//创建数组,方式1:直接声明一个数组，并赋值		
	int sz[] ={10,11,12,13,14,15};
	String mz[] ={"奥格瑞姆","洛萨","雷克萨","萨尔","格罗玛什"};
//数组的长度用.length	
    int bh=mz.length;
    System.out.println(bh);
 //数组的下标,数组的下标从0开始,最大的下标为数字的长度-1	
    System.out.println(mz[0]);
    System.out.println(mz.length-1);
	
	
	
	
	
	
	
	
	
	
		
	}

}
