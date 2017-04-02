package day08;

public class Exam04 {
	int a;
	double b;
	
	Exam04(){
		a=0;
		b=0.0;
	}
	
	Exam04(int x){
		a=x;
		b=0.0;
	}
	Exam04(double x){
		a=0;
		b=x;
	}
	
	Exam04(int x, double y){
		a=x;
		b=y;
	}
	
	public static void main(String[] ar){
		Exam04 ex = new Exam04();
		Exam04 ex1 = new Exam04();
		Exam04 ex2 = new Exam04(5);
		Exam04 ex3 = new Exam04(5.5);
		Exam04 ex4 = new Exam04(10, 5.0);
	}

}













