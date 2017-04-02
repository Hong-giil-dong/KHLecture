package day07;
/**
 * 
 * 생성자 : 디폴트 생성자, 단 1번만 호출된다.
 *
 */
class Exam04{ 
	int num;
	public Exam04(){//디폴트 생성자, 클래스명과 일치하는 메소드명
		num=10;
		System.out.println("생성자 호출");
	}
	public int getNumber(){
		return num;
	}

}

class AAA{
	
	//메소드 오버로딩
	void isYourFunc(int n){
		System.out.println("정수 입니다.");
	}
	void isYourFunc(int n, int n2){
		System.out.println("정수 2개 입니다.");
	}
	void isYourFunc(float f){
		System.out.println("실수 입니다.");
	}
	void isYourFunc(float f, int n){
		System.out.println("실수 하나 정수 하나 입니다.");
	}
	
	void swap(String str1, String str2){
		String t = str1;
		str1 = str2;
		str2 = t;
	}
	
	void swap(int str1, int str2){
		int t = str1;
		str1 = str2;
		str2 = t;
	}
	
	void swap(float str1, float str2){
		float t = str1;
		str1 = str2;
		str2 = t;
	}
	
	
}


class BBB{
	//생성자 오버로딩
	public BBB(){}
	public BBB(int n){}
	public BBB(int n, int n2){}
}




//main()이 속한 클래스명은 반드시 파일명과 일치 하여야 한다.
class Construnctor1{
	public static void main(String[] ar){
		
		AAA inst = new AAA();
		inst.isYourFunc(10);
		
		
		
		Exam04 num1 = new Exam04();
		System.out.println(num1.getNumber());
		
		Exam04 num2 = new Exam04();
		System.out.println(num2.getNumber());
	}
}











