package day09;

public class Exam02 {
	private String name;
	private double don;
	private static double iyul;
	
	Exam02(String a, double b, double d){
		this.name = a;
		this.don = b;
		this.iyul = d;
	}
	
	public static void main(String[] ar){
		Exam02 ex1 = new Exam02("aaa",1000,10.0);
			System.out.println(ex1.name + "\t" + ex1.don +"\t" + ex1.iyul);
		Exam02 ex2 = new Exam02("bbb",2000,11.0);
			System.out.println(ex2.name + "\t" + ex2.don +"\t" + ex2.iyul);
		Exam02 ex3 = new Exam02("ccc",3000,12.0);
			System.out.println(ex3.name + "\t" + ex3.don +"\t" + ex3.iyul);
		
		System.out.println(ex1.name + "\t" + ex1.don +"\t" + ex1.iyul);
		System.out.println(ex2.name + "\t" + ex2.don +"\t" + ex2.iyul);
		System.out.println(ex3.name + "\t" + ex3.don +"\t" + ex3.iyul);
				
		
	}

}








