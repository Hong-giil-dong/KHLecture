package day05;

public class Exam07 {
	public static void main(String[] ar){
		String[][] data = new String[5][5];
		int l=2, r=2;
		
		for(int i=0;i<5;i++){
			for(int j=l;j<=r;j++){
				data[i][j]="*";
			}
			if(i>=2){
				l++;
				r--;
			}else{
				l--;
				r++;
			}
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(data[i][j]== null?"\t":data[i][j]+"\t");;
			}
			System.out.println();
		}
		
	}
}
