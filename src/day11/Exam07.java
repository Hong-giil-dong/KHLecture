//다형성에서 멤버 필드로의 접근
// 필드는 다형성으로 표현 되었을 때는 객체를 통해 부모 클래스의 멤버 필드에만 접근
class A4{
	int x = 100;
}

class B4 extends A4{
	int y = 200;
}

public class Exam07 { 
	public static void main(String[] ar){
		A4 ap = new B4(); //다형적 표현
		//B4 bp = new A4();
		System.out.println("x = " + ap.x);
		//System.out.println("y = " + ap.y);
		//ap내에 들어 있는 범위는 B4클래스(자식클래스)의 인스턴스 이다.
		// 그러나 ap자체가 A4클래스(부모클래스)의 객체인 다형적 표현이기 때문에 
		//접근할 수 있는 필드는 A4클래스(부모클래스)의 멤버인 x에 국한 된다.
	}

}
