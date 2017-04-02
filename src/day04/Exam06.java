package day04;

public class Exam06 {
	public static void main(String[] ar){
		int data[] = {10,9,15,10,7,6,30,21,98,89};
		int rank[] = new int[10];
		
		for(int i=0;i<data.length;i++){
			rank[i]=1;
			for(int j=0;j<data.length;j++)
				if(data[i]<data[j])
					rank[i]++;
		}
		
		for(int i=0;i<data.length;i++){
			System.out.println(data[i] + "\t" + rank[i]);
		}
		
	}
}
