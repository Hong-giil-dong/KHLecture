package day10;
class Outer2{
	private static int x = 100;
	static class Inner2{
		private int y=200;
		public void aaa(){
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
	}
}
public class Exam03 {
	
		public static void main(String[] ar){
			//Outer2.Inner2 oi = new Outer2.Inner2();
			//oi.aaa();
			System.out.println("Inner 클래스 내부의 main");
		}
	
	
}
