package day03;
import java.util.Scanner;

/**
 * 윤년 구하는 프로그램 만들기
 * 처리조건
 * 1. 윤년인지 판단 하고자 하는 년도 입력
 * 2. 윤년은 4년에 한번 이다.
 * 3. 단, 100으로 나누어 떨어지는 해는 윤년이 아님
 * 4. 단, 100으로 나누어 떨어지는 해 중에서 400으로 
 *        나누어 떨어지는 해는 윤년이다. 
 * 입력 
 *    연도를 입력 : 2000
 * 출력
 *    2000년은 윤년입니다.
 */
public class Exam02 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		int year =0;
		boolean bool=false;
		
		System.out.print("연도를 입력 하세요 : ");
		year = Integer.parseInt(sc.nextLine());
		if(year%4 == 0 && year%100!=0 ||year%400==0)
			bool=true;
		System.out.println();
		
		System.out.print(year + "년은 ");
		System.out.print(bool?"윤년":"평년" + "입니다.");
		//조건?참:거짓 ==> 3항 연산자
	}

}
