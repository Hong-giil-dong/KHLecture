package day14;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Date;

/*
 * ?Š¹? • ?ŒŒ?¼ëª…ì„ ?‚¤ë³´ë“œë¡? ?…? ¥?„ ë°›ì•„?„œ ?•´?‹¹ ?ŒŒ?¼ ?ˆ?Š”ì§? ?™•?¸?•˜?Š” ?”„ë¡œê·¸?¨
 * ?„ ?‘?„± ?•˜?‹œ?˜¤.
 * ?‹¨, ê²½ë¡œ?Š” ? •?•´ì§„ê³³?„ ?™œ?š©?•œ?‹¤.
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
			System.out.print("?ŒŒ?¼ëª? : ");
			fileName = in.readLine();
			File f1 = new File(f, fileName);
			if(f1.exists()){
				System.out.println("?ŒŒ?¼ëª? : " + f1.getName());
				System.out.println("?ŒŒ?¼ ê²½ë¡œ : " + f1.getPath());
				System.out.println("?ŒŒ?¼ ê²½ë¡œ : " + f1.getParent());
				System.out.println("?ŒŒ?¼ ?¬ê¸? : " + f1.length());
				System.out.println("ìµœì¢… ?ˆ˜? •?¼ : " + new Date(f1.lastModified()));
			}else{
				System.out.println("File Not Found....");
				
			}
			
		}catch(Exception e){}
	}

}
