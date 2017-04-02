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
	private static float interest; //이율
	private static SimpleDateFormat format; //날짜 형식 및 날짜 처리
	private static String pass; //password
	static{
		interest = 5;
		in = new BufferedReader(new InputStreamReader(System.in));
		format = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
		pass="1111";
	}
	
	private JBank next; //자기 참조
	
	public JBank getNext() {
		return next;
	}

	public void setNext() {
		next = new JBank();
	}

	public void open_account() throws IOException{ //신규가입
		System.out.println("===== 신규 가입 ======");
		System.out.print("이름 : ");
		name = in.readLine();
		System.out.print("입금액 : ");
		money = Double.parseDouble(in.readLine());
		
		date = format.format(new Date());
		System.out.println();
		System.out.println("신규 가입이 "+date+"에 처리 되엇습니다.");
		System.out.println("입금한 금액은 " + money + "원 입니다.");
		System.out.println("현재 적용 이율은" + interest + "%입니다.");
		//1명의 고객 정보를 입력 완료
		//1명에 대한 객체를 생성
		this.setNext();
	}
	
	public static void change_interest() throws IOException{
		System.out.print("관리자 패스워드를 입력 하세요 : ");
		String pw = in.readLine();
		if(!pw.equals(pass)){
			System.out.println("패스워드가 올바르지 않습니다.");
			return;
		}
		
		System.out.println("현재 "+ interest + "%의 이율이 적용 되고 있습니다. 얼마로 변경 하시겠습니까? ");
		System.out.print("적용 이율 : ");
		interest = Float.parseFloat(in.readLine());
		System.out.println("모든 고객에게 "+interest + "%로 변경");
	}
	
	public void view_account(){
		System.out.println("====== 현재 등록 고객 정보 ======");
		System.out.println("이름\t금액\t이율");
		System.out.println("=================================");
		JBank custom = this;
		while(custom.next != null){
			System.out.println(custom.name+"\t"+custom.money+"\t"+custom.interest);
			custom = custom.next;
		}
		System.out.println("=================================");
	}
	
	public void end_bank(){
		System.out.println("영업 마감");
		System.exit(0);
	}	
}

















