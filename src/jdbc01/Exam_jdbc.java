package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exam_jdbc {
	public static void main(String[] ar){
		Connection conn = null;
		String id = "scott";
		String pw = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try{
			//Driver ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loading Success");
			
			//Oracle DB ����
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB ���� ����");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
