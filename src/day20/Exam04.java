package day20;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Exam04 {
	public static void main(String[] ar){
		Exam04_sub ex = new Exam04_sub();
	}
}

class Exam04_sub extends Frame implements MouseListener {
	
	private Button btn = new Button("������"); // 버튼 객체 생성
	public Exam04_sub(){
		super();
		this.init();
		this.start();
		this.setSize(400,400);
		this.setVisible(true);
	}

	void init() {
		this.setLayout(null); // 프레임에 빈 레이아웃 설정
		btn.setBounds(50, 50, 80, 30); // 버튼의 사이즈와 위치 설정
		this.add(btn); // 프레임에 버튼 추가
		
	}
	void start() {
		btn.addMouseListener(this); // 버튼에서 마우스의 입력값을 기다리게 됨
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("clicked");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("pressd");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("released");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("enter");
		btn.setLocation((int)(Math.random() * 400)-80, 
				(int)(Math.random()* 400 - 30));
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("exited");
		
	}
	
}
