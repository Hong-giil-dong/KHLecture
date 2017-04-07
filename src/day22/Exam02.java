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
		Color color = jcc.showDialog(this, "색상선택", Color.black);
		System.out.println("선택한 색상 = " + color);
		jcc.setColor(color);
		System.out.println("다른 색상 = " + jcc.getColor());
		*/
		jfc.setDialogTitle("파일 선택 창");
		jfc.setMultiSelectionEnabled(true);
		jfc.setApproveButtonToolTipText("하하하하하");
		jfc.showDialog(this, "허허허");
		
	}

	private void init() {
		// TODO Auto-generated method stub
		
	}

	private void start() {
		// TODO Auto-generated method stub
		
	}
}









