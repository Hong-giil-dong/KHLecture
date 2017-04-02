package day08;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam09 {
	private int x;
	private int y;
	private BufferedReader in;
	
	Exam09() throws IOException{
		in = new BufferedReader(new InputStreamReader(System.in));
		x=0;
		y=0;
	}
	public void setX() throws IOException{
		System.out.print("X = ");
		x = Integer.parseInt(in.readLine());
	}
	public void setY() throws IOException{
		System.out.print("Y = ");
		y = Integer.parseInt(in.readLine());
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void display(){
		System.out.println();
		System.out.print("Á¡ÀÇ ÁÂÇ¥(x, y) :");
		System.out.println("(" + x+","+y+")");
		System.out.println();
	}
	
	public static void main(String[] ar) throws IOException{
		Exam09 ex = new Exam09();
		ex.setX();
		ex.setY();
		ex.display();
		ex.setX(50);
		ex.setY(100);
		ex.display();
		
	}
	

}












