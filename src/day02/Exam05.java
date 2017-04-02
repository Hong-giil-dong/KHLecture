package day02;

public class Exam05 {
	public static void main(String[] ar){
		/**
		 * 'A', "A", '\n'
		 * switch ~ case ~ break문
		 * 다중 조건문
		 * if문은 종속적인 관계로 비교하기 때문에 속도가
		 * 현저히 느려지게 된다.
		 * switch(조건:정수 또는 문자 값을 나타낼수 변수){
		 * 	case 값1:
		 *     내용1;
		 *     내용2;
		 *     [break;]
		 *  case 값2:
		 *     내용3;
		 *     .....
		 *  [default:]
		 * }
		 */
		int jum=87;
		switch(jum/10){
		case 10:
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;
		default:
			System.out.println("가");
		}
		
	}
	/**
	 * 주민번호 7번째 숫자를 입력 받아서 출생년대를 출력 하시오.
	 * 1,2 : 1900년대
	 * 3,4 : 2000년대
	 * 9,0 : 1800년대
	 * 성별
	 * 1 --> 1900년대 남성
	 */

}











