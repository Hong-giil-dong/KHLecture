package day04;
/**
 * �迭 �� ������ ���� ���� �Է� �Ǿ������� ���� �ȿ��� ���� ū
 * ���� ���� ���� ���� ���Ͻÿ�.
 * 9,15,10,7,6,30,21
 */
public class Exam03 {
	public static void main(String[] ar){
		int[] data = {1,9,15,10,7,6,30,21};
		//int max=0, min=100;
		int max = data[0], min = data[0];
		
		for(int i=0;i<data.length;i++){
			if(max < data[i])
				max = data[i];
			if(min > data[i])
				min = data[i];
		}
		
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}
	/**
	 * ������ �� 5���� �Է� �޾Ƽ� ���� ū���� ���� ���� ���
	 * �Ͻÿ�.
	 */
	
}


























