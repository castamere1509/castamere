package org.chengcai.day03;
/**
 * 
 * ����Ƕ��
 * if(����){
 *     ����1
 *     if(����){
 *     Ƕ�����
 *     }
 * }else{
 *     ����2
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
			System.out.println("a>b����");
			if(b>c){
				System.out.println("a>b>c����");
			}			
		}else{
			System.out.println("a<=b����");
		}
						
	}
	

}
