package day14;
import java.io.*;
class Exam04_sub implements Serializable{
	int x;
	int y;
}

public class Exam04 {
	public static void main(String[] ar) throws IOException{
		Exam04_sub ex = new Exam04_sub();
		ex.x = 100;
		ex.y = 200;
		
		File dir = new File("c:\\workspace\\java2");
		File file = new File(dir, "Object.txt");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(ex);
		oos.close();
		
	}

}










