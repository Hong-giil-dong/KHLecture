package day17;

import java.awt.*;

public class Exam09 {
	public static void main(String[] ar){
		Exam09_sub ex = new Exam09_sub();
	}
}

class Exam09_sub extends Frame {
	private Dimension dim1, dim2;
	private int xpos, ypos;
	
	private Dialog dlg1 = new Dialog(this, "종속된 Dialog1", false);
	private Dialog dlg2 = new Dialog(this, "종속된 Dialog2", true);
	
	private Label lb1 = new Label("종속된 Dialog1 입니다.", Label.CENTER);
	private Label lb2 = new Label("종속된 Dialog2 입니다.", Label.CENTER);
	
	private FileDialog fdlg1 = new FileDialog(this, "열기", FileDialog.SAVE);
	
	
	public Exam09_sub(){
		super("제목줄");
		this.init(); //사용자 정의 메소드 - 화면구성
		this.start(); // 사용자 정의 메소드 - Event or Thread
		this.setSize(900, 600);
		dim1 = Toolkit.getDefaultToolkit().getScreenSize();
		dim2 = this.getSize();
		
		xpos = (int)(dim1.getWidth() / 2 - dim2.getWidth()/2);
		ypos = (int)(dim1.getHeight() / 2 - dim2.getHeight()/2);
		
		this.setLocation(xpos, ypos);
		this.setVisible(true);
		
		try{
			Thread.sleep(6000);
		}catch(Exception e){
			System.err.println("Error = "+ e.toString());
			e.printStackTrace();
		}
		fdlg1.setVisible(true);
		lb1.setText(fdlg1.getDirectory());
		lb2.setText(fdlg1.getFile());
		/*
		dlg1.setVisible(true);
		
		try{
			Thread.sleep(6000);
		}catch(Exception e){}
		dlg1.setVisible(false);
		dlg2.setVisible(true);
		
		
		try{Thread.sleep(6000);}catch(Exception e){}
		dlg2.setVisible(false);
		fdlg1.setVisible(true);
		*/
		
		//this.setVisible(false); //화면에서 지워진다.(종료X)
		//this.dispose(); //메모리 상에서 삭제
		//System.exit(0);
		
	}
	
	void init(){
		Dimension dim3 = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dim4 = dlg1.getSize();
		int xpos1, ypos1, xpos2, ypos2;
		
		BorderLayout border = new BorderLayout();
		dlg1.setLayout(border);
		dlg1.add("Center",lb1);
		dlg1.setSize(150, 200);
		xpos1 = (int)(dim3.getWidth() /2 - dim4.getWidth()/2);
		ypos1 = (int)(dim3.getHeight() / 2 - dim4.getHeight()/2);
		dlg1.setLocation(xpos1, ypos1);
		
		BorderLayout border1 = new BorderLayout();
		dlg2.setLayout(border1);
		dlg2.add("Center", lb2);
		dlg2.setSize(150, 120);
		Dimension dim5 = dlg2.getSize();
		xpos2 = (int)(dim3.getWidth() /2 - dim5.getWidth()/2);
		ypos2 = (int)(dim3.getHeight() / 2 - dim5.getHeight()/2);
		dlg2.setLocation(xpos2, ypos2);
		
		this.add("North", lb1);
		this.add("South", lb2);
		
		
		
		
		
	}
	void start(){
		
	}
}














