package day13;
class AA1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("?¬κΈ°κ? ?€? ? ???€.");
		for(int i=0;i<100;i++){
			for(char ch = 'A';ch <= 'z'; ch++){
				System.out.print(ch);
			}
		}
	}
	
}
public class Exam05 {
	public static void main(String[] ar){
		System.out.println("λ©μΈ ?€? ?");
		AA1 mt = new AA1(); //Runnable κ°μ²΄ ??±
		Thread myth = new Thread(mt); //Thread κ°μ²΄ ??±
		myth.start();
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
















