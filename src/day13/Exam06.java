package day13;
class AA2 extends Thread{
	public void run(){
		System.out.println("?¬κΈ°κ? ?€? ? ???€.");
		for(int i=0;i<100;i++){
			for(char ch = 'A';ch <= 'z'; ch++){
				System.out.print(ch);
			}
		}
	}
	
}
public class Exam06 {
	public static void main(String[] ar){
		System.out.println("λ©μΈ ?€? ?");
		AA2 mt = new AA2(); //Runnable κ°μ²΄ ??±
		//Thread myth = new Thread(mt); //Thread κ°μ²΄ ??±
		mt.start(); //Thread ?€?
		for(int i=0;i<1000;i++){
			System.out.print(i);
			if(i % 10 ==0)
				System.out.println();
			else
				System.out.print("\t");
		}
		System.out.println("Main Thread Destroy!!");
	}
}
