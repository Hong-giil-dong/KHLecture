package day02;
import java.io.*;
public class Exam11 {
	public static void main(String[] ar) throws IOException{
		while(true){
			System.out.println("JAVA");
			System.out.print("계속(y/n) :");
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
		 * 국어, 영어, 수학 점수를 입력 받아서
		 * 총점과 평균을 구하여 출력하시오.
		 * (단, 평균은 소수 2자리에서 반올림하여 1자리 
		 * 까지 출력 하고 각 과목의 점수는 0 ~ 100사이의 
		 * 수 만 입력받을 수 있다.)
		 * 
		 */
		
	}

}















