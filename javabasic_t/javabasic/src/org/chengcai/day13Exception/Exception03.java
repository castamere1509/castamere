package org.chengcai.day13Exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Exception:�쳣
 *
 *������ʱ�쳣(unRuntimeException):�����Ǵ���û�����⣬����Ҳ�ᱨ��
 *��Java���棬�кܶ���뱻��Ϊ�Ǹ߷��մ���,������ǰ�����������ߴ���
 *
 *������ʱ�쳣����������ǰ����Ҫ���д���
 *����ʽ2��
 *      try{//��������	
 *      
 *      }catch(�쳣����){ //ִ��try�е����飬ʹ��catch ץȡ�쳣���� �����д���
 *        ֻҪ�������쳣��������catch���������
 *      }
 *
 *     catch��������飬ֻ�Ǵ󲿷�ֻ�ǽ�����ʾ�����߿������쳣�����������ط�����Ҫ������
 *     �ֶ�ȥ����쳣������ֱ�Ӱ￪���߽��쳣�����
 *
 */


public class Exception03 {

	public static void  main(String[] args){
		
		//���������ClassNotFoundException�쳣���Ż����� catch���������
		try {		
		////�������ݿ������࣬���׳����Ҳ������쳣
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println(10/0);
		} catch (Exception e) {//�����Ҳ������쳣���д���
			// �����쳣,�󲿷ֶ��Ǹ���һ���쳣��Ϣ����ʾ����Աȥ��λ����
			System.out.println("û���ҵ������࣬�����ǰ�û�е���");
			e.printStackTrace();//��ӡ��ջ��Ϣ
		}		
		
		//���빦�ܣ�ͨ�����ݿ�IP��ַ���˿ںţ��û����������������ݿ⣬��δ������׳���SQL����쳣
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "1234");
		} catch (SQLException e) {//����SQL�쳣�����д���
			System.out.println("������IP��ַ���˿ںţ��û����������������");
			e.printStackTrace();
		}
		
		
	}
	
   

	
}
