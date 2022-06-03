package org.chengcai.day07;
/**
 * 
 * 访问权限            类      包       子类       其他包
 * public     V  V	  V		V   (对任何人都是可用的)
 * protecte   V  V    V     X   (继承的类可以访问以及和private一样的权限)
 * default    V  V    X     X   (包访问权限,即在整个包内均可被访问)
 * private    V  X    X     X   (类型的内部方法之外的任何人都不能访问的元素)
 */
public class Function03 {
	//公开权限方法
	public static int add(int a,int b){
		return a+b;
	}
    //私有权限方法
	private static int adds(int a,int b){
		return a+b;
	}
	
public static void main(String[] args){
	//跨类调用
	int i =add(1,2);//静态方法,可以直接使用类名,方法名调用,前提是权限足够
	System.out.println(i);
	
	i =adds(1,2);//同类下,可调用private权限方法
	System.out.println(i);
	
}
	
	
}
