package day17;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.List;

public class Exam05 {
	public static void main(String[] ar){
		Exam05_sub ex = new Exam05_sub();
	}
}

class Exam05_sub extends Form{
	public Exam05_sub(){
		super();
		this.setTitle("免积老");
		this.setSize(600, 200);
	}

	@Override
	public void init() {
		super.init();
		FlowLayout flow = new FlowLayout();
		this.setLayout(flow);
		
		Label lb1 = new Label("积斥岿老");
		Label lb2 = new Label("斥");
		Label lb3 = new Label("岿");
		Label lb4 = new Label("老");
		
		Choice ch1 = new Choice();
		Choice ch2 = new Choice();
		Choice ch3 = new Choice();
		
		List list = new List(10, true);
		
		for(int i=0;i<20;i++)
			list.add("Test"+(i+1));
		this.add(list);
		
		for(int i=1970; i<=2017;i++)
			ch1.add(String.valueOf(i));
		
		for(int i=1; i<=12;i++)
			ch2.add(String.valueOf(i));
		
		for(int i=1; i<=31;i++)
			ch3.add(String.valueOf(i));
		
		ch1.select(3);
		ch2.select(3);
		ch3.select(3);
		
		
		list.select(4);
		list.select(6);
		list.select(10);
		
		
		
		/*
		 * ch1.add(String text)
		 * ch1 : 1970 ~ 2017
		 * ch2 : 1 ~ 12
		 * ch3 : 1 ~ 31
		 * 		 
		*/
		
		this.add(lb1);
		this.add(ch1);
		this.add(lb2);
		this.add(ch2);
		this.add(lb3);
		this.add(ch3);
		this.add(lb4);
		
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}
	
}








