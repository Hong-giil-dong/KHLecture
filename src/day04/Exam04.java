package day04;
import java.util.Scanner;

public class Exam04 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		int data[] = new int[5];
		int min=100, max=0;
		
		for(int i=0;i<data.length;i++){
			System.out.print("°ª ÀÔ·Â(1 - 100) : ");
			data[i] = Integer.parseInt(sc.nextLine());
			
			if(max < data[i])
				max = data[i];
			if(min > data[i])
				min = data[i];
		}
		
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}
}
