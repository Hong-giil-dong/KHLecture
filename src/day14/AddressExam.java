package day14;

import java.io.*;

public class AddressExam implements Serializable{
	private String name;
	private String tel;
	private String addr;
	private static BufferedReader in;
	static{
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public AddressExam() throws IOException{
		System.out.print("?���? : ");
		this.name = in.readLine();
		System.out.print("?��?�� : ");
		this.tel = in.readLine();
		System.out.print("주소 : ");
		this.addr = in.readLine();
	}
	public void disp(){
		System.out.print(name + "\t");
		System.out.print(tel + "\t");
		System.out.println(addr);
	}

}
