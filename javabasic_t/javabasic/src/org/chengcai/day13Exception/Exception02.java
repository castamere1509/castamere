package org.chengcai.day13Exception;

/**
 * Exception:�쳣
 *
 *������ʱ�쳣(unRuntimeException):�����Ǵ���û�����⣬����Ҳ�ᱨ��
 *��Java���棬�кܶ���뱻��Ϊ�Ǹ߷��մ���,������ǰ�����������ߴ���
 *
 *Ϊʲô���з������쳣��
 *�����������д�������⣬ֻ��Java��Ϊ������ʹ�õ���������ǱȽ����׳����쳣�Ĵ���
 *
 *������ʱ�쳣����������ǰ����Ҫ�����������ߴ���
 *����ʽ1��ʹ��throws ����������ܻ�����쳣
 *    
 *
 */


public class Exception02 {
                                 //��������������Ĵ����п��ܳ����쳣
	public static void testEx() throws ClassNotFoundException  {
		////�������ݿ������࣬���׳����Ҳ������쳣
		Class.forName("oracle.jdbc.driver.OracleDriver");		
		
	}
	
    public static void main(String[] args) throws ClassNotFoundException {
    	testEx();
	}

	
}
