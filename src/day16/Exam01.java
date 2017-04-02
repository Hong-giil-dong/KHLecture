package day16;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Exam01 {
	public static void main(String[] ar){
		Frame f = new Frame("? œëª©í‘œ?‹œì¤?"); //ì´ˆê¸°?™” ê³¼ì •?—?„œ ?„¤? •
		//f.show();
		f.setTitle("? œëª©ì—°?Šµì¤?"); //? œëª? ë³?ê²?
		
		f.setSize(300, 500);//?¼?˜ ?¬ê¸?
		
		
		Dimension dimen1 = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dimen2 = f.getSize();
		int x = (int)(dimen1.getWidth() / 2 - dimen2.getWidth()/2);
		int y = (int)(dimen1.getHeight()/ 2 - dimen2.getHeight()/2);
		f.setLocation(x, y); //?œ„ì¹? ì§?? •
		f.setVisible(true); //?™”ë©´ì— ?‘œ?‹œ
	}
}












