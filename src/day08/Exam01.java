package day08;

public class Exam01 {
	//��� �ʵ�
	int[] sub = new int[14];
	float avg;
	
	//�޼ҵ�
	void calc(){
		int tot=0;
		for(int i = 0;i<sub.length;i++){
			tot+=sub[i];
		}
		avg = tot / sub.length;
	}
}
