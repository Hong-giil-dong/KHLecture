package day14;
import java.io.*;
public class Exam05 {
	public static void main(String[] ar) throws IOException{
		File dir = new File("c:\\workspace\\java2");
		File file = new File(dir, "Object.txt");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Object obj = null;
		try{
			obj = ois.readObject();
		}catch(Exception e){}
		ois.close();
		Exam04_sub ex = (Exam04_sub)obj;
		//Object?��  ?��?�� ?��?���? Exam04_sub?�� 것이�?�? 강제 ?���??��
		System.out.println("X = " + ex.x);
		System.out.println("Y = " + ex.y);
		
	}

}
