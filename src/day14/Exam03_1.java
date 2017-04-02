package day14;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * ?��?��?�� ?��출력?�� ?��?��?��?�� 주소�? ?��로그?��?�� ?��?��?��?��?��.
 * 1. ?��?��  2. 조회  3. 종료 : 
 * 1.
 * ?���? :
 * ?��?�� :
 * 주소 :
 * 2.
 * ?��?��?�� ?���? ?��?�� 출력
 * ?��, 객체�? ?��?��?��?�� ?��?�� ?��?��?��.
 */
public class Exam03 {
	
	
	public static void main(String[] ar){
		String data="";
		int cnt=0;
		Scanner sc = new Scanner(System.in);
		try{
			
			PrintWriter out=null;
			/*= new PrintWriter(
					  new BufferedWriter(
					  new FileWriter(
					  new File(
					  new File("c:\\workspace\\java"),"address.txt"))));
			*/
			
			BufferedReader in=new BufferedReader(
					new FileReader(
					new File(
					new File("c:\\workspace\\java"),"address.txt")));
				
			
			
			do{
				System.out.print("1. ?��?��  2. 조회  3. 종료 :");
				int choose = Integer.parseInt(sc.nextLine());
				switch(choose){
				case 1:
					out = new PrintWriter(
					  new BufferedWriter(
					  new FileWriter(
					  new File(
					  new File("c:\\workspace\\java"),"address.txt"))));
					System.out.print("?���? : ");
					String name = sc.nextLine();
					System.out.print("?��?�� : ");
					String tel = sc.nextLine();
					System.out.print("주소 : ");
					String addr = sc.nextLine();
					 
					out.println(name+","+tel+","+addr);
					out.close();
					break;
				case 2:
					
					while((data = in.readLine()) != null){
						int first = data.indexOf(',');
						int last = data.lastIndexOf(',');
						cnt++;
						System.out.println("?���? : " + cnt);
						System.out.println("?���? = " + data.substring(0, first));
						System.out.println("?��?�� = " + data.substring(first+1, last));
						System.out.println("주소 = " + data.substring(last+1, data.length()));
						System.out.println("\n\n");						
					}
					
					break;
				case 3:
					System.out.println("?��?�� 종료");
					
					in.close();
					System.exit(0);
				}
			}while(true);
			
		}catch(Exception e){
			
		}
	}
}
