package day17;

import java.awt.*;

public class Exam03 {
	public static void main(String[] ar){
		Exam03_sub ex = new Exam03_sub();
	}
}
class Exam03_sub extends Frame{
	private Dimension dim1, dim2;
	private int xpos, ypos;
	
	public Exam03_sub(){
		super("제목");
		this.init();
		this.start();
		this.setSize(400,500);
		dim1 = Toolkit.getDefaultToolkit().getScreenSize();
		dim2 = this.getSize();
		xpos = (int)(dim1.getWidth()/2 - dim2.getWidth()/2);
		ypos = (int)(dim1.getHeight()/2 - dim2.getHeight()/2);
		
		this.setLocation(xpos, ypos);
		this.setVisible(true);		
	}
	
	public void init(){
		GridLayout grid = new GridLayout(4,3,5,5); // 조건에 따라 그리드 레이아웃 객체 생성
		Font font = new Font("TimesRoman", Font.BOLD, 20); // 조건에 따라 폰트 객체 생성
		Button[] btn = new Button[12]; // 버튼 배열 생성 
		this.setLayout(grid); // 생성한 그리드 레이아웃 객체를 프레임에 집어넣음
		String[] str = {"*","0","#"}; // 문자배열 선언
		
		for(int i=0;i<btn.length;i++){ //버튼배열의 길이 만큼 반복
			if(i<9){
				btn[i] = new Button(String.valueOf(i+1)); // i+1계산한 값을 문자열로 변환한 값을 매개변수로 하는 새로운 버튼 객체를 만들고 버튼i배열에 초기화
				btn[i].setFont(font); // 폰트 지정 설정
				this.add(btn[i]); // 최종적으로 레이아웃에 각 버튼 배열을 추가
				
			}else{
				btn[i] = new Button(str[i-9]); // str문자열 값을 매개변수로 하는 새로운 버튼 객체를 만들고 버튼i배열에 초기화
				btn[i].setFont(font); // 폰트 지정 설정
				this.add(btn[i]); // 최종적으로 레이아웃에 각 버튼 배열을 추가
				
			}
			this.add(btn[i]);
		}

	}
	public void start(){}
}











