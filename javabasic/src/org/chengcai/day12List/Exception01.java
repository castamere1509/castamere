package org.chengcai.day12List;
/**
 * Exception:�쳣
 *
 * 1.����ʱ�쳣(RuntimeException) : �������ͨ���������еĹ����б���
 *   �쳣�����Ժ󣬻��׳��쳣����Ȼ����ֹ�����쳣����λ���Ժ�Ĵ��붼��ִ��
 *
 */
public class Exception01 {
	
	
	public static void main(String[] args){
		
	 //��δ���д��main����������û��ֱ�ӱ���ģ��������е�ʱ�����˴���
	System.out.println(10/0);//��java.lang.ArithmeticException    ��ѧ�����쳣
	
	String str = null;
	System.out.println(str.equals("С��"));//java.lang.NullPointerException��ָ���쳣
	
	int[] ins={1,2,3};
	System.out.println(ins[4]);//java.lang.ArrayIndexOutOfBoundsException  �����±�Խ���쳣
	
	}

}
