package day21;

package kr.or.iei.homework;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
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

class Display_Sub extends JFrame{
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
private Vector vc = new Vector();//사용자 데이터(Exam_03_Sub1의 객체)를 무한히 저장...
private int pos = 0; // 검색된 데이터의 위치번째를 기억...
private int pos1 = 0; //수정될 데이터의 위치번째를 기억...
private JFileChooser jfc = new JFileChooser("c://잠팅//온라인강좌//classes//Chapter_10");

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
}
public class Display_01 {
	public static void main(String[] ar){
		Display_Sub ex = new Display_Sub(null); 
	}
}

