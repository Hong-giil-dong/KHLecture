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
		super("? œëª?");
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
		GridLayout grid = new GridLayout(4,3,5,5);
		Font font = new Font("TimesRoman", Font.BOLD, 20);
		Button[] btn = new Button[12];
		this.setLayout(grid);
		String[] str = {"*","0","#"};
		
		for(int i=0;i<btn.length;i++){
			if(i<9){
				btn[i] = new Button(String.valueOf(i+1));
				btn[i].setFont(font);
				
			}else{
				btn[i] = new Button(str[i-9]);
				btn[i].setFont(font);
				
			}
			this.add(btn[i]);
		}
		
		
		
		
		
		
	}
	public void start(){}
}











