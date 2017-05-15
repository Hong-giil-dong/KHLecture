package jdbc06;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Exam04 {
	public static void main(String[] ar){
		InetAddress ia1 = null;
		Socket soc = null;
		PrintWriter out = null;
		try{
			ia1 = InetAddress.getByName("192.168.30.28");
			soc = new Socket(ia1,12345);
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())));
			
		}catch(Exception e){
			System.err.println("접속 오류 : " + e.toString());
		}
		
		out.println("전용호" + "\n");
		out.flush();
		out.close();
	}
}







