package pack;

public class Exam01 {
	public static void make(){
		System.out.println("Exam01.make()");
		
		
	}
	
	public static void main(String[] ar){
		Exam02 ex = new Exam02();
		ex.print();
		make();
	}
	
}
