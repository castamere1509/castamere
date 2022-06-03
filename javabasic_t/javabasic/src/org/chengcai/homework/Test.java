package org.chengcai.homework;

public class Test {

	public static void main(String[] args) {
		//重载
		Square sq = new Square();//正方形对象
		sq.setSide(4);// 调用了父类的属性和方法
		sq.perimeter(2);//调用了父类的属性和方法,根据入参，选择调用了正方形周长计算方法
System.out.println(sq.getSide());//打印2   因为调perimeter(double a)重新给side赋值了
        sq.perimeter(1,2);//调用了父类的属性和方法,根据入参，选择调用了长方形周长计算方法	
		
        //重写
        Oblong ob = new Oblong();//长方形对象
        ob.setLenght(4);//调用父类方法给长赋值4   这个方法子类没重写，直接调父类
        ob.setWidth(2);//调用父类方法给宽赋值2
        ob.area();//子类有和父类方法名和参数列表完全一致的方法，那么子类覆盖了父类的方法，当
        //调用该方法时，会自动取调用子类的方法
        
        
        //多态
        Rectangle rec = new Square();//父类类型指向子类对象（通俗讲：这个对象类型是父类，对象是子类的）
        rec.setSide(4);//调用父类的属性和方法
        //rec.setTtt();//该方法属于子类，未发生重写，不符合多态，所以无法调用
        rec.area();//该方法属于子类，发生重写,符合多态，通过父类的方法动态调用了子类area()方法
        //当对象为父类类型指向子类对象时，可以调用父类所有方法和属性，可以调用子类里卖面重写
        //的方法，但是不能直接调用子类的属性和方法
        
	}
	
	
}
