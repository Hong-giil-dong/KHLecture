package day01;
import java.io.IOException;

public class Exam08 {
	public static void main(String[] ar) 
			throws IOException{
		int a, b;
		int c=0;
		System.out.print("입력1 : ");
		a = System.in.read()-48;
		
		System.in.read();
		System.in.read();
		
		System.out.print("입력2 : ");
		b = System.in.read()-48;
		
		c=a+b;
		/*
		System.in.read();
		System.in.read();
		*/
		System.out.println("c = " + c);
	}
}
