package day01;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exam09 {
	public static void main(String[] ar)
		throws java.io.IOException
	{
		BufferedReader in = new BufferedReader
				(new InputStreamReader(System.in));
		
		int a, b, c;
		System.out.print("입력 = ");
		a = Integer.parseInt(in.readLine());
		System.out.print("입력 = ");
		b = Integer.parseInt(in.readLine());
		String irum = in.readLine();
		System.out.println(a +"+" + b +"="+ (a+b));
		System.out.println(a +"-" + b +"="+ (a-b));
		System.out.println(a +"*" + b +"="+ (a*b));
		System.out.println(a +"/" + b +"="+ (a/b));
	
	}
}


//문제 
/*
 * 임의 숫자 2개를 입력 받아서 사칙연산의 결과를 출력 하시외
 * ex)
 * A = 10
 * B = 5
 * 
 * 10+5=15
 * 10-5=5
 * 10*5=50
 * 10/5=2  
 */






