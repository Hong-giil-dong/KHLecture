package day13;
class A4 extends Thread{
	public void run(){
		System.out.println("A4 ?‹¤?–‰");
	}
}

class B4 implements Runnable{

	@Override
	public void run() {
		System.out.println("B4 ?‹¤?–‰");
		
	}
	
}

public class Exam07 {
	public static void main(String[] ar){
		A4 ap = new A4();
		Thread bp = new Thread(new B4());
		ap.setPriority(3);
		bp.setPriority(8);
		
		ap.start();
		bp.start();
		
		
		int max = Thread.MAX_PRIORITY;
		int normal = Thread.NORM_PRIORITY;
		int min = Thread.MIN_PRIORITY;
		System.out.println("MAX = " + max);
		System.out.println("NORMAL = " + normal);
		System.out.println("MIN = " + min);
	}

}
