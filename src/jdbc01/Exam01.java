package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exam01 {
	public static void main(String[] ar){
		//����̹� ����
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����Ŭ ����̹� �˻� ����");
			
			//Class.forName("org.gjt.mm.mysql.Driver");
			//System.out.println("MySql ����̹� �˻� ����");
		}catch(ClassNotFoundException e){
			System.err.println("����̹� �˻� ����");
		}
		Connection conn = null;
		String id = "scott";
		String pass = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		//MySql : "jdbc:mysql://localhost:3306:java"
		
		try{
			conn = DriverManager.getConnection(url, id, pass);
			System.out.println("���� ����");
		}catch(SQLException e){
			System.err.println("���� ����");
		}
		
		try{
			Statement stmt = conn.createStatement();
			System.out.println("��ü ���� ����");
		}catch(SQLException e){
			System.err.println("���� ���� : " + e.toString());
		}
		/*
		try{
			//ResultSet rs = stmt.executeQuery("select * from emp");
		}catch(SQLException e){}
		
		*/
	}
}















