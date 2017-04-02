class A1{
	protected int x = 100;
	private int y = 300;
}

class B1 extends A1{
	private int x = 200;
	public void disp(){
		super.x = 50;
		System.out.println("A1 클래스 X = " + super.x);
		//System.out.println("A1 클래스 Y = " + super.y);
		System.out.println("B1 클래스 X = " + this.x);
	}
}
public class Exam03 {
	public static void main(String[] ar){
		B1 bp = new B1();
		bp.disp();
	}

}
