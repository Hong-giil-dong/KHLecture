package day07;
class Person{
	/**
	 * ����Ʈ �������� ��� ��������� �ʱ�ȭ�� �ַ� ��� �Ѵ�.
	 */
	private int perID;
	private int milID;
	
	Person(){}
	
	public Person(int pID, int mID){
		perID = pID;
		milID = mID;
	}
	
	public Person(int pID){
		int abc;
		perID = pID;
		milID = 0;
	}
	
	public void showInfo(){
		System.out.println("�ι� : " + perID);
		
		if(milID != 0)
			System.out.println("���� : " + milID);
		else
			System.out.println("���� ��� ����");
	}
	
	
}
public class Exam05 {
	public static void main(String[] ar){
		Person man = new Person(950123,880102);
		Person woman = new Person(941125);
		
		
		
		man.showInfo();
		woman.showInfo();
	}

}









