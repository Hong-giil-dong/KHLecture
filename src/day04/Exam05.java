package day04;
/**
 * 배열에 1~99 사이의 데이터 10개가 입력되어있다고 가정을 하고
 * 2와 3의 배수를 출력 하시오.
 *
 */
public class Exam05 {
	public static void main(String[] ar){
		int data[] = {1,9,15,10,7,6,30,21,98,89};
		
		for(int i=0;i<data.length;i++){
			int n2 = data[i]%2;
			int n3 = data[i]%3;
			
			if(n2+n3 == 0)
				System.out.println(data[i]);
			
			/*
			if(data[i]%2==0 && data[i]%3==0)
				System.out.println(data[i]);
				*/
		}
	}

}







