package org.chengcai.day12List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Exception:�쳣
 * Error:����
 * ������ʱ�쳣(unRuntimeException):�����Ǵ���û�����⣬����Ҳ�ᱨ��
 * ��Java���棬�кܶ���뱻��Ϊ�Ǹ߷��մ���,������ǰ�����������ߴ���
 *
 *������ʱ�쳣����������ǰ����Ҫ���д���
 *����ʽ2��
 *     try{
 *     �������и�����
 *     }catch(�쳣����){
 *     ����������쳣�����б�����
 *     }finally{
 *     �����鲻����û�з����쳣���������ִ�У�����һ������������β
 *     }
 *     
 *     
 */
public class Exception05 {
	
	
	public static void testTry() {

 try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521 : orcl","scott","1234");
 }catch(Exception e){
	 e.printStackTrace();
 }finally{
	 System.out.println("finally����Ĵ��벻����û�з����쳣����ִ��");
 }

	}

public static void main(String[] args){
	testTry();
}
	
}
