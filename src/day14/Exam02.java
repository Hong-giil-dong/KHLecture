package day14;
import java.io.*;
public class Exam02 {
	public static void main(String[] ar){
		File f = new File("c:\\workspace\\java\\abc.txt");
		if(f.exists()){
			
			System.out.println("?ŒŒ?¼ëª? : " + f.getName());
			System.out.println("?ŒŒ?¼ ê²½ë¡œ : " + f.getPath());
			System.out.println("?ŒŒ?¼ ê²½ë¡œ : " + f.getParent());
			System.out.println("?ŒŒ?¼ ?¬ê¸? : " + f.length());
		}else{
			System.out.print(f.getName()+"?´?¼?Š” ?ŒŒ?¼?´ ?—†?–´ ");
			System.out.println("?ŒŒ?¼?„ ?ƒ?„± ?•©?‹ˆ?‹¤....");
			try{
				f.createNewFile();
			}catch(Exception e){}
		}
	}

}
