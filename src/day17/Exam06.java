package day17;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;

public class Exam06 {
	public static void main(String[] ar){
		Exam06_sub ex = new Exam06_sub();
	}
}

class Exam06_sub extends Frame{
	private Dimension dim1, dim2;
	private int xpos, ypos;
	
	FlowLayout flow = new FlowLayout();
	List list1 = new List(10, true);
	List list2 = new List(10);
	
	TextField tf = new TextField(30);
	TextArea ta = new TextArea(10,8);
	
	public Exam06_sub(){
		super("Á¦¸ñ");
		this.init();
		this.start();
		this.setSize(600,300);
		dim1 = Toolkit.getDefaultToolkit().getScreenSize();
		dim2 = this.getSize();
		xpos = (int)(dim1.getWidth()/2 - dim2.getWidth()/2);
		ypos = (int)(dim1.getHeight()/2 - dim2.getHeight()/2);
		
		this.setLocation(xpos, ypos);
		this.setVisible(true);
		try{
			Thread.sleep(3000);
		}catch(Exception e){}
		list1.select(3);
		list1.select(6);
		list1.select(9);
		
		String[] str = list1.getSelectedItems();
		
		for(int i=0;i<str.length;i++)
			list2.add(str[i]);
		
		list1.remove(str[0]);
		list1.remove(str[1]);
		list1.remove(str[2]);
		
		
		
	}

	
	public void init() {
		// TODO Auto-generated method stub
		
		
		
		for(int i=0;i<30;i++)
			list1.add("TEST"+(i+1));
		
		this.setLayout(flow);
		this.add(list1);
		this.add(list2);
		
		this.add(tf);
		this.add(ta);
	}


	public void start() {
		// TODO Auto-generated method stub
		
	}
	
}
