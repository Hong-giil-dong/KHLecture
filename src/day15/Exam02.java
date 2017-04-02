package day15;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam02 {
	public static void main(String[] ar){
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		String url ="jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pw = "tiger";
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("?ìú?ùº?ù¥Î≤? Î°úÎìú");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB ?†ë?Üç ?Ñ±Í≥?");
		}catch(ClassNotFoundException e){
			System.err.println("Error-Driver : " + e.toString());
			e.printStackTrace();
		}catch(SQLException e){
			System.err.println("Error-SQL : " + e.toString());
		}finally{
			System.out.println("?ûë?óÖ Ï¢ÖÎ£å");
		}
	}

}











