package day05;
/*
 * Selection Sorting
 */
public class Exam01 {
	public static void main(String[] ar){
		int[] data={7,3,6,2};
		
		System.out.print("������ : \t");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+"\t");
		}
		System.out.println();
		
		for(int i=0;i<data.length-1;i++){
			for(int j=i+1;j<data.length;j++){
				if(data[i] > data[j]){ //�ڸ� ��ȯ
					int t = data[i];
					data[i]=data[j];
					data[j]= t;
				}
			}
			
			System.out.print(i+"ȸ���� : \t");
			for(int l=0;l<data.length;l++){
				System.out.print(data[l]+"\t");
			}
			System.out.println();
			
		}
		
		System.out.print("������ : \t");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+"\t");
		}
		System.out.println();
		
	}
}



