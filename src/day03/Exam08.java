package day03;
/**
 * 
 * 1+3+6+10+15+21+28+36+45+55
 * ������ ���� �Է� �޾Ƽ� �� ���� ����� ��� ���Ͻÿ�.
 */
import java.io.*;
public class Exam08 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int val;
		System.out.print("�� : ");
		val = Integer.parseInt(in.readLine());
		for(int i=1;i<=val ;i++){
			if(val%i==0)
				System.out.print(i+"\t");
		}
		
	}
	

}
