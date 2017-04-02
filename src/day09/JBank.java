package day09;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
import java.io.*;
import java.util.*;
import java.text.*;
*/

public class JBank {
	private String name;
	private double money;
	private String date;
	private static BufferedReader in;
	private static float interest; //����
	private static SimpleDateFormat format; //��¥ ���� �� ��¥ ó��
	private static String pass; //password
	static{
		interest = 5;
		in = new BufferedReader(new InputStreamReader(System.in));
		format = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm��");
		pass="1111";
	}
	
	private JBank next; //�ڱ� ����
	
	public JBank getNext() {
		return next;
	}

	public void setNext() {
		next = new JBank();
	}

	public void open_account() throws IOException{ //�ű԰���
		System.out.println("===== �ű� ���� ======");
		System.out.print("�̸� : ");
		name = in.readLine();
		System.out.print("�Աݾ� : ");
		money = Double.parseDouble(in.readLine());
		
		date = format.format(new Date());
		System.out.println();
		System.out.println("�ű� ������ "+date+"�� ó�� �Ǿ����ϴ�.");
		System.out.println("�Ա��� �ݾ��� " + money + "�� �Դϴ�.");
		System.out.println("���� ���� ������" + interest + "%�Դϴ�.");
		//1���� �� ������ �Է� �Ϸ�
		//1�� ���� ��ü�� ����
		this.setNext();
	}
	
	public static void change_interest() throws IOException{
		System.out.print("������ �н����带 �Է� �ϼ��� : ");
		String pw = in.readLine();
		if(!pw.equals(pass)){
			System.out.println("�н����尡 �ùٸ��� �ʽ��ϴ�.");
			return;
		}
		
		System.out.println("���� "+ interest + "%�� ������ ���� �ǰ� �ֽ��ϴ�. �󸶷� ���� �Ͻðڽ��ϱ�? ");
		System.out.print("���� ���� : ");
		interest = Float.parseFloat(in.readLine());
		System.out.println("��� ������ "+interest + "%�� ����");
	}
	
	public void view_account(){
		System.out.println("====== ���� ��� �� ���� ======");
		System.out.println("�̸�\t�ݾ�\t����");
		System.out.println("=================================");
		JBank custom = this;
		while(custom.next != null){
			System.out.println(custom.name+"\t"+custom.money+"\t"+custom.interest);
			custom = custom.next;
		}
		System.out.println("=================================");
	}
	
	public void end_bank(){
		System.out.println("���� ����");
		System.exit(0);
	}	
}

















