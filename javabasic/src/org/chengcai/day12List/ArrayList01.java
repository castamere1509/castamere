package org.chengcai.day12List;

import java.util.ArrayList;
import java.util.List;

import org.chengcai.day10extends01.Emp02;

/**
 * 集合：用来成组的存放数据,就是数据集合
 * 什么是引用类型:除了8大基本类型以外的都是引用类型
 * 
 * 集合和数组的区别:他们都是用来保存一组数据,区别在于集合是可变长的，可以自动扩容
 *               数组是定长的。集合只能存放引用类型数据
 * ArrayList集合：和数组很像，都有下标，都能使用下标访问数据
 * 
 * 不管使用什么集合，必须先导包
 * 
 * <>这个是泛型：用来规定集合存放的数据的类型，在这个<>只能是引用类型，不能是基本类型
 * 
 * 集合不能存放基本类型,但是可以存放八种基本类型的包装类的类型；       
 * 包装类和基本类型可以自动转换       
 *    int----->Integer 
 *    byte---->Byte
 *    short--->Short 
 *    long---->Long
 *    float--->Float
 *    double--->Double    
 *    char----->Character    
 *    boolean--->Boolean    
 */
public class ArrayList01 {
	
	public static void main(String[] args){
		//除了8大基本类型以外的都是引用类型
		String str = new String();//String 是引用类型
		Emp02 ep = new Emp02();//Emp02引用类型
	
	List<String> st = new ArrayList<String>();//定义一个保存String类型ArrayList集合；	
	//st是一个放String类型的集合,能放入String的数据
	
	//add()方法,往集合里面放入数据
	st.add("xiaohua");//为集合放入数据,在下标0放入数据
	st.add("小王");//为下标1放入数据
	st.add("小兰");//为下标2放入数据
		
	//打印集合
	System.out.println(st);//[xiaohua,小王,小兰]
			
	//size();获取集合的长度
	int sz = st.size();
	System.out.println(sz);//3
	
	//get(index);通过下标获取这个集合对应的值
	String stt = st.get(2);
	System.out.println(stt);//小兰
		
	//isEmpty();判断为空
	boolean bo = st.isEmpty();
	System.out.println(bo);//false
	
	//contains(XXX)  是否包含XXX数据
	boolean bo1 = st.contains("xiaohua");
	System.out.println(bo1);//true
	
	//remove(index)  删除对应下标位置的值,返回了被删除的值
	String sttt = st.remove(0);
	System.out.println(sttt);//xiaohua
	
	System.out.println(st.get(0));//xiaohua被删除,小王从1号下标移动到0号下标
	
	//clear();清空集合
	st.clear();
	System.out.println(st.isEmpty());//true
	
	//存放获取8大基本类型的包装类
	List<Integer> ls = new ArrayList<Integer>();//定义一个保存Integer类型ArrayList集合
	ls.add(1);
	ls.add(2);
	ls.add(3);
	
	int a =ls.get(0);//取出来的是Integer类型,自动转换成int类型后赋值给a
	System.out.println(a);

	}

}
