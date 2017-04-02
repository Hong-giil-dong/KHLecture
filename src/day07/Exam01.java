package day07;

public class Exam01 {
	int numOfApple=20;
	int myMoney=0;
	
	public int SaleApple(int money){
		int num = money / 1000;
		numOfApple-=num;
		myMoney += money;
		return num;
	}
	
	public void showBuyResult(){
		System.out.println("남은 사과 : "+ numOfApple);
		System.out.println("판매 수익 : "+ myMoney);
	}
}
