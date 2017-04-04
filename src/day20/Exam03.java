package day20;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Exam03 {
	public static void main(String[] ar){
		Exam03_sub ex = new Exam03_sub();
	}
}

class Exam03_sub extends Frame 
implements KeyListener, WindowListener{

	private FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
	private TextField tf1 = new TextField(10);
	private TextField tf2 = new TextField(10);
	private Label lb = new Label("-");

	public Exam03_sub(){
		super();
		this.init();
		this.start();
		this.setSize(400,120);
		this.setVisible(true);
	}

	void init() {
		this.setLayout(flow);
		this.add(tf1);
		this.add(lb);
		add(tf2);
	}

	void start() {
		addWindowListener(this);

		tf1.addKeyListener(this);
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
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
		String str = tf1.getText().trim();
		if(str.length()==6)
			tf2.requestFocus();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
	}
}
