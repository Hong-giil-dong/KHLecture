package jdbc06;
import java.net.*;
public class Exam01 {
	public static void main(String[] ar){
		InetAddress[] ia1=null;
		InetAddress ia2=null;
		
		try{
			ia1 = InetAddress.getAllByName("www.daum.net");
			ia2 = InetAddress.getLocalHost();
		}catch(Exception e){
			System.err.println("유효하지 않은 사이트");
		}
		
		for(int i=0;i<ia1.length;i++){
			System.out.println("www.iei.or.kr = " + ia1[i].getHostAddress());
		}
		System.out.println("현재 주소 = " + ia2.getHostAddress());
		
	}

}
