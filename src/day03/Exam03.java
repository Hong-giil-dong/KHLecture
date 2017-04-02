package day03;
import java.io.IOException;

/**
 * 주민번호의 8번째 숫자를 입력 하여 출생지역을 확인
 * 하는 프로그램을 작성 하시오.
 * 지역
 * 0 : 서울
 * 1 : 경기, 인천
 * 2 : 부산
 * 3 : 강원
 * 4 : 충청
 * 5 : 전라
 * 6 : 대구, 광주
 * 7 : 경상
 * 8 : 경남
 * 9 : 제주
 * switch문을 이용하시오.
 */
public class Exam03 {
	public static void main(String[] ar) throws IOException{
		int pos=0;
		String area="";
		
		System.out.print("8번째 자리 입력 : ");
		pos = System.in.read()-48;
		
		switch(pos){
		case 0:	area="서울";	break;
		case 1:	area="경기,인천";	break;
		case 2:	area="부산";	break;
		case 3:	area="강원";	break;
		case 4:	area="충청";	break;
		case 5:	area="전라";	break;
		case 6:	area="대구,광주";	break;
		case 7:	area="경상";	break;
		case 8:	area="경남";	break;
		case 9:	area="제주";	break;
		}
		System.out.println();
		System.out.println(area + "출신 입니다.");
		
	}
}












