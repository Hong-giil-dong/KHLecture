package day05;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 5���� ��,��,�� 3������ ������ �Է� �޾Ƽ� ������ ����� ���ϰ�
 * ������ �������� ������ ���ϰ� ������ �������� �Ͽ� 
 * �������� ��� �Ͻÿ�.
 */
public class Exam03 {
	public static void main(String[] ar){
		//���� ����
		Scanner sc = new Scanner(System.in);
		
		String[] irum = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] mat = new int[5];
		
		
		
		//��� ����(��� �Ǵ� ����)
		int[] tot = new int[5];
		int[] rank = new int[5];
		float[] ave = new float[5];
		//�ӽ� ����
		
		//�Է�
		for(int i=0;i<irum.length;i++){
			System.out.print("�̸� : ");
				irum[i] = sc.nextLine();
					
				System.out.print("���� : ");
				kor[i]=Integer.parseInt(sc.nextLine());
			System.out.print("���� : ");
				eng[i]=Integer.parseInt(sc.nextLine());
			System.out.print("���� : ");
				mat[i]=Integer.parseInt(sc.nextLine());
				
			tot[i]=kor[i]+eng[i]+mat[i];
			ave[i]=((int)((tot[i]/3.0f+0.005)*100))/100;					
		}
		
		for(int i=0;i<tot.length;i++){ //���� ���ϱ�
			rank[i]=1;
			for(int j=0;j<tot.length;j++){
				if(tot[i]<tot[j])
					rank[i]++;
			}
		}
		
		for(int i=0;i<rank.length-1;i++){ //���� �ϱ�
			for(int j=i+1;j<rank.length;j++){
				if(rank[i]>rank[j]){ //������ �������� ��������
					//�̸�
					String temp = irum[i];
					irum[i] = irum[j];
					irum[j] = temp;
				
					//����
					int t = kor[i];
					kor[i] = kor[j];
					kor[j] = t;
					
					//����
					t = kor[i];
					eng[i] = eng[j];
					eng[j] = t;
					
					//����
					t = mat[i];
					mat[i] = mat[j];
					mat[j] = t;
					
					//����
					t = tot[i];
					tot[i] = tot[j];
					tot[j] = t;
					
					//���
					float tt = ave[i];
					ave[i] = ave[j];
					ave[j] = tt;
					
					//����
					t = rank[i];
					rank[i] = rank[j];
					rank[j] = t;
				}
			}
		}
		
		
		//���
		System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
		for(int i=0;i<rank.length;i++){
			System.out.println(irum[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+ave[i]+"\t"+rank[i]);
		}
		
		
	}
}






