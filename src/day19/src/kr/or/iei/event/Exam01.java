package kr.or.iei.event;
/*
 * �͸� ��ø Ŭ���� ���
 */
import java.awt.*;
import java.awt.event.*;

public class Exam01 {
	public static void main(String[] ar){
		Exam01_sub ex = new Exam01_sub();
	}
}

class Exam01_sub extends Frame{
	private Dimension dimen1, dimen2;
	private int xpos, ypos;
	
	private Button btn = new Button("��ư");
	public Exam01_sub(){
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
		this.setLayout(new FlowLayout());
		this.add(btn);
		
	}
	private void start() { //Thread, Event ����
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
	}
}









