package day01;
import java.io.*;
public class Exam10 {

	public static void main(String[] args) 
		throws IOException
	{
		String name;
		int kor, mat, eng, tot;
		float ave;
		
		BufferedReader in = new BufferedReader
				(new InputStreamReader(System.in));
		
		System.out.print("�̸� : ");
		name = in.readLine();
		System.out.print("���� : ");
		kor = Integer.parseInt(in.readLine());
		System.out.print("���� : ");
		eng = Integer.parseInt(in.readLine());
		System.out.print("���� : ");
		mat = Integer.parseInt(in.readLine());
		
		tot = kor + eng + mat;
		ave = tot/3.0f;
		
		int num = Integer.parseInt(in.readLine());
		String number = (num%2==0)?"¦��" : "Ȧ��";
		System.out.println(num + "�� " + number);
		
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+ave);
		
		// ���� = ���� ? �� : ����;
		
		

	}

}







