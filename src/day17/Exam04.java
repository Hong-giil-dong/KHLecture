package day17;

import java.awt.*;

public class Exam04 {
	public static void main(String[] ar){
		Exam04_sub ex = new Exam04_sub();
	}
}

class Exam04_sub extends Form{
	public Exam04_sub() {
			super();
			this.setSize(400, 200);
		}
	
	@Override
	public void init() {
		Label lb = new Label("체크박스 테스트");
		
		CheckboxGroup cg = new CheckboxGroup(); // 체크박스그룹 객체 생성
		Checkbox cbk1 = new Checkbox("aaa",false,cg); // 각 체크박스내용 객체를 생성해서 체크박스그룹 객체에 삽입
		Checkbox cbk2 = new Checkbox("bbb",true,cg);
		Checkbox cbk3 = new Checkbox("ccc",true,cg);
		Checkbox cbk4 = new Checkbox("ddd",false,cg);
		
		Button btn1 = new Button("check"); // 버튼 생성
		Button btn2 = new Button("next");
		
		BorderLayout border = new BorderLayout(); // 보더레이아웃 생성
		this.setLayout(border); // 보더레이아웃 객체를 프레임에 삽입
		this.add("North", lb); // 라벨을 보더레이아웃의 북쪽에 집어넣음
		
		Panel p = new Panel(new GridLayout(2,2)); // 2행2열짜리 그리드레이아웃을 넣은 패널 p객체 생성
		p.add(cbk1);p.add(cbk2); // 패널 p객체에 각 체크박스 내용 객체 삽입 
		p.add(cbk3);p.add(cbk4);
		this.add("Center",p); // 완성된 p패널객체를 보더레이아웃의 가운데에 넣음
		
		Panel p2 = new Panel(new FlowLayout(FlowLayout.RIGHT)); // 패널 2를 만들고 플로우 레이아웃 객체를 만드는데 플로우 레이아웃은 오른쪽 정렬이 조건
		p2.add(btn1); // 패널2에 먼저 버튼1 객체를 집어넣음
		p2.add(btn2); // 패널2에 버튼 2객체를 집어넣음
		this.add("South",p2); // 완성된 패널p2 객체를 보더레이아웃 객체 남쪽에 집어넣음
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}
}
