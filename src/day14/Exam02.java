package day14;
import java.io.*;
public class Exam02 {
	public static void main(String[] ar){
		File f = new File("c:\\workspace\\java\\abc.txt");
		if(f.exists()){
			
			System.out.println("?��?���? : " + f.getName());
			System.out.println("?��?�� 경로 : " + f.getPath());
			System.out.println("?��?�� 경로 : " + f.getParent());
			System.out.println("?��?�� ?���? : " + f.length());
		}else{
			System.out.print(f.getName()+"?��?��?�� ?��?��?�� ?��?�� ");
			System.out.println("?��?��?�� ?��?�� ?��?��?��....");
			try{
				f.createNewFile();
			}catch(Exception e){}
		}
	}

}
