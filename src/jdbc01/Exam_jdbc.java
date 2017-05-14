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
			//Driver 楷搬
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loading Success");
			
			//Oracle DB 立加
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB 立加 己傍");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
