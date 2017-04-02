package day02;
/**
 * 반복문 : 일정구간은 정해진 횟수 또는 조건에 만족 할때
 * 까지 순환을 한다.
 * 1. for : 횟수
 *   문법)
 *   for(초기값;최종 조건식; 증감식){
 *        .....
 *   }
 * 2. while : 조건
 *   while(조건){
 *      조건이 참인 동안에만 반복
 *      .....
 *   }
 *
 */
public class Exam07 {
	public static void main(String[] ar){
		int sum=0, cnt=0;
		for(int i=1;i<=10;i++){
			cnt++;
			sum+=i; //sum=sum+i;
			}
		System.out.println("sum = " + sum);
		System.out.println("cnt = " + cnt);
	}

}








