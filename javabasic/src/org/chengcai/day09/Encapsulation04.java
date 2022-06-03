package org.chengcai.day09;
/**
 * 
 * 
 *
 */
public class Encapsulation04 {

	public static void main(String[] args){
		Encapsulation03 en= new Encapsulation03();
	    //en.age=10;
		//en.name="xiaohua";//该行代码报错,因为这两个属性都是私有的,在本类无法直接访问
		
		en.setName("xiaohua");//对象调用了setName方法为name赋值为xiaohua
		String str=en.getName();//对象调用了getName,获取了当前对象name的值
		System.out.println(str);
		
		en.setAge(18);//对象调用了setAge方法,给age赋值18
		en.getAge();//获取当前对象age的值
		
		
	}

}
