package day23;
//통째 암기, 오라클 연동 작업 
/*C: app user2 product 11.2.0 dbhome_1 jdbc lib
ojdbc6.jar jdk 설치된 곳으로 복사
C: Java jdk1.8.0_121 jre lib ext
*/

import java.sql.Connection;
import java.sql.DriverManager;

public class Exam_jdbc {
	public static void main(String[] ar){
		Connection conn = null;
		String id = "scott";
		String pw = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:orcm";
		try{
			//Driver 연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loading Success");
			
			//Oracle DB 접속
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB 접속 성공");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
