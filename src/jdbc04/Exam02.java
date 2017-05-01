package jdbc04;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Date;

class Exam02_sub extends Frame{
	private Image img;
	public Exam02_sub(){
		super();
		this.init();
		this.start();
		this.setSize(500,500);
		this.setVisible(true);
	}
	
	public void init(){
		img = Toolkit.getDefaultToolkit().getImage
				("C:\\Users\\Public\\Pictures\\Sample Pictures\\guk.jpg");
	}
	
	public void start(){
		
	}
	public void paint(Graphics g){
		String date = new Date().toString();
		g.drawString(date, 50, 50);
		g.drawImage(img, 50,100, this);
	}
}



public class Exam02 {
	public static void main(String[] ar){
		Exam02_sub ex = new Exam02_sub();
	}
}
