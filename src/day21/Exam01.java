/**
 * 스윙에 대한 내용 시작
 */
package day21;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam01 {
	public static void main(String[] ar){
		Exam01_sub ex = new Exam01_sub();
	}
}

class Exam01_sub extends JFrame{
	private Container con; // 컨테이너 타입 변수 선언
	private ImageIcon im, im1; // 이미지 아이콘 타입 변수 2개 선언
	
	public Exam01_sub(){
		this.init();
		this.start();
		this.setSize(300,200); // 스윙 프레임 사이즈  설정
		this.setTitle("TEST"); // 스윙 프레임 제목 설정
		im = new ImageIcon("C:\\Users\\user2\\Pictures\\icon.png"); // 주소를 매개변수로 하는 새로운 이미지아이콘 객체를 만들고 참조변수에 매칭
		this.setIconImage(im.getImage()); // (im참조변수 위치값의 객체로부터 이미지를 불러온 값)을 매개변수로 프레임의 아이콘 이미지를 설정함
		Toolkit tk = Toolkit.getDefaultToolkit(); // 디폴트툴킷 객체를 생성하고 참조변수 tk에 대입 
		Dimension di = tk.getScreenSize(); // tk참조변수 위치값의 객체로부터 스크린 사이즈를 읽어오는 메소드를 실행해서 그 값을 di에 저장
		Dimension di1 = this.getSize(); // 스윙 프레임으로부터 불러온 사이즈값을 di1에 저장
		this.setLocation((int)(di.getWidth()/2-di1.getWidth()/2),  // 스윙 프레임 위치를 가운데로 설정하는 구문
				(int)(di.getHeight()/2 - di1.getHeight()/2));
		this.setVisible(true); // 스윙 프레임을 보이게 함
	}

	private void init() {
		con = this.getContentPane(); // 컨텐트판을 불러와서	참조변수로 매칭
		
		im = new ImageIcon("C:\\Users\\user2\\Pictures\\icon.png"); // 특정 매개변수를 입력하여 이미지아이콘 객체를 만들어 참조변수 im에 저장
		im1 = new ImageIcon("C:\\Users\\user2\\Pictures\\icon2.jpg"); // 특정 매개변수를 입력하여 이미지아이콘 객체를 만들어 참조변수 im1에 저장 
		JButton jb = new JButton("test", im1); // 스윙 버튼 객체 생성 (매개변수를 텍스트 이름과 아이콘으로 설정)
		con.setLayout(new BorderLayout()); // 컨테이너에 레이아웃을 보더 레이아웃으로 설정
		
		jb.setToolTipText("툴팁"); // 스윙버튼객체 jb에 툴팁텍스트가 나타나게 설정
		con.add("North", new JButton("Test")); // 보더레이아웃 북쪽에 새로운 스윙버튼 객체를 만들어서 삽입 
		con.add("Center",jb); // 보더레이아웃 가운데 스윙버튼객체 jb를 삽입
		
		
		
	}

	private void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료 메서드 awt의 종료 메서드와 비슷한 기능?
		
	}
}












