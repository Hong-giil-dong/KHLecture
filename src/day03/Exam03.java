package day03;
import java.io.IOException;

/**
 * �ֹι�ȣ�� 8��° ���ڸ� �Է� �Ͽ� ��������� Ȯ��
 * �ϴ� ���α׷��� �ۼ� �Ͻÿ�.
 * ����
 * 0 : ����
 * 1 : ���, ��õ
 * 2 : �λ�
 * 3 : ����
 * 4 : ��û
 * 5 : ����
 * 6 : �뱸, ����
 * 7 : ���
 * 8 : �泲
 * 9 : ����
 * switch���� �̿��Ͻÿ�.
 */
public class Exam03 {
	public static void main(String[] ar) throws IOException{
		int pos=0;
		String area="";
		
		System.out.print("8��° �ڸ� �Է� : ");
		pos = System.in.read()-48;
		
		switch(pos){
		case 0:	area="����";	break;
		case 1:	area="���,��õ";	break;
		case 2:	area="�λ�";	break;
		case 3:	area="����";	break;
		case 4:	area="��û";	break;
		case 5:	area="����";	break;
		case 6:	area="�뱸,����";	break;
		case 7:	area="���";	break;
		case 8:	area="�泲";	break;
		case 9:	area="����";	break;
		}
		System.out.println();
		System.out.println(area + "��� �Դϴ�.");
		
	}
}












