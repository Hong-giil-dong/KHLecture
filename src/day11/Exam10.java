import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyPoint1{
	private int x;
	private int y;
	protected static BufferedReader in;
	static{
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	protected MyPoint1() throws IOException{ //생성자 : 초기화
		System.out.print("x = ");
		x = Integer.parseInt(in.readLine());
		System.out.print("y = ");
		y = Integer.parseInt(in.readLine());
		
	}
	
	protected void disp(){
		System.out.println();
		System.out.print("점(x,y) = " + this.x + this.y);
		
	}
	
}

class Circle1 extends MyPoint1{
	private int r;
	protected Circle1() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		System.out.print("R = ");
		this.r = Integer.parseInt(in.readLine());
	}
	@Override
	protected void disp() {
		// TODO Auto-generated method stub
		super.disp();
		System.out.println("반지름 : " +this.r);
	}
	
	
}

class Rect1 extends MyPoint1{
	private int w, h;
	protected Rect1() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		System.out.print("폭 : ");
		this.w = Integer.parseInt(in.readLine());
		System.out.print("높이 : ");
		this.h = Integer.parseInt(in.readLine());
	}

	@Override
	protected void disp() {
		// TODO Auto-generated method stub
		super.disp();
		System.out.println("폭 : " +this.w + "\t높이 : "+this.h);
	}
}


public class Exam10 {
	public static void main(String[] ar) throws IOException{
		MyPoint1[] mp = new MyPoint1[10];
		for(int i=0;i<mp.length;i++){
			System.out.println("1. 원  2. 사각형  3. 보기   4. 종료 : ");
			int choose = System.in.read()-48;
			System.in.read();
			System.in.read();
			
			//선택된 메뉴의 객체를 객체 배열에 저장을 한다.
			switch(choose){
			case 1:
				mp[i] = new Circle1();
				break;
			case 2:
				mp[i] = new Rect1();
				break;
			case 3:
				System.out.println("=== 보 기 ===");
				for(int j = 0; j<i; j++)
					mp[j].disp();
				i--;
				break;
			case 4:
				System.out.println("프로그램을 종료 합니다.");
				System.exit(0);
			}
			
		}
	}

}

















