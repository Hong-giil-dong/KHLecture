package day21;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Exam02 {
	public static void main(String[] ar){
		Exam02_sub ex = new Exam02_sub();
	}
}
class Exam02_sub extends JFrame implements MouseListener{
	private Container con;
	private FlowLayout flow = new FlowLayout();
	private ImageIcon im1 = new ImageIcon("C:\\output\\icon.png");
	private ImageIcon im2 = new ImageIcon("C:\\output\\icon2.jpg");
	private ImageIcon im3 = new ImageIcon("C:\\output\\icon3.jpg");
	private JButton jb1 = new JButton("String");
	private JButton jb2 = new JButton(im1);
	private JButton jb3 = new JButton("Str & Icon", im1);
	
	
	
	
	
	public Exam02_sub(){
		super("Test");
		this.init();
		this.start();
		this.setSize(300,200);
		this.setVisible(true);
	}
/*
 * @ = alt
 * ~ = Shift
 * ^ - Ctrl
 */


	private void init() {
		con = this.getContentPane();
		con.setLayout(flow);
		jb1.setEnabled(false); //��ư ��� ����
		con.add(jb1);
		jb2.setMnemonic('a');//����Ű ����(@+a)
		con.add(jb2);
		
		jb3.setHorizontalTextPosition(SwingConstants.RIGHT);
		jb3.setVerticalTextPosition(SwingConstants.TOP);
		// Text ��ġ ����
		
		jb3.setMnemonic('b');
		jb3.setPressedIcon(im2); //��ư Ŭ����
		jb3.setRolloverIcon(im3); //��ư�� �ö� ������
		con.add(jb3);
		
		
	}



	private void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jb1.addMouseListener(this);
		
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == jb1){
			jb1.doClick(5000);
		}
		
	}



	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}

	
}
