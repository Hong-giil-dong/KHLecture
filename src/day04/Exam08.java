package day04;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 5���� �л��� ����, ����, ���� ������ �Է� �޾Ƽ�
 * ������ ����� ���ϰ� ������ �������� ������ ��� �Ͻÿ�.
 * (��, ����� �Ҽ��� ���� 2�ڸ� ���� ǥ���Ͻÿ�.)
 * <�Է�>
 * �̸� :
 * ���� :
 * ���� :
 * ���� :
 * 
 * <<���>>
 * �̸� ���� ����  ���� ���� ��� ����
 
 */
public class Exam08 {
	public static void main(String[] ar){
		//���� ����
		Scanner sc = new Scanner(System.in);
		BufferedReader in = new BufferedReader
					(new InputStreamReader(System.in));
		//�Է� ����(�迭)
		String[] irum = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] mat = new int[5];
		
		int[][] sungjuk = new int[5][3];
		
		//��� ����(��� �Ǵ� ����)
		int[] tot = new int[5];
		int[] rank = new int[5];
		float[] ave = new float[5];
		//�ӽ� ����
		String[] kwa = {"����","����","����"};
		//�Է�
		for(int i=0;i<irum.length;i++){
			System.out.print("�̸� : ");
				irum[i] = sc.nextLine();
			tot[i]=0;	
			for(int l=0;l<sungjuk[0].length;l++){
				System.out.print(kwa[i]);
				sungjuk[i][l] = Integer.parseInt(sc.nextLine());
				tot[i]+=sungjuk[i][l];
			}
				
		//////////////////////////////////////////		
				System.out.print("���� : ");
				kor[i]=Integer.parseInt(sc.nextLine());
			System.out.print("���� : ");
				eng[i]=Integer.parseInt(sc.nextLine());
			System.out.print("���� : ");
				mat[i]=Integer.parseInt(sc.nextLine());
				
			tot[i]=kor[i]+eng[i]+mat[i];
			ave[i]=tot[i]/3.0f;					
		}
		
		//���(ó��, ����)
		for(int i=0;i<kor.length;i++){ //����, ��� ���
			tot[i]=kor[i]+eng[i]+mat[i];
			ave[i]=tot[i]/3.0f;
		}
		
		for(int i=0;i<tot.length;i++){ //���� ���ϱ�
			
			rank[i]=1;
			for(int j=0;j<tot.length;j++){
				if(tot[i]<tot[j])
					rank[i]++;
			}
		}
		
		//���
		
		
		
	}
	

}










