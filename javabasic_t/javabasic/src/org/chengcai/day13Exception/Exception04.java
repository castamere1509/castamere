package org.chengcai.day13Exception;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * Exception:�쳣
 *
 *������ʱ�쳣(unRuntimeException):�����Ǵ���û�����⣬����Ҳ�ᱨ��
 *��Java���棬�кܶ���뱻��Ϊ�Ǹ߷��մ���,������ǰ�����������ߴ���
 *
 *������ʱ�쳣����������ǰ����Ҫ���д���
 *����ʽ2��
 *      try{
 *      
 *      }catch(�쳣����){
 *      
 *      }
 *
 */


public class Exception04 {

	public static void  main(String[] args) {

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "1234");
			} catch (Exception e) {//ֻҪ�����쳣�������д���
				System.out.println("��������ʱ�������쳣���봦��");
				e.printStackTrace();//��ӡe�����������
				
			}
			
         
			
	}

}
