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
 * ??Ό? ?μΆλ ₯? ?΄?©??¬ μ£Όμλ‘? ?λ‘κ·Έ?¨? ??±???€.
 * 1. ?? ₯  2. μ‘°ν  3. μ’λ£ : 
 * 1.
 * ?΄λ¦? :
 * ? ? :
 * μ£Όμ :
 * 2.
 * ??Ό? ? μ²? ?΄?© μΆλ ₯
 * ?¨, κ°μ²΄λ₯? ??©??¬ ??± ???€.
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
				System.out.print("1. ?? ₯  2. μ‘°ν  3. μ’λ£ :");
				int choose = Integer.parseInt(sc.nextLine());
				switch(choose){
				case 1:
					out = new PrintWriter(
					  new BufferedWriter(
					  new FileWriter(
					  new File(
					  new File("c:\\workspace\\java"),"address.txt"))));
					System.out.print("?΄λ¦? : ");
					String name = sc.nextLine();
					System.out.print("? ? : ");
					String tel = sc.nextLine();
					System.out.print("μ£Όμ : ");
					String addr = sc.nextLine();
					 
					out.println(name+","+tel+","+addr);
					out.close();
					break;
				case 2:
					
					while((data = in.readLine()) != null){
						int first = data.indexOf(',');
						int last = data.lastIndexOf(',');
						cnt++;
						System.out.println("?λ²? : " + cnt);
						System.out.println("?΄λ¦? = " + data.substring(0, first));
						System.out.println("? ? = " + data.substring(first+1, last));
						System.out.println("μ£Όμ = " + data.substring(last+1, data.length()));
						System.out.println("\n\n");						
					}
					
					break;
				case 3:
					System.out.println("?? μ’λ£");
					
					in.close();
					System.exit(0);
				}
			}while(true);
			
		}catch(Exception e){
			
		}
	}
}
