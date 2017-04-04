package day20;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Exam05 {
	public static void main(String[] ar){
		Exam05_sub ex = new Exam05_sub();
	}
}

class Exam05_sub extends Frame implements ActionListener,
KeyListener,
FocusListener

{
	private TextField tf1 = new TextField(10);
	private TextField tf2 = new TextField(10);
	private Label lb = new Label("-");
	private Button btn = new Button("버튼");
	public Exam05_sub(){
		super();
		this.init();
		this.start();
		this.setSize(500,100);
		this.setVisible(true);
	}

	private void init() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.add(tf1);
		this.add(lb);
		this.add(tf2);
		this.add(btn);

	}

	private void start() {
		btn.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String pan="";
		int age = 2017 - Integer.parseInt(tf1.getText().substring(0, 2))+1900;
		if(age >= 20){
			pan ="��밡�� �մϴ�";


		}else{
			pan ="���Ұ��� �մϴ�";
		}
		final Dialog dlg = new Dialog(this, "OK",true);
		dlg.setLayout(new BorderLayout());
		dlg.setSize(300,300);
		dlg.add("Center", new Label(pan, Label.CENTER));
		Button bt = new Button("Ȯ��");
		
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		dlg.setVisible(true);
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}



}
