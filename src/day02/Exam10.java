package day02;
import java.io.IOException;
import java.util.Scanner;

/*
 * while(����){
 *   ������ ���� �ϴ� ���ȸ� �ݺ�
 *   ������ ��ó��
 * }
 * 
 * do{
 *   ��ó�� ������
 * }while(����);
 * 
 * 
 */
public class Exam10 {
	public static void main(String[] ar)
		throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int i=0;
		
		while(i<=10){
			String st = sc.nextLine();
			if(st.equals("Q"))
				break;
			System.out.println(i);
			i++;
		}
		
	}

}






