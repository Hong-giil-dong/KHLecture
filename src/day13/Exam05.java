package day13;
class AA1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("?—¬ê¸°ê? ?Š¤? ˆ?“œ ?ž…?‹ˆ?‹¤.");
		for(int i=0;i<100;i++){
			for(char ch = 'A';ch <= 'z'; ch++){
				System.out.print(ch);
			}
		}
	}
	
}
public class Exam05 {
	public static void main(String[] ar){
		System.out.println("ë©”ì¸ ?Š¤? ˆ?“œ");
		AA1 mt = new AA1(); //Runnable ê°ì²´ ?ƒ?„±
		Thread myth = new Thread(mt); //Thread ê°ì²´ ?ƒ?„±
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
















