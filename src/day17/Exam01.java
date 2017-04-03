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
	
	private Panel p1 = new Panel(); // 패널 객체를 만듬
	private Panel p2 = new Panel(); // 패널 객체를 만듬
	private Panel p3 = new Panel(); // 패널 객체를 만듬
	CardLayout card = new CardLayout(); // 카드레이아웃 객체를 만듬
	
	Label lb1 = new Label("AAA"); // 각 라벨 객체들 생성 
	Label lb2 = new Label("BBB");
	Label lb3 = new Label("CCC");
	Label lb4 = new Label("DDD");
	Label lb5 = new Label("EEE");
	Label lb6 = new Label("FFF");
	Label lb7 = new Label("GGG");
	Label lb8 = new Label("HHH");
	Label lb9 = new Label("III");
	Label lb0 = new Label("JJJ");
	
	
	public Exam01_sub(){ // 생성자
		super("카드레이아웃"); // 제목설정
		this.init(); // 이닛 메소드 실행
		this.start(); // 스타트 메소드 실행
		this.setSize(600,600); // 프레임 사이즈 설정
		dim1 = Toolkit.getDefaultToolkit().getScreenSize(); // 화면 사이즈 불러옴
		dim2 = this.getSize(); // 프레임 사이즈 불러옴
		xpos = (int)(dim1.getWidth()/2 - dim2.getWidth()/2); // x위치 설정
		ypos = (int)(dim1.getHeight()/2 - dim2.getHeight()/2); // y위치 설정
		
		this.setLocation(xpos, ypos); // xy위치값 바탕으로 프레임 위치 설정
		this.setVisible(true); // 프레임을 보이게 함
		
/*		//카드레이아웃
		try{
			Thread.sleep(1000);
		}catch(Exception e){ }
		card.show(this, "aaa");
		
		try{
			Thread.sleep(1000);
		}catch(Exception e){ }
		card.show(this, "bbb");
		
		try{
			Thread.sleep(1000);
		}catch(Exception e){ }
		card.show(this, "ccc");*/
	
	}
	
	
	public void init(){
		
		GridBagLayout gridbag = new GridBagLayout(); // 그리드백 레이아웃 객체 생성
		GridBagConstraints gc = new GridBagConstraints(); // GridBagConstraint 인스턴스 생성
		this.setLayout(gridbag); // 프레임에 그리드 백 레이아웃 설정
		lb1.setBackground(Color.YELLOW); // 라벨 3개 만듬
		lb2.setBackground(Color.blue);
		lb3.setBackground(Color.black);
		gc.gridx=0; gc.gridy=0; this.add(lb1,gc);
		gc.gridx=1; gc.gridy=1; this.add(lb2,gc);
		gc.gridx=10; gc.gridy=10; this.add(lb3,gc);
		
/*		//카드레이아웃
		this.setLayout(card);
		p1.setBackground(Color.RED);
		p2.setBackground(Color.GREEN);
		p3.setBackground(Color.BLUE);
		
		this.add(p1,"aaa");
		this.add(p2,"bbb");
		this.add(p3,"ccc");*/
		
	}
	public void start(){
		
	}
}













