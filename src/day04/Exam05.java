package day04;
/**
 * �迭�� 1~99 ������ ������ 10���� �ԷµǾ��ִٰ� ������ �ϰ�
 * 2�� 3�� ����� ��� �Ͻÿ�.
 *
 */
public class Exam05 {
	public static void main(String[] ar){
		int data[] = {1,9,15,10,7,6,30,21,98,89};
		
		for(int i=0;i<data.length;i++){
			int n2 = data[i]%2;
			int n3 = data[i]%3;
			
			if(n2+n3 == 0)
				System.out.println(data[i]);
			
			/*
			if(data[i]%2==0 && data[i]%3==0)
				System.out.println(data[i]);
				*/
		}
	}

}







