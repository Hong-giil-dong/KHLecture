package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exam01 {
	public static void main(String[] ar){
		//드라이버 연결
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 드라이버 검색 성공");
			
			//Class.forName("org.gjt.mm.mysql.Driver");
			//System.out.println("MySql 드라이버 검색 성공");
		}catch(ClassNotFoundException e){
			System.err.println("드라이버 검색 실패");
		}
		Connection conn = null;
		String id = "scott";
		String pass = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		//MySql : "jdbc:mysql://localhost:3306:java"
		
		try{
			conn = DriverManager.getConnection(url, id, pass);
			System.out.println("연결 성공");
		}catch(SQLException e){
			System.err.println("연결 실패");
		}
		
		try{
			Statement stmt = conn.createStatement();
			System.out.println("객체 생성 성공");
		}catch(SQLException e){
			System.err.println("생성 실패 : " + e.toString());
		}
		/*
		try{
			//ResultSet rs = stmt.executeQuery("select * from emp");
		}catch(SQLException e){}
		
		*/
	}
}















