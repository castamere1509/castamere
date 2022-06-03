package org.chengcai.day08;

import java.util.Arrays;

import org.chengcai.day07.Function02;

//一个类可以有多个对象

public class FriendTest04 {

	public static void main(String[] args) {
		
		Friend03 bfd =new Friend03();//对象1
		bfd.name="吴彦祖";
		bfd.age =18;
		bfd.sex='男';
		bfd.height=187;
		bfd.weight=70;
		bfd.yanzi="超级高";
		
		bfd.yueHui("成才学院");
		
		
		Friend03 gfd =new Friend03();//对象2		
		gfd.name ="迪丽热巴";
		gfd.age =18;
		gfd.sex='女';
		gfd.height=165;
		gfd.weight=50;
		gfd.yanzi="超超级高";
		
		gfd.yueHui("惠南");
		
		Friend03 fd =new Friend03();//对象3
		//一个类可以拥有多个对象
		
		
		int[] arr={1,3,6,2,4};
		Arrays.sort(arr);//是java自带的API
		
		Function02.arraySort(arr);//自己写的静态方法进行处理
		
		//练习创建Function02的对象调用arraySort方法对数组进行排序
		int[] ar={1,3,6,2,4};		
		Function02 fut =new Function02();
		int[] ar2=fut.arraySort(ar);//new一个对象去调用方法
		System.out.println(Arrays.toString(ar2));
		
		fut.lo();//使用对象调用闰年判断的API
		
		String str =fut.cz(50, 50);//使用对象调用充值API
		System.out.println(str);
		
		
	}
	
	
	
	
}
