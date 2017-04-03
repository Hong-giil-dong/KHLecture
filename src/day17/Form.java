package day17;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

class Form extends Frame{
	private Dimension dim1, dim2;
	private int xpos, ypos;

	public Form(){
		super("프레임의 제목지정");
		this.init();
		this.start();
		this.setSize(200,300);
		dim1 = Toolkit.getDefaultToolkit().getScreenSize();
		dim2 = this.getSize();
		xpos = (int)(dim1.getWidth()/2 - dim2.getWidth()/2);
		ypos = (int)(dim1.getHeight()/2 - dim2.getHeight()/2);

		this.setLocation(xpos, ypos);
		this.setVisible(true);		
	}


	public void init(){

	}
	public void start(){

	}
}
