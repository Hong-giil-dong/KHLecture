package day13;
/*
 * ?��?��?��?���? 만든 MyPoint1, Circle1, Rect1 ?��?��?��?�� ?��로그?��?�� abstract�? ?��?��?��?��
 * ?��?��?�� �?경시�? 보고 ?��?��?��?��?���? ?��?��?��?��?�� �?경시�? 보시?��.
 */

import java.io.*;

interface MyPoint11 {	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	
	
	void disp();	
}

class Circle11 implements MyPoint11 {
	private int x;
	private int y;
	private int r;

	public Circle11() throws IOException {
		//super(); // MyPoint1() ?���?
		System.out.print("x = ");
		this.x = Integer.parseInt(in.readLine());
		System.out.print("y = ");
		this.y = Integer.parseInt(in.readLine());
		System.out.print("r = ");
		this.r = Integer.parseInt(in.readLine());
	}

	public void disp() {
		System.out.println("?��(x, y) = (" + x + ", " + y + ")");
		System.out.println("반�?�? r = " + this.r);
	}
}

class Rect11 implements MyPoint11 {
	private int x;
	private int y;
	private int w;
	private int h;

	public Rect11() throws IOException {
		//super(); // MyPoint1() ?���?
		System.out.print("x = ");
		this.x = Integer.parseInt(in.readLine());
		System.out.print("y = ");
		this.y = Integer.parseInt(in.readLine());
		System.out.print("w = ");
		this.w = Integer.parseInt(in.readLine());
		System.out.print("h = ");
		this.h = Integer.parseInt(in.readLine());
	}

	public void disp() {
		System.out.println("?��(x, y) = (" + x + ", " + y + ")");
		System.out.println("?�� = " + this.w + ", ?��?�� = " + this.h);
	}
}

public class Exam04 {
	public static void main(String[] ar) throws IOException {
		MyPoint11[] mp = new MyPoint11[10];
		for (int i = 0; i < mp.length; i++) {
			System.out.println();
			System.out.print("1.?�� 2.?��각형 3.보기 4.종료 ==> ");
			int x = System.in.read() - 48;
			System.in.read();
			System.in.read();
			if (x == 1) {
				mp[i] = new Circle11();
			} else if (x == 2) {
				mp[i] = new Rect11();
			} else if (x == 3) {
				System.out.println();
				System.out.println("=== 보기 ===");
				for (int a = 0; a < i; a++) {
					mp[a].disp();
				}
				System.out.println("=== 보기 ===");
				System.out.println();
				i--;
				// 보기 ?��?��?�� 값을 ?��?��?�� 것이 ?��?���?�? i?�� 증�??�� 값을 줄인?��.
			} else if (x == 4) {
				System.out.println("?��로그?��?�� 종료?��?��?��.");
				System.exit(0);
			} else {
				System.err.println("?���? ?��?��?��?��?��?��?��.");
			}
		}
		System.out.println();
		System.out.println("?���? ?��?��?��?��?��.");
	}
}
