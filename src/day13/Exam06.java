package day13;
class AA2 extends Thread{
	public void run(){
		System.out.println("?��기�? ?��?��?�� ?��?��?��.");
		for(int i=0;i<100;i++){
			for(char ch = 'A';ch <= 'z'; ch++){
				System.out.print(ch);
			}
		}
	}
	
}
public class Exam06 {
	public static void main(String[] ar){
		System.out.println("메인 ?��?��?��");
		AA2 mt = new AA2(); //Runnable 객체 ?��?��
		//Thread myth = new Thread(mt); //Thread 객체 ?��?��
		mt.start(); //Thread ?��?��
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
