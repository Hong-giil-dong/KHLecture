package day19;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exam03 {
	public static void main(String[] ar){
		Exam03_sub ex = new Exam03_sub();
	}
}

class Exam03_sub extends Frame implements ActionListener{
	private Dimension dimen1, dimen2;
	private int xpos, ypos;
	
	private Button btn1 = new Button("버튼1");
	private Button btn2 = new Button("버튼2");
	private Label lb1 = new Label("버튼 누르기 전",Label.CENTER);
	
	public Exam03_sub(){
		super("");
		this.init(); 
		this.start(); 
		this.setSize(300, 200);
		dimen1 = Toolkit.getDefaultToolkit().getScreenSize();
		dimen2 = this.getSize();
		
		xpos = (int)(dimen1.getWidth() / 2 - dimen2.getWidth()/2);
		ypos = (int)(dimen1.getHeight() / 2 - dimen2.getHeight()/2);
		
		this.setLocation(xpos, ypos);
		this.setVisible(true);
	}
	private void init() { 
		BorderLayout border = new BorderLayout();
		this.setLayout(border);
		this.add("North", lb1);
		Panel p = new Panel(new FlowLayout(FlowLayout.CENTER));
		p.add(btn1);
		p.add(btn2);
		this.add("Center", p);
		
		
		
	}
	private void start() {
		btn1.addActionListener(this); // 
		btn2.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1){
			lb1.setText("결과 : 버튼1을 눌렀습니다"); // 
		}else if(e.getSource()==btn2){
			lb1.setText("결과 : 버튼2를 눌렀습니다");
		}
		
	}
	
	
	
}










