package day14;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Date;

/*
 * ?��?�� ?��?��명을 ?��보드�? ?��?��?�� 받아?�� ?��?�� ?��?�� ?��?���? ?��?��?��?�� ?��로그?��
 * ?�� ?��?�� ?��?��?��.
 * ?��, 경로?�� ?��?��진곳?�� ?��?��?��?��.
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
			System.out.print("?��?���? : ");
			fileName = in.readLine();
			File f1 = new File(f, fileName);
			if(f1.exists()){
				System.out.println("?��?���? : " + f1.getName());
				System.out.println("?��?�� 경로 : " + f1.getPath());
				System.out.println("?��?�� 경로 : " + f1.getParent());
				System.out.println("?��?�� ?���? : " + f1.length());
				System.out.println("최종 ?��?��?�� : " + new Date(f1.lastModified()));
			}else{
				System.out.println("File Not Found....");
				
			}
			
		}catch(Exception e){}
	}

}
