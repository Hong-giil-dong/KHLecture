package day02;
import java.io.*;
import java.util.*;
public class Exam06 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		int num, year = 0;
		String gender="";
		System.out.print("7��° �� : ");
		num = Integer.parseInt(sc.nextLine());
		if(num%2==0)
			gender = "����";
		else
			gender = "����";
		
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
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			System.exit(-1);//���α׷� ����
		}
		
		System.out.println("����� "+year+
				"���� "+gender+"�Դϴ�.");
		
	}

}
