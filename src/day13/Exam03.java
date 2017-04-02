package day13;
/**
 * 
 * 인터페이스의 정의
 * 1. 다중 상속을 위한 클래스 선언
 * 2. 다형성에 의한 클래스 제어
 * 
 * 인터페이 포함 멤버
 * 1. 필드
 *  - 무조건 public static final 멤버 필드 이다.
 *  - public static final을 기술 하던 static만 기재하던 
 *  또는 아무것도 기재 하지 않던 무조건 public static final로 인식을 한다.
 * 2. 메소드
 *  - 무조건 public abstract 메서드 이다.
 *  - 정의부를 가질 수 없다.
 *  - 인터페이스도 다형성이 목적이므로 모든 메서드에는 abstract가 붙는다.
 * 3. 정적 중첩 클래스
 *  - 인터페이스가 가지는 중첩 클래스는 자동적으로 static이 붙는다.      
 *
 */

/*
interface A{
	
}
interface B{
	
}
interface C extends A, B{
	
}

class E{
	
}

class F { }
class D extends E, F{ }
*/

interface A1{
	int w = 10;
	static int x = 20;
	final int y = 30;
	public static final int z = 40;
	public abstract void aaa();
}

class B1 implements A1{
	public void aaa(){
		System.out.println("aaa메소드");
	}
	public void bbb(){
		System.out.println("bbb메소드");
	}
}
public class Exam03 {
	public static void main(String[] ar){
		/*A1 ap = new A1();
		ap.w = 100;
		System.out.println("ap.w = " + ap.w); //10
		System.out.println("ap.x = " + ap.x); //20
		System.out.println("ap.y = " + ap.y); //30
		System.out.println("ap.z = " + ap.z); //40*/
		B1 ap = new B1();
		ap.aaa();
		ap.bbb();
	}
}







































