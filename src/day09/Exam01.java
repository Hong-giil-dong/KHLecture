package day09;

public class Exam01 {
	private int x;
	private int y;
	Exam01(){
		x=0;
		y=0;
	}
	
	Exam01(int x, int y){
		this.x=x;
		this.y=y;
	}
	public void disp(){
		System.out.println("X = "+x+"\tY= "+y);
	}
	public static void main(String[] ar){
		Exam01 ex = new Exam01(100, 200);
		ex.disp();
	}
	
}







