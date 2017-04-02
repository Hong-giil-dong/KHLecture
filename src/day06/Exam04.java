package day06;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 메소드를 이용하여 다음과 같은 프로그램을 작성 하시오.
 * 
 * 1. 최대수  2. 사이합  3. 수나열  4. 종료 : 1
 * 첫번째 수 : 100 
 * 두번째 수 : 200
 * 최대수는 200입니다.
 * 
 * 1. 최대수  2. 사이합  3. 수나열  4. 종료 : 
 * 
 * System.exit(-1); //프로그램 종료
 * 
 *
 */
public class Exam04 {
	
	public static void main(String[] ar) throws IOException{
		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int choose = 0;
		while(true){
			System.out.print("1. 최대수  2. 사이합  3. 수나열  4. 종료 :");
			choose = Integer.parseInt(in.readLine());
			
			if(choose==1)
				aaa();
			else if(choose==2)
				bbb();
			else if(choose==3)
				ccc();
			else if(choose==4)
				break;
			else
				System.out.println("다시 입력 하세요");
		}
	}
	
	public static void aaa() throws IOException{
		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 수 = ");
		int a = Integer.parseInt(in.readLine());
		System.out.print("두번째 수 = ");
		int b = Integer.parseInt(in.readLine());
		
		if(a>b)
			System.out.println("최대수는 "+a+" 입니다.");
		else
			System.out.println("최대수는 "+b+" 입니다.");
	}
	
	public static void bbb() throws IOException{
		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 수 = ");
		int a = Integer.parseInt(in.readLine());
		System.out.print("두번째 수 = ");
		int b = Integer.parseInt(in.readLine());
		
		if(a>b){
			int t = a;
			a=b;
			b=t;
		}
		int tot=0;
		for(int i=a;i<=b;i++)
			tot+=i;
		System.out.println(a +"부터 "+b+"까지의 합 : "+tot);
		
	}
	
	public static void ccc() throws IOException{
		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 수 = ");
		int a = Integer.parseInt(in.readLine());
		System.out.print("두번째 수 = ");
		int b = Integer.parseInt(in.readLine());
		
		if(a>b){
			int t = a;
			a=b;
			b=t;
		}
		
		for(int i=a;i<=b;i++)
			System.out.println(i);
	}
	
}
