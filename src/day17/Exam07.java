package day17;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Exam07{
	public static void main(String[] ar){
		Exam07_sub ex = new Exam07_sub();
	}
}

class Exam07_sub extends Form{
	public Exam07_sub(){
		super();
		this.setSize(400, 300);
	}
	

	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		BorderLayout border = new BorderLayout(); // 보더 레이아웃 객체 생성
		Label lb1 = new Label("프로그램"); // 라벨1객체 생성
		Label lb2 = new Label("계산"); // 라벨2 객체 생성
		TextArea ta = new TextArea(); // 텍스트에리아 객체 생성
		TextField tf = new TextField(10); // 텍스트 필드 객체 생성(10행)
		Panel p = new Panel(new FlowLayout(FlowLayout.RIGHT)); // 오른쪽 정렬 조건인 플로우레이아웃 객체 생성해서 패널 P객체 생성된 것에 삽입
		
		p.add(lb2);p.add(tf); // 패널p객체에 라벨2 삽입, 텍스트 필드 삽입
		
		
		this.setLayout(border); // 프레임에 보더레이아웃 객체를 설정
		this.add("North",lb1); // 보더레이아웃 북쪽에 라벨1객체 삽입
		this.add("Center",ta); // 보더레이아웃 가운데에 텍스트에리아 객체 삽입
		this.add("South",p); // 보더레이아웃 남쪽에 패널P객체 삽입
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}

}
