package day14;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Date;

/*
 * ?Ή?  ??Όλͺμ ?€λ³΄λλ‘? ?? ₯? λ°μ? ?΄?Ή ??Ό ??μ§? ??Έ?? ?λ‘κ·Έ?¨
 * ? ??± ???€.
 * ?¨, κ²½λ‘? ? ?΄μ§κ³³? ??©??€.
 * 
 */

public class Exam05 {
	public static void main(String[] ar){
		String fileName=null;
		BufferedReader in = new BufferedReader(
							new InputStreamReader(
									System.in));
		File f = new File("c:\\workspace\\java2");
		try{
			System.out.print("??Όλͺ? : ");
			fileName = in.readLine();
			File f1 = new File(f, fileName);
			if(f1.exists()){
				System.out.println("??Όλͺ? : " + f1.getName());
				System.out.println("??Ό κ²½λ‘ : " + f1.getPath());
				System.out.println("??Ό κ²½λ‘ : " + f1.getParent());
				System.out.println("??Ό ?¬κΈ? : " + f1.length());
				System.out.println("μ΅μ’ ?? ?Ό : " + new Date(f1.lastModified()));
			}else{
				System.out.println("File Not Found....");
				
			}
			
		}catch(Exception e){}
	}

}
