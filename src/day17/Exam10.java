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
	//메인 메뉴 선언
	private Menu file = new Menu("파일");
	private Menu edit = new Menu("편집");
	private Menu view = new Menu("보기");
	private Menu help = new Menu("도움말");
	
	private MenuItem fnew = new MenuItem("새파일");
	private MenuItem fopen = new MenuItem("열기");
	private MenuItem fsave = new MenuItem("저장");
	private MenuItem fsaveas = new MenuItem("다른 이름으로 저장");
	private MenuItem fexit = new MenuItem("종료");
	
	private Menu vmo = new Menu("보기");
	private MenuItem vmbasic = new MenuItem("기본 모양");
	private MenuItem vmweb = new MenuItem("웹 모양");
	private MenuItem vmprint = new MenuItem("인쇄 모양");
	
	private Menu vtool = new Menu("도구");
	private CheckboxMenuItem vtcustom = new CheckboxMenuItem("표준",true);
	private CheckboxMenuItem vtform = new CheckboxMenuItem("서식",true);
	private CheckboxMenuItem vtexam = new CheckboxMenuItem("검토",false);
	
	
	private Button[] bt = new Button[50];
	
	
	
	
	
	public Exam10_sub(){
		super("메뉴만들기");
		this.init(); //사용자 정의 메소드 - 화면구성
		this.start(); // 사용자 정의 메소드 - Event or Thread
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
		Label lb = new Label("메뉴 만들기 중...");
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









