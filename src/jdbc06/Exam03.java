package jdbc06;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Exam03 {
	public static void main(String[] ar){
		ServerSocket ss = null;
		Socket soc = null;
		
		try{
			ss = new ServerSocket(12345);
			System.out.println("Server Ready...");
		}catch(Exception e){
			System.err.println("해당 포트가 열려 있습니다");
		}
		while(true){
			try{
				soc = ss.accept();
				System.out.println("접속자 정보 : " + soc.toString());
				BufferedReader in = new BufferedReader
						(new InputStreamReader(soc.getInputStream()));
				String str = in.readLine();
				System.out.println("전달 내용 : " + str);
				soc.close();
			}catch(Exception e){}
		}
		
		
		/*
		for(int i=1;i<=65535;i++){
			try{
				ss = new ServerSocket(i);
				ss.close();
			}catch(Exception e){
				System.out.println(i + "번 포트 Open 되어 있음");
			}
		}
		*/
	}
}
