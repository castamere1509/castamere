package org.chengcai.day12List;
/**
 * Exception:�쳣
 * 
 * ������ʱ�쳣(unRuntimeException):�����Ǵ���û�����⣬����Ҳ�ᱨ��
 * ��Java���棬�кܶ���뱻��Ϊ�Ǹ߷��մ���,������ǰ�����������ߴ���
 *
 *������ʱ�쳣����������ǰ����Ҫ���д���
 *����ʽ1��ʹ��throws ����������ܻ�����쳣
 *   ȱ�㣺һ������ʱthrows�����쳣�������������ø÷���ʱ����Ҫ������쳣���д���
 */
public class Exception02 {
	
	                           //��������������Ĵ����п��ܳ����쳣
	public static void textEx() throws ClassNotFoundException{
	//�������ݿ������࣬���׳����Ҳ������쳣
	Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
	}

	public static void main(String[] args) throws ClassNotFoundException{
		textEx();
	}
	
	
}
