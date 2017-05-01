package jdbc06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Exam02 {
	public static void main(String[] ar){
			InetAddress ia1 = null;
			Socket sc = null;
			PrintWriter out = null;
			BufferedReader in = null;
			try{
				ia1 = InetAddress.getByName("www.iei.or.kr");
				sc = new Socket(ia1,80);//접속 하기 위한 포트
				out = new PrintWriter(new BufferedWriter
						(new OutputStreamWriter(sc.getOutputStream())));
				in = new BufferedReader(new InputStreamReader
						(sc.getInputStream())	);
						
			}catch(Exception e){
				System.err.println("연결 오류 : " + e.toString());
				System.exit(-1);
			}
			
			try{
				out.println("GET http://www.iei.or.kr/" + "index.jsp HTTP/1.0\r\n\n");
				out.flush();
				
				while(true){
					String str = in.readLine();
					if(str == null) break;
					System.out.println(str);
				}
				sc.shutdownOutput();
				sc.shutdownInput();
				sc.close();
			}catch(Exception e){
				
			}
	}
}
