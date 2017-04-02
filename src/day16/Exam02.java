package day16;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.*;

import javax.swing.JFrame;

public class Exam02 extends Frame{
	private Dimension dimen1, dimen2;
	private int xpos, ypos;
	
	Label lb1 = new Label("North");
	Label lb2 = new Label("Soutn");
	Label lb3 = new Label("West");
	Label lb4 = new Label("East");
	Label lb5 = new Label("Center");
	
	public Exam02(){
		super("?†úÎ™©Ï§Ñ");
		this.init(); //?Ç¨?ö©?ûê ?†ï?ùò Î©îÏÜå?ìú - ?ôîÎ©¥Íµ¨?Ñ±
		this.start(); // ?Ç¨?ö©?ûê ?†ï?ùò Î©îÏÜå?ìú - Event or Thread
		this.setSize(300, 200);
		dimen1 = Toolkit.getDefaultToolkit().getScreenSize();
		dimen2 = this.getSize();
		
		xpos = (int)(dimen1.getWidth() / 2 - dimen2.getWidth()/2);
		ypos = (int)(dimen1.getHeight() / 2 - dimen2.getHeight()/2);
		
		this.setLocation(xpos, ypos);
		this.setVisible(true);
		
	}
	
	public void init(){
		/*
		this.setLayout(null);
		this.setBackground(Color.RED);
		Label lb = new Label("?ó∞?äµ ?†à?ù¥Î∏? ?ûÖ?ãà?ã§.");
		lb.setBackground(Color.YELLOW);
		this.add(lb);
		lb.setBounds(100, 100, 100, 100);
		*/
		
		/*
		FlowLayout flow = new FlowLayout(FlowLayout.RIGHT);
		this.setLayout(flow);
		
		lb1.setBackground(Color.yellow);
		lb2.setBackground(Color.GREEN);
		lb3.setBackground(Color.PINK);
		this.add(lb1);
		this.add(lb2);
		this.add(lb3);
		*/
		/*
		GridLayout grid = new GridLayout(2,2,5,5);
		this.setLayout(grid);
		lb1.setBackground(Color.yellow);
		lb2.setBackground(Color.GREEN);
		lb3.setBackground(Color.PINK);
		this.add(lb1);
		this.add(lb2);
		this.add(lb3);
		this.add(lb4);
		*/
		BorderLayout border = new BorderLayout();
		this.setLayout(border);
		
		lb1.setBackground(Color.yellow);
		lb2.setBackground(Color.GREEN);
		lb3.setBackground(Color.PINK);
		lb4.setBackground(Color.BLUE);
		lb5.setBackground(Color.CYAN);
		
		
		this.add("North",lb1);
		this.add("South",lb2);
		//this.add("West",lb3);
		//this.add("East",lb4);
		this.add("Center",lb5);
		
		
	}
	public void start(){
		
	}

}









