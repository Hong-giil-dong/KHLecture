package day14;
import java.io.*;
public class Exam02 {
	public static void main(String[] ar){
		try{
			BufferedReader in = new BufferedReader(
					new FileReader(
					new File(
					new File("c:\\workspace\\java"),"address.txt")));
			String data;
			while((data = in.readLine()) != null){
			
			System.out.println("data = " + data);
			int first = data.indexOf(',');
			int last = data.lastIndexOf(',');
			System.out.println("data = " + first +'\t'+last);
			System.out.println("data = " + data.substring(0, first));
			System.out.println("data = " + data.substring(first+1, last));
			System.out.println("data = " + data.substring(last+1, data.length()));
			}
			in.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
