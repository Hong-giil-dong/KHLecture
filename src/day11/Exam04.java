package day11;
class A2{
	public void disp() throws Exception{
		System.out.println("A2 Ŭ����");
	}
}

class B2 extends A2{

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		//super.disp();
		System.out.println("B2 Ŭ����");
	}
	
}

public class Exam04 {
	public static void main(String[] ar){
		B2 bp = new B2();
		bp.disp();
		
	}

}
