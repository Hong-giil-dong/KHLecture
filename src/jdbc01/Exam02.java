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
		String id = "scott"; //������ �Է� �Ǵ� ���̹Ƿ� ""�κ��� ��������
		String pass = "tiger"; //������ �Է� �Ǵ� ���̹Ƿ� ""�κ��� ��������
		Statement stmt=null;
		ResultSet rs=null;
		PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID �Է� : ");
		id = sc.nextLine();
		System.out.print("PW �Է� : ");
		pass = sc.nextLine();
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pass);
			
			pstmt = conn.prepareStatement("select * from emp where deptno=?");
			
			System.out.print("�μ���ȣ �Է� : ");
			int Input = sc.nextInt();
			pstmt.setInt(1, Input);
			stmt = conn.createStatement();
			rs = pstmt.executeQuery();
			
			/*comm�� null�� �ƴ� ������ ���
			��»���
			empno, ename, job, sal, deptno*/
			
			while(rs.next()){
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "   ");
				System.out.print(rs.getInt(4) + "\t");
				//" : " �� ���� ���ϰ� �Ϸ��� �־���
				System.out.print(rs.getDate(5) + "\t");
				System.out.print(rs.getFloat(6) + "\t");
				System.out.print(rs.getInt(7) + "\t");
				System.out.println(rs.getInt(8));
				
				
			}
			rs.close();
			stmt.close();
			conn.close();
			
					
			
		}catch(ClassNotFoundException e){
			System.err.println("Driver �˻� ����");
		}catch(SQLException ee){
			System.err.println("DB ���� ����");
		}
	}

}




