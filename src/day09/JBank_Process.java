package day09;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JBank_Process {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		JBank bank = new JBank();
		
		while(true){
			System.out.print("1. �ű԰���  2. ��������  3. ����ο�����  4. ���� :");
			int pos = Integer.parseInt(in.readLine());
			
			if(pos==1){
				JBank jb = bank;
				if(jb.getNext() != null){
					jb = jb.getNext();
				}
				jb.open_account();
			}
			
			if(pos==2){
				JBank.change_interest();
			}
			
			if(pos==3){
				bank.view_account();
			}
			
			if(pos==4){
				bank.end_bank();
			}
			
		}
	}

}
