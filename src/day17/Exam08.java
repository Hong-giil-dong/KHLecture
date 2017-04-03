package day17;

import java.awt.*;

public class Exam08 {
	public static void main(String[] ar){
		Exam08_sub ex = new Exam08_sub();
	}
}

class Exam08_sub extends Frame{
	private Dimension dim1, dim2;
	private int xpos, ypos;
	
	public Exam08_sub(){
		super("Chat Window"); // 프레임 제목 설정
		this.init();
		this.start();
		this.setSize(500,320);
		dim1 = Toolkit.getDefaultToolkit().getScreenSize();
		dim2 = this.getSize();
		xpos = (int)(dim1.getWidth()/2 - dim2.getWidth()/2);
		ypos = (int)(dim1.getHeight()/2 - dim2.getHeight()/2);
		
		this.setLocation(xpos, ypos);
		this.setVisible(true);		
	}
	
	
	public void init(){
		BorderLayout border = new BorderLayout(); //  보더 레이아웃 객체 생성
		this.setLayout(border); // 보더 레이아웃 객체를 프레임에 삽입
		
		//각종 버튼 필드 리스트 라벨 객체 생성
		Label lb1 = new Label("Chat Program");
		Label lb2 = new Label("Chat - list");
		TextArea ta = new TextArea(12,35);
		TextField tf = new TextField();
		List list = new List();
		Button btn1 = new Button("하이");
		Button btn2 = new Button("잘가");
		Button btn3 = new Button("뭐야");
		Button btn4 = new Button("왜");
		
		this.add("North", lb1); // 보더레이아웃 객체 북쪽에 라벨1 추가 
		lb1.setAlignment(Label.CENTER); // 북쪽에 있는 라벨1의 위치를 그중에서도 가운데로 잡아줌
		
		Panel p1 = new Panel(new BorderLayout()); // 보더레이아웃객체를 만들고 그것을 새로운 패널 p1객체에 삽입
		p1.add("North",ta); // 패널p1객체 북쪽에 텍스트에리아 객체 삽입
		p1.add("South",tf); // 패널 p1객체 남쪽에 텍스트 필드 객체 삽입
		this.add("Center",p1); // 보더레이아웃 객체의 가운데에 만들어진 패널 p1객체를 삽입 
		
		Panel p2 = new Panel(new BorderLayout()); // 보더레이아웃객체를 만들고 그것을 새로운 패널 p2객체에 삽입
		p2.add("North", lb2); // 패널p2객체 북쪽에 라벨2 객체 삽입
		p2.add("Center", list); // 패널p2객체 중간에 리스트 객체 삽입
		
		Panel p3 = new Panel(new GridLayout(4,1)); // 그리드레이아웃객체(4행 1열)를 만들고 그것을 새로운 패널 p3객체에 삽입 
		p3.add(btn1); // 각 버튼을 패널p3객체에 삽입
		p3.add(btn2); // 각 버튼을 패널p3객체에 삽입
		p3.add(btn3); // 각 버튼을 패널p3객체에 삽입
		p3.add(btn4); // 각 버튼을 패널p3객체에 삽입
		
		p2.add("South", p3); // 패널 p2객체 남쪽에 패널 p3객체 삽입
		
		this.add("East", p2); // 최종적으로 보더레이아웃의 동쪽에 패널p2객체 삽입 
		
		this.setFont(new Font("TimesRoman", Font.BOLD, 15)); // 프레임 전체의 폰트를 설정
		
		
		
			
	}
	public void start(){
		
	}
}
