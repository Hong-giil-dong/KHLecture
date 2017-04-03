package day17;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;

public class Exam06 {
	public static void main(String[] ar){
		Exam06_sub ex = new Exam06_sub();
	}
}

class Exam06_sub extends Frame{
	private Dimension dim1, dim2;
	private int xpos, ypos;
	
	FlowLayout flow = new FlowLayout(); // 플로우 레이아웃 객체 생성
	List list1 = new List(10, true); // 리스트 객체 생성 (10개 보이고 중복선택 가능)
	List list2 = new List(10); // 리스트 객체 생성 (10개 보이고 중복선택 불가능?)
	
	TextField tf = new TextField(10); // 텍스트 필드 객체 생성 (열10)
	TextArea ta = new TextArea(10,15); // 텍스트 에리아 객체 생성 (행10, 열15)
	
	public Exam06_sub(){
		super("텍스트 테스트");
		this.init();
		this.start();
		this.setSize(600,300);
		dim1 = Toolkit.getDefaultToolkit().getScreenSize();
		dim2 = this.getSize();
		xpos = (int)(dim1.getWidth()/2 - dim2.getWidth()/2);
		ypos = (int)(dim1.getHeight()/2 - dim2.getHeight()/2);
		
		this.setLocation(xpos, ypos);
		this.setVisible(true);
		try{
			Thread.sleep(3000);
		}catch(Exception e){}
		list1.select(3); // 리스트에 4번째를 선택
		list1.select(6);
		list1.select(9); 
		
		String[] str = list1.getSelectedItems(); // 리스트1 객체에서 선택되어 있는 아이템의 값을 얻어와서 문자배열에 저장
		
		for(int i=0;i<str.length;i++) // 문자배열 str의 길이만큼 반복
			list2.add(str[i]); // 리스트2 객체에 str배열을 추가
		
		//list1.remove("TEST1");
		list1.remove(str[0]); // 리스트1 객체에서 문자 배열안의 값을 제거
		list1.remove(str[1]);
		list1.remove(str[2]);
		}

	
	public void init() {
		// TODO Auto-generated method stub
		for(int i=0;i<30;i++) // 30번 반복
			list1.add("TEST"+(i+1)); // 리스트1 객체에 TEST1~30까지 추가
		
		this.setLayout(flow); // 프레임에 플로우 레이아웃 객체 삽입 
		this.add(list1); // 프레임에 리스트1 객체 삽입
		this.add(list2); // 프레임에 리스트2 객체 삽입
		
		this.add(tf); // 프레임에 텍스트 필드 객체 삽입
		this.add(ta); // 프레임에 텍스트 에리아 객체 삽입
	}


	public void start() {
		// TODO Auto-generated method stub
		
	}
	
}
