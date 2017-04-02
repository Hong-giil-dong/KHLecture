package day03;

public class Exam05 {
	public static void main(String[] ar){
		int mul=0, hap=0;
		for(int i=77;i>=1;i--){
			//mul = i*(78-i);
			//hap+=mul;
			hap+=i*(78-i);
		}
		System.out.println("Hap = "+hap);
	}

}
