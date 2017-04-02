package day11;
class A6{
	public void aaa(){
		System.out.println("aaa");
	}
	
	public void bbb(){
		System.out.println("bbb");
	}
}

class B6 extends A6{
	public void bbb(){
		System.out.println("BBB");
	}
	public void ccc(){
		System.out.println("ccc");
	}
}

public class Exam09 {
	public static void main(String[] ar){
		A6 ap = new B6();
		ap.aaa();
		ap.bbb();
		//ap.ccc();
	}

}








