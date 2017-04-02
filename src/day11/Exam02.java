class UpperClass{
	int x;
	int y;
	
	public UpperClass(){
		x=10;
		y=20;
	}
	
	public UpperClass(int x, int y){
		this(x);
	}
	
	public UpperClass(int x){
		this(); //자신의 클래스 생성자 호출, 생략가능
		this.x = x;
	}
		
}

class LowerClass extends UpperClass{
	int r;
	public LowerClass(){
		super(); //상위 클래스의 생성자 호출, 생략가능.
		r = 30;
	}
	
	public LowerClass(int x){
		//this();
		super(x);
		//this();
		r = 30;
	}
	
}







public class Exam02 {

}














