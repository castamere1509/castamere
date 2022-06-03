package org.chengcai.day11interface03;
/**
 * 1.一个类只能继承一个父类,但是可以实现多个接口
 * 2.如果实现多个接口，必须实现所有接口的抽象方法
 *
 */


public class Test extends C implements A,B {
    
	

	@Override
	public int c2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int a1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int a2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int b1() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int c1() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	@Override
	public int b2() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		//A as = new A();//接口不能实例化。
		//C cs = new C();//抽象类不能实例化
		
	}

}
