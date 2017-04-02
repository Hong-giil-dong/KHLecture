package day14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exam01_1 {
	public static void main(String[] ar) throws IOException{
		//?åå?ùº Ï∂úÎ†• ?Ñ§?†ï
		/*
		PrintWriter out = new PrintWriter(
						  new BufferedWriter(
						  new FileWriter(
						  new File(
						  new File("c:\\workspace\\java"),"java.txt")
						  )));
		out.println("?åå?ùº?óê Ï∂úÎ†• ?ïú?ã§.");
		out.close();
		
		PrintWriter out1 = new PrintWriter(
							new BufferedWriter(
							new OutputStreamWriter(System.out)));
		out1.println("?ôîÎ©¥Ïóê Ï∂úÎ†• ?ïú?ã§.");
		out1.close();
		*/
		
		
		File f = new File("c:\\workspace\\java");
		File file = new File(f, "java.txt");
		
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		//?ôîÎ©? Ï∂úÎ†• ?Ñ§?†ï
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw1 = new BufferedWriter(osw);
		PrintWriter pw1 = new PrintWriter(bw1);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("?ù¥Î¶? : ");
		String name = sc.nextLine();
		System.out.print("?†Ñ?ôî : ");
		String tel = sc.nextLine();
		System.out.print("Ï£ºÏÜå : ");
		String addr = sc.nextLine();
		
		pw1.println(name + "\t" + tel + "\t" + addr);
		pw.println(name + ',' + tel + ',' + addr);
		pw.close();
		pw1.close();
		
		
		
	}
}









