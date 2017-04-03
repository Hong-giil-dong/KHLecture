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
	
	private TextArea ta = new TextArea("텍스트에리아");
	
	private PopupMenu pm = new PopupMenu("My popup"); //팝업메뉴 객체 생성
	private MenuItem copy = new MenuItem("copy");
	private MenuItem cut = new MenuItem("cut");
	private MenuItem past = new MenuItem("past");
	private Menu align = new Menu("align");
	private CheckboxMenuItem asize = new CheckboxMenuItem("asize");
	private CheckboxMenuItem aname = new CheckboxMenuItem("aname");
	private CheckboxMenuItem aauto = new CheckboxMenuItem("aauto",true);
	
	
	
	public Exam11_sub(){
		super("테스트");
		this.init();
		this.start();
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
		pm.show(ta, 50, 10); // 액션리스너로 팝업창 띄우기 가능!
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
