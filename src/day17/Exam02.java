package day17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;

public class Exam02 {
	public static void main(String[] ar){
		Exam02_sub ex = new Exam02_sub();
	}
}

class Exam02_sub extends Frame{
	private Dimension dim1, dim2;
	private int xpos, ypos;

	public Exam02_sub(){ // 생성자.. 프레임을 하나 띄움
		super("제목");
		this.init();
		this.start();
		this.setSize(200,300);
		dim1 = Toolkit.getDefaultToolkit().getScreenSize();
		dim2 = this.getSize();
		xpos = (int)(dim1.getWidth()/2 - dim2.getWidth()/2);
		ypos = (int)(dim1.getHeight()/2 - dim2.getHeight()/2);
		this.setLocation(xpos, ypos);
		this.setVisible(true);		
	}

	public void init(){
		BorderLayout border = new BorderLayout(); // 보더레이아웃 객체 생성
		Panel p = new Panel(); //패널 객체 생성
		Panel p1 = new Panel(new GridLayout(2,1)); // 그리드레이아웃 객체를 패널 객체에 넣고 생성 
		GridLayout grid = new GridLayout(); // 그리드 레이아웃 객체 생성
		//GridLayout grid1 = new GridLayout(2,1);
		Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR); // 커서 객체를 생성하는데 매개변수는 핸드 커서
		Cursor cursor2 = new Cursor(Cursor.WAIT_CURSOR); // 커서 객체를 생성하는데 매개변수는 wait 커서
		Font font = new Font("SansSerif", Font.BOLD, 40); // 폰트 객체 생성 매개변수 sansserif 볼드, 크기 20
		Image image = Toolkit.getDefaultToolkit()//툴킷 객체를 생성하는 메소드
				.getImage("C:\\Users\\Public\\Pictures\\Sample Pictures\\koala.jpg"); // 툴킷 객체의 메소드인 getImage

		this.setIconImage(image); // 프레임의 아이콘 이미지에 불러온 image 를 매칭시킴
		
		this.setLayout(border); // 보더레이아웃을 프레임에 넣음
		this.setCursor(cursor1); // 프레임의 커서설정(cursor1) -> 프레임 지역에 설정된 핸드 커서가 뜨게 된다.

		Label lb1 = new Label("Test1"); // 새 라벨 3개를 만듬
		Label lb2 = new Label("Test2");
		Label lb3 = new Label("Test3");

		lb1.setBackground(Color.CYAN); // 라벨1의 색 파랑설정
		lb2.setBackground(Color.YELLOW); // 라벨2의 색 노랑설정
		lb3.setBackground(new Color(117,11,113)); // 새로운 색상 객체 생성해서 라벨3의 백그라운드 색으로 설정
		lb1.setCursor(cursor2); // 라벨1의 커서설정을 wait커서로 설정
		lb1.setFont(font); // 라벨1의 폰트 설정을 font로 설정


		//p1.setLayout(grid1);
		p1.add(lb2); // p1 패널 객체(그리드 레이아웃, 2행 1열)에 라벨 2 삽입 
		p1.add(lb3); // p1 패널 객체(그리드 레이아웃, 2행 1열)에 라벨 3 삽입 

		p.setLayout(grid); // 아무것도 설정되어 있지 않음 p 패널 객체에 그리드 레이아웃 객체를 삽입
		p.add(lb1); // p패널 객체에 라벨1 삽입
		p.add(p1); // p패널 객체에 p1패널 객체 삽입


		this.add(p, BorderLayout.SOUTH); // 최종적으로 p패널 객체를 보더 레이아웃의 아래쪽에 삽입(꽉참)


	}

	public void start(){

	}
}
