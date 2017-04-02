package day04;
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] ar){
		
		//사용할 변수 및 배열의 선언 과 생성
		Scanner sc = new Scanner(System.in);
		int[] kor, mat, eng, tot;
		float[] ave;
		String[] irum;
		
		kor = new int[3];
		eng = new int[3];
		mat = new int[3];
		tot = new int[3];
		ave = new float[3];
		irum = new String[3];
		
		
		//자료의 입력
		for(int i=0;i<3;i++){
			System.out.print("이름 : ");
				irum[i] = sc.nextLine();
			System.out.print("국어 : ");
				kor[i]=Integer.parseInt(sc.nextLine());
			System.out.print("영어 : ");
				eng[i]=Integer.parseInt(sc.nextLine());
			System.out.print("수학 : ");
				mat[i]=Integer.parseInt(sc.nextLine());
		}
		
		
		//자료 처리(계산)
		for(int i=0;i<3;i++){
			tot[i]=kor[i]+mat[i]+eng[i];
			ave[i]=tot[i]/3.0f;
		}
		
		
		// 자료 출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균" );
		for(int i=0;i<3;i++){
			System.out.println(irum[i]+"\t"+kor[i]+"\t"+eng[i]+
					"\t"+mat[i]+"\t"+tot[i]+"\t"+ave[i]);
		}
		
		
	}
}
