package day13;
abstract class A{
	/**
	 * 일반 클래스의 멤버(Field, Method, Construct-생성자), 추상 메서드를 가진다.
	 * 추상 메소드는 내용부를 가지지 않고 이름만 가지고 있는 메소드 이다.
	 * 반드시 오버라이딩(재정의)이 되어야만 한다. 
	 * 
	 * 추상 클래스를 상속받은 클래스는 추상 클래스의 추상 메소드를 반드시 오버라이딩을 하여야 한다.
	 * 만일 재정의를 하지 않으면 상속을 받은 하위 클래스도 추상 클래스로 인식을 하게 된다.
	 * 
	 */
	public abstract void disp();
}

class B extends A{

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Success");
		
	} //Overriding Error
	
}
public class Exam01 {
	public static void main(String[] ar){
		//A ap = new A(); //컴파일 에러, 객체 생성 불가
		B bp = new B();
		A cp = new B();
		
		bp.disp();
		cp.disp();
	}
}
