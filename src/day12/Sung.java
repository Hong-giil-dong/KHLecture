package day12;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sung {
	private String name;
	private int kor, mat, eng;
	protected int tot;
	protected double ave;
	private static BufferedReader in;
	static {
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	public Sung() throws IOException{
		System.out.print("�̸� : ");
		name = in.readLine();
		System.out.print("���� : ");
		kor = Integer.parseInt(in.readLine());
		System.out.print("���� : ");
		eng = Integer.parseInt(in.readLine());
		System.out.print("���� : ");
		mat = Integer.parseInt(in.readLine());	
		
		//this.tot = this.kor + this.mat + this.eng;
		//this.ave = this.tot/3.0;
	}
	
	public void calculation() {
		this.tot = this.kor + this.mat + this.eng;
		this.ave = this.tot/3.0;
	}
	
	public void disp(){
		System.out.print(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t");
	}
}
