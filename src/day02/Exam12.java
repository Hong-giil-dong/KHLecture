package day02;
import java.io.*;
public class Exam12 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		int kor, mat, eng, tot=0;
		float ave;
		
		do{
			System.out.print("국어 = ");
			kor=Integer.parseInt(in.readLine());
		}while(!(kor>=0) || !(kor<=100));
		
		do{
			System.out.print("영어 = ");
			eng=Integer.parseInt(in.readLine());
		}while(!(eng>=0) || !(eng<=100));
		
		do{
			System.out.print("수학 = ");
			mat=Integer.parseInt(in.readLine());
		}while(!(mat>=0) || !(mat<=100));
		
		tot = kor + eng + mat;
		ave = ((int)(((tot / 3.0f) + 0.05f) * 10)/10.0f) ;
		
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + ave);
		
		
		

	}

}
