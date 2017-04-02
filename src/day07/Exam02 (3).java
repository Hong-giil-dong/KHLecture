package pack;

public class Exam02 {
	static void print(){
		System.out.println("Print");
	}
	private static void disp(){
		System.out.println("private disp()");
		print();
	}
	protected static void pro(){
		
	}
	public static void main(String[] ar){
		disp();
		Exam01 ex = new Exam01();
		ex.make();
	}
}
