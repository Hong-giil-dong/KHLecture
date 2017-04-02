package day11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class AA{ }

class MyPoint extends AA{
	private int x;
	private int y;
	protected static BufferedReader in;
	static{
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	public MyPoint() throws IOException{
		System.out.print("X = ");
		this.x = Integer.parseInt(in.readLine());
		System.out.print("Y = ");
		this.y = Integer.parseInt(in.readLine());
	}
	protected void disp(){
		System.out.println();
		System.out.println("Á¡(x,y) =(" + this.x +" , "+")");
	}
}

class Circle extends MyPoint{ //¿øÀÇ ³ÐÀÌ°ªÀ» Ãâ·Â
	private int r;
	private double area;

	public Circle() throws IOException {
		super();
		System.out.print("R = ");
		this.r = Integer.parseInt(in.readLine());
	}

	@Override
	protected void disp() {
		// TODO Auto-generated method stub
		
		super.disp();
		System.out.println("R = " + this.r);
		area = 3.141592 * (r * r);
		System.out.println("³ÐÀÌ = " + this.area);
	}
	
}

class Rect extends MyPoint{//»ç°¢ÇüÀÇ ³ÐÀÌ °ª
	private int w;
	private int h;
	private int area;

	public Rect() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		System.out.print("W= ");
		this.w = Integer.parseInt(in.readLine());
		System.out.print("H = ");
		this.h = Integer.parseInt(in.readLine());
	}

	@Override
	protected void disp() {
		// TODO Auto-generated method stub
		super.disp();
		System.out.println("W = " + this.w);
		System.out.println("H = " + this.h);
		area = h * w;
		System.out.println("³ÐÀÌ = " + this.area);
	}
	
	
	
}

public class Exam05 {
	public static void main(String[] ar) throws IOException{
		
		Circle c = new Circle();
		c.disp();
		Rect r = new Rect();
		r.disp();
		
		
	}

}















