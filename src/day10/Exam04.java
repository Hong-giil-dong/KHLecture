package day10;

public class Exam04 {
	public static void main(String[] ar){
		int x = 100;
		class Inner4{
			int y = 200;
		}
		Inner4 in = new Inner4();
		System.out.println("X = " + x);
		System.out.println("Y = " + in.y);
	}

}
