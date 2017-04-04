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
	
	private Dialog dlg1 = new Dialog(this, "Dialog1", false); // 다이얼로그 알림창 false이므로 다른데를 클릭 가능
	private Dialog dlg2 = new Dialog(this, "Dialog2", true); // 다이얼로그 알림창 true이므로 다른데를 클릭 불가능
	
	private Label lb1 = new Label("Dialog1", Label.CENTER);
	private Label lb2 = new Label("Dialog2", Label.CENTER);
	
	private FileDialog fdlg1 = new FileDialog(this, "파일", FileDialog.SAVE); // 파일 다이얼로그 , 세이브 목적
	
	
	public Exam09_sub(){
		super("다이얼로그 테스트");
		this.init();
		this.start();
		this.setSize(900, 600);
		dim1 = Toolkit.getDefaultToolkit().getScreenSize();
		dim2 = this.getSize();
		
		xpos = (int)(dim1.getWidth() / 2 - dim2.getWidth()/2);
		ypos = (int)(dim1.getHeight() / 2 - dim2.getHeight()/2);
		
		this.setLocation(xpos, ypos);
		this.setVisible(true);
		
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			System.err.println("Error = "+ e.toString());
			e.printStackTrace();
		}
		fdlg1.setVisible(true);
		lb1.setText(fdlg1.getDirectory()); // fdlg1의 getdirectory메소드 실행해서 리턴된 값으로 라벨의 텍스트 변경 
		lb2.setText(fdlg1.getFile()); // fdlg1의 getfile메소드 실행해서 리턴된 값으로 라벨의 텍스트 변경
		
		dlg1.setVisible(true);
		
		try{
			Thread.sleep(6000);
		}catch(Exception e){}
		dlg1.setVisible(false);
		dlg2.setVisible(true);
		
		
		try{Thread.sleep(6000);}catch(Exception e){}
		dlg2.setVisible(false);
		fdlg1.setVisible(true);
		
		
		//this.setVisible(false); //ȭ�鿡�� ��������.(����X)
		//this.dispose(); //�޸� �󿡼� ����
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














