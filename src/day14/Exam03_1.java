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
 * ?ŒŒ?¼?˜ ?…ì¶œë ¥?„ ?´?š©?•˜?—¬ ì£¼ì†Œë¡? ?”„ë¡œê·¸?¨?„ ?™„?„±?•˜?‹œ?˜¤.
 * 1. ?…? ¥  2. ì¡°íšŒ  3. ì¢…ë£Œ : 
 * 1.
 * ?´ë¦? :
 * ? „?™” :
 * ì£¼ì†Œ :
 * 2.
 * ?ŒŒ?¼?˜ ? „ì²? ?‚´?š© ì¶œë ¥
 * ?‹¨, ê°ì²´ë¥? ?™œ?š©?•˜?—¬ ?‘?„± ?•˜?‹œ?˜¤.
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
				System.out.print("1. ?…? ¥  2. ì¡°íšŒ  3. ì¢…ë£Œ :");
				int choose = Integer.parseInt(sc.nextLine());
				switch(choose){
				case 1:
					out = new PrintWriter(
					  new BufferedWriter(
					  new FileWriter(
					  new File(
					  new File("c:\\workspace\\java"),"address.txt"))));
					System.out.print("?´ë¦? : ");
					String name = sc.nextLine();
					System.out.print("? „?™” : ");
					String tel = sc.nextLine();
					System.out.print("ì£¼ì†Œ : ");
					String addr = sc.nextLine();
					 
					out.println(name+","+tel+","+addr);
					out.close();
					break;
				case 2:
					
					while((data = in.readLine()) != null){
						int first = data.indexOf(',');
						int last = data.lastIndexOf(',');
						cnt++;
						System.out.println("?ˆœë²? : " + cnt);
						System.out.println("?´ë¦? = " + data.substring(0, first));
						System.out.println("? „?™” = " + data.substring(first+1, last));
						System.out.println("ì£¼ì†Œ = " + data.substring(last+1, data.length()));
						System.out.println("\n\n");						
					}
					
					break;
				case 3:
					System.out.println("?‘?—… ì¢…ë£Œ");
					
					in.close();
					System.exit(0);
				}
			}while(true);
			
		}catch(Exception e){
			
		}
	}
}
