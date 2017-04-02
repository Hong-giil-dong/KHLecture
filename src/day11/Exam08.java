class A5{
	int x = 100;
}
class B5 extends A5{
	//super.x = 200;
	int y = 200;
}
public class Exam08 {
	public static void main(String[] ar){
		A5 ap = new B5();
		B5 bp = new B5();
		System.out.println("x = " + ap.x);
		System.out.println("x = " + bp.x);
	}

}
