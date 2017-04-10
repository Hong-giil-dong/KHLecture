package day23;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
class FreeBoard_Sub1 implements Serializable{
	private String name;
	private String title;
	private String password;
	private String memo;
	private int number;
	private String date;
	private int searchnum;
	public FreeBoard_Sub1(String a, String b, String c, String d){
		name = a;
		title = b;
		password = c;
		memo = d;
		//넘버를 체크한다..저장...
		Calendar ca = Calendar.getInstance();
		int year = (int)ca.get(Calendar.YEAR);
		int month = (int)ca.get(Calendar.MONTH);
		int day = (int)ca.get(Calendar.DAY_OF_MONTH);
		date = year + "-" + month + "-" + day;
		searchnum = 0;
	}
	public String getName(){
		return name;
	}
	public void setTitle(String a){
		title = a;
	}
	public String getTitle(){
		return title;
	}
	public void setPassword(String a){
		password = a;
	}
	public String getPassword(){
		return password;
	}
	public void setMemo(String a){
		memo = a;
	}
	public String getMemo(){
		return memo;
	}
	public void setDate(String a){
		date = a;
	}
	public String getDate(){
		return date;
	}
	public void setSearchnum(int a){
		searchnum = a;
	}
	public int getSearchnum(){
		return searchnum;
	}
	public void setNumber(int a){
		number = a;
	}
	public int getNumber(){
		return number;
	}
}
class FreeBoard_Sub extends JFrame implements ActionListener, MouseListener{
	private Container con;
	private FlowLayout fl = new FlowLayout();
	private JButton bt = new JButton("리스트보기");
	private JButton bt1 = new JButton("글쓰기");
	
	private JDialog jdlg = new JDialog(this, "글쓰기", true);
	private Container dlgcon;
	private JLabel dlglb = new JLabel("작성자 : ", JLabel.RIGHT);
	private JLabel dlglb1 = new JLabel("제목 : ", JLabel.RIGHT);
	private JLabel dlglb2 = new JLabel("비밀번호 : ", JLabel.RIGHT);
	private JTextField dlgtf = new JTextField();
	private JTextField dlgtf1 = new JTextField();
	private JPasswordField dlgtf2 = new JPasswordField();
	private JTextArea dlgta = new JTextArea();
	private JScrollPane dlgjsp = new JScrollPane(dlgta);
	private JButton dlgbt = new JButton("저장");
	private JButton dlgbt1 = new JButton("취소");
	
	private JDialog adlg = new JDialog(this, "리스트목록", true);
	private Container adlgcon;
	private JLabel adlglb = new JLabel("리스트목록", JLabel.CENTER);
	private Vector adlgvc = new Vector();
	private JList adlgli = new JList();
	private JScrollPane adlgjsp = new JScrollPane(adlgli);
	private JButton adlgbt = new JButton("선택항목보기");
	private JButton adlgbt1 = new JButton("닫기");
	
	private JDialog bdlg = new JDialog(this, "글보기", true);
	private Container bdlgcon;
	private JLabel bdlglb = new JLabel("제목 : ", JLabel.RIGHT);
	private JLabel bdlglb1 = new JLabel("작성자 : ", JLabel.RIGHT);
	private JLabel bdlgtf = new JLabel();
	private JLabel bdlgtf1 = new JLabel();
	private JTextArea bdlgta = new JTextArea();
	private JScrollPane bdlgjsp = new JScrollPane(bdlgta);
	private JButton bdlgbt = new JButton("확인");
	
