package day17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;

class Exam02_sub extends Frame{
	private Dimension dim1, dim2;
	private int xpos, ypos;
	
	public Exam02_sub(){
		super("�젣紐�");
		this.init();
		this.start();
		this.setSize(200,300);
		dim1 = Toolkit.getDefaultToolkit().getScreenSize();
		dim2 = this.getSize();
		xpos = (int)(dim1.getWidth()/2 - dim2.getWidth()/2);
		ypos = (int)(dim1.getHeight()/2 - dim2.getHeight()/2);
		
		this.setLocation(xpos, ypos);
		this.setVisible(true);		
	}
	
	
	public void init(){
		BorderLayout border = new BorderLayout();
		Panel p = new Panel();
		Panel p1 = new Panel(new GridLayout(2,1));
		GridLayout grid = new GridLayout();
		//GridLayout grid1 = new GridLayout(2,1);
		Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR);
		Cursor cursor2 = new Cursor(Cursor.WAIT_CURSOR);
		Font font = new Font("SansSerif", Font.BOLD, 20);
		Image image = Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\Public\\Pictures\\Sample Pictures\\koala(2).jpg");
			
		this.setIconImage(image);
		
		
		this.setLayout(border);
		this.setCursor(cursor1);
		
		Label lb1 = new Label("Test1");
		Label lb2 = new Label("Test2");
		Label lb3 = new Label("Test3");
		
		lb1.setBackground(Color.CYAN);
		lb2.setBackground(Color.YELLOW);
		lb3.setBackground(new Color(117,11,113));
		lb1.setCursor(cursor2);
		lb1.setFont(font);
		
		
		//p1.setLayout(grid1);
		p1.add(lb2);
		p1.add(lb3);
		
		p.setLayout(grid);
		p.add(lb1);
		p.add(p1);
		
		
		this.add(p, BorderLayout.SOUTH);
		
		
	}
	public void start(){
		
	}
}


public class Exam02 {
	public static void main(String[] ar){
		Exam02_sub ex = new Exam02_sub();
	}

}
