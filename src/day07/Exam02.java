package day07;

public class Exam02 {
	int myMoney = 5000;
	int numOfApple=0;
	
	public void buyApple(Exam01 seller, int money){
		//Exam01 seller = new Exam01();
		numOfApple += seller.SaleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult(){
		System.out.println("현재 잔액 : "+ myMoney);
		System.out.println("사과 개수 : "+ numOfApple);
	}
}
