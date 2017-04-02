package day15;
import java.io.IOException;

public class Exam05 {
	public static void main(String[] ar) throws IOException{
		Runtime rt = Runtime.getRuntime();
		System.out.println("1. ?Ñ§?ù¥Î≤?  2. ?ã§?ùå  : ");
		int x = System.in.read()-48;
		System.in.read();
		System.in.read();
		String str;
		if(x==1){
			str = "http://www.naver.com";
		}else{
			str = "http://www.daum.net";
		}
		
		rt.exec("iexplore " + str);
	}

}
