package org.chengcai.day03;
/**
 * 
 * 条件嵌套
 * if(条件){
 *     语句块1
 *     if(条件){
 *     嵌套语句
 *     }
 * }else{
 *     语句块2
 * }
 * 
 *
 */
public class MultipleConditionalJudgment06 {
	public static void main(String[] args) {
		
		int a=30;
		int b=20;
		int c=20;
		if(a>b){
			System.out.println("a>b成立");
			if(b>c){
				System.out.println("a>b>c成立");
			}			
		}else{
			System.out.println("a<=b成立");
		}
						
	}
	

}
