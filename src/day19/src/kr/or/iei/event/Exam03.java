package kr.or.iei.event;

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

/*
 * 현재 클래스에 Listener를 구현하는 방법
 */
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
	private Label lb1 = new Label("결과 : 현재 누른 버튼이 없습니다.",Label.CENTER);
	
	public Exam03_sub(){
		super("제목줄");
		this.init(); //사용자 정의 메소드 - 화면구성
		this.start(); // 사용자 정의 메소드 - Event or Thread
		this.setSize(300, 200);
		dimen1 = Toolkit.getDefaultToolkit().getScreenSize();
		dimen2 = this.getSize();
		
		xpos = (int)(dimen1.getWidth() / 2 - dimen2.getWidth()/2);
		ypos = (int)(dimen1.getHeight() / 2 - dimen2.getHeight()/2);
		
		this.setLocation(xpos, ypos);
		this.setVisible(true);
	}
	private void init() { //화면구성
		BorderLayout border = new BorderLayout();
		this.setLayout(border);
		this.add("North", lb1);
		Panel p = new Panel(new FlowLayout(FlowLayout.CENTER));
		p.add(btn1);
		p.add(btn2);
		this.add("Center", p);
		
		
		
	}
	private void start() { //Thread, Event 설정
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1){
			lb1.setText("결과 : 버튼1을 누르셨습니다.");
		}else if(e.getSource()==btn2){
			lb1.setText("결과 : 버튼2을 누르셨습니다.");
		}
		
	}
	
	
	
}










