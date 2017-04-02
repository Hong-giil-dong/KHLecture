package day04;
import java.util.Scanner;

public class Exam01 {
	public static void main(String[] ar){
		//배열의 선언
		int[] sung;
		int sung1[] ={1,2,3};//초기값 부여
		
		String[] kwa={"국어","영어","수학"};
		
		//배열의 초기화(생성)
		sung = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			System.out.print(kwa[i]+" : ");
			sung[i]=Integer.parseInt(sc.nextLine());
		}
		
		for(int i=0;i<3;i++){
			System.out.println(kwa[i]+" : " + sung[i]);
			
		}
		/**
		 *  3명의 국어, 영어, 수학 점수를 각각 입력 받아서
		 *  각각의 총점과 평균을 모두 구하시오.
		 *  <<출력 예시>>
		 *  번호		국어		영어		수학		총점		평균
		 */
	}
}







