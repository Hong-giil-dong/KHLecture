package jdbc03;

import java.sql.*;
import java.io.*;
import java.util.*;
import java.util.Date;

public class DBConn {
	private File log = new File("db.log");
	private PrintWriter log_out;
	private String driver, url, id, pass;
	private Connection conn;
	private DBConn(){
		try{
			File data = new File("dbinfo.iei");
			BufferedReader data_in = new BufferedReader
					(new FileReader(data));
			driver = data_in.readLine();
			url = data_in.readLine();
			id = data_in.readLine();
			pass= data_in.readLine();
			data_in.close();
			log_out = new PrintWriter(new BufferedWriter(
					new FileWriter(log, true)));
			//true로 설정을 하면 기존 데이터를 유지하면서 추가 된다.
		}catch(IOException e){
			e.toString();
		}
		//DB연결및 로그 파일 생성
		//드라이버 연결
		try{
			Class.forName(driver);
			log_out.println(new Date() + " : Driver 검색 완료 !!");
			log_out.flush();
		}catch(ClassNotFoundException e){
			log_out.println(new Date() + " : Driver 검색 실패 !!");
			log_out.flush();
			System.exit(-1);
		}
		//DB연결
		try{
			conn = DriverManager.getConnection(url,id, pass);
			log_out.println(new Date() + " : Connection 생성 완료 !!");
			log_out.flush();
		}catch(SQLException e){
			log_out.println(new Date() + " : Connection 생성 실패 !!");
			log_out.flush();
			System.exit(-1);
		}
	}
	public static DBConn getInstance(){
		return new DBConn();
	}
	public Connection getConn(){
		return conn;
	}
	
	public Statement getStmt(){
		Statement stmt = null;
		try{
			stmt = conn.createStatement();
			log_out.println(new Date() + " : Statement객체 생성 성공!!");
			log_out.flush();
		}catch(SQLException e){
			log_out.println(new Date() + " : Statement객체 생성 실패!!");
			log_out.flush();
		}
		return stmt;
	}
	
	public PreparedStatement getPstmt(String query){
		PreparedStatement pstmt = null;
		try{
			pstmt = conn.prepareStatement(query);
			log_out.println(new Date() + " : PreparedStatement객체 생성 성공!!");
			log_out.flush();
		}catch(SQLException e){
			log_out.println(new Date() + " : PreparedStatement객체 생성 실패!!");
			log_out.flush();
		}
		return pstmt;
	}
	
	public void close(){
		if(conn!=null){
			try{
				if(!conn.isClosed()){
					conn.close();
					log_out.println(new Date() + " : Connection 객체 해제 성공!!");
					log_out.flush();
				}
				
			}catch(SQLException e){
				log_out.println(new Date() + " : Connection 객체 해제 실패!!");
				log_out.flush();
			}
			conn = null;
		}
	}

}






















