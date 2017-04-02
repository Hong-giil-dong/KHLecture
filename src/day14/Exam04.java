package day14;
import java.io.*;

public class Exam04 {
	public static void main(String[] ar){
		File f = new File("C:\\Windows");
		//String[] file = f.list();
		File[] file = f.listFiles();
		
		for(int i=0;i<file.length;i++){
			if(!file[i].getName().endsWith("exe")){
				System.out.println(file[i].getName());
			}
			
		}
	}

}
























