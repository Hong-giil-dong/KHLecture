package day21;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class Exam03 {
	public static void main(String[] ar){
		Exam03_sub ex = new Exam03_sub();
	}
}

class Exam03_sub extends JFrame{
	private Container con; // 컨테이너 타입 변수 생성 
	private GridLayout grid = new GridLayout(2,2,5,5);
	private JToggleButton tb1 = new JToggleButton("1",true);
	private JToggleButton tb2 = new JToggleButton("2",false);
	private JToggleButton tb3 = new JToggleButton("3",false);
	private JToggleButton tb4 = new JToggleButton("4",false);
	
	private JRadioButton jr1 = new JRadioButton("1",true);
	
	private ButtonGroup bg = new ButtonGroup();
	
	public Exam03_sub(){
		this.init();
		this.start();
		this.setSize(300, 200);
		this.setVisible(true);
	}

	private void init() {
		con = this.getContentPane();
		con.setLayout(grid);
		bg.add(tb1); //��ư �׷쿡 �߰�
		bg.add(tb2);
		bg.add(tb3);
		//bg.add(tb4);
		con.add(tb1);
		con.add(tb2);
		con.add(tb3);
		con.add(tb4);
		
		
	}

	private void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
}













