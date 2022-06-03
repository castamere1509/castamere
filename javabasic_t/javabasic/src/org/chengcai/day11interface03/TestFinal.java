package org.chengcai.day11interface03;


/**
 * 
 *  final可以修饰类，方法，属性
      1）final修饰的类，叫做最终类，不能再被继承（不能再有子类）
      2）final修饰方法，不能再被子类重写
      3）final修饰属性，值不能被修改，为常量。 

 *
 */
public class TestFinal {
	
	// 常用的常量定义：
    public static final char SEX1 = '男';
    public final static char SEX2 = '女';

    public static void main(String[] args) {
        int i = 10;
        i = 20;
        System.out.println(i);
        final int j = 10;
        // j = 20; //此行代码报错 以final修饰的变量 值不能被更改。
        char c = TestFinal.SEX1; // 使用常量
    }

	

}
