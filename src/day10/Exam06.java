package day10;
class Inner6{
	int y=200;
	public Inner6(){
		this.disp();
	}
	public void disp(){
		
	}
}
public class Exam06 {
	public static void main(String[] ar){
		final int x = 100;
		 new Inner6(){
			 public void disp(){
				 System.out.println(x);
			 }
		 };
	}

}
