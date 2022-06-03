package chengcai.testngtest;

public class HomeWork02 {
	public static String scores(double a){
		if(a<60 && a>=0){
			return "不及格";
		}else if(a>=60 && a<=100){
			return "及格";
		}else{
			return "成绩异常";				
		}
	}

}
