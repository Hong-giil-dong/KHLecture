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

	private FlowLayout flow = new FlowLayout(FlowLayout.CENTER); // 플로우 레이아웃 객체 생성
	private TextField tf1 = new TextField(10); // 텍스트 필드 객체 생성
	private TextField tf2 = new TextField(10); // 텍스트 필드 객체 생성
	private Label lb = new Label("-"); // 라벨 객체 생성

	public Exam03_sub(){
		super();
		this.init();
		this.start();
		this.setSize(400,120);
		this.setVisible(true);
	}

	void init() {
		this.setLayout(flow); // 프레임에 플로우 레이아웃 객체 삽입
		add(tf1); // 프레임에 텍스트필드1 객체 추가
		super.add(lb); // 프레임에 라벨 객체 추가
		this.add(tf2); // 프레임에 텍스트필드1 객체 추가
	}

	void start() {
		addWindowListener(this); // 윈도우 창에서 일어나는 것을 감시

		tf1.addKeyListener(this); // 텍스트필드1에서 일어나는 키 입력을 감시
	}

	@Override
	public void windowClosing(WindowEvent e) { // 윈도우창에서 닫기 버튼이 눌리면 아래를 실행
		System.exit(0); // 종료
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
	public void keyReleased(KeyEvent e) { // 키가 떨어지는 신호가 감지되면 아래를 실행
		String str = tf1.getText().trim(); // 텍스트필드의 문자를 받아와서 문자열에 입력
		if(str.length()==6) // 문자열의 길이가 6이라면 아래를 실행
			tf2.requestFocus(); // 텍스트 필드 2로 포커싱을 함
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
