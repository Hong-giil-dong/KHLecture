package day03;

public class Exam01 {
	public static void main(String[] ar){
		int h=0, m=0, t=0;
		for(int i=1;i<=5;i++)
		{
			h++; // 1 2 3 4 5
			m+=h;//(1), (1+2), (1+2+3).... 
			t+=m;//1+(1+2)+(1+2+3)....
			
		}
		System.out.println("гу = " + t);
	}
}
