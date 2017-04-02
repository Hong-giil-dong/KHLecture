package day02;
import java.io.IOException;
import java.util.Scanner;

/*
 * while(조건){
 *   조건을 만족 하는 동안만 반복
 *   선조건 후처리
 * }
 * 
 * do{
 *   선처리 후조건
 * }while(조건);
 * 
 * 
 */
public class Exam10 {
	public static void main(String[] ar)
		throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int i=0;
		
		while(i<=10){
			String st = sc.nextLine();
			if(st.equals("Q"))
				break;
			System.out.println(i);
			i++;
		}
		
	}

}






