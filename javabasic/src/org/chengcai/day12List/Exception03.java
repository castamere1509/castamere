package org.chengcai.day12List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Exception:�쳣
 * 
 * ������ʱ�쳣(unRuntimeException):�����Ǵ���û�����⣬����Ҳ�ᱨ��
 * ��Java���棬�кܶ���뱻��Ϊ�Ǹ߷��մ���,������ǰ�����������ߴ���
 *
 *������ʱ�쳣����������ǰ����Ҫ���д���
 *����ʽ2��
 *     try{
 *     
 *     }catch(�쳣����){ //ִ��try�е�����,ʹ��catch ץȡ�쳣���󣬽��д���
 *     
 *     }
 *     
 *     
 */
public class Exception03 {
	
	
	public static void main(String[] args) {
	
	//���������ClassNotFoundException�쳣���Ż����� catch���������	
	try {//��������
	//�������ݿ������࣬���׳����Ҳ������쳣
	Class.forName("oracle.jdbc.driver.OracleDriver");
	}catch (ClassNotFoundException e) {//�����Ҳ������쳣���д���
		//�����쳣
		//TODO Auto-generated catch block
		System.out.println("û���ҵ������࣬�����ǰ�û�е���");
		e.printStackTrace();//��ӡ��ջ��Ϣ
	}
		
	//���빦�ܣ�ͨ�����ݿ�IP��ַ���˿ںţ��û����������������ݿ⣬��δ������׳���SQL����쳣
	
	try{
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521 : orcl","scott","1234");
	}catch(SQLException e){
		System.out.println("������IP��ַ���˿ںţ��û����������������");
		e.printStackTrace();
	}	
	}
	
	}


	

