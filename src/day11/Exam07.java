//���������� ��� �ʵ���� ����
// �ʵ�� ���������� ǥ�� �Ǿ��� ���� ��ü�� ���� �θ� Ŭ������ ��� �ʵ忡�� ����
class A4{
	int x = 100;
}

class B4 extends A4{
	int y = 200;
}

public class Exam07 { 
	public static void main(String[] ar){
		A4 ap = new B4(); //������ ǥ��
		//B4 bp = new A4();
		System.out.println("x = " + ap.x);
		//System.out.println("y = " + ap.y);
		//ap���� ��� �ִ� ������ B4Ŭ����(�ڽ�Ŭ����)�� �ν��Ͻ� �̴�.
		// �׷��� ap��ü�� A4Ŭ����(�θ�Ŭ����)�� ��ü�� ������ ǥ���̱� ������ 
		//������ �� �ִ� �ʵ�� A4Ŭ����(�θ�Ŭ����)�� ����� x�� ���� �ȴ�.
	}

}
