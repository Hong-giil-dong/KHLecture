import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
public class Exam05 {
	public static void main(String[] ar){
		Exam05_sub ex = new Exam05_sub();
	}
}

class Exam05_sub extends Frame implements ActionListener,
										KeyListener,
										FocusListener

{
	private TextField tf1 = new TextField(10);
	private TextField tf2 = new TextField(10);
	private Label lb = new Label("-");
	private Button btn = new Button("확인");
	public Exam05_sub(){
		super();
		this.init();
		this.start();
		this.setSize(500,100);
		this.setVisible(true);
	}

	private void init() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.add(tf1);
		this.add(lb);
		this.add(tf2);
		this.add(btn);
		
	}

	private void start() {
		btn.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String pan="";
		int age = 2017 - 
				Integer.parseInt(tf1.getText().substring(0, 2))+1900;
		if(age >= 20){
			pan ="사용가능 합니다";
			
			
		}else{
			pan ="사용불가능 합니다";
		}
		final Dialog dlg = new Dialog(this, "OK",true);
		dlg.setLayout(new BorderLayout());
		dlg.add("Center", new Label(pan, Label.CENTER));
		Button bt = new Button("확인");
		dlg.setVisible(true);
		
		
	}
	
}
