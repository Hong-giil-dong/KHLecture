package jdbc07;

interface One{}
interface Two{}
class Three{}
class Four extends Three implements One, Two{ }
class Five<T>{
	private T clazz;
	public Five(T clazz){
		this.clazz = clazz;
	}
	
	public void disp(){
		System.out.println(clazz);
	}
}

class Six{
	public static <T> void disp(T src, Five<? super T> data){
		data.disp();
	}
	/*
	 * disp라는 이름으로 제네릭 타입 메서드를 선언.
	 * 타입 매개 변수는 T 하나만을 사용하였다.
	 * 첫번째 매개 변수로 "T src"로 입력
	 * 두번째 매개 변수로 Five 클래스의 객체를 입력
	 */
}
public class Exam03 {
	public static void main(String[] ar){
		Four obj = new Four();
		Six.disp(obj, new Five<One>(new One(){}));
		Six.disp(obj, new Five<Two>(new Two(){}));
		Six.disp(obj, new Five<Three>(new Three(){}));
		Six.disp(obj, new Five<Four>(new Four(){}));
		
	}
}
