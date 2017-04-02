package day14;
import java.io.*;
public class Exam06 {
	public static void main(String[] ar){
		File f = new File("c:\\workspace\\java\\abc.txt");
		try{
			FileInputStream fis = new FileInputStream(f);
			byte[] by = new byte[65536];
			int count = fis.read(by);
			for(int i=0;i<count;i++)
				System.out.println(i + " : " + (char)by[i]);
		}catch(Exception e){}
		
		/*
		try{
			FileOutputStream fos = 
					new FileOutputStream(FileDescriptor.out);
			FileOutputStream fos1 = 
					new FileOutputStream(f);
			byte[] data = {66,68,70,72,(byte)'!'};
			fos.write(data);
			fos1.write(data);
		}catch(Exception e){}
		System.out.println("?‹¤?–‰ ?!!!");
		*/
	}

}
