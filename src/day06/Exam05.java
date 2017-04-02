package day06;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ¹ü¿ë ¸Þ¼Òµå ÀÛ¼º ¿¹
public class Exam05 {
	public static String getIrum(String str) throws IOException{
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.print(str + " : ");
		String irum = in.readLine();
		return irum;
		
	}
	
	
	public static void main(String[] ar) throws IOException{
		Exam06 ex06 = new Exam06(); 
		
		String name = getIrum("ÀÌ¸§");
		System.out.println(name +"´Ô ¾È³çÇÏ¼î!!!");
		int a = ex06.getValue("¸Þ·Õ");
		System.out.print(a);
		
		
		
		
		
	}

}




