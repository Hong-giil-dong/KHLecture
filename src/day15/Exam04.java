package day15;

public class Exam04 {
	public static void main(String[] ar){
		int x = 100;
		int y = 0;
		int tot = 0;
		try{
			tot = x / y;
		}catch(ArithmeticException e){
			Exam03 ae = new Exam03("?‚˜?ˆ—?…ˆ",e);
			ae.printStackTrace();
		}
		
		System.out.println("tot = " + tot);
	}

}







