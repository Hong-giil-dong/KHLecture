package day12;
import java.io.IOException;

public class Calc extends Sung{
	
	protected int tot;
	protected double ave;

	public Calc() throws IOException {
		super();
		
	}

	@Override
	public void calculation() {
		// TODO Auto-generated method stub
		super.calculation();
		this.tot = super.tot;
		this.ave = (int)(super.ave*10)/10;
		
	}
	
	public void disp(){
		//super.ave = this.ave;
		super.disp();
		System.out.print(this.tot+"\t"+this.ave);
		
	}
	
	
	
	
	

}
