package day04;
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] ar){
		
		//����� ���� �� �迭�� ���� �� ����
		Scanner sc = new Scanner(System.in);
		int[] kor, mat, eng, tot;
		float[] ave;
		String[] irum;
		
		kor = new int[3];
		eng = new int[3];
		mat = new int[3];
		tot = new int[3];
		ave = new float[3];
		irum = new String[3];
		
		
		//�ڷ��� �Է�
		for(int i=0;i<3;i++){
			System.out.print("�̸� : ");
				irum[i] = sc.nextLine();
			System.out.print("���� : ");
				kor[i]=Integer.parseInt(sc.nextLine());
			System.out.print("���� : ");
				eng[i]=Integer.parseInt(sc.nextLine());
			System.out.print("���� : ");
				mat[i]=Integer.parseInt(sc.nextLine());
		}
		
		
		//�ڷ� ó��(���)
		for(int i=0;i<3;i++){
			tot[i]=kor[i]+mat[i]+eng[i];
			ave[i]=tot[i]/3.0f;
		}
		
		
		// �ڷ� ���
		System.out.println("�̸�\t����\t����\t����\t����\t���" );
		for(int i=0;i<3;i++){
			System.out.println(irum[i]+"\t"+kor[i]+"\t"+eng[i]+
					"\t"+mat[i]+"\t"+tot[i]+"\t"+ave[i]);
		}
		
		
	}
}
