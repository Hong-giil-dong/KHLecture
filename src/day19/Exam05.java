package day19;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exam05 {
	public static void main(String[] ar){
		Exam05_sub ex = new Exam05_sub();
	}
}

class Exam05_sub extends Frame implements ActionListener{
	private Dimension dimen1, dimen2;
	private int xpos, ypos;
	
	//��ư
	private Button btn1 = new Button("�Է�");
	private Button btn2 = new Button("���");
	
	//���̺�
	private Label[] lb = new Label[5];
	private String[] title={"����","����","����","����","���"};
	
	
	//�ؽ�Ʈ �ʵ�
	private TextField[] tfkwa = new TextField[3];
	
	//List
	private List[] list = new List[5];
	
	private int cnt=0;
	private int[] kor = new int[5];
	private int[] eng = new int[5];
	private int[] mat = new int[5];
	private int[] tot = new int[5];
	private int[] ave = new int[5];
	
	public Exam05_sub(){
		super("������");
		this.init(); //����� ���� �޼ҵ� - ȭ�鱸��
		this.start(); // ����� ���� �޼ҵ� - Event or Thread
		this.setSize(300, 200);
		dimen1 = Toolkit.getDefaultToolkit().getScreenSize();
		dimen2 = this.getSize();
		
		xpos = (int)(dimen1.getWidth() / 2 - dimen2.getWidth()/2);
		ypos = (int)(dimen1.getHeight() / 2 - dimen2.getHeight()/2);
		
		this.setLocation(xpos, ypos);
		this.setVisible(true);
	}
	private void init() { //ȭ�鱸��
		BorderLayout border = new BorderLayout();
		this.setLayout(border);
		Panel pInput = new Panel(new GridLayout(3,2,5,5));
		
		for(int i=0;i<3;i++){
			pInput.add(lb[i] = new Label(title[i], Label.RIGHT));
			pInput.add(tfkwa[i] = new TextField(5));
		}
		this.add("North", pInput);
		
		Panel pButton = new Panel(new FlowLayout(FlowLayout.CENTER));
		pButton.add(btn1);
		pButton.add(btn2);
		this.add("Center", pButton);
		
		
		
		
	}
	private void start() { //Thread, Event ����
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1){
			
			
			kor[cnt] = Integer.parseInt(tfkwa[0].getText());
			eng[cnt] = Integer.parseInt(tfkwa[1].getText());
			mat[cnt] = Integer.parseInt(tfkwa[2].getText());
			tot[cnt] = kor[cnt]+eng[cnt]+mat[cnt];
			ave[cnt] = tot[cnt]/3;
			cnt++;
			
			for(int i=0;i<3;i++)
				tfkwa[i].setText("");
		}
		if(e.getSource()==btn2){
			Panel pResult = new Panel(new FlowLayout());
			this.setSize(700, 250);
			for(int i=0;i<5;i++){
				pResult.add(list[i]=new List());
			}
			this.add("South", pResult);
			

			
			
			for(int i=0;i<cnt;i++){
				list[0].add(String.valueOf(kor[i]));
				list[1].add(String.valueOf(eng[i]));
				list[2].add(String.valueOf(mat[i]));
				list[3].add(String.valueOf(tot[i]));
				list[4].add(String.valueOf(ave[i]));
			}
			
		}
		
		
	}
	
	
	
}