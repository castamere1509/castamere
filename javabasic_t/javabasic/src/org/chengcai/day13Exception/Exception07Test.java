package org.chengcai.day13Exception;

import java.sql.Connection;
import java.sql.DriverManager;

/**  
 *
 *
 *
 *
 */

public class Exception07Test {

	public static void main(String[] args) throws Exception07 {
		
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "1234");		    
		} catch (Exception e) {				
			e.printStackTrace();//���ܻ��ӡ����������Ϣ�����²����㶨λ����		
			System.out.println("���ݿ����ӳ���������");//ֻ������ʾ��û����λ����
			//Exception07 ex = new Exception07("���ݿ����ӳ���������");
			//throw ex;//����������ʾ�����һ����ҵ������쳣�Ĵ���������
			throw new Exception07("���ݿ����ӳ���������");//�׳�Exception07����
			
		}

	}



}
