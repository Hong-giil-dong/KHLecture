package day17;

import java.awt.*;

public class Exam11 {
	public static void main(String[] ar){
		Exam11_sub ex = new Exam11_sub();
	}

}

class Exam11_sub extends Frame{
	private Dimension dimen1, dimen2;
	private int xpos, ypos;
	
	private TextArea ta = new TextArea("약간의 시간후에 표시");
	
	private PopupMenu pm = new PopupMenu("My popup"); //MenuBar와 동일 성격
	private MenuItem copy = new MenuItem("복사");
	private MenuItem cut = new MenuItem("잘라내기");
	private MenuItem past = new MenuItem("붙여넣기");
	private Menu align = new Menu("정렬");
	private CheckboxMenuItem asize = new CheckboxMenuItem("크기순");
	private CheckboxMenuItem aname = new CheckboxMenuItem("이름순");
	private CheckboxMenuItem aauto = new CheckboxMenuItem("자동정렬",true);
	
	
	
	public Exam11_sub(){
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
		
		try{
			Thread.sleep(5000);
		}catch(Exception e){}
		pm.show(ta, 50, 10);
		
		
	}

	private void init() {
		BorderLayout border = new BorderLayout();
		this.setLayout(border);
		this.add("Center",ta);
		
		pm.add(copy);
		pm.add(cut);
		pm.add(past);
		pm.addSeparator();
		
		align.add(asize);
		align.add(aname);
		align.addSeparator();
		align.add(aauto);
		pm.add(align);
		
		ta.add(pm);
		
		
	}

	private void start() {
		// TODO Auto-generated method stub
		
	}
	
}