	public FreeBoard_Sub(String str){
		super(str);
		jdlg.setVisible(true);//
		this.init();
		this.start();
		this.pack();
		this.setResizable(false);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension di = tk.getScreenSize();
		Dimension di1 = this.getSize();
		this.setLocation((int)(di.getWidth() / 2 - di1.getWidth() / 2), 
			(int)(di.getHeight() / 2 - di1.getHeight() / 2));
		this.setVisible(true);
	}
	public void init(){
		con = this.getContentPane();
		con.setLayout(fl);
		con.add(bt);
		con.add(bt1);
		
		//글쓰기 다이얼로그를 구성합니다.
		dlgcon = jdlg.getContentPane();
		dlgcon.setLayout(new BorderLayout(5, 5));
		JPanel dlgjp1 = new JPanel(new BorderLayout());
		dlgjp1.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED), "기본정보"));
		JPanel dlgjp2 = new JPanel(new GridLayout(3, 1));
		dlgjp2.add(dlglb);
		dlgjp2.add(dlglb1);
		dlgjp2.add(dlglb2);
		dlgjp1.add("West", dlgjp2);
		JPanel dlgjp3 = new JPanel(new GridLayout(3, 1));
		dlgjp3.add(dlgtf);
		dlgjp3.add(dlgtf1);
		dlgjp3.add(dlgtf2);
		dlgjp1.add("Center", dlgjp3);
		dlgcon.add("North", dlgjp1);
		dlgjsp.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED), "내용작성"));
		dlgcon.add("Center", dlgjsp);
		JPanel dlgjp = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		dlgbt.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		dlgbt1.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		dlgjp.add(dlgbt);
		dlgjp.add(dlgbt1);
		dlgcon.add("South", dlgjp);
		jdlg.setSize(400, 400);
		jdlg.setResizable(false);
		Toolkit dlgtk = Toolkit.getDefaultToolkit();
		Dimension dlgdi = dlgtk.getScreenSize();
		Dimension dlgdi1 = jdlg.getSize();
		jdlg.setLocation((int)(dlgdi.getWidth() / 2 - dlgdi1.getWidth() / 2), 
			(int)(dlgdi.getHeight() / 2 - dlgdi1.getHeight() / 2));
		//글쓰기 다이얼로그 구성끝..
		
		//리스트 목록 다이얼로그 구성...
		adlgcon = adlg.getContentPane();
		adlgcon.setLayout(new BorderLayout(5, 5));
		adlgcon.add("North", adlglb);
		adlgcon.add("Center", adlgjsp);
		JPanel adlgjp = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		adlgjp.add(adlgbt);
		adlgjp.add(adlgbt1);
		adlgcon.add("South", adlgjp);
		adlg.setSize(400, 400);
		adlg.setResizable(false);
		Toolkit adlgtk = Toolkit.getDefaultToolkit();
		Dimension adlgdi = adlgtk.getScreenSize();
		Dimension adlgdi1 = adlg.getSize();
		adlg.setLocation((int)(adlgdi.getWidth() / 2 - adlgdi1.getWidth() / 2), 
			(int)(adlgdi.getHeight() / 2 - adlgdi1.getHeight() / 2));
		//리스트 목록 다이얼로그 구성끝...
		
		//글보기 다이얼로그 구성..
		bdlgcon = bdlg.getContentPane();
		bdlgcon.setLayout(new BorderLayout());
		JPanel bdlgjp1 = new JPanel(new BorderLayout());
		JPanel bdlgjp2 = new JPanel(new GridLayout(2, 1));
		bdlgjp2.add(bdlglb);
		bdlgjp2.add(bdlglb1);
		bdlgjp1.add("West", bdlgjp2);
		JPanel bdlgjp3 = new JPanel(new GridLayout(2, 1));
		bdlgjp3.add(bdlgtf);
		bdlgjp3.add(bdlgtf1);
		bdlgjp1.add("Center", bdlgjp3);
		bdlgcon.add("North", bdlgjp1);
		bdlgcon.add("Center", bdlgjsp);
		JPanel bdlgjp = new JPanel(new FlowLayout());
		bdlgjp.add(bdlgbt);
		bdlgcon.add("South", bdlgjp);
		bdlgta.setEnabled(false);
		bdlgta.setDisabledTextColor(Color.black);
		bdlg.setSize(300, 200);
		bdlg.setResizable(false);
		Toolkit bdlgtk = Toolkit.getDefaultToolkit();
		Dimension bdlgdi = bdlgtk.getScreenSize();
		Dimension bdlgdi1 = bdlg.getSize();
		bdlg.setLocation((int)(bdlgdi.getWidth() / 2 - bdlgdi1.getWidth() / 2), 
			(int)(bdlgdi.getHeight() / 2 - bdlgdi1.getHeight() / 2));
		//글보기 다이얼로그 구성끝...
	}
	public void start(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bt1.addActionListener(this);//글쓰기버튼...
		dlgbt.addActionListener(this);//글쓰기 다이얼로그의 저장버튼...
		dlgbt1.addActionListener(this);//글쓰기 다이얼로그의 취소버튼...
		bt.addActionListener(this);//리스트목록 버튼..
		adlgbt1.addActionListener(this);//리스트목록 다이얼로그의 닫기버튼...
		adlgli.addMouseListener(this);//리스트목록 다이얼로그의 리스트목록...
		adlgbt.addActionListener(this);//리스트목록 다이얼로그의 선택목록보기 버튼...
		bdlgbt.addActionListener(this);//글보기 다이얼로그의 확인버튼...
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == bt1){
			jdlg.setVisible(true);
		}
		else if(e.getSource() == dlgbt){
			String str = dlgtf.getText().trim();//작성자
			String str1 = dlgtf1.getText().trim();//제목
			String str2 = new String(dlgtf2.getPassword());//비밀번호
			String str3 = dlgta.getText().trim();//글내용
			FreeBoard_Sub1 ess = new FreeBoard_Sub1(str, str1, str2, str3);
			File dir = new File("c://data");
			String[] files = dir.list();
			File file = null;
			if(files.length == 0){
				file = new File(dir, "1.myfile");
				ess.setNumber(1);
			}
			else{
				int[] ii = new int[files.length];
				for(int i = 0; i < files.length; i++){
					ii[i] = Integer.parseInt(files[i].substring(0, files[i].indexOf(".")));
				}
				int kkk = -1;
				for(int i = 0; i < ii.length; i++){
					if(kkk < ii[i]){
						kkk = ii[i];
					}
				}
				file = new File(dir, kkk + 1 + ".myfile");
				ess.setNumber(kkk + 1);
			}
			try{
				FileOutputStream fo = new FileOutputStream(file);
				BufferedOutputStream bo = new BufferedOutputStream(fo);
				ObjectOutputStream oos = new ObjectOutputStream(bo);
				oos.writeObject(ess);
				oos.close();
				bo.close();
				fo.close();			
			}catch(FileNotFoundException ee){
			}catch(IOException ee){}
			dlgtf.setText("");
			dlgtf1.setText("");
			dlgtf2.setText("");
			dlgta.setText("");
			jdlg.setVisible(false);
		}
		else if(e.getSource() == dlgbt1){
			dlgtf.setText("");
			dlgtf1.setText("");
			dlgtf2.setText("");
			dlgta.setText("");
			jdlg.setVisible(false);
		}
		else if(e.getSource() == bt){
			//리스트를 보여주어야 한다.
			File dir = new File("f://data");
			adlgvc.clear();
			String[] files = dir.list();
			for(int i = 0; i < files.length; i++){
				File file = new File(dir, files[i]);
				try{
					FileInputStream fi = new FileInputStream(file);
					BufferedInputStream bi = new BufferedInputStream(fi);
					ObjectInputStream ois = new ObjectInputStream(bi);
					FreeBoard_Sub1 ess = (FreeBoard_Sub1)ois.readObject();
					ois.close();
					bi.close();
					fi.close();
					String imsi = "";
					imsi += files[i].substring(0, files[i].indexOf("."));
					imsi += " : ";
					imsi += ess.getTitle();
					imsi += " : ";
					imsi += ess.getName();
					imsi += " : ";
					imsi += ess.getDate();
					imsi += " : ";
					imsi += ess.getSearchnum();
					adlgvc.add(imsi);
				}catch(FileNotFoundException ee){
				}catch(IOException ee){
				}catch(ClassNotFoundException ee){}
			}
			adlgli.setListData(adlgvc);
			//adlgli.updateUI();
			adlg.setVisible(true);
		}
		else if(e.getSource() == adlgbt1){
			adlg.setVisible(false);
		}
		else if(e.getSource() == adlgbt){
			view();
		}
		else if(e.getSource() == bdlgbt){
			bdlg.setVisible(false);
			File dir = new File("C://data");
			adlgvc.clear();
			String[] files = dir.list();
			for(int i = 0; i < files.length; i++){
				File file = new File(dir, files[i]);
				try{
					FileInputStream fi = new FileInputStream(file);
					BufferedInputStream bi = new BufferedInputStream(fi);
					ObjectInputStream ois = new ObjectInputStream(bi);
					FreeBoard_Sub1 ess = (FreeBoard_Sub1)ois.readObject();
					ois.close();
					bi.close();
					fi.close();
					String imsi = "";
					imsi += files[i].substring(0, files[i].indexOf("."));
					imsi += " : ";
					imsi += ess.getTitle();
					imsi += " : ";
					imsi += ess.getName();
					imsi += " : ";
					imsi += ess.getDate();
					imsi += " : ";
					imsi += ess.getSearchnum();
					adlgvc.add(imsi);
				}catch(FileNotFoundException ee){
				}catch(IOException ee){
				}catch(ClassNotFoundException ee){}
			}
			adlgli.setListData(adlgvc);
			//adlgli.updateUI();
			adlg.setVisible(true);
		}
	}
	public void mouseClicked(MouseEvent e){
		if(e.getSource() == adlgli){
			if(e.getClickCount() == 2){//더블클릭....
				view();
			}
		}
	}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	private void view(){
		//System.out.println((String)adlgli.getSelectedValue());
		File dir = new File("c://data");
		String str = (String)adlgli.getSelectedValue();
		String imsi = str.substring(0, str.indexOf(":"));
		imsi = imsi.trim();
		File file = new File(dir, imsi + ".myfile");
		FreeBoard_Sub1 ess = null;
		try{
			FileInputStream fi = new FileInputStream(file);
			BufferedInputStream bi = new BufferedInputStream(fi);
			ObjectInputStream ois = new ObjectInputStream(bi);
			ess = (FreeBoard_Sub1)ois.readObject();
			ois.close();
			bi.close();
			fi.close();
		}catch(FileNotFoundException ee){
		}catch(IOException ee){
		}catch(ClassNotFoundException ee){}
		bdlgtf.setText(ess.getTitle());
		bdlgtf1.setText(ess.getName());
		bdlgta.setText(ess.getMemo());
		adlg.setVisible(false);
		int iii = ess.getSearchnum();
		iii++;
		ess.setSearchnum(iii);
		try{
			FileOutputStream fo = new FileOutputStream(file);
			BufferedOutputStream bo = new BufferedOutputStream(fo);
			ObjectOutputStream oos = new ObjectOutputStream(bo);
			oos.writeObject(ess);
			oos.close();
			bo.close();
			fo.close();
		}catch(FileNotFoundException ee){
		}catch(IOException ee){}
		bdlg.setVisible(true);
	}
}
public class FreeBoard{
	public static void main(String[] ar){
		FreeBoard_Sub es = new FreeBoard_Sub("게시판");
	}
}
