package day21;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam01 {
	public static void main(String[] ar){
		Exam01_sub ex = new Exam01_sub();
	}
}

class Exam01_sub extends JFrame{
	private Container con; //�۾� ������ ���� �⺻ Panel�� ���� ��ü
	private ImageIcon im, im1; //Ÿ��Ʋ�� �̹��� ��ü
	
	public Exam01_sub(){
		this.init();
		this.start();
		this.setSize(300,200);
		this.setTitle("TEST");
		im = new ImageIcon("C:\\Users\\user2\\Pictures\\icon.png");
		this.setIconImage(im.getImage()); //Ÿ��Ʋ �ٿ� �̹��� �ֱ�
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension di = tk.getScreenSize();
		Dimension di1 = this.getSize();
		this.setLocation((int)(di.getWidth()/2-di1.getWidth()/2), 
				(int)(di.getHeight()/2 - di1.getHeight()/2));
		this.setVisible(true);
	}

	private void init() {
		con = this.getContentPane();
		//���� �гο��� �⺻ �۾� ���� ȹ��
		//�� ���� ����
		
		
		im = new ImageIcon("C:\\Users\\user2\\Pictures\\icon.png");
		im1 = new ImageIcon("C:\\Users\\user2\\Pictures\\icon2.jpg");
		JButton jb = new JButton("test", im1);
		con.setLayout(new BorderLayout());
		
		jb.setToolTipText("��������");
		con.add("North", new JButton("Test"));
		con.add("Center",jb);
		
		
		
	}

	private void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}












