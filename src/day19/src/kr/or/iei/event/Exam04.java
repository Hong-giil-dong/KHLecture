package kr.or.iei.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exam04{
	public static void main(String[] ar){
		Exam04_sub ex = new Exam04_sub();
	}
}

class Exam04_sub extends Frame implements ActionListener{
	private Dimension dimen1, dimen2;
	private int xpos, ypos;
	
	private Button btn1 = new Button("계산");
	//private Button btn2 = new Button("버튼2");
	private Label lbKor = new Label("국어",Label.RIGHT);
	private Label lbEng = new Label("영어",Label.RIGHT);
	private Label lbMat = new Label("수학",Label.RIGHT);
	private Label lbTot = new Label("총점",Label.CENTER);
	private Label lbAve = new Label("평균",Label.CENTER);
	private Label lbTot_jum = new Label("0",Label.CENTER);
	private Label lbAve_jum = new Label("o",Label.CENTER);
	
	private TextField tfKor = new TextField(5);
	private TextField tfEng = new TextField(5);
	private TextField tfMat = new TextField(5);
	
	public Exam04_sub(){
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
		//this.add("North", "점수입력");
		Panel p = new Panel(new GridLayout(3,2,5,5));
		Panel p_Kor = new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel p_Eng = new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel p_Mat = new Panel(new FlowLayout(FlowLayout.LEFT));
		p.add(lbKor);
		p_Kor.add(tfKor);
		p.add(p_Kor);
		p.add(lbEng);
		p_Eng.add(tfEng);
		p.add(p_Eng);
		//p.add(tfEng);
		p.add(lbMat);
		p_Mat.add(tfMat);
		p.add(p_Mat);
		//p.add(tfMat);
		
		this.add("North", p);
		Panel p1 = new Panel(new FlowLayout());
		p1.add(btn1);
		this.add("Center", p1);
		
		Panel p3 = new Panel(new GridLayout(2,2,5,5));
		p3.add(lbTot);
		p3.add(lbAve);
		p3.add(lbTot_jum);
		p3.add(lbAve_jum);
		this.add("South", p3);
		
		
		
		
		
		
	}
	private void start() { //Thread, Event 설정
		btn1.addActionListener(this);
		//btn2.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int kor, eng, mat, tot;
		float ave;
		kor = Integer.parseInt(tfKor.getText());
		eng = Integer.parseInt(tfEng.getText());
		mat = Integer.parseInt(tfMat.getText());
		tot = kor + eng + mat;
		ave = tot / 3.0f;
		
		lbAve_jum.setText(String.valueOf(ave));
		lbTot_jum.setText(String.valueOf(tot));
		
	}
	
	
	
	
}