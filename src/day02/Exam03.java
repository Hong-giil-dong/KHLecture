package day02;
import java.io.*;
import java.util.Scanner;
public class Exam03 {

	public static void main(String[] args) 
		throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int temp;
		System.out.print("첫번째 값 : ");
		int first = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 값 : ");
		int second = Integer.parseInt(sc.nextLine());
		System.out.print("세번째 값 : ");
		int third = Integer.parseInt(sc.nextLine());
		
		if(first<second && second>third){
			temp = first;
			first = second;
			second = temp;
		}else if(third > first && third > second){
			temp = first;
			first = third;
			third = temp;
		}
		
		if(third > second){
			temp = second;
			second = third;
			third = temp;
		}
		
		System.out.println();
		System.out.println(first +"\t"+second+"\t"+third);
		
		
	}

}






