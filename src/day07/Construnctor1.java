package day07;
/**
 * 
 * ������ : ����Ʈ ������, �� 1���� ȣ��ȴ�.
 *
 */
class Exam04{ 
	int num;
	public Exam04(){//����Ʈ ������, Ŭ������� ��ġ�ϴ� �޼ҵ��
		num=10;
		System.out.println("������ ȣ��");
	}
	public int getNumber(){
		return num;
	}

}

class AAA{
	
	//�޼ҵ� �����ε�
	void isYourFunc(int n){
		System.out.println("���� �Դϴ�.");
	}
	void isYourFunc(int n, int n2){
		System.out.println("���� 2�� �Դϴ�.");
	}
	void isYourFunc(float f){
		System.out.println("�Ǽ� �Դϴ�.");
	}
	void isYourFunc(float f, int n){
		System.out.println("�Ǽ� �ϳ� ���� �ϳ� �Դϴ�.");
	}
	
	void swap(String str1, String str2){
		String t = str1;
		str1 = str2;
		str2 = t;
	}
	
	void swap(int str1, int str2){
		int t = str1;
		str1 = str2;
		str2 = t;
	}
	
	void swap(float str1, float str2){
		float t = str1;
		str1 = str2;
		str2 = t;
	}
	
	
}


class BBB{
	//������ �����ε�
	public BBB(){}
	public BBB(int n){}
	public BBB(int n, int n2){}
}




//main()�� ���� Ŭ�������� �ݵ�� ���ϸ�� ��ġ �Ͽ��� �Ѵ�.
class Construnctor1{
	public static void main(String[] ar){
		
		AAA inst = new AAA();
		inst.isYourFunc(10);
		
		
		
		Exam04 num1 = new Exam04();
		System.out.println(num1.getNumber());
		
		Exam04 num2 = new Exam04();
		System.out.println(num2.getNumber());
	}
}











