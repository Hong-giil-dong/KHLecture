import javax.swing.*;
import java.awt.*;

public class Exam04 {
	public static void main(String[] ar){
		Exam04_sub ex = new Exam04_sub();
	}
}

class Exam04_sub extends JFrame{
	private Container con;
	private JLabel lb1 = new JLabel("�̰��� �� �� �Դϴ�!");
	private JButton btn1 = new JButton("Ȯ��");
	private JButton btn2 = new JButton("���");
	private JPanel jp1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	private JPanel jp2 = new JPanel(new BorderLayout());
	private JTabbedPane jtp = new JTabbedPane(JTabbedPane.BOTTOM, 
											JTabbedPane.SCROLL_TAB_LAYOUT);
	private JButton bt1 = new JButton("ù��° Tab");
	private JButton bt2 = new JButton("�ι�° Tab");
	private JButton bt3 = new JButton("����° Tab");
	private JButton bt4 = new JButton("�׹�° Tab");
	private JButton bt5 = new JButton("�ټ���° Tab");
	
	public Exam04_sub(){
		super();
		this.init();
		this.setSize(300,200);
		this.setVisible(true);
	}

	public void init() {
		con = this.getContentPane();
		con.setLayout(new BorderLayout(5,5));
		con.add("North", lb1);
		jp1.add(btn1);
		jp1.add(btn2);
		con.add("South",jp1);
		
		jtp.add("ù��°",bt1);
		jtp.add("�ι�°",bt2);
		jtp.add("����°",bt3);
		jtp.add("�׹�°",bt4);
		jtp.addTab("������", new ImageIcon("C:\\output\\icon.png"),bt5,"���� ������ ");
		
		jp2.add(jtp);
		con.add("Center", jp2);
		
	}
}


//






