package day14;
import java.io.File;
import java.io.IOException;
public class Exam01 {
	public static void main(String[] ar){
		File f = new File("c:\\workspace\\java");
		if(f.exists()){
			System.out.println("κ²½λ‘ μ‘΄μ¬");
			f.delete();
		}
		//??Έ μ²λ¦¬
		try{
			//?€ μ²λ¦¬ ?΄?© ?? ₯
			Thread.sleep(3000);
			
		}catch(Exception e){
			//??Έ ??© μ²λ¦¬
			e.printStackTrace();
		}
		
		System.out.println("??");
		File f1 = new File(f, "abc.txt");
		
		try{
			Thread.sleep(3000);
		}catch(Exception e){
			
		}
		
		if(!f.exists()){
			System.out.println("κ²½λ‘ ??±");
			f.mkdir();
		}
		
		try{
			System.out.println("??Ό ??±μ€?....");
			f1.createNewFile(); //??Ό ??±?΄ ?½κΈ? / ?°κΈ? ? ?©
			Thread.sleep(3000);
			System.out.println("??Ό ??± ?±κ³?");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(f1.canRead())
				f1.setWritable(false);
		}
		
		File f2 = new File("c:\\workspace\\java\\abc.txt");
		System.out.println("??Όλͺ? : " + f2.getName());
		System.out.println("??Ό κ²½λ‘ : " + f2.getPath());
		System.out.println("??Ό κ²½λ‘ : " + f2.getParent());
		System.out.println("??Ό ?¬κΈ? : " + f2.length());
		//System.out.println("??Ό ??±?Ό : " + new java.util.Date(f.lastModifield()));
		
		
			
	}

}







