package day14;
import java.io.File;
import java.io.IOException;
public class Exam01 {
	public static void main(String[] ar){
		File f = new File("c:\\workspace\\java");
		if(f.exists()){
			System.out.println("경로 존재");
			f.delete();
		}
		//?��?�� 처리
		try{
			//?�� 처리 ?��?�� ?��?��
			Thread.sleep(3000);
			
		}catch(Exception e){
			//?��?�� ?��?�� 처리
			e.printStackTrace();
		}
		
		System.out.println("?��?��");
		File f1 = new File(f, "abc.txt");
		
		try{
			Thread.sleep(3000);
		}catch(Exception e){
			
		}
		
		if(!f.exists()){
			System.out.println("경로 ?��?��");
			f.mkdir();
		}
		
		try{
			System.out.println("?��?�� ?��?���?....");
			f1.createNewFile(); //?��?�� ?��?��?�� ?���? / ?���? ?��?��
			Thread.sleep(3000);
			System.out.println("?��?�� ?��?�� ?���?");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(f1.canRead())
				f1.setWritable(false);
		}
		
		File f2 = new File("c:\\workspace\\java\\abc.txt");
		System.out.println("?��?���? : " + f2.getName());
		System.out.println("?��?�� 경로 : " + f2.getPath());
		System.out.println("?��?�� 경로 : " + f2.getParent());
		System.out.println("?��?�� ?���? : " + f2.length());
		//System.out.println("?��?�� ?��?��?�� : " + new java.util.Date(f.lastModifield()));
		
		
			
	}

}







