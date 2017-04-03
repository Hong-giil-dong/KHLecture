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
	
	private MenuBar mb = new MenuBar(); // 메뉴바 객체 생성
	
	//맨처음 보이는 메뉴들 객체 생성
	private Menu file = new Menu("file");
	private Menu edit = new Menu("edit");
	private Menu view = new Menu("view");
	private Menu help = new Menu("help");
	
	//메뉴의 아이템 객체 생성
	private MenuItem fnew = new MenuItem("fnew");
	private MenuItem fopen = new MenuItem("fopen");
	private MenuItem fsave = new MenuItem("fsave");
	private MenuItem fsaveas = new MenuItem("fsaveas");
	private MenuItem fexit = new MenuItem("fexit");
	
	//메뉴속 메뉴아이템 객체 트리 생성
	private Menu vmo = new Menu("vmo");
	private MenuItem vmbasic = new MenuItem("vmbasic");
	private MenuItem vmweb = new MenuItem("vmweb");
	private MenuItem vmprint = new MenuItem("vmprint");
	
	//메뉴속 체크메뉴아이템 객체 트리 생성
	private Menu vtool = new Menu("vtool");
	private CheckboxMenuItem vtcustom = new CheckboxMenuItem("vtcustom",true);
	private CheckboxMenuItem vtform = new CheckboxMenuItem("vtform",true);
	private CheckboxMenuItem vtexam = new CheckboxMenuItem("vtexam",false);
	
	private Button[] bt = new Button[50]; // 버튼 배열 선언
	
	public Exam10_sub(){
		super("메뉴 테스트");
		this.init();
		this.start();
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
		BorderLayout border = new BorderLayout(); // 보더레이아웃 선언
		this.setLayout(border); // 프레임에 보더레이아웃 삽입
		Label lb = new Label("리스트"); // 라벨 객체 생성
		this.add("North", lb); // lb객체를 보더레이아웃 북쪽에 삽입
 		this.setMenuBar(mb); // 메뉴바에 mb객체를 삽입
		
		file.add(fnew); // 메뉴에 각 아이템 삽입
		file.addSeparator(); // 구분자 삽입
		file.add(fopen); // 메뉴에 각 아이템 삽입
		file.add(fsave); // 메뉴에 각 아이템 삽입
		file.add(fsaveas); // 메뉴에 각 아이템 삽입
		fsaveas.setEnabled(false); // 이 메뉴아이템은 일단 비활성화
		file.add(fexit); // 메뉴에 각 아이템 삽입
		
		view.add(vmo); // 메뉴에 들어간 메뉴
		vmo.add(vmbasic); // 메뉴에 들어간 메뉴아이템
		vmo.add(vmweb); // 메뉴에 들어간 메뉴아이템
		vmo.add(vmprint); // 메뉴에 들어간 메뉴아이템
		
		view.add(vtool); // 메뉴에 들어간 메뉴
		vtool.add(vtcustom); // 메뉴에 들어간 체크박스
		vtool.add(vtform); // 메뉴에 들어간 체크박스
		vtool.add(vtexam); // 메뉴에 들어간 체크박스
		
		//최종적으로 완성된 메뉴들을 메뉴바에 추가시키면 끝
		mb.add(file); 
		mb.add(edit);
		mb.add(view);
		mb.add(help);
		
		Panel p = new Panel(new GridLayout(10,5,2,3)); // 그리드레이아웃(10행,5열,2공간, 3공간) 객체를 넣은 패널 객체를 선언
	
		ScrollPane sp = new ScrollPane(); // 스크롤있는 공간 객체 sp 선언
		for(int i=0;i<bt.length;i++){ //버튼 배열의 길이만큼 반복
			bt[i] = new Button("TEST" + i); // 버튼 배열을 초기화
			p.add(bt[i]); // 초기화된 버튼 배열을  패널 p에 추가
		}
		sp.add(p); // 스크롤 공간객체 sp에 패널 p 삽입
		this.add("Center",sp); // 최종적으로 sp 객체를 보더레이아웃 가운데 삽입
		}
}









