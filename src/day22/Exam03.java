import java.awt.*;

import javax.swing.*;

public class Exam03 {
	public static void main(String[] ar){
		Exam03_sub ex = new Exam03_sub();
	}
}

class Exam03_sub extends JFrame{
	private Container con;
	private JButton btn1 = new JButton("1");
	private JButton btn2 = new JButton("2");
	private BorderLayout border = new BorderLayout();
	private JTextArea ta = new JTextArea();
	private JScrollPane jsp = new JScrollPane(ta);
	
	public Exam03_sub(){
		super();
		this.init();
		this.setSize(300,200);
		this.setVisible(true);
	}

	private void init() {
		con = this.getContentPane();
		con.setLayout(border);
		Panel p = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p.add(btn1);
		p.add(btn2);
		this.add("North",p);
		jsp.setWheelScrollingEnabled(true);
		this.add("Center", jsp);
		
	}
	
}
