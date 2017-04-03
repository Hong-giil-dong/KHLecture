package day16;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.*;

import javax.swing.JFrame;

public class Exam02 {
	public static void main(String[] ar){
		Exam02_sub ex = new Exam02_sub();
		//ex.init();
		//ex.start();
	}
}

class Exam02_sub extends Frame { // 이 클래스는 프레임을 만드고 모양을 만드는 클래스이므로 따로 만들어주면 이용하기가 편함
	private Dimension dimen1, dimen2; // Dimention 타입의 변수 두개 선언 ->dimention은 x,y값을 갖음
	private int xpos, ypos; // 가로 위치값, 세로 위치값 변수 선언
	
	Label lb1 = new Label("North"); // 라벨 클래스로부터  객체 만듬, 각 개체는 매개변수가 다름
	Label lb2 = new Label("Soutn");
	Label lb3 = new Label("West");
	Label lb4 = new Label("East");
	Label lb5 = new Label("Center");
	
	public Exam02_sub(){ // 생성자 ->  인스턴스가 사용되기위해 만들어질때 실행되어야 할 초기 조건을 지정해주는 곳
		super("제목표시줄"); // 수퍼는 부모클래스의  생성자를 의미함


		this.init(); // 생성자가 초기화 될때 이 클래스의 init메소드를 실행
		this.start(); // 생성자가 초기화 될때 이 클래스의 start메소드를 실행
		dimen1 = Toolkit.getDefaultToolkit().getScreenSize(); // 화면 사이즈 읽어옴 xy좌표
		this.setSize(300, 200);	 // 프레임사이즈 설정
		dimen2 = this.getSize(); // 프레임 사이즈 읽어옴 xy
		xpos = (int)(dimen1.getWidth() / 2 - dimen2.getWidth()/2); // x위치 설정
		ypos = (int)(dimen1.getHeight() / 2 - dimen2.getHeight()/2); // y위치 설정
		
		this.setLocation(xpos, ypos); // x위치 y위치  값을 가지고 프레임의 위치를 설정
		this.setVisible(true); // 프레임을 보이게 함

	}
	
	public void init(){
		
/*		this.setLayout(null); // 프레임에 아무 레이아웃도 설정하지 않음
		this.setBackground(Color.RED); // 프레임의 백그라운드 색을 레드로 설정 
		Label lb = new Label("레이아웃 미설정"); // 레이아웃 미설정 이라는 매개변수를 넣고 새로운 라벨 객체 만듬
		lb.setBackground(Color.YELLOW); // 라벨의 백그라운드 색을 노랑색으로 설정
		this.add(lb); // 만들어진 라벨 객체를 프레임의 붙여넣음
		lb.setBounds(30, 30, 50, 50); // 라벨의 위치값과 사이즈를 설정
*/		
		
		
/*		FlowLayout flow = new FlowLayout(FlowLayout.RIGHT); // 플로우 레이아웃 객체를 만드는데 매개변수는 FlowLayout.RIGHT -> 플로우 레이아웃을 만들고 내용을 오른쪽 정렬하라는 명령 
		this.setLayout(flow); // 프레임에 플로우 레이아웃 객체를 설정
		lb1.setBackground(Color.yellow); // 라벨1의 바탕색 노랑색 설정
		lb2.setBackground(Color.GREEN); // 라벨2의 바탕색 녹색 설정
		lb3.setBackground(Color.PINK); // 라벨3의 바탕색 핑크색 설정
		this.add(lb1); // 프레임에 라벨1을 붙임
		this.add(lb2); // 프레임에 라벨2을 붙임
		this.add(lb3); // 프레임에 라벨3을 붙임
*/		
		
/*		GridLayout grid = new GridLayout(3,2,50,5); // 그리드 레이아웃 객체를 만드는데 매개변수는 (행개수, 열개수, 열사이공간, 행사이공간)
		this.setLayout(grid); // 만들어진 그리드 레이아웃 객체를 프레임에 넣음
		lb1.setBackground(Color.yellow); // 라벨1의 바탕색 노랑색 설정
		lb2.setBackground(Color.GREEN); // 라벨2의 바탕색 녹색 설정
		lb3.setBackground(Color.PINK); // 라벨3의 바탕색 핑크색 설정
		lb5.setBackground(Color.BLACK);
		this.add(lb1); // 프레임에 라벨1 붙임
		this.add(lb2); // 프레임에 라벨2 붙임
		this.add(lb3); // 프레임에 라벨3 붙임
		this.add(lb4); // 프레임에 라벨4 붙임 // 이 라벨은 색 설정이 안되있으므로 바탕색이 표시됨
		this.add(lb5); // 프레임에 라벨5 붙임
		//그리드 레이아웃에 붙는 순서는 왼쪽 위부터 오른쪽으로 가며 끝에서는 아래쪽으로
*/		
		
/*		BorderLayout border = new BorderLayout(); // 보더레이아웃객체 생성
		this.setLayout(border); // 컨테이너에 보더레이아웃객체 넣음
		lb1.setBackground(Color.yellow);
		lb2.setBackground(Color.GREEN);
		lb3.setBackground(Color.PINK);
		lb4.setBackground(Color.BLUE);
		lb5.setBackground(Color.CYAN);
		this.add("North",lb1);
		this.add("South",lb2);
		this.add("West",lb3);
		this.add("East",lb4);
		this.add("Center",lb5);*/
		
	}
	public void start(){
		
	}

}









