package day17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CheckboxMenuItem;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Toolkit;

import javax.swing.JFrame;
public class Exam10 {
	public static void main(String[] ar){
		Exam10_sub ex = new Exam10_sub();
	}
}

class Exam10_sub extends JFrame{
	private Dimension dimen1, dimen2;
	private int xpos, ypos;
	
	private MenuBar mb = new MenuBar();
	//���� �޴� ����
	private Menu file = new Menu("����");
	private Menu edit = new Menu("����");
	private Menu view = new Menu("����");
	private Menu help = new Menu("����");
	
	private MenuItem fnew = new MenuItem("������");
	private MenuItem fopen = new MenuItem("����");
	private MenuItem fsave = new MenuItem("����");
	private MenuItem fsaveas = new MenuItem("�ٸ� �̸����� ����");
	private MenuItem fexit = new MenuItem("����");
	
	private Menu vmo = new Menu("����");
	private MenuItem vmbasic = new MenuItem("�⺻ ���");
	private MenuItem vmweb = new MenuItem("�� ���");
	private MenuItem vmprint = new MenuItem("�μ� ���");
	
	private Menu vtool = new Menu("����");
	private CheckboxMenuItem vtcustom = new CheckboxMenuItem("ǥ��",true);
	private CheckboxMenuItem vtform = new CheckboxMenuItem("����",true);
	private CheckboxMenuItem vtexam = new CheckboxMenuItem("����",false);
	
	
	private Button[] bt = new Button[50];
	
	
	
	
	
	public Exam10_sub(){
		super("�޴������");
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

	private void start() {
		
		
	}

	private void init() {
		BorderLayout border = new BorderLayout();
		this.setLayout(border);
		Label lb = new Label("�޴� ����� ��...");
		this.add("North", lb);
		this.setMenuBar(mb);
		
		file.add(fnew);
		file.addSeparator();
		file.add(fopen);
		file.add(fsave);
		fsaveas.setEnabled(false);
		file.add(fsaveas);
		file.add(fexit);
		
		view.add(vmo);
		vmo.add(vmbasic);
		vmo.add(vmweb);
		vmo.add(vmprint);
		
		view.add(vtool);
		vtool.add(vtcustom);
		vtool.add(vtform);
		vtool.add(vtexam);
		
		
		mb.add(file);
		mb.add(edit);
		mb.add(view);
		mb.add(help);
		
		Panel p = new Panel(new GridLayout(10,5,2,3));
		
		
		ScrollPane sp = new ScrollPane();
		for(int i=0;i<bt.length;i++){
			bt[i] = new Button("TEST" + i);
			p.add(bt[i]);
		}
		sp.add(p);
		this.add("Center",sp);
		
		
		
	}
}









