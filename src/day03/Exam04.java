package day03;
/**
 * 구구단 출력
 * 2 * 1 = 2 ..... 9 * 1 = 9
 * ....
 * 2 * 9 = 18..... 9 * 9 = 81 
 *
 */
public class Exam04 {
	public static void main(String[] ar){
		for(int i=1;i<=9;i++){
			for(int j=2;j<=9;j++){
				System.out.printf("%2d * %2d = %2d  ", j,i,j*i);
				//System.out.print(j+" * "+i+" = "+j*i+"\t");
			}
			System.out.println();
		}
	}
}







