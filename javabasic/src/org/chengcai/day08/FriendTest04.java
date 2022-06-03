package org.chengcai.day08;

import java.util.Arrays;

import org.chengcai.day07.Function02;
import org.chengcai.day07.Functionlianxi;

//一个类可以有多个对象

public class FriendTest04 {
	
	public static void main(String[] args){
	  
		Friend03 bfd = new Friend03();//对象1
		bfd.setName("吴彦祖");
		bfd.setAge(18);
		bfd.setSex('男');
		bfd.setHeight(187);
		bfd.setWeight(70);
		bfd.setYanzhi("超级高");
		
		bfd.yueHui("成才学院");
		
		
		Friend03 gfd =new Friend03();//对象2
		gfd.setName("迪丽热巴");
		gfd.setAge(18);
		gfd.setSex('女');
		gfd.setHeight(165);
		gfd.setWeight(50);
		gfd.setYanzhi("超超级高");
		
		gfd.yueHui("惠南");
		
		Friend03 fd =new Friend03();//对象3
		//一个类可以拥有多个对象
		
		
		int[] arr={1,3,6,2,4};
		Arrays.sort(arr);//是java自带的API
		Functionlianxi.arraySort(arr);
		
		Functionlianxi.arraySort(arr);//自己写的静态方法进行处理
		
		//练习创建Functionlianxi的对象调用arraySort方法对数组进行排序
		int[] ar={1,3,6,2,4};
		Functionlianxi fut =new Functionlianxi();
		int[] ar2=fut.arraySort(ar);//new一个对象去调用方法
		System.out.println(Arrays.toString(ar2));
		
		fut.lo();//使用对象调用闰年判断的API	
		
		String str=fut.cz(50, 50);//使用对象调用充值API
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
	}

}
