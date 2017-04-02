package day17;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;

public class Exam01{
	public static void main(String[] ar){
		Exam01_sub ex = new Exam01_sub();
	}
}



class Exam01_sub extends Frame{
	private Dimension dim1, dim2;
	private int xpos, ypos;
	
	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	private Panel p3 = new Panel();
	CardLayout card = new CardLayout();
	
	Label lb1 = new Label("AAA");
	Label lb2 = new Label("BBB");
	Label lb3 = new Label("CCC");
	Label lb4 = new Label("DDD");
	Label lb5 = new Label("EEE");
	Label lb6 = new Label("FFF");
	Label lb7 = new Label("GGG");
	Label lb8 = new Label("HHH");
	Label lb9 = new Label("III");
	Label lb0 = new Label("JJJ");
	
	
	public Exam01_sub(){
		super("? œëª?");
		this.init();
		this.start();
		this.setSize(200,300);
		dim1 = Toolkit.getDefaultToolkit().getScreenSize();
		dim2 = this.getSize();
		xpos = (int)(dim1.getWidth()/2 - dim2.getWidth()/2);
		ypos = (int)(dim1.getHeight()/2 - dim2.getHeight()/2);
		
		this.setLocation(xpos, ypos);
		this.setVisible(true);
		
		/*
		try{
			Thread.sleep(5000);
		}catch(Exception e){ }
		card.show(this, "aaa");
		
		try{
			Thread.sleep(5000);
		}catch(Exception e){ }
		card.show(this, "bbb");
		
		try{
			Thread.sleep(5000);
		}catch(Exception e){ }
		card.show(this, "ccc");
		
		*/
		
	}
	
	
	public void init(){
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints gc = new GridBagConstraints();
		this.setLayout(gridbag);
		lb1.setBackground(Color.YELLOW);
		lb2.setBackground(Color.YELLOW);
		lb3.setBackground(Color.YELLOW);
		gc.gridx=0; gc.gridy=0; this.add(lb1,gc);
		gc.gridx=1; gc.gridy=1; this.add(lb2,gc);
		gc.gridx=2; gc.gridy=1; this.add(lb3,gc);
		
		
		/*
		this.setLayout(card);
		p1.setBackground(Color.RED);
		p2.setBackground(Color.GREEN);
		p3.setBackground(Color.BLUE);
		
		this.add(p1,"aaa");
		this.add(p2,"bbb");
		this.add(p3,"ccc");
		*/
		
		
		
		
	}
	public void start(){
		
	}
}













