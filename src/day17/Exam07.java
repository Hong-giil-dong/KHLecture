package day17;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Exam07{
	public static void main(String[] ar){
		Exam07_sub ex = new Exam07_sub();
		
		
	}
}

class Exam07_sub extends Form{
	public Exam07_sub(){
		super();
		this.setSize(400, 300);
	}
	

	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		BorderLayout border = new BorderLayout();
		Label lb1 = new Label("특정 내용의 범위를 지정하세요");
		Label lb2 = new Label("선택된 내용");
		TextArea ta = new TextArea();
		TextField tf = new TextField(10);
		Panel p = new Panel(new FlowLayout(FlowLayout.RIGHT));
		
		p.add(lb2);p.add(tf);
		
		
		this.setLayout(border);
		this.add("North",lb1);
		this.add("Center",ta);
		this.add("South",p);
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}

}
