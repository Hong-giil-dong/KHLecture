package day03;
/**
 * 스위칭
 * 1-2+3-4+5
 *
 */
public class Exam07 {
	public static void main(String[] ar){
		//스위칭 변수 사용법
		int sw=0;
		for(int i=1;i<=5;i++){
			if(sw==0){
				System.out.print("+" + i); //+1
				sw=1;
			}else{
				System.out.print("-" + i); //+1-2
				sw=0;
			}
		}
		
		System.out.println();
		// 부호 변환 스위칭(-1)
		int s=-1;//1
		for(int i=1;i<=5;i++){
			System.out.print(i*s);
			s=s*(-1);
		}
		
		//순차적인 스위칭
		System.out.println();
		int j=0;
		for(int i=1;i<=5;i++){
			j++;
			System.out.print("+"+j);
			if(j==5) break;
			j++;
			System.out.print("-"+j);
		}
		
		
		
		
		
	}

}






