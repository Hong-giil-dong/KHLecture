package day05;
import java.util.Scanner;

/**
 * 임의 수 10개를 무작위로 입력 받아서
 * 셀랙션 정열을 이용하여 오름차순으로 
 * 정렬하여 출력 하시오.
 *
 */
public class Exam02 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		int[] data = new int[10];
		for(int i=0;i<data.length;i++){
			System.out.print("값 : ");
			data[i] = sc.nextInt();
		}
		
		System.out.print("정렬전 : \t");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+"\t");
		}
		System.out.println();
		
		for(int i=0;i<data.length-1;i++){
			for(int j=i+1;j<data.length;j++){
				if(data[i] > data[j]){ //자리 교환
					int t = data[i];
					data[i]=data[j];
					data[j]= t;
				}
			}
		}
		
		System.out.print("정렬후 : \t");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+"\t");
		}
		System.out.println();
	}
}
