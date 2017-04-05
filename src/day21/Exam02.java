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
class Exam02_sub extends JFrame implements MouseListener{ // MouseListener 인터페이스를 구현하고, JFrame클래스를 상속받은 클래스
	private Container con; // 컨테이너 타입 변수 선언
	private FlowLayout flow = new FlowLayout(); // 플로우 레이아웃 객체 생성후 참조변수flow에 변수타입FlowLayout으로 설정
	private ImageIcon im1 = new ImageIcon("C:\\output\\icon.png"); // 각 이미지 객체 생성
	private ImageIcon im2 = new ImageIcon("C:\\output\\icon2.jpg"); // 각 이미지 객체 생성
	private ImageIcon im3 = new ImageIcon("C:\\output\\icon3.jpg"); // 각 이미지 객체 생성
	private JButton jb1 = new JButton("String"); // 스윙 버튼 객체 생성
	private JButton jb2 = new JButton(im1); // 스윙 버튼 객체 생성
	private JButton jb3 = new JButton("Str & Icon", im1); // 스윙 버튼 객체 생성
	
	
	
	
	
	public Exam02_sub(){
		super("Test"); // 상속받은 JFrame 생성자 초기화
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
		con = this.getContentPane(); //컨테이너팬을 가져와서 변수 con에 저장
		con.setLayout(flow); // 컨테이너팬의 레이아웃을 flow로 설정
		jb1.setEnabled(false); // 이 스윙버튼객체를 비활성화 하겠다는 의미
		con.add(jb1); // 컨테이너에 jb1 버튼 객체 추가
		jb2.setMnemonic('a'); // 버튼에 연상기호 a 설정?
		con.add(jb2); // 컨테이너에 jb1 버튼 객체 추가
		
		jb3.setHorizontalTextPosition(SwingConstants.RIGHT); //버튼의 텍스트 가로 위치를 조정
		jb3.setVerticalTextPosition(SwingConstants.TOP); // 버튼의 텍스트 세로 위치를 조정
		// 
		
		jb3.setMnemonic('b'); // 버튼에 연상기호 b 설정?
		jb3.setPressedIcon(im2); // 버튼이 눌렸을대의 아이콘이미지를 설정
		jb3.setRolloverIcon(im3); // 버튼 위에 마우스커서가 있을때의 이미지 설정
		con.add(jb3); // 버튼을 컨테이너에 붙인다.
		
		
	}



	private void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 스윙컨테이너에 종료 기능을 넣어줌
		jb1.addMouseListener(this); // jb1 버튼에서의 마우스 움직임을 감시
		
	}



	@Override
	public void mouseClicked(MouseEvent e) { //마우스 클릭이 일어나면 실행
		if(e.getSource() == jb1){ // jb1 버튼이 눌려지면 아래를 실행
			jb1.doClick(5000); // jb1을 5000번 클릭
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
