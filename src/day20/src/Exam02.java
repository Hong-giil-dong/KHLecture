import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Exam02 {
	public static void main(String[] ar){
		Exam02_sub ex = new Exam02_sub();
	}
}



class Exam02_sub extends Frame implements ItemListener,FocusListener, WindowListener{
	private FlowLayout flow = new FlowLayout();
	private Choice year = new Choice();
	private Choice month = new Choice();
	private Choice day = new Choice();
	private List list = new List(3, false);
	public Exam02_sub(){
		super();
		this.init();
		this.start();
		this.setSize(300, 200);
		this.setVisible(true);
	}
	

	private void init() {
		this.setLayout(flow);
		year.add("년도");
		for(int i=1970;i<=2060;i++)
			year.add(String.valueOf(i));
		month.add("월");
		for(int i=1;i<=12;i++)
			month.add(String.valueOf(i));
		day.add("일");
		
		this.add(year);
		this.add(month);
		this.add(day);
		
		
		
		
	}




	private void start() {
		year.addItemListener(this);
		year.addFocusListener(this);
		month.addItemListener(this);
		day.addItemListener(this);
		list.addItemListener(this);
		this.addWindowListener(this);
		
	}




	@Override
	public void itemStateChanged(ItemEvent e) {
		
		int[] day1={31,28,31,30,31,30,31,31,30,31,30,31};
		if(e.getSource()==year){
			month.requestFocus();
		}else if(e.getSource()==month){
			int index = month.getSelectedIndex();
			day.removeAll();
			day.add("일");
			for(int i=1;i<=day1[index-1];i++)
				day.add(String.valueOf(i));		
			day.requestFocus();
		}
		
		
		
	}


	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}


	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
