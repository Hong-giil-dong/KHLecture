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
		super("Chat Window");
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
		BorderLayout border = new BorderLayout();
		this.setLayout(border);
		//컴포넌트 선언
		Label lb1 = new Label("gurum님 환영합니다.");
		Label lb2 = new Label("Chat - list");
		TextArea ta = new TextArea(12,35);
		TextField tf = new TextField();
		List list = new List();
		Button btn1 = new Button("귓속말");
		Button btn2 = new Button("저장");
		Button btn3 = new Button("강퇴");
		Button btn4 = new Button("상세보기");
		
		//레이아웃에 알맞게 각종 컴포넌트를 붙여 준다.
		//North
		this.add("North", lb1);
		lb1.setAlignment(Label.CENTER);
		
		
		//center
		Panel p1 = new Panel(new BorderLayout());
		p1.add("North",ta);
		p1.add("South",tf);
		this.add("Center",p1);
		
		//East
		Panel p2 = new Panel(new BorderLayout());
		p2.add("North", lb2);
		p2.add("Center", list);
		
		Panel p3 = new Panel(new GridLayout(4,1));
		p3.add(btn1);
		p3.add(btn2);
		p3.add(btn3);
		p3.add(btn4);
		
		p2.add("South", p3);
		
		this.add("East", p2);
		
		this.setFont(new Font("TimesRoman", Font.BOLD, 15));
		
		
		
			
	}
	public void start(){
		
	}
}
