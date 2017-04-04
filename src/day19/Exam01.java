package day19;

import java.awt.*;
import java.awt.event.*;

public class Exam01 {
	public static void main(String[] ar){
		Exam01_sub ex = new Exam01_sub();
	}
}

class Exam01_sub extends Frame {
	
	private Dimension dimen1, dimen2; // 디멘션 초기화
	private int xpos, ypos; // xy좌표
	private Button btn = new Button("종료"); // 종료 버튼의 인스턴스 생성
	
	public Exam01_sub(){
		super("종료 버튼 연습"); // 프레임에 매개변수 "종료버튼연습" 붙여서 선언
		this.init(); // 이니시 메소드를 실행
		this.start(); // 스타트 메소드를 싱행
		this.setSize(300, 200);
		dimen1 = Toolkit.getDefaultToolkit().getScreenSize();
		dimen2 = this.getSize();
		
		xpos = (int)(dimen1.getWidth() / 2 - dimen2.getWidth()/2);
		ypos = (int)(dimen1.getHeight() / 2 - dimen2.getHeight()/2);
		
		this.setLocation(xpos, ypos);
		this.setVisible(true);
	}
	
	private void init() { 
		//this.setLayout(new FlowLayout());
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		this.add(btn);
	}
	
	private void start() {
		btn.addActionListener(new ActionListener() { // 액션리스너 메소드를 생성하고 그것을 btn객체에 추가시킴
			@Override
			public void actionPerformed(ActionEvent e) {//메소드 안에 메소드, 버튼 클릭이 감지되면 안의 내용이 실행됨
				// TODO Auto-generated method stub
				//System.out.println("종료");
				System.exit(0);
			}
		});
		
	}
}









