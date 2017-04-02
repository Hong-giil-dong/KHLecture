package day06;
/*
 *    5!(ÆÑÅä¸®¾ó) = 1*2*3*4*5
 */
public class Exam03 {
	public static int fact(int x){
		if(x==1)
			return 1;
		else
			return x*fact(x-1);
	}
	
	public static void main(String[] ar){
		
		int x = fact(5);
		System.out.println("5! = " + x);
		
		
		/*
		int p=1;
		for(int i=1;i<=5;i++)
			p*=i;
		System.out.println("5! = "+p);
		*/
	}

}
