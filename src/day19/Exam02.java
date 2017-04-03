package day19;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exam02 {
	public static void main(String[] ar){
		Exam02_sub ex = new Exam02_sub();
	}
}

class Exam02_sub {
	private Dimension dimen1, dimen2;
	private int xpos, ypos;

	Frame f = new Frame();
	Button btn1 = new Button("버튼1");
	Button btn2 = new Button("버튼2");
	Label lb1 = new Label("라벨 : 라벨 센터",Label.CENTER);

	public Exam02_sub(){
		//super("");
		this.init();
		this.start(); 
		f.setSize(300, 200);
		dimen1 = Toolkit.getDefaultToolkit().getScreenSize();
		dimen2 = f.getSize();

		xpos = (int)(dimen1.getWidth() / 2 - dimen2.getWidth()/2);
		ypos = (int)(dimen1.getHeight() / 2 - dimen2.getHeight()/2);

		f.setLocation(xpos, ypos);
		f.setVisible(true);
	}
	private void init() {
		BorderLayout border = new BorderLayout();
		f.setLayout(border);
		f.add("North", lb1);
		Panel p = new Panel(new FlowLayout(FlowLayout.CENTER));
		p.add(btn1);
		p.add(btn2);
		f.add("Center", p);



	}
	private void start() {
		ActionDefine ad = new ActionDefine();
		btn1.addActionListener(ad); //ad객체에서 액션리스너 인터페이스를 임플리먼트했으므로 사용가능 
		btn2.addActionListener(ad);

	}
}

class ActionDefine implements ActionListener{ //액션리스너 인터페이스를 임플리먼트함
	//Exam02 ex = new Exam02();
	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand()=="버튼1"){ // 버튼을 눌렀을때 버튼 객체의 출력된 매개변수 값과 비교
			System.out.println("출력 : 버튼1을 누르셨습니다");

			return;
		}else if(e.getActionCommand()=="버튼2"){
			System.out.println("출력 : 버튼2를 누르셨습니다");
			//lb1.setText("��� : ��ư2�� �����̽��ϴ�.");
			return;
		}

		System.out.println(e.getActionCommand()=="버튼1");
		return;
	}

}





