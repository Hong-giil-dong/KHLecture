import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Exam01{
	public static void main(String[] ar){
		Exam01_sub ex = new Exam01_sub();
	}
}


class Exam01_sub extends Frame implements FocusListener, ActionListener{
	private BorderLayout border = new BorderLayout();
	private Label lb1 = new Label("이름 : ", Label.RIGHT);
	private Label lb2 = new Label("주민번호 : ", Label.RIGHT);
	private TextField tf1 = new TextField();
	private TextField tf2 = new TextField();
	private TextField tf3 = new TextField();
	private Button bt1 = new Button("확인");
	private Button bt2 = new Button("취소");
	
	Exam01_sub(){
		super("Fous Listener");
		this.init();
		this.start();
		this.setSize(300,120);
		this.setVisible(true);
	}

	private void init() {
		this.setLayout(border);
		Panel p1 = new Panel(new GridLayout(2,1));
		p1.add(tf1);
		Panel p2 = new Panel(new GridLayout(1,2));
		p2.add(tf2);
		p2.add(tf3);
		p1.add(p2);
		this.add("Center", p1);
		
		Panel p3 = new Panel(new GridLayout(2,1));
		p3.add(lb1);
		p3.add(lb2);
		this.add("West", p3);
		
		Panel p4 = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p4.add(bt1);
		p4.add(bt2);
		this.add("South", p4);
	}

	private void start() {
		tf2.addFocusListener(this);
		tf3.addFocusListener(this);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		tf2.addActionListener(this);
		bt1.addFocusListener(this);
		
	}

	@Override
	public void focusGained(FocusEvent e) {
		// Focus를 얻을때 발생
		
		if(e.getSource()==tf2){
			int x = tf1.getText().trim().length();
			if(x==0)
				tf1.requestFocus();
		}else if(e.getSource() == tf3){
			int x = tf2.getText().trim().length();
			if(x!=6){
				tf2.setText(" ");
				tf2.requestFocus();
			}
			
		}
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// Focus를 잃을때 발생
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Frame f = new Frame("확인");
		if(e.getSource()==bt1){
			int x = tf1.getText().trim().length();
			if(x==0){
				tf1.requestFocus();
			}else{	
				f.setLayout(new GridLayout(2,1));
				Label lb1_f = new Label();
				Label lb2_f = new Label();
				String str1 = lb1.getText() + tf1.getText();
				String str2 = lb2.getText() + tf2.getText()+" - "+tf3.getText();
				lb1_f.setText(str1);
				lb2_f.setText(str2);
				f.add(lb1_f);
				f.add(lb2_f);
				f.setSize(300, 100);
				f.setVisible(true);
				this.setVisible(false);
			}
		}else if(e.getSource()==bt2){
			tf1.setText("");
			tf2.setText("");
			
			System.out.println(tf3.getText());
			tf3.setText("");
			
		}
		
		
		
	}

}








