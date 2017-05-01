package jdbc05;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

class Exam01_sub extends JFrame{
	private JRootPane jrp;
	private Container con;
	//private String[] str = {"AAA","BBB","CCC"};
	//private JTree jt = new JTree(str);
	
	private DefaultMutableTreeNode dmtn = 
			new DefaultMutableTreeNode("TOP");
	private DefaultMutableTreeNode dmtn1 = 
			new DefaultMutableTreeNode("AAA");
	private DefaultMutableTreeNode dmtn2 = 
			new DefaultMutableTreeNode("BBB");
	private DefaultMutableTreeNode dmtn3 = 
			new DefaultMutableTreeNode("CCC");
	private DefaultMutableTreeNode dmtn11 = 
			new DefaultMutableTreeNode("111");
	private DefaultMutableTreeNode dmtn12 = 
			new DefaultMutableTreeNode("222");
	private DefaultMutableTreeNode dmtn13 = 
			new DefaultMutableTreeNode("333");
	
	private DefaultTreeModel dtm = new DefaultTreeModel(dmtn);
	
	private JTree jt = new JTree(dtm);
	private JScrollPane jsp = new JScrollPane(jt);
	
	public Exam01_sub(){
		super("Test");
		this.init();
		//this.start();
		this.setSize(300,200);
		this.setVisible(true);
	}
	
	public void init(){
		jrp = this.getRootPane();
		con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", new JLabel("JTree",JLabel.CENTER));
		JPanel jp = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jp.add(new JButton("확인"));
		jp.add(new JButton("취소"));
		con.add("South",jp);
		
		dmtn.add(dmtn1);
		dmtn.add(dmtn2);
		dmtn.add(dmtn3);
		dmtn1.add(dmtn11);
		dmtn1.add(dmtn12);
		dmtn1.add(dmtn13);
		
		
		
		
		
		jt.addSelectionRow(1); //기본 선택 노드
		jt.expandRow(1); //하위 내용을 가질 때 확장될 노드
		jt.setDragEnabled(true); //드래그 기능 활성화
		jt.setEditable(true); //노드 수정 여부
		jt.setToggleClickCount(2); // Toggle 지정 시 클릭수
		con.add("Center",jsp);
	}
	
	
}
public class Exam01 {
	public static void main(String[] ar){
		try{
			UIManager.setLookAndFeel
			(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e){}
		Exam01_sub ex = new Exam01_sub();
	}
}







