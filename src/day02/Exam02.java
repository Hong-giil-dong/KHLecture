package day02;
import java.io.IOException;

public class Exam02 {
	public static void main(String[] ar) throws IOException{
		System.out.print("�� : ");
		int num = System.in.read()-48;
		
		if((num%3==0) && (num%5==0))
			System.out.println("3�� 5�� ��� �Դϴ�.");
		else
			System.out.println("3�� 5�� ����� �ƴմϴ�.");
	}

}
