package day07;

public class Exam03 {
	public static void main(String[] ar){
		Exam01 seller = new Exam01();
		Exam02 buyer = new Exam02();
		
		buyer.buyApple( seller, 3000); 
		//seller에게 3000원 어치 사과 구매
		
		System.out.print("과일 구매자의 현재 상황");
		buyer.showBuyResult();
		
		System.out.print("과일 판매자의 현재 상황");
		seller.showBuyResult();
		
	}
}











