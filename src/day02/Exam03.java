package day02;
import java.io.*;
import java.util.Scanner;
public class Exam03 {

	public static void main(String[] args) 
		throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int temp;
		System.out.print("ù��° �� : ");
		int first = Integer.parseInt(sc.nextLine());
		System.out.print("�ι�° �� : ");
		int second = Integer.parseInt(sc.nextLine());
		System.out.print("����° �� : ");
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






