package day16;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Exam01 {
	public static void main(String[] ar){
		Frame f = new Frame("Exam01");
		
		f.setTitle("Exam01 연습");
		f.setSize(400, 500);
		
		Dimension dimen1 = Toolkit.getDefaultToolkit().getScreenSize(); //툴킷 클래스는 특이하게 객체를 생성해서 사용하는 것이 아니라
		//정적메소드로 객체를 제공하고 있다. getDefaultToolkit메소드는 정적메소드인데 이 메소드를 사용하면 반환값으로 Toolkit객체값을 전달받을수 있다.
		// 한마디로 Toolkit.getDefaultToolkit() 이 문장 자체가 Toolkit객체를 생성하는 메소드 따라서 이렇게 객체를 생성하고 getScreenSize라는 메소드를 사용가능 
		//클래스 안의 메소드를 그대로 쓰기 때문에 객체를 따로 생성(new)할 필요가 없음
		
		Dimension dimen2 = f.getSize(); // 프레임의 f객체로부터 x, y크기를 가져와서 Dimension 타입의 변수 dimen2에 저장
		System.out.println(dimen2);
		
		int x = (int)(dimen1.getWidth() / 2 - dimen2.getWidth()/2); // dimen1,2의 너비값만 불러와서 계산된 x좌표를 저장
		int y = (int)(dimen1.getHeight()/ 2 - dimen2.getHeight()/2); // dimen1,2의 높이값만 불러와서 계산된 y좌표를 저장
		
		f.setLocation(x, y); // 프레임클래스의 f객체의 메소드 setLocation을 매개변수 x,y로 실행 -> 프레임을 가운데에 위치시킴
		f.setVisible(true); // 프레임클래스의 f객체의 메소드 setVisible을 매개변수 true로 실행 -> 프레임을 실제로 보이게 함(그전까지는 보이지 않음)
		
	}
}












