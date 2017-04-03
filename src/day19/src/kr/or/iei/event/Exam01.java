package kr.or.iei.event;
/*
 * 익명 중첩 클래스 사용
 */
import java.awt.*;
import java.awt.event.*;

public class Exam01 {
	public static void main(String[] ar){
		Exam01_sub ex = new Exam01_sub();
	}
}

class Exam01_sub extends Frame{
	private Dimension dimen1, dimen2;
	private int xpos, ypos;
	
	private Button btn = new Button("버튼");
	public Exam01_sub(){
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
		this.setLayout(new FlowLayout());
		this.add(btn);
		
	}
	private void start() { //Thread, Event 설정
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
	}
}









