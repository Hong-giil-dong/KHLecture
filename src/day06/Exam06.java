package day06;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// ���� �޼ҵ� ���� ��
public class Exam06 {
	public static int getValue(String str)throws IOException{
		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.print(str + " �� = ");
		int value = Integer.parseInt(in.readLine());
		return value;
	}
	
	public static void main(String[] ar) throws IOException{
		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int choose = 0;
		while(true){
			System.out.print("1. �ִ��  2. ������  3. ������  4. ���� :");
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
				System.out.println("�ٽ� �Է� �ϼ���");
		}
		System.out.println("�����մϴ�.");
	}
	
	public static void aaa() throws IOException{
		
		int a = getValue("ù��°");
		int b = getValue("�ι�°");
		
		if(a>b)
			System.out.println("�ִ���� "+a+" �Դϴ�.");
		else
			System.out.println("�ִ���� "+b+" �Դϴ�.");
	}
	
	public static void bbb() throws IOException{
		int a = getValue("ù��°");
		int b = getValue("�ι�°");
		
		if(a>b){
			int t = a;
			a=b;
			b=t;
		}
		int tot=0;
		for(int i=a;i<=b;i++)
			tot+=i;
		System.out.println(a +"���� "+b+"������ �� : "+tot);
		
	}
	
	public static void ccc() throws IOException{
		int a = getValue("ù��°");
		int b = getValue("�ι�°");
		
		if(a>b){
			int t = a;
			a=b;
			b=t;
		}
		
		for(int i=a;i<=b;i++)
			System.out.println(i);
	}
	
}
