package day23;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

class Board_sub extends JFrame implements ActionListener, MouseListener{
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
		
		
		
		public Board_sub(String str){
			super(str);
			
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
			
			
		}
		public void start(){
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			bt1.addActionListener(this);//글쓰기버튼...
			dlgbt.addActionListener(this);//글쓰기 다이얼로그의 저장버튼...
			dlgbt1.addActionListener(this);//글쓰기 다이얼로그의 취소버튼...
			bt.addActionListener(this);//리스트목록 버튼..
			
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
				}
			
		}

		public void mouseClicked(MouseEvent e){}
		public void mousePressed(MouseEvent e){}
		public void mouseReleased(MouseEvent e){}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e){}
}		
public class Board {
	public static void main(String[] ar){
		Board_sub ex = new Board_sub("게시판");
	}
	
}
