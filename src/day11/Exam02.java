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
		this(); //�ڽ��� Ŭ���� ������ ȣ��, ��������
		this.x = x;
	}
		
}

class LowerClass extends UpperClass{
	int r;
	public LowerClass(){
		super(); //���� Ŭ������ ������ ȣ��, ��������.
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














