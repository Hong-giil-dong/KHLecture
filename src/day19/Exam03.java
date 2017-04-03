package day19;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * ���� Ŭ������ Listener�� �����ϴ� ���
 */
public class Exam03 {
	public static void main(String[] ar){
		Exam03_sub ex = new Exam03_sub();
	}
}

class Exam03_sub extends Frame implements ActionListener{
	private Dimension dimen1, dimen2;
	private int xpos, ypos;
	
	private Button btn1 = new Button("��ư1");
	private Button btn2 = new Button("��ư2");
	private Label lb1 = new Label("��� : ���� ���� ��ư�� �����ϴ�.",Label.CENTER);
	
	public Exam03_sub(){
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
	}
	private void init() { //ȭ�鱸��
		BorderLayout border = new BorderLayout();
		this.setLayout(border);
		this.add("North", lb1);
		Panel p = new Panel(new FlowLayout(FlowLayout.CENTER));
		p.add(btn1);
		p.add(btn2);
		this.add("Center", p);
		
		
		
	}
	private void start() { //Thread, Event ����
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1){
			lb1.setText("��� : ��ư1�� �����̽��ϴ�.");
		}else if(e.getSource()==btn2){
			lb1.setText("��� : ��ư2�� �����̽��ϴ�.");
		}
		
	}
	
	
	
}










