import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Exam04 {
	public static void main(String[] ar){
		Exam04_sub ex = new Exam04_sub();
	}
}

class Exam04_sub extends Frame implements MouseListener {
	
	private Button btn = new Button("눌러봐");
	public Exam04_sub(){
		super();
		this.init();
		this.start();
		this.setSize(400,400);
		this.setVisible(true);
	}

	void init() {
		this.setLayout(null);
		btn.setBounds(50, 50, 80, 30);
		this.add(btn);
		
	}
	void start() {
		btn.addMouseListener(this);
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("버튼을 클릭");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("버튼을 누름");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("버튼에서 손뗌");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("해당 위치로 들어옴");
		btn.setLocation((int)(Math.random() * 400)-80, 
				(int)(Math.random()* 400 - 30));
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("범위를 벗어남");
		
	}
	
}
