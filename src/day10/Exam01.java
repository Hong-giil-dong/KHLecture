package day10;
class Outer{
	private int x = 100;
	
	class Inner{
		private int y = 200;	
	}
	
	public void aaa(){
		// Outer.Inner in = this.new Inner(); 선원 원형
		Inner in = new Inner();
		System.out.println("X = " + x);
		System.out.println("Y = " + in.y);
	}
}



public class Exam01 {
	public static void main(String[] ar){
		Outer ot = new Outer();
		Outer.Inner oi = ot.new Inner();
		ot.aaa();
	}
}
