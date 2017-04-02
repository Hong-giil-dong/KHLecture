package day04;
/**
 * 배열 에 일정한 양의 수가 입력 되어있을때 범위 안에서 가장 큰
 * 값과 가장 작은 값을 구하시오.
 * 9,15,10,7,6,30,21
 */
public class Exam03 {
	public static void main(String[] ar){
		int[] data = {1,9,15,10,7,6,30,21};
		//int max=0, min=100;
		int max = data[0], min = data[0];
		
		for(int i=0;i<data.length;i++){
			if(max < data[i])
				max = data[i];
			if(min > data[i])
				min = data[i];
		}
		
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}
	/**
	 * 임의의 수 5개를 입력 받아서 가장 큰수와 작은 수를 출력
	 * 하시오.
	 */
	
}


























