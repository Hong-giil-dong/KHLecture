package day02;
/**
 * �ݺ��� : ���������� ������ Ƚ�� �Ǵ� ���ǿ� ���� �Ҷ�
 * ���� ��ȯ�� �Ѵ�.
 * 1. for : Ƚ��
 *   ����)
 *   for(�ʱⰪ;���� ���ǽ�; ������){
 *        .....
 *   }
 * 2. while : ����
 *   while(����){
 *      ������ ���� ���ȿ��� �ݺ�
 *      .....
 *   }
 *
 */
public class Exam07 {
	public static void main(String[] ar){
		int sum=0, cnt=0;
		for(int i=1;i<=10;i++){
			cnt++;
			sum+=i; //sum=sum+i;
			}
		System.out.println("sum = " + sum);
		System.out.println("cnt = " + cnt);
	}

}








