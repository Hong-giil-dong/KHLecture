package day14;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * ?‚¤ë³´ë“œë¡? 1ë°”ì´?Š¸?˜ ? •ë³´ë?? ?…? ¥ ë°›ì•„?„œ ?ŒŒ?¼?— ???¥ ?•˜?‹œ?˜¤.
 */
public class Exam07 {
	public static void main(String[] ar){
		File f = new File("c:\\workspace\\java\\abc.txt");
		try{
			FileInputStream fis = new FileInputStream(FileDescriptor.in);
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			byte[] by = new byte[65536];
			int i=0;
			do{
				System.out.print("?…? ¥(Q:ì¢…ë£Œ) : ");
				by[i] = dis.readByte();
				dis.readByte();
				dis.readByte();
				
				if(by[i] == (byte)'Q'){
					break;
				}
				i++;
			}while(true);
			
			FileOutputStream fos1 = 
					new FileOutputStream(f);
			for(int j=0;j<i;j++){
				fos1.write(by[j]);
				//System.out.println(by[j]);
			}
			
		
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
