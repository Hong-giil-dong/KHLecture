package day08;
import java.io.IOException;

public class Exam05 {
	private int x = 10;
	public static void main(String[] ar) throws IOException{
		Exam05 ex05 = new Exam05();
		System.out.println("X = " + ex05.x);
		
		Exam05_Other ex05_ot = new Exam05_Other();
		System.out.println("X = " + ex05_ot.x);
		
		SungJuk ex = new SungJuk(); 
	}
}

class Exam05_Other{
	protected int x = 20;
	
	final float PI = 3.1415f;
	
	PI = 123.456f;
}












