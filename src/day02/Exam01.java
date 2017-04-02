package day02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam01 {
	public static void main(String[] ar) throws IOException{
		/*
		 * if문 1형식
		 * if(논리형 조건)
		 *     내용_실행문;
		 *     
		 * if(논리형 조건){
		 *     내용_실행문;
		 *     내용_실행문;
		 *     내용_실행문;
		 *   }
		 * if문 2형식  
		 * if(조건)
		 *    내용 실행문; //조건이 참일경우
		 * else
		 *    내용 실행문; //거짓일때
		 *    
		 * if문 3형식
		 * if(조건)
		 *    실행문;
		 * else if(조건)
		 *    실행문;
		 * else if(조건)
		 *    실행문;
		 * else
		 *    실행문;
		 *      
		 *     
		 */
		
		/*
		System.out.print("숫자를 입력(0~9) : ");
		int num = System.in.read()-'0';
		if(num%2 == 0)
			System.out.println("짝수 입니다.");
		else
			System.out.println("홀수 입니다.");
		*/
		
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("점수 입력 : ");
		int num = Integer.parseInt(in.readLine());
		
		if(num<=100 && num>=90)
			System.out.println("수");
		else if( num>=80)
			System.out.println("우");
		else if(num>=70)
			System.out.println("미");
		else if(num>=60)
			System.out.println("양");
		else 
			System.out.println("가");
		
		//Swaping
		int a=5, b=6;
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		
		int t = a;
		a=b;
		b=t;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		
	}
}









