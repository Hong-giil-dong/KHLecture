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
		System.out.print("�Է� = ");
		a = Integer.parseInt(in.readLine());
		System.out.print("�Է� = ");
		b = Integer.parseInt(in.readLine());
		String irum = in.readLine();
		System.out.println(a +"+" + b +"="+ (a+b));
		System.out.println(a +"-" + b +"="+ (a-b));
		System.out.println(a +"*" + b +"="+ (a*b));
		System.out.println(a +"/" + b +"="+ (a/b));
	
	}
}


//���� 
/*
 * ���� ���� 2���� �Է� �޾Ƽ� ��Ģ������ ����� ��� �Ͻÿ�
 * ex)
 * A = 10
 * B = 5
 * 
 * 10+5=15
 * 10-5=5
 * 10*5=50
 * 10/5=2  
 */






