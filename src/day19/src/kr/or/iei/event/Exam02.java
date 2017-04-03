package kr.or.iei.event;
import java.awt.BorderLayout;
/*
 * ��ü ���� ���� 
 * - Listener�� �����ϰų� Adapter�� ��ӹ��� ������ Ŭ���� ������
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
	Button btn1 = new Button("��ư1");
	Button btn2 = new Button("��ư2");
	Label lb1 = new Label("��� : ���� ���� ��ư�� �����ϴ�.",Label.CENTER);
	
	public Exam02_sub(){
		//super("������");
		this.init(); //����� ���� �޼ҵ� - ȭ�鱸��
		this.start(); // ����� ���� �޼ҵ� - Event or Thread
		f.setSize(300, 200);
		dimen1 = Toolkit.getDefaultToolkit().getScreenSize();
		dimen2 = f.getSize();
		
		xpos = (int)(dimen1.getWidth() / 2 - dimen2.getWidth()/2);
		ypos = (int)(dimen1.getHeight() / 2 - dimen2.getHeight()/2);
		
		f.setLocation(xpos, ypos);
		f.setVisible(true);
	}
	private void init() { //ȭ�鱸��
		BorderLayout border = new BorderLayout();
		f.setLayout(border);
		f.add("North", lb1);
		Panel p = new Panel(new FlowLayout(FlowLayout.CENTER));
		p.add(btn1);
		p.add(btn2);
		f.add("Center", p);
		
		
		
	}
	private void start() { //Thread, Event ����
		ActionDefine ad = new ActionDefine();
		btn1.addActionListener(ad);
		btn2.addActionListener(ad);
		
	}
}

class ActionDefine implements ActionListener{

	Exam02 ex = new Exam02();

	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand()=="��ư1"){
			System.out.println("��� : ��ư1�� �����̽��ϴ�.");
			
			return;
		}else if(e.getActionCommand()=="��ư2"){
			System.out.println("��� : ��ư2�� �����̽��ϴ�.");
			//lb1.setText("��� : ��ư2�� �����̽��ϴ�.");
			
		}
		
		System.out.println(e.getActionCommand()=="��ư1");
		return;
	}
	
}





