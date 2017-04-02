package day02;
import java.io.IOException;

public class Exam02 {
	public static void main(String[] ar) throws IOException{
		System.out.print("값 : ");
		int num = System.in.read()-48;
		
		if((num%3==0) && (num%5==0))
			System.out.println("3과 5의 배수 입니다.");
		else
			System.out.println("3과 5의 배수가 아닙니다.");
	}

}
