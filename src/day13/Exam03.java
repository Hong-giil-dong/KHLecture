package day13;
/**
 * 
 * �������̽��� ����
 * 1. ���� ����� ���� Ŭ���� ����
 * 2. �������� ���� Ŭ���� ����
 * 
 * �������� ���� ���
 * 1. �ʵ�
 *  - ������ public static final ��� �ʵ� �̴�.
 *  - public static final�� ��� �ϴ� static�� �����ϴ� 
 *  �Ǵ� �ƹ��͵� ���� ���� �ʴ� ������ public static final�� �ν��� �Ѵ�.
 * 2. �޼ҵ�
 *  - ������ public abstract �޼��� �̴�.
 *  - ���Ǻθ� ���� �� ����.
 *  - �������̽��� �������� �����̹Ƿ� ��� �޼��忡�� abstract�� �ٴ´�.
 * 3. ���� ��ø Ŭ����
 *  - �������̽��� ������ ��ø Ŭ������ �ڵ������� static�� �ٴ´�.      
 *
 */

/*
interface A{
	
}
interface B{
	
}
interface C extends A, B{
	
}

class E{
	
}

class F { }
class D extends E, F{ }
*/

interface A1{
	int w = 10;
	static int x = 20;
	final int y = 30;
	public static final int z = 40;
	public abstract void aaa();
}

class B1 implements A1{
	public void aaa(){
		System.out.println("aaa�޼ҵ�");
	}
	public void bbb(){
		System.out.println("bbb�޼ҵ�");
	}
}
public class Exam03 {
	public static void main(String[] ar){
		/*A1 ap = new A1();
		ap.w = 100;
		System.out.println("ap.w = " + ap.w); //10
		System.out.println("ap.x = " + ap.x); //20
		System.out.println("ap.y = " + ap.y); //30
		System.out.println("ap.z = " + ap.z); //40*/
		B1 ap = new B1();
		ap.aaa();
		ap.bbb();
	}
}







































