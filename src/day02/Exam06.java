package day02;
import java.io.*;
import java.util.*;
public class Exam06 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		int num, year = 0;
		String gender="";
		System.out.print("7번째 값 : ");
		num = Integer.parseInt(sc.nextLine());
		if(num%2==0)
			gender = "여성";
		else
			gender = "남성";
		
		switch(num){
		case 1:
		case 2:
			year=1900;
			break;
		case 3:
		case 4:
			year=2000;
			break;
		case 9:
		case 0:
			year=1800;
			break;
		default:
			System.out.println("잘못 입력 하셨습니다.");
			System.exit(-1);//프로그램 종료
		}
		
		System.out.println("당신은 "+year+
				"년대생 "+gender+"입니다.");
		
	}

}
