package org.chengcai.day11interface02;

/**
 *�ӿڣ�ʹ�� interface���Σ�jdk1.7�汾��֮ǰ�İ汾ֻ�ܷų��󷽷���1.8���Ժ�汾���Էž�̬����
 * 
 *      ע�⣺1�� �ӿڲ���ʵ�����������ǲ���ֱ�� new �ӿ���() ��
              2�� һ����Ҫʵ��һ���ӿڣ�����ʵ�ֽӿ��е����г��󷽷���
              3�� һ����ֻ�ܼ̳�һ���࣬���ǿ���ʵ�ֶ���ӿڡ�
 * 
 *  jdk1.8�����ԣ��ӿ��п����г��󷽷��;�̬����
 */


public interface Inc01 {
	
	public abstract boolean login(String username,String password);//���󷽷�
	
	public abstract int add(int a,int b);//���󷽷�
    
	public static int jian(int a,int b){//��̬����
		return a-b;
	}

}
