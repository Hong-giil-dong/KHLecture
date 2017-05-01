package jdbc04;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

class Exam01_sub extends Frame{
	private Button bt1 = new Button("확인");
	private Button bt2 = new Button("취소");
	public Exam01_sub(){
		super();
		this.init();
		this.start();
		this.setSize(500,500);
		this.setVisible(true);
	}
	
	void init(){
		this.setLayout(new BorderLayout());
		Panel p = new Panel(new FlowLayout());
		p.add(bt1);
		p.add(bt2);
		this.add("North", p);
	}
	
	void start(){
		
	}
	
	public void paint(Graphics g){
		int x, y, w, h;
		
		for(int i=0;i<1000000;i++){
			Dimension di = this.getSize();
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			g.setColor(new Color(red,green,blue));
			
			x = (int)(Math.random() * di.getWidth());
			y = (int)(Math.random() * di.getHeight());
			w = (int)(Math.random() * 50) + 50;
			h = (int)(Math.random() * 50) + 50;
			
			int dist = (int)(Math.random() * 4);
			
			if(dist==0)
				g.drawRect(x, y, w, h);
			else if(dist==1)
				g.drawRect(x, y, w, h);//속빈 사각형 0-3
			else if(dist==2)			
			g.fillRect(x, y, w, h);//속찬 사각형
			else if(dist==3)
			g.drawOval(x, y, w, h);
			try{
				Thread.sleep(10);
			}catch(Exception ee){}
		}
	}
}



public class Exam01 {
	public static void main(String[] ar){
		Exam01_sub ex = new Exam01_sub();
	}
}
