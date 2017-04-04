package day20;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Exam02 {
	public static void main(String[] ar){
		Exam02_sub ex = new Exam02_sub();
	}
}

class Exam02_sub extends Frame implements ItemListener,FocusListener, WindowListener{
	private FlowLayout flow = new FlowLayout();
	private Choice year = new Choice(); // 초이스 메뉴 객체 생성
	private Choice month = new Choice(); // 초이스 메뉴 객체 생성
	private Choice day = new Choice(); // 초이스 메뉴 객체 생성
	//private List list = new List(3, false);
	public Exam02_sub(){ //생성자
		super();
		this.init();
		this.start();
		this.setSize(300, 200);
		this.setVisible(true);
	}

	private void init() {
		this.setLayout(flow); // 플로우 레이아웃
		year.add("년"); // 년 제목줄 추가
		for(int i=1970;i<=2060;i++) // 이 길이만큼 반복
			year.add(String.valueOf(i)); // 초이스 아이템들을 추가
		month.add("월"); // 월 제목줄 추가
		for(int i=1;i<=12;i++) // 이 길이만큼 반복
			month.add(String.valueOf(i)); // 초이스 아이템들을 추가
		day.add("일"); // 일 제목줄 추가

		this.add(year); // 플로우 레이아웃에 추가
		this.add(month);
		this.add(day);
	}

	private void start() {
		year.addItemListener(this);
		//year.addFocusListener(this);
		month.addItemListener(this);
		day.addItemListener(this);
		//list.addItemListener(this);
		//this.addWindowListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		int[] day1={31,28,31,30,31,30,31,31,30,31,30,31};
		if(e.getSource()==year){ //연도가 선택되면
			month.requestFocus(); // 달 선택으로 포커스 
		}else if(e.getSource()==month){ //월이 선택되면
			int index = month.getSelectedIndex(); // 선택된 값의 인덱스값을 반환해서 index변수에 저장
			day.removeAll(); // day초이스의 모든 아이템을 일단 삭제
			day.add("일"); // 일 제목줄 추가
			for(int i=1;i<=day1[index-1];i++) //  아래를 반복
				day.add(String.valueOf(i)); // 아이템 추가
			day.requestFocus(); // 아이템 다 추가된 후 day초이스에 포커스 함
		}
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
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
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
