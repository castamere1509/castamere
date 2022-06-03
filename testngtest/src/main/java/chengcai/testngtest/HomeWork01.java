package chengcai.testngtest;

public class HomeWork01 {
	  public static String bmi(double h,double w ){
    	  double bm =w/(h*h);
    	  if(bm<18.5){
    		  return "偏瘦";
    	  }else if(bm>=18.5 && bm<=23.9){
    		  return "体重正常";
    	  }else if(bm>23.9 && bm<=27.9){
    		  return "过重";
    	  }else if(bm>27.9){
    		  return "肥胖";    		  
    	  }else{
    		  return "输入数据异常，无法计算";
    	  }

}
}