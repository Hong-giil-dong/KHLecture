package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Exam03 {
	public static void main(String[] ar){
		Connection conn;
		String url ="jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pass = "tiger";
		Statement stmt=null;
		ResultSet rs=null;
		PreparedStatement pstmt=null;
		
		Scanner sc = new Scanner(System.in);	
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pass);
			String query="insert into emp_copy(empno, ename, job, mgr, sal, deptno)"
					+" values(?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			stmt = conn.createStatement();
			/*
			rs = stmt.executeQuery("select * from emp_copy");
			
			System.out.print("사원번호 : ");
			int empno = sc.nextInt();
			System.out.print("사원이름 : ");
			String ename = sc.next();
			System.out.print("직급 : ");
			String job = sc.next();
			System.out.print("관리자 : ");
			int mgr = sc.nextInt();
			System.out.print("급여 : ");
			int sal = sc.nextInt();
			System.out.print("부서번호 : ");
			int deptno = sc.nextInt();
			
			pstmt.setInt(1, empno);
			pstmt.setString(2, ename);
			pstmt.setString(3, job);
			pstmt.setInt(4, mgr);
			pstmt.setInt(5, sal);
			pstmt.setInt(6, deptno);
			
			System.out.println(empno+ename+job+mgr+sal+deptno);
			
			pstmt.executeUpdate();
			*/
			rs = stmt.executeQuery("select * from emp_copy");
			while(rs.next()){
				System.out.print(rs.getInt("empno")+"\t");
				System.out.print(rs.getString("ename")+"\t\t");
				System.out.print(rs.getString("job")+"\t\t");
				System.out.print(rs.getInt("mgr")+"\t\t");
				System.out.print(rs.getDate("hiredate")+"\t");
				System.out.print(rs.getInt("sal")+"\t\t");
				System.out.print(rs.getInt("comm")+"\t\t");
				System.out.println(rs.getInt("deptno"));
				
				
			}
			
			rs.close();
			stmt.close();
			pstmt.close();
			conn.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
