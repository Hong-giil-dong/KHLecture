package day08;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SungJuk {
	int[] sub = new int[4]; //0:����,1:����, 2:����, 3:����
	float avg;
	SungJuk() throws IOException{
		BufferedReader in = new BufferedReader
				(new InputStreamReader(System.in));
		String[] str ={"����","����","����"};
		
		for(int i=0;i<str.length;i++){
			System.out.print(str[i] +" : ");
			sub[i] = Integer.parseInt(in.readLine());
			sub[3] += sub[i];
		}
		avg = sub[str.length] / (float)str.length;
		
		System.out.println("���� : " + sub[3]);
		System.out.println("��� : " + avg);
	}
	
	public static void main(String[] ar) throws IOException{
		SungJuk ex = new SungJuk();
	}
}


















