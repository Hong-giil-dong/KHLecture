package day10;

public class Exam05 {
	public static void main(String[] ar){
		final int x = 100;
		class Inner5{
			int y=200;
			public void aaa(){
				System.out.println("X = " + x);
				System.out.println("Y = " + y);
			}
		}
		
		Inner5 in = new Inner5();
		in.aaa();
	}
}
