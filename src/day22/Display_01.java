package kr.or.iei.homework;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

class Display_Sub1 implements Serializable{ //객체의 직렬화
	private String name;
	private String jumin;
	private String tel;
	private String addr;
	
	public Display_Sub1(String a, String b, String c, String d){
		name = a;
		jumin = b;
		tel = c;
		addr = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
}



class Display_Sub extends JFrame
		implements ActionListener, KeyListener, FocusListener
{
private Container con;
private BorderLayout bl = new BorderLayout(5, 5);
private JLabel jlb = new JLabel("<== 이것을 누르면 전체보기가 됩니다.");
private JButton jbt = new JButton("전체보기");
private JTextArea jta = new JTextArea(15, 40);
private JScrollPane jsp = new JScrollPane(jta);
private JButton jbt1 = new JButton("등록");
private JButton jbt2 = new JButton("수정");
private JButton jbt3 = new JButton("삭제");
private JButton jbt4 = new JButton("Clear");
private JButton jbt5 = new JButton("저장");
private JButton jbt6 = new JButton("로드");
private JButton jbt7 = new JButton("종료");

private JLabel lb = new JLabel("이름 : ", JLabel.RIGHT);
private JLabel lb1 = new JLabel("주민번호 : ", JLabel.RIGHT);
private JLabel lb2 = new JLabel("전화번호 : ", JLabel.RIGHT);
private JLabel lb3 = new JLabel("주소 : ", JLabel.RIGHT);
private JTextField tf = new JTextField(14);
private JTextField tf1 = new JTextField(7);
private JTextField tf2 = new JTextField(7);
private JTextField tf3 = new JTextField(14);
private JTextField tf4 = new JTextField(14);

private JLabel alb = new JLabel("검색 : ", JLabel.RIGHT);
private JTextField atf = new JTextField(7);
private JTextField atf1 = new JTextField(7);
private JButton abt = new JButton("검색");
private JTextArea ata = new JTextArea(5, 20);
private JScrollPane ajsp = new JScrollPane(ata);
private JButton abt1 = new JButton("<<");
private JButton abt2 = new JButton(">>");

private ImageIcon im = new ImageIcon("web.gif");
private Vector vc = new Vector();//사용자 데이터를 무한히 저장...
private int pos = 0; // 검색된 데이터의 위치번째를 기억...
private int pos1 = 0; //수정될 데이터의 위치번째를 기억...
private JFileChooser jfc = new JFileChooser("c://workspace//data");

private JDialog jdlg = new JDialog(this, "삭제", true);
private Container condlg;
private JLabel lbdlg = new JLabel("이름 : ", JLabel.RIGHT);
private JLabel lbdlg1 = new JLabel("주민번호 : ", JLabel.RIGHT);
private JTextField tfdlg = new JTextField(15);
private JTextField tfdlg1 = new JTextField(7);
private JTextField tfdlg2 = new JTextField(7);
private JButton btdlg = new JButton("삭제");
private JButton btdlg1 = new JButton("취소");

private JDialog ajdlg = new JDialog(this, "수정", true);
private Container acondlg;
private JLabel albdlg = new JLabel("이름 : ", JLabel.RIGHT);
private JLabel albdlg1 = new JLabel("주민번호 : ", JLabel.RIGHT);
private JTextField atfdlg = new JTextField(15);
private JTextField atfdlg1 = new JTextField(7);
private JTextField atfdlg2 = new JTextField(7);
private JButton abtdlg = new JButton("수정");
private JButton abtdlg1 = new JButton("취소");

private JDialog bjdlg = new JDialog(this, "수정", true);
private Container bcondlg;
private JLabel blbdlg = new JLabel("이름 : ", JLabel.RIGHT);
private JLabel blbdlg1 = new JLabel("주민번호 : ", JLabel.RIGHT);
private JLabel blbdlg2 = new JLabel("전화번호 : ", JLabel.RIGHT);
private JLabel blbdlg3 = new JLabel("주소 : ", JLabel.RIGHT);
private JLabel btfdlg = new JLabel();
private JLabel btfdlg1 = new JLabel();
private JTextField btfdlg2 = new JTextField(15);
private JTextField btfdlg3 = new JTextField(15);
private JButton bbtdlg = new JButton("수정");
private JButton bbtdlg1 = new JButton("취소");
		
public Display_Sub(String str){
	super(str);
	this.setIconImage(im.getImage());
	this.init();
	this.start();
	this.pack();
	this.setResizable(false);
	//this.setSize(720, 320);
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension di = tk.getScreenSize();
	Dimension di1 = this.getSize();
	this.setLocation((int)(di.getWidth() / 2 - di1.getWidth() / 2), 
		(int)(di.getHeight() / 2 - di1.getHeight() / 2));
	this.setVisible(true);
}
public void start() {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jbt7.addActionListener(this); //종료 버튼
	tf.addKeyListener(this); //이름 필드
	tf1.addFocusListener(this); //주민번호 첫번째 필드
	tf1.addKeyListener(this);
	tf2.addFocusListener(this); //주민번호 두번째 필드
	tf2.addKeyListener(this);
	tf3.addFocusListener(this); //전화번호 필드
	tf3.addKeyListener(this);
	tf4.addFocusListener(this); //주소 필드
	tf4.addKeyListener(this);
	atf.addKeyListener(this);
	atf1.addKeyListener(this);
	atf1.addFocusListener(this);
	jbt1.addActionListener(this); //등록
	jbt4.addActionListener(this); //Clear
	jbt.addActionListener(this); //전체보기
	abt.addActionListener(this); //검색
	abt1.addActionListener(this); //이전
	abt2.addActionListener(this); //다음
	jbt5.addActionListener(this); //저장
	jbt6.addActionListener(this); //로드
	
	jbt2.addActionListener(this); //수정
	atfdlg1.addKeyListener(this); //수정 다이얼로그의 주민 필드1
	atfdlg2.addKeyListener(this); //수정 다이얼로그의 주민 필드2
	abtdlg1.addActionListener(this); //수정 다이얼로그의 취소버튼
	abtdlg.addActionListener(this); //수정 다이얼로그의 수정버튼
	
	bbtdlg.addActionListener(this); //수정 다이얼로그2의 수정버튼
	bbtdlg1.addActionListener(this); //수정 다이얼로그2의 취소버튼
	
	jbt3.addActionListener(this); //삭제
	tfdlg1.addKeyListener(this); //삭제 다이얼로그 주민필드1
	tfdlg2.addKeyListener(this); //삭제 다이얼로그 주민필드2
	btdlg1.addActionListener(this); //삭제 다이얼로그의 취소
	btdlg.addActionListener(this); //삭제 다이얼로그의 삭제
	//F:\work\Day22\src\kr\or\iei\homework
	
}
public void init(){
	con = this.getContentPane();
	con.setLayout(bl);
	JPanel jp = new JPanel(new BorderLayout(3, 3));
	JPanel jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	jp1.add(jbt);
	jp1.add(jlb);		
	jp.add("North", jp1);
	jp.add("Center", jsp);
	JPanel jp2 = new JPanel(new GridLayout(1, 7, 3, 3));
	jp2.add(jbt1);
	jp2.add(jbt2);
	jp2.add(jbt3);
	jp2.add(jbt4);
	jp2.add(jbt5);
	jp2.add(jbt6);
	jp2.add(jbt7);
	jp.add("South", jp2);
	jbt.setBorder(new BevelBorder(BevelBorder.RAISED));
	jbt1.setBorder(new BevelBorder(BevelBorder.RAISED));
	jbt2.setBorder(new BevelBorder(BevelBorder.RAISED));
	jbt3.setBorder(new BevelBorder(BevelBorder.RAISED));
	jbt4.setBorder(new BevelBorder(BevelBorder.RAISED));
	jbt5.setBorder(new BevelBorder(BevelBorder.RAISED));
	jbt6.setBorder(new BevelBorder(BevelBorder.RAISED));
	jbt7.setBorder(new BevelBorder(BevelBorder.RAISED));
	jbt.setEnabled(false);
	jbt1.setEnabled(false);
	jbt2.setEnabled(false);
	jbt3.setEnabled(false);
	jbt4.setEnabled(false);
	jbt5.setEnabled(false);
	jp.setBorder(new TitledBorder(new SoftBevelBorder(SoftBevelBorder.RAISED), "개인정보확인"));
	con.add("Center", jp);
	JPanel jp3 = new JPanel(new GridLayout(2, 1, 3, 3));
	JPanel jp4 = new JPanel(new BorderLayout());
	JPanel jp5 = new JPanel(new GridLayout(4, 1));
	jp5.add(lb);
	jp5.add(lb1);
	jp5.add(lb2);
	jp5.add(lb3);
	jp4.add("West", jp5);
	JPanel jp6 = new JPanel(new GridLayout(4, 1));
	jp6.add(tf);
	JPanel jp7 = new JPanel(new GridLayout(1, 2, 5, 5));
	jp7.add(tf1);
	jp7.add(tf2);
	jp6.add(jp7);
	jp6.add(tf3);
	jp6.add(tf4);
	jp4.add("Center", jp6);
	jp4.setBorder(new TitledBorder(new SoftBevelBorder(SoftBevelBorder.RAISED), "개인정보"));
	jp3.add(jp4);//상단부
	JPanel jp8 = new JPanel(new BorderLayout());
	JPanel jp9 = new JPanel(new BorderLayout());
	jp9.add("West", alb);
	JPanel jp10 = new JPanel(new GridLayout(1, 2, 4, 4));
	jp10.add(atf);
	jp10.add(atf1);
	jp9.add("Center", jp10);
	jp9.add("East", abt);
	JPanel jp11 = new JPanel(new FlowLayout());
	jp11.add(abt1);
	jp11.add(abt2);
	jp8.add("North", jp9);
	jp8.add("Center", ajsp);
	jp8.add("South", jp11);
	abt.setBorder(new BevelBorder(BevelBorder.RAISED));
	abt1.setBorder(new BevelBorder(BevelBorder.RAISED));
	abt2.setBorder(new BevelBorder(BevelBorder.RAISED));
	abt.setEnabled(false);
	abt1.setEnabled(false);
	abt2.setEnabled(false);
	jp8.setBorder(new TitledBorder(new SoftBevelBorder(SoftBevelBorder.RAISED), "정보검색"));
	jp3.add(jp8);//하단부
	con.add("West", jp3);
	jta.setEnabled(false);
	ata.setEnabled(false);
	jta.setDisabledTextColor(Color.black);
	ata.setDisabledTextColor(Color.black);
	
	//삭제 다이얼로그를 구성합니다.
	condlg = jdlg.getContentPane();
	condlg.setLayout(new BorderLayout());
	JPanel jpdlg = new JPanel(new GridLayout(2, 1));
	jpdlg.add(lbdlg);
	jpdlg.add(lbdlg1);
	condlg.add("West", jpdlg);
	JPanel jpdlg1 = new JPanel(new GridLayout(2, 1));
	jpdlg1.add(tfdlg);
	JPanel jpdlg3 = new JPanel(new GridLayout(1, 2, 4, 4));
	jpdlg3.add(tfdlg1);
	jpdlg3.add(tfdlg2);
	jpdlg1.add(jpdlg3);
	condlg.add("Center", jpdlg1);
	JPanel jpdlg2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	jpdlg2.add(btdlg);
	jpdlg2.add(btdlg1);
	condlg.add("South", jpdlg2);
	jdlg.pack();
	jdlg.setResizable(false);
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension di = tk.getScreenSize();
	Dimension di1 = jdlg.getSize();
	jdlg.setLocation((int)(di.getWidth() / 2 - di1.getWidth() / 2), 
		(int)(di.getHeight() / 2 - di1.getHeight() / 2));
	//삭제 다이얼로그 구성 끝...
	
	//수정 다이얼로그를 구성합니다.
	acondlg = ajdlg.getContentPane();
	acondlg.setLayout(new BorderLayout());
	JPanel ajpdlg = new JPanel(new GridLayout(2, 1));
	ajpdlg.add(albdlg);
	ajpdlg.add(albdlg1);
	acondlg.add("West", ajpdlg);
	JPanel ajpdlg1 = new JPanel(new GridLayout(2, 1));
	ajpdlg1.add(atfdlg);
	JPanel ajpdlg3 = new JPanel(new GridLayout(1, 2, 4, 4));
	ajpdlg3.add(atfdlg1);
	ajpdlg3.add(atfdlg2);
	ajpdlg1.add(ajpdlg3);
	acondlg.add("Center", ajpdlg1);
	JPanel ajpdlg2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	ajpdlg2.add(abtdlg);
	ajpdlg2.add(abtdlg1);
	acondlg.add("South", ajpdlg2);
	ajdlg.pack();
	ajdlg.setResizable(false);
	Toolkit atk = Toolkit.getDefaultToolkit();
	Dimension adi = atk.getScreenSize();
	Dimension adi1 = ajdlg.getSize();
	ajdlg.setLocation((int)(adi.getWidth() / 2 - adi1.getWidth() / 2), 
		(int)(adi.getHeight() / 2 - adi1.getHeight() / 2));
	//수정 다이얼로그 구성 끝...
	
	//수정 두번째 다이얼로그 구성...
	bcondlg = bjdlg.getContentPane();
	bcondlg.setLayout(new BorderLayout());
	JPanel bjp = new JPanel(new GridLayout(4, 1));
	bjp.add(blbdlg);
	bjp.add(blbdlg1);
	bjp.add(blbdlg2);
	bjp.add(blbdlg3);
	bcondlg.add("West", bjp);
	JPanel bjp1 = new JPanel(new GridLayout(4, 1));
	bjp1.add(btfdlg);
	bjp1.add(btfdlg1);
	bjp1.add(btfdlg2);
	bjp1.add(btfdlg3);
	bcondlg.add("Center", bjp1);
	JPanel bjp2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	bjp2.add(bbtdlg);
	bjp2.add(bbtdlg1);
	bcondlg.add("South", bjp2);
	bjdlg.pack();
	bjdlg.setResizable(false);
	Toolkit btk = Toolkit.getDefaultToolkit();
	Dimension bdi = btk.getScreenSize();
	Dimension bdi1 = bjdlg.getSize();
	bjdlg.setLocation((int)(bdi.getWidth() / 2 - bdi1.getWidth() / 2), 
		(int)(bdi.getHeight() / 2 - bdi1.getHeight() / 2));
	//수정 두번째 다이얼로그 구성끝...
}
@Override
public void focusGained(FocusEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==tf1){
		String str = tf.getText().trim();
		if(str.length()==0){
			tf.setText("");
			tf.requestFocus();
			return;
		}
	}
	else if(e.getSource()==tf2){
		String str = tf1.getText().trim();
		if(str.length()==0){
			tf1.setText("");
			tf1.requestFocus();
			return;
		}
		try{
			int i = Integer.parseInt(str);
		}catch(NumberFormatException ee){
			tf1.setText("");
			tf1.requestFocus();
			return;
		}
	}
	else if(e.getSource()==tf3){
		String str = tf2.getText().trim();
		if(str.length()==0){
			tf2.setText("");
			tf2.requestFocus();
			return;
		}
		try{
			int i = Integer.parseInt(str);
		}catch(NumberFormatException ee){
			tf2.setText("");
			tf2.requestFocus();
			return;
		}
	}
	else if(e.getSource()==tf4){
		String str = tf3.getText().trim();
		if(str.length()==0){
			tf3.setText("");
			tf3.requestFocus();
			return;
		}
	}
	else if(e.getSource()==atf1){
		String str = atf.getText().trim();
		if(str.length()==6){
			atf.setText("");
			atf.requestFocus();
			return;
		}
	}
	
	
	
}
@Override
public void focusLost(FocusEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {//키보드의 키가 눌릴때
	// TODO Auto-generated method stub
	//System.out.println(tf1.getText().trim().length());
	if(e.getSource()==tf1){
		if(tf1.getText().trim().length()==6){
			tf2.requestFocus();
			return;
		}
	}//tf1
	else if(e.getSource()==tf2){
		//System.out.println(tf1.getText().trim());
		if(tf2.getText().trim().length()==6){
			tf3.requestFocus();
			return;
		}
	}//tf2
	else if(e.getSource() == atf){
		if(atf.getText().trim().length() == 6){
			atf1.requestFocus();
			return;
		}
	}
	else if(e.getSource() == atf1){
		if(atf1.getText().trim().length() == 7){
			abt.setEnabled(true);
			abt.requestFocus();
			return;
		}
	}
	
	//삭제 수정 다이얼 로그 이동
	//삭제 : tfdlg1, tfdlg2 삭제:atfdlg1, atfdlg2
	else if(e.getSource() == tfdlg1){
		if(tfdlg1.getText().trim().length() == 6){
			tfdlg2.requestFocus();
			return;
		}
	}
	else if(e.getSource() == tfdlg2){
		if(tfdlg2.getText().trim().length() == 7){
			btdlg.setEnabled(true);
			btdlg.requestFocus();
			return;
		}
	}	
	else if(e.getSource() == atfdlg1){
		if(atfdlg1.getText().trim().length() == 6){
			atfdlg2.requestFocus();
			return;
		}
	}
	else if(e.getSource() == atfdlg2){
		if(atfdlg2.getText().trim().length() == 7){
			abtdlg.setEnabled(true);
			abtdlg.requestFocus();
			return;
		}
	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==tf){
		String str = tf.getText().trim();
		if(str.length() != 0){
			jbt4.setEnabled(true);
			if(tf.getText().trim().length() != 0 &&
				tf1.getText().trim().length() != 0 &&
				tf2.getText().trim().length() != 0 &&
				tf3.getText().trim().length() != 0 &&
				tf4.getText().trim().length() != 0){
				
					jbt1.setEnabled(true);
				}
		}
		else{
			jbt1.setEnabled(false);
			if(tf1.getText().trim().length() !=0 ||
					tf2.getText().trim().length() !=0 ||
					tf3.getText().trim().length() !=0 ||
					tf4.getText().trim().length() !=0){
				return;
			}
			jbt4.setEnabled(false);
		}
	}//tf
	else if(e.getSource()==tf1){
		if(tf1.getText().trim().length()==6){
			tf2.requestFocus();
			return;
		}
		if(tf1.getText().trim().length()==0){
			jbt1.setEnabled(false);
		}else{
			if(tf.getText().trim().length() != 0 &&
				tf1.getText().trim().length() != 0 &&
				tf2.getText().trim().length() != 0 &&
				tf3.getText().trim().length() != 0 &&
				tf4.getText().trim().length() != 0){
				jbt1.setEnabled(true);
			}
		}
	}//tf1
	else if(e.getSource() == tf2){
		if(tf2.getText().trim().length() == 7){
			tf3.requestFocus();
			return;
		}
		if(tf2.getText().trim().length() == 0){
			jbt1.setEnabled(false);
		}
		else{
			if(tf.getText().trim().length() != 0 &&
				tf1.getText().trim().length() != 0 &&
				tf2.getText().trim().length() != 0 &&
				tf3.getText().trim().length() != 0 &&
				tf4.getText().trim().length() != 0){
				jbt1.setEnabled(true);
			}
		}
	}//tf2
	else if(e.getSource() == tf3){
		if(tf3.getText().trim().length() == 0){
			jbt1.setEnabled(false);
		}
		else{
			if(tf.getText().trim().length() != 0 &&
				tf1.getText().trim().length() != 0 &&
				tf2.getText().trim().length() != 0 &&
				tf3.getText().trim().length() != 0 &&
				tf4.getText().trim().length() != 0){
				jbt1.setEnabled(true);
			}
		}
	}//tf3
	else if(e.getSource() == atf){
		if(atf.getText().trim().length() == 6){
			atf1.requestFocus();
			return;
		}
	}
	else if(e.getSource() == atf1){
		if(atf1.getText().trim().length() == 7){
			abt.setEnabled(true);
			abt.requestFocus();
			return;
		}
	}
	//삭제 다이얼 로그 TextField(tfdlg1, tfdlg2)
	else if(e.getSource() == tfdlg1){
		if(tfdlg1.getText().trim().length() == 6){
			tfdlg2.requestFocus();
			return;
		}
	}
	else if(e.getSource() == tfdlg2){
		if(tfdlg2.getText().trim().length() == 7){
			btdlg.setEnabled(true);
			btdlg.requestFocus();
			return;
		}
	}	
	
	//수정 다이얼 로그 TextField(atfdlg1, atfdlg2)
	else if(e.getSource() == atfdlg1){
		if(atfdlg1.getText().trim().length() == 6){
			atfdlg2.requestFocus();
			return;
		}
	}
	else if(e.getSource() == atfdlg2){
		if(atfdlg2.getText().trim().length() == 7){
			abtdlg.setEnabled(true);
			abtdlg.requestFocus();
			return;
		}
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==jbt7){
		System.exit(0);
	}
	else if(e.getSource()==jbt1){
		String str = tf1.getText().trim() + tf2.getText().trim();
		int[] jumin = new int[13];
		for(int i=0;i<13;i++)
			jumin[i] = str.charAt(i) - 48; // '0'
		
		//주민번호 검증
		float hap = 0.0f;
		float temp = 0.0f;
		float temp1 = 0.0f;
		float cre = 2.0f;
		for(int i = 0; i < 12; i++){
			if(cre == 10.0f){
				cre = 2.0f;
			}
			hap += (jumin[i] * cre);
			cre += 1.0f;
		}
		temp = 11.0f * (int)(hap / 11.0f) + 11.0f - hap;
		temp1 = temp - 10.0f * (int)(temp / 10.0f);
		if(temp1 != jumin[12]){
			tf1.setText("");
			tf2.setText("");
			jbt1.setEnabled(false);
			tf1.requestFocus();
			return;
		}
		//등록 준비
		String a = tf.getText().trim();
		String b = tf1.getText().trim() + tf2.getText().trim();
		String c = tf3.getText().trim();
		String d = tf4.getText().trim();
		Display_Sub1 sss = new Display_Sub1(a, b, c, d);
		vc.addElement(sss); //객체를 벡터에 저장!
		jta.setText("저장이 잘 되었습니다.");
		jta.append("현재" + vc.size() + "명의 데이터가 존재 합니다.");
		tf.setText("");
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		jbt1.setEnabled(false);
		jbt4.setEnabled(false);
		jbt.setEnabled(true);
		jbt2.setEnabled(true);
		jbt3.setEnabled(true);
		jbt5.setEnabled(true);
		tf.requestFocus();
	  } 
	else if(e.getSource()==jbt4){
		tf.setText("");
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		jbt4.setEnabled(false);
		tf.requestFocus();
	}
	else if(e.getSource()==jbt){
		jta.setText("전체 인원의 개인정보 입니다.\n");
		jta.append("이름\t주민번호\t\t전화번호\t주소\n");
		jta.append("==========================================\n");
		//실제 출력 내용
		for(int i=0;i<vc.size();i++){
			Display_Sub1 imsi = (Display_Sub1)vc.elementAt(i);
			jta.append(imsi.getName()+"\t");
			jta.append(imsi.getJumin()+"\t");
			jta.append(imsi.getTel()+"\t");
			jta.append(imsi.getAddr()+"\n");
		}
		jta.append("==========================================\n");
		jta.append("총 " + vc.size() + "명");
	}
	else if(e.getSource()==abt){
		String str = atf.getText().trim() + atf1.getText().trim();
		int k = -1;
		//순차 검색
		for(int i=0;i<vc.size();i++){
			Display_Sub1 imsi = (Display_Sub1)vc.elementAt(i);
			if(imsi.getJumin().equals(str)){
				k=i;
			}
		}
		
		if(k==-1){
			ata.setText("그런 주민등록 번호는 없습니다.");
			atf.setText("");
			atf1.setText("");
			abt.setEnabled(false);
			atf.requestFocus();
			return;
			
		}
		pos = k; //찾은 자료의 위치값
		//검색후 찾은 값 출력
		view(pos);
		//view1(k);
		
		if(vc.size()<=1){
			abt1.setEnabled(false);
			abt2.setEnabled(false);
		}else{
			if(pos==0){
				abt1.setEnabled(false);
				abt2.setEnabled(true);
			}else if(pos == vc.size()-1){
				abt1.setEnabled(true);
				abt2.setEnabled(false);
			}else{
				abt1.setEnabled(true);
				abt2.setEnabled(true);
			}
			
		}
		atf.setText("");
		atf1.setText("");
		abt.setEnabled(false);
	}//abt
	else if(e.getSource()==abt1){
		pos--;
		if(pos==0){
			abt1.setEnabled(false);
		}
		abt2.setEnabled(true);
		view(pos);
	}//abt1
	else if(e.getSource()==abt2){
		pos++;
		if(pos==vc.size()-1){
			abt2.setEnabled(false);
		}
		abt1.setEnabled(true);
		view(pos);
	}//abt2
	else if(e.getSource()==jbt5){ //저장 단추를 이용하여 파일 저장
		jfc.showSaveDialog(this);
		File file = jfc.getSelectedFile();
		System.out.println(file);
		try{
			FileOutputStream fo = new FileOutputStream(file);
			BufferedOutputStream bo = new BufferedOutputStream(fo);
			ObjectOutputStream oos = new ObjectOutputStream(bo);
			oos.writeObject(vc); //반드시 직렬화 되어 있어야 한다.
			oos.close();
			bo.close();
			fo.close();
		}catch(Exception ee){
			System.err.println("Error = " + ee.toString());
		}
		jta.setText("저장 완료 !\n");
		jta.append(file + "의 이름으로 저장되었습니다.");
		
	}//jbt5
	else if(e.getSource()==jbt6){ //파일 불러오기
		jfc.showOpenDialog(this);
		File file = jfc.getSelectedFile();
		try{
			FileInputStream fi = new FileInputStream(file);
			BufferedInputStream bi = new BufferedInputStream(fi);
			ObjectInputStream ois = new ObjectInputStream(bi);
			vc.clear();
			vc = (Vector)ois.readObject();
			ois.close();
			bi.close();
			fi.close();
		}catch(Exception ee){
			ee.printStackTrace();
		}
		jta.setText("파일 읽기 완료 !\n");
		jta.append(file + "의 파일로부터 읽기를 완료하였습니다.\n");
		jta.append("총 데이터 개수 : " + vc.size() + "개");
		
		if(vc.size()>=1){
			jbt.setEnabled(true);
			jbt2.setEnabled(true);
			jbt3.setEnabled(true);
			jbt5.setEnabled(true);
		}
		
	}//jbt6
	else if(e.getSource()==jbt3){
		jdlg.setVisible(true); //삭제 다이얼로그 창 호출
	}//jbt3
	else if(e.getSource()==btdlg1){ //삭제 다이얼로그 창의 취소
		tfdlg.setText("");
		tfdlg1.setText("");
		tfdlg2.setText("");
		jdlg.setVisible(false);
		
	}//btdlg1
	else if(e.getSource()==btdlg){ //삭제 다이얼그 창의 삭제 버튼
		String str = tfdlg.getText().trim();
		String str1 = tfdlg1.getText().trim() + tfdlg2.getText().trim();
		int kk= -1;
		//삭제할 정보 검색
		for(int i=0;i<vc.size();i++){
			Display_Sub1 imsi = (Display_Sub1)vc.elementAt(i);
			if(imsi.getName().equals(str) &&
					imsi.getJumin().equals(str1)){
				kk=i;
			}
		}
		if(kk==-1){
			jta.setText("사용자가 존재 하지 않습니다.");
			jta.append("정보 !!!!\n");
			jta.append("이름 : " + str +"\n");
			jta.append("주민번호 : " + str1.substring(0, 6) +" - " 
					+str1.substring(6) + "\n");
			jta.append("다시 시도 하세요....");
			tfdlg.setText("");
			tfdlg1.setText("");
			tfdlg2.setText("");
			jdlg.setVisible(false);
			return;
		}
		//실제 정보의 삭제
		tfdlg.setText("");
		tfdlg1.setText("");
		tfdlg2.setText("");
		jdlg.setVisible(false);
		vc.removeElementAt(kk); //백터의 실제 정보 삭제
		jta.setText("다음의 사용자를 데이터 저장소에서 삭제 하였습니다.!!");
		jta.append("정보 !!!!\n");
		jta.append("이름 : " + str +"\n");
		jta.append("주민번호 : " + str1.substring(0, 6) +" - " 
				+str1.substring(6) + "\n");
		jta.append("현재 남은 데이터 개수 : " + vc.size() + "개");
		
	}//btdlg
	else if(e.getSource()==jbt2){ //수정 다이얼 로그
		//수정할 데이터 정보 검색
		//다이얼로그 : ajdlg, 취소 : abtdlg1, 수정 : abtdlg
		ajdlg.setVisible(true);
	}
	else if(e.getSource() == abtdlg1){
		atfdlg.setText("");
		atfdlg1.setText("");
		atfdlg2.setText("");
		ajdlg.setVisible(false);
	}
	else if(e.getSource() == abtdlg){
		String str = atfdlg.getText().trim();
		String str1 = atfdlg1.getText().trim() + atfdlg2.getText().trim();
		int kk = -1;
		for(int i = 0; i < vc.size(); i++){
			Display_Sub1 imsi = (Display_Sub1)vc.elementAt(i);
			if(imsi.getName().equals(str) && imsi.getJumin().equals(str1)){
				kk = i;				
			}
		}
		if(kk == -1){
			jta.setText("사용자 존재 하지 않습니다..\n");
			jta.append("정보 !!!\n");
			jta.append("이름 : " + str + "\n");
			jta.append("주민번호 : " + str1.substring(0, 6) + "-" + str1.substring(6) + "\n");
			jta.append("다시 시도 하세요... ^^");
			atfdlg.setText("");
			atfdlg1.setText("");
			atfdlg2.setText("");
			ajdlg.setVisible(false);
			return;
		}
		//실질적인 수정 작업 수행 부분
		atfdlg.setText("");
		atfdlg1.setText("");
		atfdlg2.setText("");
		ajdlg.setVisible(false);
		pos1 = kk;
		jta.setText("해당 사용자를 찾았습니다. 수정하겠습니다!");
		Display_Sub1 imsi = (Display_Sub1)vc.elementAt(pos1);
		btfdlg.setText(imsi.getName());
		btfdlg1.setText(imsi.getJumin().substring(0, 6)+ " - " 
		+ imsi.getJumin().substring(6));
		btfdlg2.setText(imsi.getTel());
		btfdlg3.setText(imsi.getAddr());
		bjdlg.setVisible(true);
	}//abtdlg
	else if(e.getSource()==bbtdlg){ //수정 다이얼로그 창의 수정 버튼
		Display_Sub1 imsi = (Display_Sub1)vc.elementAt(pos1);
		if(btfdlg2.getText().trim().length() !=0){
			imsi.setTel(btfdlg2.getText().trim());
		}
		if(btfdlg3.getText().trim().length() !=0){
			imsi.setAddr(btfdlg3.getText().trim());
		}
		bjdlg.setVisible(false);
	}//bbtdlg
	else if(e.getSource()==bbtdlg1){
		bjdlg.setVisible(false);
	}
	
		
 }//actionPerformed


void view(int pos) {
	Display_Sub1 imsi = (Display_Sub1)vc.elementAt(pos);
	ata.setText("이름 : " + imsi.getName() + "\n");
	ata.append("주민번호 : " + imsi.getJumin().substring(0, 6) + " - "
			+ imsi.getJumin().substring(6)+"\n");
	ata.append("전화번호 : " + imsi.getTel()+"\n");
	ata.append("주소 : " + imsi.getAddr() + "\n");
	
	int[] jumin = new int[13];
	for(int i = 0; i < 13; i++){
		jumin[i] = imsi.getJumin().charAt(i) - '0';
	}
	int year = 0;
	int month = 0;
	int day = 0;
	if(jumin[6] == 1 || jumin[6] == 2){
		year = 1900;
	}
	else if(jumin[6] == 3 || jumin[6] == 4){
		year = 2000;
	}
	year += jumin[0] * 10 + jumin[1];
	month = jumin[2] * 10 + jumin[3];
	day = jumin[4] * 10 + jumin[5];
	ata.append("생년월일 : " + year + "년 " + month + "월 " + day + "일\n");
	ata.append("성별 : " + ((jumin[6] % 2 == 0) ? "여성" : "남성") + "\n");
	Calendar ca = Calendar.getInstance();
	ata.append("나이 : " + ((int)ca.get(Calendar.YEAR) - year) + "세\n");
	
	
}
	


}
public class Display_01 {
	public static void main(String[] ar){
		Display_Sub ex = new Display_Sub(null); 
	}
}
