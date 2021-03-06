package day13;
/*
 * ?€??±?Όλ‘? λ§λ  MyPoint1, Circle1, Rect1 ?΄??€? ?λ‘κ·Έ?¨? abstractλ₯? ?΄?©??¬
 * ? ?Ή? λ³?κ²½μμΌ? λ³΄κ³  ?Έ?°??΄?€λ₯? ?΄?©?΄?? λ³?κ²½μμΌ? λ³΄μ?€.
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
		//super(); // MyPoint1() ?ΈμΆ?
		System.out.print("x = ");
		this.x = Integer.parseInt(in.readLine());
		System.out.print("y = ");
		this.y = Integer.parseInt(in.readLine());
		System.out.print("r = ");
		this.r = Integer.parseInt(in.readLine());
	}

	public void disp() {
		System.out.println("? (x, y) = (" + x + ", " + y + ")");
		System.out.println("λ°μ?λ¦? r = " + this.r);
	}
}

class Rect11 implements MyPoint11 {
	private int x;
	private int y;
	private int w;
	private int h;

	public Rect11() throws IOException {
		//super(); // MyPoint1() ?ΈμΆ?
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
		System.out.println("? (x, y) = (" + x + ", " + y + ")");
		System.out.println("?­ = " + this.w + ", ??΄ = " + this.h);
	}
}

public class Exam04 {
	public static void main(String[] ar) throws IOException {
		MyPoint11[] mp = new MyPoint11[10];
		for (int i = 0; i < mp.length; i++) {
			System.out.println();
			System.out.print("1.? 2.?¬κ°ν 3.λ³΄κΈ° 4.μ’λ£ ==> ");
			int x = System.in.read() - 48;
			System.in.read();
			System.in.read();
			if (x == 1) {
				mp[i] = new Circle11();
			} else if (x == 2) {
				mp[i] = new Rect11();
			} else if (x == 3) {
				System.out.println();
				System.out.println("=== λ³΄κΈ° ===");
				for (int a = 0; a < i; a++) {
					mp[a].disp();
				}
				System.out.println("=== λ³΄κΈ° ===");
				System.out.println();
				i--;
				// λ³΄κΈ° ??? κ°μ ?? ₯? κ²μ΄ ??λ―?λ‘? i? μ¦κ?? κ°μ μ€μΈ?€.
			} else if (x == 4) {
				System.out.println("?λ‘κ·Έ?¨? μ’λ£?©??€.");
				System.exit(0);
			} else {
				System.err.println("?λͺ? ?? ₯??¨?΅??€.");
			}
		}
		System.out.println();
		System.out.println("?κ³? ??¨?΅??€.");
	}
}
