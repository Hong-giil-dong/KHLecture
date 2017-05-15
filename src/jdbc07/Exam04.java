package jdbc07;

enum EnumDay{ //열거형으로 EnumDay를 선언
	SUNDAY(0,"일"),
	MONDAY(1,"월"),
	TUESDAY(2,"화"),
	WENDESDAY(3,"수"),
	THURSDAY(4,"목"),
	FRIDAY(5,"금"),
	SATURDAY(6,"토");
	// 열거형 EnumDay에 요일에 관련된 7개의 상수 필드를 선언
	// 각 상수 필드는 int와 String을 매개 변수로 가지는 내부 생성자
	// 메서드를 사용해 초기화되과 전달받은 각 값은 position, dayString
	// 에 저장 된다.
	
	private int position;
	private String dayString;
	
	//각 상수 필드의 정보를 저장할 내부 필드 선언
	
	EnumDay(int pos, String word){
		this.position = pos;
		this.dayString = word;
	}

	public int getPosition() {
		return position;
	}

	public String getDayString() {
		return dayString;
	}
	
	public String toString(){
		return dayString + "요일(" + position + ")";
	}
	// toString() 메소드를 오버라이딩 하여 열거형의 객체나 상수 필드를 
	// 출력할 때 실행될 수 있도록 한다.
	
	//static 메서드로 특정한 요일로부터 정해진 날짜가 지났을때
	//요일을 계산해 주는 역할을 수행
	public static String afterDay(EnumDay eDay, int days){
		int afterDay = eDay.getPosition() + days; 
		int requestDay = afterDay % 7;
		for(EnumDay enumDay : EnumDay.values()){
			if(enumDay.getPosition() == requestDay){
				return enumDay.toString();
			}
		}
		return "";
	}
	
}
public class Exam04 {
	public static void main(String[] ar){
		EnumDay eDay = EnumDay.MONDAY;
		
		String afterTen = EnumDay.afterDay(eDay, 10);
		System.out.println("월요일의 10일 후는 " + afterTen);
	}
}

