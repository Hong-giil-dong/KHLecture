package day02;

public class Exam09 {
	public static void main(String[] ar){
		int a=1, b=1, c=0;
		System.out.print(a+"\t"+b+"\t");
		for(int j=1;j<=8;j++){
			c=a+b;
			System.out.print(c+"\t");
			a=b;
			b=c;
		}
	}
}
