package day01;
import java.io.*;
public class Exam10 {

	public static void main(String[] args) 
		throws IOException
	{
		String name;
		int kor, mat, eng, tot;
		float ave;
		
		BufferedReader in = new BufferedReader
				(new InputStreamReader(System.in));
		
		System.out.print("이름 : ");
		name = in.readLine();
		System.out.print("국어 : ");
		kor = Integer.parseInt(in.readLine());
		System.out.print("영어 : ");
		eng = Integer.parseInt(in.readLine());
		System.out.print("수학 : ");
		mat = Integer.parseInt(in.readLine());
		
		tot = kor + eng + mat;
		ave = tot/3.0f;
		
		int num = Integer.parseInt(in.readLine());
		String number = (num%2==0)?"짝수" : "홀수";
		System.out.println(num + "는 " + number);
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+ave);
		
		// 변수 = 조건 ? 참 : 거짓;
		
		

	}

}







