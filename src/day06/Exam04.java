package day06;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �޼ҵ带 �̿��Ͽ� ������ ���� ���α׷��� �ۼ� �Ͻÿ�.
 * 
 * 1. �ִ��  2. ������  3. ������  4. ���� : 1
 * ù��° �� : 100 
 * �ι�° �� : 200
 * �ִ���� 200�Դϴ�.
 * 
 * 1. �ִ��  2. ������  3. ������  4. ���� : 
 * 
 * System.exit(-1); //���α׷� ����
 * 
 *
 */
public class Exam04 {
	
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
	}
	
	public static void aaa() throws IOException{
		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ù��° �� = ");
		int a = Integer.parseInt(in.readLine());
		System.out.print("�ι�° �� = ");
		int b = Integer.parseInt(in.readLine());
		
		if(a>b)
			System.out.println("�ִ���� "+a+" �Դϴ�.");
		else
			System.out.println("�ִ���� "+b+" �Դϴ�.");
	}
	
	public static void bbb() throws IOException{
		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ù��° �� = ");
		int a = Integer.parseInt(in.readLine());
		System.out.print("�ι�° �� = ");
		int b = Integer.parseInt(in.readLine());
		
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
		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ù��° �� = ");
		int a = Integer.parseInt(in.readLine());
		System.out.print("�ι�° �� = ");
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
