package lianxi01;

public class SuiBian01 {
	
   private int a;
   private int b;
   
   public static void add(int a,int b){
	   if(a>0 && a<=99 && b>0 && b<=99){
		   System.out.println(a+b);
	   }else{
		System.out.println("请输入有效数字");
	   }
   }

public SuiBian01() {
}

public SuiBian01(int a, int b) {
	super();
	this.a = a;
	this.b = b;
}

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}

}
