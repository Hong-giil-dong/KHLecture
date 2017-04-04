package day20;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Exam01{
	public static void main(String[] ar){
		Exam01_sub ex = new Exam01_sub();
	}
}


class Exam01_sub extends Frame implements FocusListener, ActionListener{
	private BorderLayout border = new BorderLayout(); // 보더레이아웃 객체 생성
	private Label lb1 = new Label("이름 : ", Label.RIGHT); // 라벨 객체 생성 및 초기화
	private Label lb2 = new Label("주민번호 : ", Label.RIGHT); // 라벨 객체 생성 및 초기화
	private TextField tf1 = new TextField(); // 텍스트 필드 객체 생성 및 초기화
	private TextField tf2 = new TextField(); // 텍스트 필드 객체 생성 및 초기화
	private TextField tf3 = new TextField(); // 텍스트 필드 객체 생성 및 초기화
	private Button bt1 = new Button("출력"); // 버튼 객체 생성 및 초기화
	private Button bt2 = new Button("초기화"); // 버튼 객체 생성 및 초기화
	
	Exam01_sub(){
		super("Focus Listener"); //프레임 생성 및 이름 초기화 
		this.init(); // init메소드 실행
		this.start(); // start메소드 실행
		this.setSize(300,120); // 프레임 사이즈 설정 
		this.setVisible(true); // 프레임 보이게 하기
	}

	private void init() {
		this.setLayout(border); // 보더레이아웃을 프레임에 설정
		Panel p1 = new Panel(new GridLayout(2,1)); // 패널 객체를 그리드 레이아웃으로 생성
		p1.add(tf1); // 패널 객체에 텍스트필드 객체를 붙임
		Panel p2 = new Panel(new GridLayout(1,2)); // 패널 객체를 그리드 레이아웃으로 생성
		p2.add(tf2); // 패널 p2객체에 텍스트필드 객체 붙임
		p2.add(tf3); // 패널 p2객체에 텍스트필드 객체 붙임
		p1.add(p2); // p1객체에 p2객체를 붙임
		this.add("Center", p1); // p1객체를 보더레이아웃프레임 가운데에 붙임
		
		Panel p3 = new Panel(new GridLayout(2,1)); // 패널 객체생성 그리드 레이아웃으로 설정
		p3.add(lb1); // 패널 객체에 라벨 붙임
		p3.add(lb2); // 패널 객체에 라벨 붙임
		this.add("West", p3); // 완성된 p3객체를 프레임의 서쪽에 붙임
		
		Panel p4 = new Panel(new FlowLayout(FlowLayout.RIGHT)); // 패널p4객체 생성 플로우 레이아웃으로 설정
		p4.add(bt1); // 패널p4객체에 버튼 bt1을 붙임
		p4.add(bt2); // 패널p4객체에 버튼 bt2를 붙임
		this.add("South", p4); // 만들어진 패널p4객체를 프레임의 남쪽에 붙임
	}

	private void start() {
		tf2.addFocusListener(this);
		tf3.addFocusListener(this);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		tf2.addActionListener(this);
		bt1.addFocusListener(this);
		
	}

	@Override
	public void focusGained(FocusEvent e) { // 포커스를 얻었을때 실행되어야 하는 메소드

		if(e.getSource()==tf2){ // 포커스리스너의 출력값이 tf2와 같다면 아래 실행 -> 텍스트필드2에 뭔가를 입력하려 포커스를 주었을때를 말함
			int x = tf1.getText().trim().length(); //텍스트필드1의 길이를 받아와서 정수 x 변수로 선언 및 초기화
			if(x==0) // x가 0 -> 아무것도 입력하지 않았음을 의미
				tf1.requestFocus(); // 텍스트필드1로 포커스를 맞춰라
		}else if(e.getSource() == tf3){ // 포커스리스너의 출력값이 tf3과 같다면 아래 실행 -> 텍스트필드3에 뭔가를 입력하려 포커스를 주었을때를 말함
			int x = tf2.getText().trim().length(); // 텍스트필드 2의 길이를 받아와서 정수 x변수로 선언 및 초기화
			if(x!=6){ // 텍스트필드2 안의 내용읠 길이가 6과 같지 않으면 다음을 실행
				tf2.setText(" "); // 텍스트필드2에 있는 내용을 초기화 하고
				tf2.requestFocus(); // 다시 텍스트필드2에 포커스를 줌
			}
		}else{
			System.out.println("버튼1"); // 버튼1에 포커스가 오면 이것을 콘솔에 출력
		}
	}

	@Override
	public void focusLost(FocusEvent e) { // 있었던 포커스가 사라질때 실행되어야 하는 메소드 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) { //액션이 실행되었을때 실행되어야하는 메소드
		Frame f = new Frame("출력"); // 프레임 선언
		if(e.getSource()==bt1){ // 버튼1을 클릭했다면 아래 실행
			int x = tf1.getText().trim().length(); // 텍스트필드1의 길이를 불러옴
			if(x==0){ // 불러온 길이 값이 0이면 아래 실행
				tf1.requestFocus(); // 텍스트필드1에 다시 포커스를 함
			}else{	
				f.setLayout(new GridLayout(2,1)); // 그리드 레이아웃을 프레임에 설정한다
				Label lb1_f = new Label(); // 새로운 라벨 설정
				Label lb2_f = new Label(); // 새로운 라벨 설정
				String str1 = lb1.getText() + tf1.getText(); // 불러온 텍스트를 모아서 문자열로 저장
				String str2 = lb2.getText() + tf2.getText()+" - "+tf3.getText(); // 불러온 텍스트를 모아서 문자열로 저장
				lb1_f.setText(str1); // 문자열을 라벨에 설정
				lb2_f.setText(str2); // 문자열을 라벨에 설정
				f.add(lb1_f); // 라벨을 프레임에 붙임
				f.add(lb2_f); // 라벨을 프레임에 붙임
				f.setSize(300, 100); // 프레임 사이즈 설정
				f.setVisible(true); // 이 메소드 안에서 선언된 프레임을 보이게 함
				this.setVisible(false); // 이 클래스 안에 있는 다른 프레임을 안보이게 함
			}
		}else if(e.getSource()==bt2){ //버튼 2를 눌렀다면 아래를 실행
			tf1.setText(""); // 텍스트필드1 내용 초기화
			tf2.setText(""); // 텍스트필드2 내용 초기화
			
			System.out.println(tf3.getText()); // 텍스트필드 3에 입력된 내용을 출력
			tf3.setText(""); // 텍스트필드3 내용 초기화
			
		}
	}
}








