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
	
	private TextArea ta = new TextArea("�ణ�� �ð��Ŀ� ǥ��");
	
	private PopupMenu pm = new PopupMenu("My popup"); //MenuBar�� ���� ����
	private MenuItem copy = new MenuItem("����");
	private MenuItem cut = new MenuItem("�߶󳻱�");
	private MenuItem past = new MenuItem("�ٿ��ֱ�");
	private Menu align = new Menu("����");
	private CheckboxMenuItem asize = new CheckboxMenuItem("ũ���");
	private CheckboxMenuItem aname = new CheckboxMenuItem("�̸���");
	private CheckboxMenuItem aauto = new CheckboxMenuItem("�ڵ�����",true);
	
	
	
	public Exam11_sub(){
		super("������");
		this.init(); //����� ���� �޼ҵ� - ȭ�鱸��
		this.start(); // ����� ���� �޼ҵ� - Event or Thread
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
