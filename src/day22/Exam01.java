import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;

public class Exam01 {
	public static void main(String[] ar){
		Exam01_sub ex = new Exam01_sub();
	}
}

class Exam01_sub extends JFrame implements ActionListener{
	private Container con;
	private FlowLayout flow = new FlowLayout();
	private JLabel lb1 = new JLabel("입력 : ",JLabel.RIGHT);
	private JTextField tf1 = new JTextField(10);
	private JDialog dlg = new JDialog(this, "확인");
	private Container dlgcon;
	private JLabel dlglb = new JLabel("사용할 수 있습니다",JLabel.CENTER);
	private BorderLayout border = new BorderLayout();
	
	public Exam01_sub(){
		super();
		this.init();
		this.start();
		this.setSize(300, 200);
		this.setVisible(true);
		
	}
	

	private void init() {
		//시작 화면 구성
		con = this.getContentPane();
		con.setLayout(flow);
		con.add(lb1);
		con.add(tf1);
		
		//다이얼로그 화면 구성
		dlgcon = dlg.getContentPane();
		dlgcon.setLayout(border);
		//dlglb.setBorder(new BevelBorder(BevelBorder.RAISED));
		dlgcon.add("Center",dlglb);
		dlg.setSize(200, 150);
	}


	private void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tf1.addActionListener(this);
		dlg.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == tf1){
			System.out.println("TextField");
			dlg.setVisible(true);
		}
	}
	
}













