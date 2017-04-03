package kr.or.iei.event;
import java.awt.BorderLayout;
/*
 * 객체 정의 유형 
 * - Listener를 구현하거나 Adapter를 상속받은 임의의 클래스 생성법
 */
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exam02 {
	public static void main(String[] ar){
		Exam02_sub ex = new Exam02_sub();
	}
}

class Exam02_sub {
	private Dimension dimen1, dimen2;
	private int xpos, ypos;
	
	Frame f = new Frame();
	Button btn1 = new Button("버튼1");
	Button btn2 = new Button("버튼2");
	Label lb1 = new Label("결과 : 현재 누른 버튼이 없습니다.",Label.CENTER);
	
	public Exam02_sub(){
		//super("제목줄");
		this.init(); //사용자 정의 메소드 - 화면구성
		this.start(); // 사용자 정의 메소드 - Event or Thread
		f.setSize(300, 200);
		dimen1 = Toolkit.getDefaultToolkit().getScreenSize();
		dimen2 = f.getSize();
		
		xpos = (int)(dimen1.getWidth() / 2 - dimen2.getWidth()/2);
		ypos = (int)(dimen1.getHeight() / 2 - dimen2.getHeight()/2);
		
		f.setLocation(xpos, ypos);
		f.setVisible(true);
	}
	private void init() { //화면구성
		BorderLayout border = new BorderLayout();
		f.setLayout(border);
		f.add("North", lb1);
		Panel p = new Panel(new FlowLayout(FlowLayout.CENTER));
		p.add(btn1);
		p.add(btn2);
		f.add("Center", p);
		
		
		
	}
	private void start() { //Thread, Event 설정
		ActionDefine ad = new ActionDefine();
		btn1.addActionListener(ad);
		btn2.addActionListener(ad);
		
	}
}

class ActionDefine implements ActionListener{

	Exam02 ex = new Exam02();

	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand()=="버튼1"){
			System.out.println("결과 : 버튼1을 누르셨습니다.");
			
			return;
		}else if(e.getActionCommand()=="버튼2"){
			System.out.println("결과 : 버튼2을 누르셨습니다.");
			//lb1.setText("결과 : 버튼2을 누르셨습니다.");
			
		}
		
		System.out.println(e.getActionCommand()=="버튼1");
		return;
	}
	
}





