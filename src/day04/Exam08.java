package day04;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 5명의 학생의 국어, 영어, 수학 점수를 입력 받아서
 * 총점과 평균을 구하고 총점을 기준으로 석차를 출력 하시오.
 * (단, 평균은 소수점 이하 2자리 까지 표시하시오.)
 * <입력>
 * 이름 :
 * 국어 :
 * 영어 :
 * 수학 :
 * 
 * <<출력>>
 * 이름 국어 영어  수학 총점 평균 석차
 
 */
public class Exam08 {
	public static void main(String[] ar){
		//각종 선언문
		Scanner sc = new Scanner(System.in);
		BufferedReader in = new BufferedReader
					(new InputStreamReader(System.in));
		//입력 변수(배열)
		String[] irum = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] mat = new int[5];
		
		int[][] sungjuk = new int[5][3];
		
		//출력 변수(계산 또는 가공)
		int[] tot = new int[5];
		int[] rank = new int[5];
		float[] ave = new float[5];
		//임시 변수
		String[] kwa = {"국어","영어","수학"};
		//입력
		for(int i=0;i<irum.length;i++){
			System.out.print("이름 : ");
				irum[i] = sc.nextLine();
			tot[i]=0;	
			for(int l=0;l<sungjuk[0].length;l++){
				System.out.print(kwa[i]);
				sungjuk[i][l] = Integer.parseInt(sc.nextLine());
				tot[i]+=sungjuk[i][l];
			}
				
		//////////////////////////////////////////		
				System.out.print("국어 : ");
				kor[i]=Integer.parseInt(sc.nextLine());
			System.out.print("영어 : ");
				eng[i]=Integer.parseInt(sc.nextLine());
			System.out.print("수학 : ");
				mat[i]=Integer.parseInt(sc.nextLine());
				
			tot[i]=kor[i]+eng[i]+mat[i];
			ave[i]=tot[i]/3.0f;					
		}
		
		//계산(처리, 가공)
		for(int i=0;i<kor.length;i++){ //총점, 평균 계산
			tot[i]=kor[i]+eng[i]+mat[i];
			ave[i]=tot[i]/3.0f;
		}
		
		for(int i=0;i<tot.length;i++){ //석차 구하기
			
			rank[i]=1;
			for(int j=0;j<tot.length;j++){
				if(tot[i]<tot[j])
					rank[i]++;
			}
		}
		
		//출력
		
		
		
	}
	

}










