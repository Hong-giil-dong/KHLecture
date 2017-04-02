package day09;
import java.io.IOException;

public class Exam04 {
	public static void main(String[] ar) throws IOException{
		Exam03 ex = new Exam03();
		System.out.println();
		System.out.print("รัวี : ");
		System.out.println(ex.getTot());
		System.out.println();
		ex.setTot(500);
		ex.display();
	}
}
