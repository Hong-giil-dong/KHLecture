package day17;

import java.awt.*;

class Exam04_sub extends Form{
	
	
	
	public Exam04_sub() {
			super();
			this.setSize(400, 200);
		}
	@Override
	public void init() {
		Label lb = new Label("�����ϴ� ������ ��� ���� �Ͻÿ�.");
		
		CheckboxGroup cg = new CheckboxGroup();
		Checkbox cbk1 = new Checkbox("���",false,cg);
		Checkbox cbk2 = new Checkbox("����",false,cg);
		Checkbox cbk3 = new Checkbox("����",true,cg);
		Checkbox cbk4 = new Checkbox("Ű��",false,cg);
		
		Button btn1 = new Button("Ȯ��");
		Button btn2 = new Button("���");
		
		BorderLayout border = new BorderLayout();
		this.setLayout(border);
		this.add("North", lb);
		
		Panel p = new Panel(new GridLayout(2,2));
		p.add(cbk1);p.add(cbk2);
		p.add(cbk3);p.add(cbk4);
		this.add("Center",p);
		
		Panel p2 = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(btn1);
		p2.add(btn2);
		this.add("South",p2);
		
		
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}

	
}

public class Exam04 {
	public static void main(String[] ar){
		Exam04_sub ex = new Exam04_sub();
	}
}
