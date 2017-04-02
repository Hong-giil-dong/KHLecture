package day13;
/*
 * ?‹¤?˜•?„±?œ¼ë¡? ë§Œë“  MyPoint1, Circle1, Rect1 ?´?˜?Š¤?˜ ?”„ë¡œê·¸?¨?„ abstractë¥? ?´?š©?•˜?—¬
 * ? ?‹¹?ˆ ë³?ê²½ì‹œì¼? ë³´ê³  ?¸?„°?˜?´?Š¤ë¥? ?´?š©?•´?„œ?„ ë³?ê²½ì‹œì¼? ë³´ì‹œ?˜¤.
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
		//super(); // MyPoint1() ?˜¸ì¶?
		System.out.print("x = ");
		this.x = Integer.parseInt(in.readLine());
		System.out.print("y = ");
		this.y = Integer.parseInt(in.readLine());
		System.out.print("r = ");
		this.r = Integer.parseInt(in.readLine());
	}

	public void disp() {
		System.out.println("? (x, y) = (" + x + ", " + y + ")");
		System.out.println("ë°˜ì?ë¦? r = " + this.r);
	}
}

class Rect11 implements MyPoint11 {
	private int x;
	private int y;
	private int w;
	private int h;

	public Rect11() throws IOException {
		//super(); // MyPoint1() ?˜¸ì¶?
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
		System.out.println("?­ = " + this.w + ", ?†’?´ = " + this.h);
	}
}

public class Exam04 {
	public static void main(String[] ar) throws IOException {
		MyPoint11[] mp = new MyPoint11[10];
		for (int i = 0; i < mp.length; i++) {
			System.out.println();
			System.out.print("1.?› 2.?‚¬ê°í˜• 3.ë³´ê¸° 4.ì¢…ë£Œ ==> ");
			int x = System.in.read() - 48;
			System.in.read();
			System.in.read();
			if (x == 1) {
				mp[i] = new Circle11();
			} else if (x == 2) {
				mp[i] = new Rect11();
			} else if (x == 3) {
				System.out.println();
				System.out.println("=== ë³´ê¸° ===");
				for (int a = 0; a < i; a++) {
					mp[a].disp();
				}
				System.out.println("=== ë³´ê¸° ===");
				System.out.println();
				i--;
				// ë³´ê¸° ?‹œ?—?Š” ê°’ì„ ?…? ¥?•œ ê²ƒì´ ?•„?‹ˆë¯?ë¡? i?˜ ì¦ê??œ ê°’ì„ ì¤„ì¸?‹¤.
			} else if (x == 4) {
				System.out.println("?”„ë¡œê·¸?¨?„ ì¢…ë£Œ?•©?‹ˆ?‹¤.");
				System.exit(0);
			} else {
				System.err.println("?˜ëª? ?…? ¥?•˜?…¨?Šµ?‹ˆ?‹¤.");
			}
		}
		System.out.println();
		System.out.println("?ˆ˜ê³? ?•˜?…¨?Šµ?‹ˆ?‹¤.");
	}
}
