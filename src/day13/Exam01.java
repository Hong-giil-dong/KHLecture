package day13;
abstract class A{
	/**
	 * �Ϲ� Ŭ������ ���(Field, Method, Construct-������), �߻� �޼��带 ������.
	 * �߻� �޼ҵ�� ����θ� ������ �ʰ� �̸��� ������ �ִ� �޼ҵ� �̴�.
	 * �ݵ�� �������̵�(������)�� �Ǿ�߸� �Ѵ�. 
	 * 
	 * �߻� Ŭ������ ��ӹ��� Ŭ������ �߻� Ŭ������ �߻� �޼ҵ带 �ݵ�� �������̵��� �Ͽ��� �Ѵ�.
	 * ���� �����Ǹ� ���� ������ ����� ���� ���� Ŭ������ �߻� Ŭ������ �ν��� �ϰ� �ȴ�.
	 * 
	 */
	public abstract void disp();
}

class B extends A{

	@Override
	public void  disp() {
		// TODO Auto-generated method stub
		System.out.println("Success");
		
	} //Overriding Error
	
}
public class Exam01 {
	public static void main(String[] ar){
		//A ap = new A(); //������ ����, ��ü ���� �Ұ�
		B bp = new B();
		A cp = new B();
		
		bp.disp();
		cp.disp();
	}
}
