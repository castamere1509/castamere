package org.chengcai.day12List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Exception:�쳣
 * 
 * �����쳣�������ȱ��
 * ����ʽ1:ʹ��throws ����������ܻ�����쳣
 *ʹ��throws �����ķ������ڵ���ʱ��Ҫ�ٴδ����������
 *
 *����ʽ2�� try....catch
 *ʹ��try....catch����ģ�����ֱ�ӽ�����⣬�����߲���Ҫ��ȥ�����쳣    
 *     
 *     
 *     
 */
public class Exception06 {
	
	
	public static void main(String[] args) throws ClassNotFoundException {
	//testEx()�������û�н����쳣�Ĵ����������������������Ե����߱����ٴν����������ߴ���	
   Exception02.textEx();

   //testTry()����һ��ʹ��try....catch�����˴������Ե����߲���Ҫ�ٴ��������ߴ���
	Exception05.testTry();	
	
	
	}


	
}
