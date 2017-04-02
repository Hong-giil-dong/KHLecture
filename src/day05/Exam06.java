package day05;

public class Exam06 {
	public static void main(String[] ar){
		int[][] data = new int[5][5];
		int cnt = 0;
		
		for(int i=4;i>=0;i--){
			cnt=1;
			for(int j=4-i;j<5;j++){
				data[j][i]=cnt;
				cnt++;
			}
		}
		
		//Ãâ·Â
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(data[i][j]);
				//System.out.print(data[i][j]==0?"\t":data[i][j]);
			}
			System.out.println();
		}
	}

}










