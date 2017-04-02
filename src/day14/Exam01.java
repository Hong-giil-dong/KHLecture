package day14;
import java.io.File;
import java.io.IOException;
public class Exam01 {
	public static void main(String[] ar){
		File f = new File("c:\\workspace\\java");
		if(f.exists()){
			System.out.println("ê²½ë¡œ ì¡´ì¬");
			f.delete();
		}
		//?˜ˆ?™¸ ì²˜ë¦¬
		try{
			//?‹¤ ì²˜ë¦¬ ?‚´?š© ?…? ¥
			Thread.sleep(3000);
			
		}catch(Exception e){
			//?˜ˆ?™¸ ?ƒ?™© ì²˜ë¦¬
			e.printStackTrace();
		}
		
		System.out.println("?‹œ?‘");
		File f1 = new File(f, "abc.txt");
		
		try{
			Thread.sleep(3000);
		}catch(Exception e){
			
		}
		
		if(!f.exists()){
			System.out.println("ê²½ë¡œ ?ƒ?„±");
			f.mkdir();
		}
		
		try{
			System.out.println("?ŒŒ?¼ ?ƒ?„±ì¤?....");
			f1.createNewFile(); //?ŒŒ?¼ ?†?„±?´ ?½ê¸? / ?“°ê¸? ? „?š©
			Thread.sleep(3000);
			System.out.println("?ŒŒ?¼ ?ƒ?„± ?„±ê³?");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(f1.canRead())
				f1.setWritable(false);
		}
		
		File f2 = new File("c:\\workspace\\java\\abc.txt");
		System.out.println("?ŒŒ?¼ëª? : " + f2.getName());
		System.out.println("?ŒŒ?¼ ê²½ë¡œ : " + f2.getPath());
		System.out.println("?ŒŒ?¼ ê²½ë¡œ : " + f2.getParent());
		System.out.println("?ŒŒ?¼ ?¬ê¸? : " + f2.length());
		//System.out.println("?ŒŒ?¼ ?‘?„±?¼ : " + new java.util.Date(f.lastModifield()));
		
		
			
	}

}







