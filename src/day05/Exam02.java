package day05;
import java.util.Scanner;

/**
 * ���� �� 10���� �������� �Է� �޾Ƽ�
 * ������ ������ �̿��Ͽ� ������������ 
 * �����Ͽ� ��� �Ͻÿ�.
 *
 */
public class Exam02 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		int[] data = new int[10];
		for(int i=0;i<data.length;i++){
			System.out.print("�� : ");
			data[i] = sc.nextInt();
		}
		
		System.out.print("������ : \t");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+"\t");
		}
		System.out.println();
		
		for(int i=0;i<data.length-1;i++){
			for(int j=i+1;j<data.length;j++){
				if(data[i] > data[j]){ //�ڸ� ��ȯ
					int t = data[i];
					data[i]=data[j];
					data[j]= t;
				}
			}
		}
		
		System.out.print("������ : \t");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+"\t");
		}
		System.out.println();
	}
}
