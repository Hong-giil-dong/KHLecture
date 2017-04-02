package day06;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 범용 메소드 제작 예
public class Exam06 {
	public static int getValue(String str)throws IOException{
		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.print(str + " 수 = ");
		int value = Integer.parseInt(in.readLine());
		return value;
	}
	
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
		System.out.println("종료합니다.");
	}
	
	public static void aaa() throws IOException{
		
		int a = getValue("첫번째");
		int b = getValue("두번째");
		
		if(a>b)
			System.out.println("최대수는 "+a+" 입니다.");
		else
			System.out.println("최대수는 "+b+" 입니다.");
	}
	
	public static void bbb() throws IOException{
		int a = getValue("첫번째");
		int b = getValue("두번째");
		
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
		int a = getValue("첫번째");
		int b = getValue("두번째");
		
		if(a>b){
			int t = a;
			a=b;
			b=t;
		}
		
		for(int i=a;i<=b;i++)
			System.out.println(i);
	}
	
}
