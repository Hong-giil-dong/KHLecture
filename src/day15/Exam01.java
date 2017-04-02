package day15;
import java.io.IOException;

public class Exam01 {
	public static void main(String[] ar) throws IOException {
		try{
			System.out.print("X = ");
			int x = System.in.read();
		}catch(Exception e){
			System.err.println("Error = "+ e.toString());
			System.exit(0);
		}
		
	}
}
