package day14;
import java.io.*;
public class Exam02 {
	public static void main(String[] ar){
		File f = new File("c:\\workspace\\java\\abc.txt");
		if(f.exists()){
			
			System.out.println("??Όλͺ? : " + f.getName());
			System.out.println("??Ό κ²½λ‘ : " + f.getPath());
			System.out.println("??Ό κ²½λ‘ : " + f.getParent());
			System.out.println("??Ό ?¬κΈ? : " + f.length());
		}else{
			System.out.print(f.getName()+"?΄?Ό? ??Ό?΄ ??΄ ");
			System.out.println("??Ό? ??± ?©??€....");
			try{
				f.createNewFile();
			}catch(Exception e){}
		}
	}

}
