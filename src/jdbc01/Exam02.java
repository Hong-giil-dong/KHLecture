package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] ar){
		Connection conn;
		String url ="jdbc:oracle:thin:@localhost:1521:orcm";
		String id = "scott"; //연동시 입력 되는 값이므로 ""부분은 생략가능
		String pass = "tiger"; //연동시 입력 되는 값이므로 ""부분은 생략가능
		Statement stmt=null;
		ResultSet rs=null;
		PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID 입력 : ");
		id = sc.nextLine();
		System.out.print("PW 입력 : ");
		pass = sc.nextLine();
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pass);
			
			pstmt = conn.prepareStatement("select * from emp where deptno=?");
			
			System.out.print("부서번호 입력 : ");
			int Input = sc.nextInt();
			pstmt.setInt(1, Input);
			stmt = conn.createStatement();
			rs = pstmt.executeQuery();
			
			/*comm이 null이 아닌 데이터 출력
			출력사항
			empno, ename, job, sal, deptno*/
			
			while(rs.next()){
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "   ");
				System.out.print(rs.getInt(4) + "\t");
				//" : " 은 보기 편하게 하려고 넣었음
				System.out.print(rs.getDate(5) + "\t");
				System.out.print(rs.getFloat(6) + "\t");
				System.out.print(rs.getInt(7) + "\t");
				System.out.println(rs.getInt(8));
				
				
			}
			rs.close();
			stmt.close();
			conn.close();
			
					
			
		}catch(ClassNotFoundException e){
			System.err.println("Driver 검색 실패");
		}catch(SQLException ee){
			System.err.println("DB 접속 실패");
		}
	}

}




