package day07;

public class Exam03 {
	public static void main(String[] ar){
		Exam01 seller = new Exam01();
		Exam02 buyer = new Exam02();
		
		buyer.buyApple( seller, 3000); 
		//seller���� 3000�� ��ġ ��� ����
		
		System.out.print("���� �������� ���� ��Ȳ");
		buyer.showBuyResult();
		
		System.out.print("���� �Ǹ����� ���� ��Ȳ");
		seller.showBuyResult();
		
	}
}











