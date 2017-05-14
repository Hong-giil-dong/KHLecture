package jdbc02;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam05 {
	private Connection conn;
	public Exam05() {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		}catch(ClassNotFoundException e){
			System.out.println("드라이버 로드 실패");
			return;
		}
		String url = "jdbc:oracle:thin:@localhost:1521:orcm";
		String id = "scott";
		String pass = "tiger";

		try{
			conn = DriverManager.getConnection(url,id, pass);
			System.out.println("DB 커넥션 성공");
		}catch(SQLException e){
			System.out.println("DB 커넥션 실패");
			return;
		}
	}

	//회원 가입 처리 메소드
	public boolean registerMember(String name, String id, 
			String pass, String email){
		String query = "insert into users values(pnum_seq.nextval, ?,?,?,?)";
		try{
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			pstmt.setString(3, pass);
			pstmt.setString(4, email);
			pstmt.executeUpdate();
			pstmt.close();
			System.err.println("회원 가입 성공");		
		}catch(SQLException e){
			System.err.println("회원 가입 실패");
			return false;
		}
		return true;
	}
	//회원 정보 수정 처리....
	public boolean editMember(String name, String id, 
			String pass, String email){

		System.out.println("회원정보 수정 처리 작업 시작");
		String query = "update users set pname=?, ppassword=?, pemail=? where id=?";
		try{
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, pass);
			pstmt.setString(4, email);

			pstmt.executeUpdate();
			pstmt.close();	
			System.err.println("회원 정보 수정 성공");	
		}catch(SQLException e){
			System.out.println("회원 정보 수정 실패");
			return false;
		}
		return true;
	}

	
	public boolean deleteMember(String id, String pass){
		System.out.println("회원 정보를 삭제합니다.");
		 String query = "delete from users where pid=?";
		 try{
				PreparedStatement pstmt = conn.prepareStatement(query);
				pstmt.setString(1, id);
				//pstmt.setString(2, pass);

				pstmt.executeUpdate();
				pstmt.close();	
				System.err.println("회원 정보 삭제 성공");	
			}catch(SQLException e){
				System.err.println("회원 정보 삭제 실패");
				return false;
			}
		return true;
	}
	//삭제

	//login 처리
	public boolean loginMember(String id, String pass) {
		String query="select * from users where pid=? and ppassword=?";
		try{
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);

			ResultSet rs = pstmt.executeQuery();
			if(!rs.next()){
				rs.close();
				pstmt.close();
				return false;
			}
		/*	System.err.println("Login 성공");*/
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			System.err.println("Login 실패");
			return false;
		}
		return true;
	}
}











