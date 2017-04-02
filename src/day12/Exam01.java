package day12;
import java.io.*;

/**
 * 
 * 3과목의 점수를 입력받아 총점 평균 석차를 출력하는 프로그램을 
 * 클래스로 적절히 나누어 작성 하시오.
 * 최대 10명의 학생의 점수를 입력 받을수 있다.
 *
 */
public class Exam01 {
	public static void main(String[] ar) throws IOException{
		Sung[] sc = new Calc[10]; //다형성 적용	
		int[] rank = new int[10];
		
		
		for(int i=0;i<3;i++){
			
			sc[i] = new Calc();
			sc[i].calculation();
			
		}
		
		
		for(int i=0;i<3;i++){
			rank[i]=1;
			for(int j=0;j<3;j++){
				if(sc[i].tot<sc[j].tot){
					rank[i]++;
				}
			}
		}
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int i=0;i<3;i++){
			sc[i].disp();
			System.out.println("\t" + rank[i]);
		}
		
		
	}

}
