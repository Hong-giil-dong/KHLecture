package day03;
import java.util.Scanner;

/**
 * ���� ���ϴ� ���α׷� �����
 * ó������
 * 1. �������� �Ǵ� �ϰ��� �ϴ� �⵵ �Է�
 * 2. ������ 4�⿡ �ѹ� �̴�.
 * 3. ��, 100���� ������ �������� �ش� ������ �ƴ�
 * 4. ��, 100���� ������ �������� �� �߿��� 400���� 
 *        ������ �������� �ش� �����̴�. 
 * �Է� 
 *    ������ �Է� : 2000
 * ���
 *    2000���� �����Դϴ�.
 */
public class Exam02 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		int year =0;
		boolean bool=false;
		
		System.out.print("������ �Է� �ϼ��� : ");
		year = Integer.parseInt(sc.nextLine());
		if(year%4 == 0 && year%100!=0 ||year%400==0)
			bool=true;
		System.out.println();
		
		System.out.print(year + "���� ");
		System.out.print(bool?"����":"���" + "�Դϴ�.");
		//����?��:���� ==> 3�� ������
	}

}
