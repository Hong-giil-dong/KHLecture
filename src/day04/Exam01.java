package day04;
import java.util.Scanner;

public class Exam01 {
	public static void main(String[] ar){
		//�迭�� ����
		int[] sung;
		int sung1[] ={1,2,3};//�ʱⰪ �ο�
		
		String[] kwa={"����","����","����"};
		
		//�迭�� �ʱ�ȭ(����)
		sung = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			System.out.print(kwa[i]+" : ");
			sung[i]=Integer.parseInt(sc.nextLine());
		}
		
		for(int i=0;i<3;i++){
			System.out.println(kwa[i]+" : " + sung[i]);
			
		}
		/**
		 *  3���� ����, ����, ���� ������ ���� �Է� �޾Ƽ�
		 *  ������ ������ ����� ��� ���Ͻÿ�.
		 *  <<��� ����>>
		 *  ��ȣ		����		����		����		����		���
		 */
	}
}







