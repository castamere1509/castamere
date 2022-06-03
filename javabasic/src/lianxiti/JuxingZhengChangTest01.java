package lianxiti;

public class JuxingZhengChangTest01 {
	
	public static void main(String[] args){
		Chang01 ch = new Chang01();
        ch.setC(2.5);
		ch.setK(2);
		
		Zheng01 zh =new Zheng01();
		zh.setC(1.5);
		
		Juxing01 ju =new Juxing01();
		ju.setC(2);
		ju.setK(2);
		
		ch.zc();
		ch.mj();
		
		zh.zc();
		zh.mj();
		
		ju.zc();
		
		Juxing01 jj =new Chang01();
		
		jj.setC(3);
		jj.setK(2);
		jj.zc();
		
	}

}
