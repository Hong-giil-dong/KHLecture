package jdbc04;

import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

class DrawInfo implements Serializable{
	private int x, y, x1, y1;
	private int type;
	private Color color;
	private boolean fill;
	public DrawInfo(int x, int y, int x1, int y1, int type,
			Color color, boolean fill){
		this.x = x;
		this.y = y;
		this.x1 = x1;
		this.y1 = y1;
		this.type = type;
		this.color = color;
		this.fill = fill;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public boolean getFill() {
		return fill;
	}
	public void setFill(boolean fill) {
		this.fill = fill;
	}
	
}

class Exam03_sub extends Frame
		implements MouseListener, MouseMotionListener, ItemListener,
		ActionListener
{
	private MenuBar mb = new MenuBar();
	
	private Menu file = new Menu("FILE");
	private MenuItem fnew = new MenuItem("New");
	private MenuItem fopen = new MenuItem("Open");
	private MenuItem fsave = new MenuItem("Save");
	private MenuItem fexit = new MenuItem("Exit");
	
	private Menu option = new Menu("OPTION");
	private Menu odraw = new Menu("DRAW");
	private CheckboxMenuItem odpen = new CheckboxMenuItem("Pen",true);
	private CheckboxMenuItem odline = new CheckboxMenuItem("Line");
	private CheckboxMenuItem odrect = new CheckboxMenuItem("Rect");
	private CheckboxMenuItem odcircle = new CheckboxMenuItem("CIRCLE");
	
	private Menu ocolor = new Menu("COLOR");
	private CheckboxMenuItem ocred = new CheckboxMenuItem("Red");
	private CheckboxMenuItem ocgreen = new CheckboxMenuItem("Green");
	private CheckboxMenuItem ocblue = new CheckboxMenuItem("Blue");
	
	private Menu oprop = new Menu("PROPERTY");
	private CheckboxMenuItem opdraw = new CheckboxMenuItem("Draw", true);
	private CheckboxMenuItem opfill = new CheckboxMenuItem("Fill");
	
	private int x, y, x1, y1, dist;
	private Color color;
	private boolean fill;
	private Vector vc = new Vector();
	
	public Exam03_sub(){
		super("그림판");
		this.init();
		this.start();
		this.setSize(500,500);
		this.setVisible(true);
	}
	
	public void init(){
		this.setMenuBar(mb);
		mb.add(file);
		file.add(fnew);
		file.addSeparator();
		file.add(fopen);
		file.add(fsave);
		file.addSeparator();
		file.add(fexit);
		mb.add(option);
		option.add(odraw);
		odraw.add(odpen);
		odraw.add(odline);
		odraw.add(odrect);
		odraw.add(odcircle);
		option.addSeparator();
		option.add(ocolor);
		ocolor.add(ocred);
		ocolor.add(ocgreen);
		ocolor.add(ocblue);
		option.addSeparator();
		option.add(oprop);
		oprop.add(opdraw);
		oprop.add(opfill);
	}
	
	public void start(){
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		odpen.addItemListener(this);
		odline.addItemListener(this);
		odrect.addItemListener(this);
		odcircle.addItemListener(this);
		fnew.addActionListener(this);
		fopen.addActionListener(this);
		fsave.addActionListener(this);
		fexit.addActionListener(this);
		opdraw.addItemListener(this);
		opfill.addItemListener(this);
	}
	
	public void paint(Graphics g){
		Color c = new Color(ocred.getState() ? 255 : 0,
				ocgreen.getState() ? 255 : 0, ocblue.getState() ? 255 : 0);
		g.setColor(c);
		if(dist ==1 || dist ==0){
			g.drawLine(x, y, x1, y1);
		}else if(dist ==2){
			if(fill)
				g.fillRect(x, y, x1-x, y1-y);
			else
				g.drawRect(x, y, x1-x, y1-y);
		}else if(dist == 3){
			if(fill)
				g.fillOval(x, y, x1-x, y1-y);
			else
				g.drawOval(x, y, x1-x, y1-y);
		}
		
		for(int i=0;i< vc.size();i++){
			DrawInfo imsi = (DrawInfo)vc.elementAt(i);
			g.setColor(imsi.getColor());
			if(imsi.getType() == 1 || imsi.getType() == 0){
				g.drawLine(imsi.getX(), imsi.getY(), 
						imsi.getX1()-imsi.getX(), imsi.getY1()-imsi.getY());
			}else if(imsi.getType()==2){
				if(imsi.getFill())
					g.fillRect(imsi.getX(), imsi.getY(), 
						imsi.getX1()-imsi.getX(), imsi.getY1()-imsi.getY());
				else
					g.drawLine(imsi.getX(), imsi.getY(), 
							imsi.getX1()-imsi.getX(), imsi.getY1()-imsi.getY());
			} else if(imsi.getType()==3){
				if(imsi.getFill())
					g.fillOval(imsi.getX(), imsi.getY(), 
						imsi.getX1()-imsi.getX(), imsi.getY1()-imsi.getY());
				else
					g.drawOval(imsi.getX(), imsi.getY(), 
							imsi.getX1()-imsi.getX(), imsi.getY1()-imsi.getY());
			}
		}
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == fnew){
			vc.clear();
			x=y=x1=y1=dist=0;
			this.repaint();
			
		}else if(e.getSource() == fopen){
			FileDialog fdlg = new FileDialog(this, "열기", FileDialog.LOAD);
			fdlg.setVisible(true);
			String dir = fdlg.getDirectory();
			String file = fdlg.getFile();
			if(dir == null || file == null)
				return;
			try{
				ObjectInputStream oos = new ObjectInputStream(
						new BufferedInputStream(new FileInputStream(new File(dir, file))));
				vc = (Vector)oos.readObject();
				oos.close();
						
			}catch(Exception ee){}
		}else if(e.getSource()==fsave){
			FileDialog fdlg = new FileDialog(this, "저장", FileDialog.SAVE);
			fdlg.setVisible(true);
			String dir = fdlg.getDirectory();
			String file = fdlg.getFile();
			if(dir == null || file == null)
				return;
			try{
				ObjectOutputStream oos = new ObjectOutputStream(
						new BufferedOutputStream(new FileOutputStream(new File(dir, file))));
				oos.writeObject(vc);
				oos.close();
						
			}catch(Exception ee){}
		}else if(e.getSource()==fexit)
			System.exit(0);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == odpen){
			dist = 0;
			odpen.setState(true);
			odline.setState(false);
			odrect.setState(false);
			odcircle.setState(false);
		}else if(e.getSource() == odline){
			dist = 1;
			odpen.setState(false);
			odline.setState(true);
			odrect.setState(false);
			odcircle.setState(false);
		}else if(e.getSource() == odrect){
			dist = 2;
			odpen.setState(false);
			odline.setState(false);
			odrect.setState(true);
			odcircle.setState(false);
		}else if(e.getSource() == odcircle){
			dist = 1;
			odpen.setState(false);
			odline.setState(false);
			odrect.setState(false);
			odcircle.setState(true);
		}else if(e.getSource() == opdraw){
			opdraw.setState(true);
			opfill.setState(false);
		}else if(e.getSource() == opfill){
			opdraw.setState(false);
			opfill.setState(true);
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
		if(dist == 0){
			Color c = new Color(ocred.getState() ? 255 : 0,
					ocgreen.getState() ? 255 : 0, ocblue.getState() ? 255 : 0);
			DrawInfo di = new DrawInfo(x,y,x1,y1,dist,c,opfill.getState());
			vc.add(di);
			x = x1;
			y = y1;
		}
		this.repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
		Color c = new Color(ocred.getState() ? 255 : 0,
				ocgreen.getState() ? 255 : 0, ocblue.getState() ? 255 : 0);
		DrawInfo di = new DrawInfo(x,y,x1,y1,dist,c,opfill.getState());
		vc.add(di);
		this.repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
public class Exam03 {
	public static void main(String[] ar){
		Exam03_sub ex = new Exam03_sub();
	}
}

















