package day02;
import java.io.*;
public class Exam11 {
	public static void main(String[] ar) throws IOException{
		while(true){
			System.out.println("JAVA");
			System.out.print("���(y/n) :");
			char ch = (char)System.in.read();
			System.in.read();
			System.in.read();
			
			if(ch=='n' || ch=='N')
				break;
		}
		
		int kor=0;
		do{
			kor=-10;
		}while(!(kor>=0) || !(kor<=100));
		
		/**
		 * ����, ����, ���� ������ �Է� �޾Ƽ�
		 * ������ ����� ���Ͽ� ����Ͻÿ�.
		 * (��, ����� �Ҽ� 2�ڸ����� �ݿø��Ͽ� 1�ڸ� 
		 * ���� ��� �ϰ� �� ������ ������ 0 ~ 100������ 
		 * �� �� �Է¹��� �� �ִ�.)
		 * 
		 */
		
	}

}















