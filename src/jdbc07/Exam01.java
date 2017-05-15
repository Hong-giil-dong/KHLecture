package jdbc07;
interface First {}
interface Second{}
class Third{}
class Fourth implements First{}
class Fifth implements Second{}
class Sixth extends Third{}
class Seventh extends Third implements First, Second{}

class MyBox<T extends Third & First & Second>{}
/*
 * 제네릭 타입을 사용하는 MyBox클래스를 선언할 때 타입 매개
 * 변수로 전달받을 수 있는 타입은 First, Second, Third 모두
 * 를 상속받아 구현할 클래스로 제한 한다.
 */

class NumberBox <T extends Number>
/*
 * 제네릭 타입을 Number 클래스나 이 클래스를 상속받는 하위 
 * 클래스로 제한 한다.
 */
{
	private T number;
	public NumberBox(T number){
		this.number = number;
	}
	public boolean compare(T otherNumber){
		return number.equals(otherNumber);
		//return this.number > otherNumber;
	}
	/*
	 * 메서드의 매개 변수 T타입의 otherNumber를 입력받아 
	 * 동일한 값인지를 비교하여 결과를 반환한다.
	 * 이 메서드의 선언을 "public <T> boolean compare(T otherNumber)"
	 * 처럼 <T>를 작성해야 한다. 하지만 제네릭 타입으로 클래스를 선언
	 * 하면서 명시했기 때문에 다시 작성할 필요는 없다.
	 */
	
	
}


public class Exam01 {
	public static void main(String[] ar){
		//MyBox<Fourth> mBox_01 = new MyBox<>();
		//MyBox<Fifth> mBox_02 = new MyBox<>();
		//MyBox<Sixth> mBox_03 = new MyBox<>();
		MyBox<Seventh> mBox_04 = new MyBox<>();
		
		NumberBox<Integer> nBox = new NumberBox<>(100);
		System.out.println("check = " + nBox.compare(120));
	}
}










public class Exam01 {
	public static void main(String[] ar){
		//MyBox<Fourth> mBox_01 = new MyBox<>();
		//MyBox<Fifth> mBox_02 = new MyBox<>();
		//MyBox<Sixth> mBox_03 = new MyBox<>();
		MyBox<Seventh> mBox_04 = new MyBox<>();
		
		NumberBox<Integer> nBox = new NumberBox<>(100);
		System.out.println("check = " + nBox.compare(120));
	}
}

