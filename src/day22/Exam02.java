import java.awt.Color;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Exam02 {
	public static void main(String[] ar){
		Exam02_sub ex = new Exam02_sub();
	}
}

class Exam02_sub extends JFrame {
	private JColorChooser jcc = new JColorChooser();
	private JFileChooser jfc = new JFileChooser("c://");
	
	public Exam02_sub(){
		super();
		this.init();
		this.start();
		this.setSize(300,200);
		this.setVisible(true);
		/*
		Color color = jcc.showDialog(this, "������", Color.black);
		System.out.println("������ ���� = " + color);
		jcc.setColor(color);
		System.out.println("�ٸ� ���� = " + jcc.getColor());
		*/
		jfc.setDialogTitle("���� ���� â");
		jfc.setMultiSelectionEnabled(true);
		jfc.setApproveButtonToolTipText("����������");
		jfc.showDialog(this, "������");
		
	}

	private void init() {
		// TODO Auto-generated method stub
		
	}

	private void start() {
		// TODO Auto-generated method stub
		
	}
}









