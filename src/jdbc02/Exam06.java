package jdbc02;
import java.io.IOException;
import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) throws IOException {
		Exam05 dao = new Exam05();
		//dao.registerMember("30","30","30","30");
		//dao.editMember("50", "oprr", "keq", "dkokf@naver.com");

		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("1.회원가입 2.로그인 3.정보수정 4.정보삭제");
		int x = Integer.parseInt(sc.nextLine());
		
		if(x == 1) {
			System.out.println("회원가입 페이지 입니다.");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("ID : ");
			String id = sc.nextLine();
			System.out.print("Password : ");
			String pass = sc.nextLine();
			System.out.print("e-mail : ");
			String email = sc.nextLine();

			boolean bool = dao.registerMember(name, id, pass, email);
			if(bool){
				System.out.println("가입 성공");
			}else{
				System.out.println("가입 실패");			
			}

		}else if(x == 2) {
			System.out.println("로그인 페이지 입니다.");
			System.out.print("ID : ");
			String id = sc.nextLine();
			System.out.print("Password : ");
			String pass = sc.nextLine();

			boolean bool = dao.loginMember(id, pass);
			if(bool){
				System.out.println("로그인 성공");
			}else{
				System.out.println("로그인 실패");			
			}
		}
		
		else if(x == 3) {				
			System.out.println("정보 수정");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("ID : ");
			String id = sc.nextLine();
			System.out.print("Password : ");
			String pass = sc.nextLine();
			System.out.print("e-mail : ");
			String email = sc.nextLine();
			
			boolean bool = dao.editMember(name, id, pass, email);
			if(bool){
				System.out.println("수정 성공");
			}else{
				System.out.println("수정 실패");		
				
			}
		}
		else if(x == 4) {				
			System.out.println("정보 삭제");
			System.out.print("ID : ");
			String id = sc.nextLine();
			System.out.print("Password : ");
			String pass = sc.nextLine();
			
			boolean bool = dao.deleteMember(id, pass);
			if(bool){
				
				System.out.println("삭제 성공");
			}else{
				System.out.println("삭제 실패");		
				}
			}
		}
	}
}