package day17;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.List;

public class Exam05 {
	public static void main(String[] ar){
		Exam05_sub ex = new Exam05_sub();
	}
}

class Exam05_sub extends Form{
	public Exam05_sub(){
		super();
		this.setTitle("선택");
		this.setSize(600, 200);
	}

	@Override
	public void init() {
		super.init();
		FlowLayout flow = new FlowLayout(); // 플로우 레이아웃 객체 생성
		this.setLayout(flow); // 폼에 플로우 레이아웃 객체  집어넣음
		
		
		Label lb1 = new Label("선택하시오"); // 각 라벨 개체 생성
		Label lb2 = new Label("AA");
		Label lb3 = new Label("BB");
		Label lb4 = new Label("CC");
		
		Choice ch1 = new Choice(); // 초이스 객체 생성
		Choice ch2 = new Choice();
		Choice ch3 = new Choice();
		
		List list = new List(10, true); // 리스트 객체 생성,  매개변수 10은 한번에 보여지는 리스트양, true는 복수 선택이 가능한지 아닌지
		
		for(int i=0;i<20;i++) //20번 반복
			list.add("Test"+(i+1)); // 이것이 20개 생성되서 리스트에 추가된다.
		this.add(list);//생성된 리스트를 레이아웃에 붙여넣는다
		
		for(int i=1970; i<=2017;i++)
			ch1.add(String.valueOf(i)); // 초이스 객체에 1970부터 2017까지를 문자열로 집어넣음
		
		for(int i=1; i<=12;i++)
			ch2.add(String.valueOf(i)); // 초이스 객체에 1~12까지 문자열을 집어넣음
		
		for(int i=1; i<=31;i++)
			ch3.add(String.valueOf(i)); // 초이스 객체에 1~31까지 문자열을 집어넣음
		
		ch1.select(3); // 초기 ch1값이 4번째로 선택되어 있게 하는 메소드 실행
		ch2.select(3); // 초기 ch2값이 4번째로 선택되어 있게 하는 메소드 실행
		ch3.select(3); // 초기 ch3값이 4번째로 선택되어 있게 하는 메소드 실행
		
		
		list.select(4); // 초기에 리스트에 5번째  미리 선택 
		list.select(6); // 초기에 리스트에 7번째  미리 선택 
		list.select(10); // 초기에 리스트에 11번째  미리 선택 
		
		
		
		/*
		 * ch1.add(String text)
		 * ch1 : 1970 ~ 2017
		 * ch2 : 1 ~ 12
		 * ch3 : 1 ~ 31
		 * 		 
		*/
		
		 // 각 버튼과 라벨을 프레임에 집어넣음(플로우 레이아웃)
		this.add(lb1);
		this.add(ch1);
		this.add(lb2);
		this.add(ch2);
		this.add(lb3);
		this.add(ch3);
		this.add(lb4);
		
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}
	
}








