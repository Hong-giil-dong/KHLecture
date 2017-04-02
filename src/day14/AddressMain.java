package day14;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Vector;
public class AddressMain {

	public static void main(String[] args) throws Exception{
		File dir = new File("c:\\workspace\\java2");
		File file = new File(dir, "Address.txt");
		file.createNewFile();
		Vector vc = new Vector();//�뙆�씪�뿉 ���옣�븯湲� 
		try {
			//�쟾源뚯�? �봽濡쒓?���옩 �궡�뿉�꽌 �궡�슜�쓣 湲곗�?
			if(file.exists()){
				ObjectInputStream ois = new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream(file)));
				vc = (Vector)ois.readObject();
				ois.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("1. �엯�젰  2. 議고?��  3. ?��?���? :");
			int choose = Integer.parseInt(sc.nextLine());
			if(choose==1){
				AddressExam ae = new AddressExam();
				vc.add(ae);
				System.out.println("1紐낆?�� �벑濡� �릺��?�뒿�땲�떎.!\n\n");
			}else if(choose == 2){
				System.out.println("�씠?���?\t�쟾�솕\t二쇱?��");
				for(int i=0;i<vc.size();i++){
					AddressExam imsi = (AddressExam)vc.elementAt(i);
					imsi.disp();
				}
			}else if(choose == 3){
				ObjectOutputStream oos = new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(file)));
				oos.writeObject(vc);
				oos.close();
				System.exit(0);
			}
		}

	}

}
